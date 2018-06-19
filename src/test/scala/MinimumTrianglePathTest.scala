class MinimumTrianglePathTest extends org.scalatest.FunSuite {
  test("Triangle with 1 level evaluates to itself") {
    val triangle = Array(
      Array(4)
    )
    assert(MinimumTrianglePath.solve(triangle) === 4)
  }
  test("Minimum path for triangle with 1 level") {
    val triangle = Array(
      Array(1)
    )
    assert(MinimumTrianglePath.solve(triangle) === 1)
  }
  test("Minimum path for triangle with 2 levels") {
    val triangle = Array(
      Array( 2 ),
      Array(2,1)
    )
    assert(MinimumTrianglePath.solve(triangle) === 3)
  }
}
