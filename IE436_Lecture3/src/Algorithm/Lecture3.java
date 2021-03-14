package Algorithm;

public class Lecture3 {
	
	final static int SIZE = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		
		Vertex[] vertices = new Vertex[SIZE];
		
		for(int i = 0; i < vertices.length; i++)
			vertices[i] = new Vertex(i);

		vertices[0].adj.add(1);
		vertices[0].adj.add(2);
		
		vertices[1].adj.add(2);
		vertices[1].adj.add(4);
		vertices[1].adj.add(3);
		
		vertices[2].adj.add(3);		
		vertices[3].adj.add(5);		
		vertices[4].adj.add(3);
		vertices[4].adj.add(5);
		
		GraphSearch mySearch = new GraphSearch();
		//mySearch.ImplementBFS(vertices, 0);
		
		mySearch.ImplementDFS(vertices, 0);
	}

}

