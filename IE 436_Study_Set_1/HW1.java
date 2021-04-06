package Algorithm;

public class HW1 {

	final static int SIZE = 6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		
		Vertex[] vertices = new Vertex[SIZE];
		
		for(int i = 0; i < vertices.length; i++)
			vertices[i] = new Vertex(i);

		vertices[0].adjOut.add(new Arc(1, 4));
		vertices[1].adjIn.add(new Arc(0, 4));
		
		vertices[0].adjOut.add(new Arc(2, 6));
		vertices[2].adjIn.add(new Arc(0, 6));
		
		vertices[1].adjOut.add(new Arc(3, 2));
		vertices[3].adjIn.add(new Arc(1, 2));
		
		vertices[1].adjOut.add(new Arc(4, 1));
		vertices[4].adjIn.add(new Arc(1, 1));
		
		vertices[2].adjOut.add(new Arc(1, 2));
		vertices[1].adjIn.add(new Arc(2, 2));
		
		vertices[2].adjOut.add(new Arc(4, 2));
		vertices[4].adjIn.add(new Arc(2, 2));
		
		vertices[3].adjOut.add(new Arc(4, 1));
		vertices[4].adjIn.add(new Arc(3, 1));
		
		vertices[3].adjOut.add(new Arc(5, 3));
		vertices[5].adjIn.add(new Arc(3, 3));
		
		vertices[4].adjOut.add(new Arc(5, 7));
		vertices[5].adjIn.add(new Arc(4, 7));
		
		ShortestPath shortestPath = new ShortestPath();
		shortestPath.ImplementShortestPathForDAG(vertices);
		
		System.out.println("Hello world!");
		

	}

}
