package Algorithm;

import java.util.LinkedList;

public class Vertex {
	
	int id;
	int pred;
	int distance;
	int order;
	
	LinkedList<Arc> adjOut = new LinkedList<Arc>(); 
	LinkedList<Arc> adjIn = new LinkedList<Arc>(); 
	
	
//	LinkedList<Integer> adj = new LinkedList<Integer>(); 
//	
//	boolean isMarked = false;
	
	public Vertex() {}
	
	public Vertex(int idIn) 
	{
		id = idIn;
		pred = -1;
		order = -1;
	}

}
