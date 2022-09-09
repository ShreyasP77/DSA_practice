package BinaryTrees;

public class Create_BT {
    static int index = -1;
    public BTree buildTree(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }

        BTree node = new BTree(nodes[index]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }
}
