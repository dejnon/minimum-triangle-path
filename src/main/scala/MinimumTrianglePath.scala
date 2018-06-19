object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {
    val upperNode = triangle(0)(0)
    if(triangle.length == 1) return upperNode

    val leftNode  = triangle(1)(0)
    val rightNode = triangle(1)(1)
    return upperNode + Math.min(leftNode, rightNode)
  }
}