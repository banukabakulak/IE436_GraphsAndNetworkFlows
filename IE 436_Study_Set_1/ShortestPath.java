package Algorithm;

public class ShortestPath {
	
	final static int bigM = 100000;
	
	public void ImplementShortestPathForDAG(Vertex[] vertices)
	{
		Ordering topologicalOrdering = new Ordering();
		
		int[] topologicalOrder = topologicalOrdering.ImplementTopologicalOrdering(vertices);
		
		// initialize distance labels 
		
		for(int l = 0; l < topologicalOrder.length; l++)
			if(l == 0)
				vertices[topologicalOrder[l]].distance = 0;
			else 
				vertices[topologicalOrder[l]].distance = bigM;
		
		for(int l = 1; l < topologicalOrder.length; l++)
		{
			int currNode = topologicalOrder[l];
			
			int minDistance = bigM;
			
			for(int k = 0; k < vertices[currNode].adjIn.size(); k++)
			{
				int inNeighbor = vertices[currNode].adjIn.get(k).id;
				
				int currDistance = vertices[inNeighbor].distance + vertices[currNode].adjIn.get(k).length;
				
				if(currDistance < minDistance)
				{
					minDistance = currDistance;
					
					vertices[currNode].pred = inNeighbor;
				}
			}
			
			vertices[currNode].distance = minDistance;
		}
		
		System.out.println();
		System.out.println("The shortest distances are ");
		
		for(int i = 0; i < vertices.length; i++)
			System.out.print(vertices[i].distance + " "); 
		
		System.out.println();
	}

}
