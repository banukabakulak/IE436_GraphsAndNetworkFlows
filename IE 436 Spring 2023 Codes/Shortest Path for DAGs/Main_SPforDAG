from Network import Vertex, Arc
from ShortestPath import ShortestPath

print("Shortest Path Algorithm for Directed Acyclic Graphs")

SIZE = 6

vertices = [Vertex(i) for i in range(SIZE)]

vertices[0].adjOut.append(Arc(1, 4))
vertices[1].adjIn.append(Arc(0, 4))

vertices[0].adjOut.append(Arc(2, 6))
vertices[2].adjIn.append(Arc(0, 6))

vertices[1].adjOut.append(Arc(3, 2))
vertices[3].adjIn.append(Arc(1, 2))

vertices[1].adjOut.append(Arc(4, 1))
vertices[4].adjIn.append(Arc(1, 1))

vertices[2].adjOut.append(Arc(1, 2))
vertices[1].adjIn.append(Arc(2, 2))

vertices[2].adjOut.append(Arc(4, 2))
vertices[4].adjIn.append(Arc(2, 2))

vertices[3].adjOut.append(Arc(4, 1))
vertices[4].adjIn.append(Arc(3, 1))

vertices[3].adjOut.append(Arc(5, 3))
vertices[5].adjIn.append(Arc(3, 3))

vertices[4].adjOut.append(Arc(5, 7))
vertices[5].adjIn.append(Arc(4, 7))

shortestPath = ShortestPath()
shortestPath.ImplementShortestPathForDAG(vertices)
