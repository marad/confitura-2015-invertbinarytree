case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode]) {
  def inverted: TreeNode = TreeNode(
    value, 
    right.map(_.inverted),
    left.map(_.inverted))
}

