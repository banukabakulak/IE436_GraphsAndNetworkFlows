class Vertex:
    id = -1
    pred = -1
    order = -1
    adj = []
    isMarked = False

    def __init__(self, idIn, adjIn):
        self.id = idIn
        self.adj = adjIn

