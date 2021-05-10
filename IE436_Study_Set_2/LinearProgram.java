package Algorithm;

import ilog.concert.*;
import ilog.cplex.*;

public class LinearProgram {
	
	private IloNumVar[][] x;
	
	private IloLinearNumExpr objective;
	
	private IloLinearNumExpr flowBalanceCons;
	
	public LinearProgram(){}
	
	public void ImplementLinearProgram(Vertex[] vertices, int s, int t)
	{
		int nVertex = vertices.length;
		
		try {
			IloCplex cplex = new IloCplex();
			
			x = new IloNumVar[nVertex][];
			
			for(int i = 0; i < nVertex; i++)
				x[i] = new IloNumVar[nVertex];
			
			IloNumVar v = cplex.numVar(0, Double.MAX_VALUE, "v");
			
//			x = new IloNumVar[nVertex][nVertex];
			
			for(int i = 0; i < vertices.length; i++)
				for(int j = 0; j < vertices[i].adjOut.size(); j++)
				{
					Arc currAdj = vertices[i].adjOut.get(j);
					x[i][currAdj.id] = cplex.numVar(0, currAdj.capacity, "x(" + i + "," + currAdj.id + ")");
				}
			
			// Define the objective function
			objective = cplex.linearNumExpr();
			objective.addTerm(1, v);
			
			cplex.addMaximize(objective);
			
			// Define the flow balance constraints 
			
			for(int i = 0; i < vertices.length; i++)
			{
				flowBalanceCons = cplex.linearNumExpr();
				
				for(int j = 0; j < vertices[i].adjOut.size(); j++)
				{
					Arc currAdj = vertices[i].adjOut.get(j);
					
					flowBalanceCons.addTerm(1, x[i][currAdj.id]);
				}
				
				for(int j = 0; j < vertices[i].adjIn.size(); j++)
				{
					Arc currAdj = vertices[i].adjIn.get(j);
					
					flowBalanceCons.addTerm(-1, x[currAdj.id][i]);
				}
				
				if(i == s)
					flowBalanceCons.addTerm(-1, v);
				
				if (i == t)
					flowBalanceCons.addTerm(1, v);
	        	
	        	cplex.addEq(flowBalanceCons, 0);
			}
			
			cplex.exportModel("MaxFLow.lp");
			
			boolean success = cplex.solve();
			
			if(success)
			{
				System.out.println("The max flow amount and the flows on the arcs are: ");
				System.out.println("obj = " + cplex.getObjValue());
				
				for(int i = 0; i < vertices.length; i++)
					for(int j = 0; j < vertices[i].adjOut.size(); j++)
					{
						Arc currAdj = vertices[i].adjOut.get(j);
						System.out.println("x(" + i + ", " + currAdj.id + ") = " + cplex.getValue(x[i][currAdj.id]));
					}
			}
			else
				System.out.println("The status is " + cplex.getStatus());
					
		} catch (IloException e) {
			e.printStackTrace();
		}
	}

}
