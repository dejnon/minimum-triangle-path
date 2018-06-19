object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {
    triangle.reduceRight((upperLevel, lowerLevel) => {
      val  leftNodes = lowerLevel
      val rightNodes = lowerLevel.tail
      val lowerNodes = leftNodes.zip(rightNodes)
      upperLevel.zip(lowerNodes).map {
        case (upperNode, (leftNode, rightNode)) => {
          upperNode + Math.min(leftNode, rightNode)
        }
      }
    }).head
  }
}
