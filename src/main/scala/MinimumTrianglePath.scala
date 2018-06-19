object MinimumTrianglePath {
  def main(args: Array[String]) {
    println("Hello Supr!")
  }

  def solve(triangle: Array[Array[Int]]): Int = {
    if(triangle.length == 1) return triangle(0)(0)
    return triangle(0)(0) + Math.min(triangle(1)(0), triangle(1)(1))
  }
}