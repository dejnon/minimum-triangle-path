class MinimumTrianglePathTest extends org.scalatest.FunSuite {
  test("Triangle with 1 level evaluates to itself") {
    val triangle = Array(
      Array(4)
    )
    assert(MinimumTrianglePath.solve(triangle).value === 4)
  }
  test("Minimum path for triangle with 1 level") {
    val triangle = Array(
      Array(1)
    )
    assert(MinimumTrianglePath.solve(triangle).value === 1)
  }
  test("Minimum path for triangle with 2 levels") {
    val triangle = Array(
      Array( 3 ),
      Array(2,1)
    )
    assert(MinimumTrianglePath.solve(triangle).value === 4)
  }
  test("Minimum path for triangle with 3 levels") {
      val triangle = Array(
      Array(  1  ),
      Array( 3,2 ),
      Array(4,2,1)
    )
    assert(MinimumTrianglePath.solve(triangle).value === 4)
  }
  test("Minimum path for triangle with 4 levels") {
    val triangle = Array(
      Array(   1   ),
      Array(  3,2  ),
      Array( 4,2,1 ),
      Array(4,2,1,1)
    )
    assert(MinimumTrianglePath.solve(triangle).value === 5)
  }
}
