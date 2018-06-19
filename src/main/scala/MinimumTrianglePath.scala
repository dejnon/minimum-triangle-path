object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {
    val sums = triangle.map(_.clone)

    for( level <- (1 until triangle.length).reverse){
      for( node <- (0 until (triangle(level).length - 1))){
        val upperNode = sums(level-1)(node)
        val leftNode  = sums(level)(node)
        val rightNode = sums(level)(node+1)

        sums(level-1)(node) = upperNode + Math.min(leftNode, rightNode)
      }
    }

    return sums(0)(0)
  }
}