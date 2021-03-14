package Algorithm;

import java.util.LinkedList;

public class GraphSearch {
	
	public GraphSearch() {}
	
	public void ImplementBFS(Vertex[] vertices, int s)
	{
		for(int i = 0; i < vertices.length; i++)
			vertices[i].isMarked = false;
		
		LinkedList<Integer> LIST = new LinkedList<Integer>(); 
		
		LIST.add(s);
		vertices[s].order = 1;
		vertices[s].isMarked = true;
		
		int next = 1;
		
		while(!LIST.isEmpty())
		{
			int currVertex = LIST.getFirst();
			
			boolean isAdmissible = false;
			
			for(int i = 0; i < vertices[currVertex].adj.size(); i++)
			{
				int currNeighbor = vertices[currVertex].adj.get(i);
				
				if(!vertices[currNeighbor].isMarked)
				{
					vertices[currNeighbor].isMarked = true;					
					vertices[currNeighbor].pred = currVertex;
					next++;
					vertices[currNeighbor].order = next;					
					
					LIST.addLast(currNeighbor);
					
					isAdmissible = true;
					
					break;
				}				
			}
			
			if(!isAdmissible)
				LIST.removeFirst();			
		}
		
		System.out.println();
		System.out.println("The orders in BFS");
		for(int i = 0; i < vertices.length; i++)
			System.out.println("The (order, pred) of vertex " + i + " is (" + vertices[i].order + ", " + vertices[i].pred + ")");
	}
	
	public void ImplementDFS(Vertex[] vertices, int s)
	{
		for(int i = 0; i < vertices.length; i++)
			vertices[i].isMarked = false;
		
		LinkedList<Integer> LIST = new LinkedList<Integer>(); 
		
		LIST.add(s);
		vertices[s].order = 1;
		vertices[s].isMarked = true;
		
		int next = 1;
		
		while(!LIST.isEmpty())
		{
			int currVertex = LIST.getLast();
			
			boolean isAdmissible = false;
			
			for(int i = 0; i < vertices[currVertex].adj.size(); i++)
			{
				int currNeighbor = vertices[currVertex].adj.get(i);
				
				if(!vertices[currNeighbor].isMarked)
				{
					vertices[currNeighbor].isMarked = true;					
					vertices[currNeighbor].pred = currVertex;
					next++;
					vertices[currNeighbor].order = next;					
					
					LIST.addLast(currNeighbor);
					
					isAdmissible = true;
					
					break;
				}				
			}
			
			if(!isAdmissible)
				LIST.removeLast();			
		}
		
		System.out.println();
		System.out.println("The orders in BFS");
		for(int i = 0; i < vertices.length; i++)
			System.out.println("The (order, pred) of vertex " + i + " is (" + vertices[i].order + ", " + vertices[i].pred + ")");
	}

}
