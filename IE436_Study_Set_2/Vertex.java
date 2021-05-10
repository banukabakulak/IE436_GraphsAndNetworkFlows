package Algorithm;

import java.util.LinkedList;

public class Vertex {
	
	int id;
	
	LinkedList<Arc> adjIn = new LinkedList<Arc>(); 
	LinkedList<Arc> adjOut = new LinkedList<Arc>(); 
	
	public Vertex() {}
	
	public Vertex(int idIn) 
	{
		id = idIn;
	}
}
