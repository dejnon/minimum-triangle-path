object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {
    triangle.reduceRight((upperLevel, lowerLevel) => {
      upperLevel.zipWithIndex.map{
        case (upperNode, node) => {
          val leftNode  = lowerLevel(node)
          val rightNode = lowerLevel(node+1)
          upperNode + Math.min(leftNode, rightNode)
        }
      }
    }).head
  }
}
