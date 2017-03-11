package BinTree;

/**
 * Created by hadoop on 17-3-11.
 * 二叉树节点
 */
public class BinNode<T> {
    T data;
    BinNode<T> left;
    BinNode<T> right;

    public BinNode(T data) {
        this(data, null, null);
    }

    public BinNode(T data, BinNode<T> left, BinNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }
}
