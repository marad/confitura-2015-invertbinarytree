import org.scalatest.{FlatSpec, Matchers, GivenWhenThen}

class TreeNodeTest extends FlatSpec with GivenWhenThen with Matchers {
  it should "invert the tree" in {
    When("invert is invoked")
    val inverted = inputTree.inverted
    
    Then("resulting tree should be inverted")
    inverted shouldBe expectedTree
  }
  
  val node7 = TreeNode(7, None, None)
  val node6 = TreeNode(6, None, None)
  val node5 = TreeNode(5, None, None)
  val node4 = TreeNode(4, None, None)
  val inputNode3 = TreeNode(3, Some(node6), Some(node7))
  val inputNode2 = TreeNode(2, Some(node4), Some(node5))
  val inputTree = TreeNode(1, Some(inputNode2), Some(inputNode3))

  val expectedNode3 = TreeNode(3, Some(node7), Some(node6))
  val expectedNode2 = TreeNode(2, Some(node5), Some(node4))
  val expectedTree = TreeNode(1, Some(expectedNode3), Some(expectedNode2))
}
