class Vertex:

    def __init__(self, id):
        self.id = id
        self.pred = -1
        self.order = -1
        self.distance = -1

        self.adjIn = []
        self.adjOut = []


class Arc:

    def __init__(self, id, length):
        self.id = id
        self.length = length
