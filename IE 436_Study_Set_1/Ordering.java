package Algorithm;

public class Ordering {
	
	public int[] ImplementTopologicalOrdering(Vertex[] vertices)
	{
		int[] inDegrees = new int[vertices.length];
		
		for(int i = 0; i < inDegrees.length; i++)
			inDegrees[i] = vertices[i].adjIn.size();
		
		int[] topologicalOrder = new int[vertices.length];
		
		for(int i = 0; i < topologicalOrder.length; i++)
			topologicalOrder[i] = -1;
		
		int orderCount = 0;
		
		while(orderCount < vertices.length)
		{
			for(int i = 0; i < inDegrees.length; i++)
				if(inDegrees[i] == 0 && vertices[i].order < 0)
				{
					vertices[i].order = orderCount;					
					topologicalOrder[orderCount] = i;
					orderCount++;
					
					// update inDegrees after elimination of node i from the network
					for(int l = 0; l < vertices[i].adjOut.size(); l++)
					{
						int neighbor = vertices[i].adjOut.get(l).id;
						
						inDegrees[neighbor]--;
					}		
					
					break;					
				}
		}
		
		System.out.println("Topological order is ");
		
		for(int i = 0; i < topologicalOrder.length; i++)
			System.out.print(topologicalOrder[i] + " "); 
		
		return topologicalOrder;
		
	}

}
