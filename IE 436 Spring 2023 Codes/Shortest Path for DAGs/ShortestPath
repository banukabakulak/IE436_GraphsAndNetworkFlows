from Ordering import Ordering

class ShortestPath:
    bigM = 100000

    def ImplementShortestPathForDAG(self, vertices):

        topologicalOrdering = Ordering()

        topologicalOrder = topologicalOrdering.ImplementTopologicalOrdering(vertices)

        # initialize distance labels
        for l in range(len(topologicalOrder)):
            if l == 0:
                vertices[topologicalOrder[l]].distance = 0
            else:
                vertices[topologicalOrder[l]].distance = self.bigM

        for l in range(1, len(topologicalOrder)):
            currNode = topologicalOrder[l]
            minDistance = self.bigM

            for k in range(len(vertices[currNode].adjIn)):
                inNeighbor = vertices[currNode].adjIn[k].id

                currDistance = vertices[inNeighbor].distance + vertices[currNode].adjIn[k].length

                if currDistance < minDistance:
                    minDistance = currDistance

                    vertices[currNode].pred = inNeighbor

            vertices[currNode].distance = minDistance

        print()
        print("The shortest distances are ")

        for i in range(len(vertices)):
            print(vertices[i].distance, end=" ")

        print()
