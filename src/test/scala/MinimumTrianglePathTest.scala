class MinimumTrianglePathTest extends org.scalatest.FunSuite {
  test("Triangle with 1 level evaluates to itself") {
    val triangle = Array(
      Array(4)
    )
    assert(MinimumTrianglePath.solve(triangle) === 4)
  }
}
