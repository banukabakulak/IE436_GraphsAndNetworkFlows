from Vertex import Vertex

class Search:

    def ImplementSearch(self, vertices, s, isBFS = True):

        n = len(vertices)
        for i in range(n):
            vertices[i].isMarked = False;

        LIST = []
        LIST.append(s);
        vertices[s].order = 1;
        vertices[s].isMarked = True;
        iter = 1;

        while len(LIST) != 0:

            if isBFS:
                currVertex = LIST[0]
            else:
                currVertex = LIST[-1]

            isAdmissible = False;

            for i in range(len(vertices[currVertex].adj)):
                currNeighbor = vertices[currVertex].adj[i] -1

                if not vertices[currNeighbor].isMarked:
                    vertices[currNeighbor].isMarked = True
                    vertices[currNeighbor].pred = currVertex
                    iter = iter + 1
                    vertices[currNeighbor].order = iter
                    LIST.append(currNeighbor)
                    isAdmissible = True
                    break

            if not isAdmissible:
                if isBFS:
                   del LIST[0]
                else:
                    del LIST[-1]

        print()
        if isBFS:
            print("The orders in BFS")
        else:
            print("The orders in DFS")
        for i in range(n):
            print(f"The (order, pred) of vertex {i + 1} is ({vertices[i].order}, {vertices[i].pred + 1})")
