package Algorithm;
import ilog.concert.*;
import ilog.cplex.*;

public class CplexEx {
	
	// The example is on Lecture 7 on page 2.
	
	final static int SIZE = 4;

	private static void ExampleForLecture8() {
		
		Vertex[] vertices = new Vertex[SIZE];
		
		for(int i = 0; i < vertices.length; i++)
			vertices[i] = new Vertex(i);

		vertices[0].adjOut.add(new Arc(1, 2));
		vertices[0].adjOut.add(new Arc(2, 4));
		vertices[1].adjIn.add(new Arc(0, 2));
		vertices[2].adjIn.add(new Arc(0, 4));
		
		vertices[1].adjOut.add(new Arc(2, 3));
		vertices[1].adjOut.add(new Arc(3, 1));
		vertices[2].adjIn.add(new Arc(1, 3));
		vertices[3].adjIn.add(new Arc(1, 1));

		vertices[2].adjOut.add(new Arc(3, 5));
		vertices[3].adjIn.add(new Arc(2, 5));
		
		System.out.println("hello world!");
		
		LinearProgram myLP = new LinearProgram();
		myLP.ImplementLinearProgram(vertices, 0, 3);
		
	}

	public static void main(String[] args) {
		System.out.println("hello world!");
		
		ExampleForLecture8();

	}
}
