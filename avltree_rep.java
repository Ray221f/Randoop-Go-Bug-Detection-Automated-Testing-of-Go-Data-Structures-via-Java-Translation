@CheckRep
public boolean repOK() {
    // Entry point for invariant checking - starts recursion from root node
    // with no initial min/max bounds (null, null)
    return checkInvariants(root, null, null);
}

private boolean checkInvariants(AvlNode node, K min, K max) {
    // Base case: empty subtree is always valid
    if (node == null) return true;
    
    // 1. Check Binary Search Tree (BST) property:
    //    - Current node's key must be greater than min bound (if exists)
    //    - Current node's key must be less than max bound (if exists)    
    if (min != null && node.key.compareTo(min) <= 0) return false;
    if (max != null && node.key.compareTo(max) >= 0) return false;
    
    // 2. Check AVL balance condition:
    //    Height difference between left and right subtrees
    //    must be between -1 and 1 (inclusive)    
    int balance = height(node.left) - height(node.right);
    if (balance < -1 || balance > 1) return false;
    
    // 3. Verify structural integrity:
    //    a) Node's height must equal 1 + max height of children
    //    b) Node's size must equal 1 + sum of children's sizes    
    if (node.height != 1 + Math.max(height(node.left), height(node.right))) return false;
    if (node.size != 1 + size(node.left) + size(node.right)) return false;
    
    // 4. Recursively validate subtrees:
    //    - Left subtree: inherit parent's min bound, use current key as new max
    //    - Right subtree: use current key as new min, inherit parent's max bound    
    return checkInvariants(node.left, min, node.key)
            && checkInvariants(node.right, node.key, max);
}
