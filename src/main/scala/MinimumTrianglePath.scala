object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {

    val sums = triangle.map(_.clone)

    sums.reduceRight((upperLevel, lowerLevel) => {
      for( node <- (0 until (lowerLevel.length - 1))){
        val upperNode = upperLevel(node)
        val leftNode  = lowerLevel(node)
        val rightNode = lowerLevel(node+1)

        upperLevel(node) = upperNode + Math.min(leftNode, rightNode)
      }
      upperLevel
    })

    return sums(0)(0)
  }
}