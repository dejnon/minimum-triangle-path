import io.Source.stdin

case class Node(value: Int, trail: List[Int])

object MinimumTrianglePath {
  def main(args: Array[String]) {
    val triangle = stdin.
      getLines().
      map(_.
        split(" ").
        map(_.toInt)).
      toArray

    val minimumPath = solve(triangle)
    val path = minimumPath.trail.mkString(" + ")

    println(s"Minimal path is: ${path} = ${minimumPath.value}")
  }

  def solve(triangle: Array[Array[Int]]): Node = {
    val firstRow = Array.fill[Node](triangle.last.length+1)(Node(0, List()))

    def subTriangles(upperLevel: Array[Int], lowerLevel: Array[Node]): Array[Node] = {
      val lowerNodes   = lowerLevel.zip(lowerLevel.tail)
      val subTriangles = upperLevel.zip(lowerNodes)

      subTriangles.map {
        case (upperNode, (leftNode, rightNode)) => {
          val nextNode =
            if(leftNode.value < rightNode.value) leftNode else rightNode

          Node(
            upperNode + nextNode.value,
            upperNode :: nextNode.trail)
        }
      }
    }

    triangle.
      foldRight(firstRow)(subTriangles).
      head
  }
}
