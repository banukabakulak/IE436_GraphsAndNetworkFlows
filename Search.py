from Vertex import Vertex
from GraphSearch import Search

print("IE 436 Graph Search Algorithms....")

vertices = []

vertices.append(Vertex(1, [2, 3]))
vertices.append(Vertex(2, [3, 4, 5]))
vertices.append(Vertex(3, [4]))
vertices.append(Vertex(4, [6]))
vertices.append(Vertex(5, [4, 6]))
vertices.append(Vertex(6, []))

mySearch = Search()

#For BFS implementation
mySearch.ImplementSearch(vertices, 0, True)

#For DFS implementation
mySearch.ImplementSearch(vertices, 0, False)

