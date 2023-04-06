class Ordering:

    def ImplementTopologicalOrdering(self, vertices):

        inDegrees = [len(v.adjIn) for v in vertices]
        topologicalOrder = [-1] * len(vertices)
        orderCount = 0

        while orderCount < len(vertices):
            for i in range(len(inDegrees)):
                if inDegrees[i] == 0 and vertices[i].order < 0:
                    vertices[i].order = orderCount
                    topologicalOrder[orderCount] = i
                    orderCount += 1

                    # update inDegrees after elimination of node i from the network
                    for l in range(len(vertices[i].adjOut)):
                        neighbor = vertices[i].adjOut[l].id
                        inDegrees[neighbor] -= 1

                    break

        print("Topological order is ")
        for i in range(len(topologicalOrder)):
            print(topologicalOrder[i], end=" ")

        return topologicalOrder
