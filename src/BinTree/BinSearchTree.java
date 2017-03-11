package BinTree;

/**
 * Created by hadoop on 17-3-11.
 * 二叉搜索树
 */
public class BinSearchTree<T extends Comparable<? super T>> {
    private BinNode<T> rootTree;

    public BinSearchTree() {
        rootTree = null;
    }

    public void clear() {
        rootTree = null;
    }

    public boolean isEmpty() {
        return rootTree == null;
    }

    public boolean contains(T t) {
        return contains(t, rootTree);
    }

    /**
     * 找到二叉查找树中的最小值
     */
    public T findMin() {
        if (isEmpty()) {
            System.out.println("二叉树为空");
            return null;
        } else {
            return findMin(rootTree).data;
        }
    }

    /**
     * 找到二叉查找树中的最大值
     */
    public T findMax() {
        if (isEmpty()) {
            System.out.println("二叉树为空");
            return null;
        } else {
            return findMax(rootTree).data;
        }
    }

    /**
     * 插入元素
     */
    public void insert(T t) {
        rootTree = insert(t, rootTree);
    }

    /**
     * 删除元素
     */
    public void remove(T t) {
        rootTree = remove(t, rootTree);
    }

    /**
     * 打印二叉查找树
     */
    public void printTree() {

    }

    public boolean contains(T t, BinNode<T> node) {
        if (node == null) {
            return false;
        }
        int result = t.compareTo(node.data);
        if (result > 0) {
            return contains(t, node.right);
        } else if (result < 0) {
            return contains(t, node.left);
        } else {
            return true;
        }
    }

    public BinNode<T> findMin(BinNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    public BinNode<T> findMax(BinNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.right == null) {
            return node;
        }
        return findMax(node.right);
    }

    /**
     * 在某个位置开始判断插入元素
     */
    public BinNode<T> insert(T t, BinNode<T> node) {
        if (node == null) {
            //新构造一个二叉查找树
            return new BinNode<T>(t, null, null);
        }
        int result = t.compareTo(node.data);
        if (result < 0) {
            node.left = insert(t, node.left);
        } else if (result > 0) {
            node.right = insert(t, node.right);
        }

        return node;
    }

    /**
     * 在某个位置开始判断删除某个结点
     */
    public BinNode<T> remove(T t, BinNode<T> node) {
        if (node == null)
            return node;//没有找到
        int result = t.compareTo(node.data);
        if (result > 0) {
            node.right = remove(t, node.right);
        } else if (result < 0) {
            node.left = remove(t, node.left);
        } else if (node.left != null && node.right != null) {
            node.data = findMin(node.right).data;
            node.right = remove(node.data, node.right);
        } else {
            node = (node.left != null) ? node.left : node.right;
        }

        return node;
    }

    public BinNode<Integer> init() {
        BinNode<Integer> node3 = new BinNode<>(3);
        BinNode<Integer> node1 = new BinNode<>(1);
        BinNode<Integer> node4 = new BinNode<>(4, node3, null);
        BinNode<Integer> node2 = new BinNode<>(2, node1, node4);
        BinNode<Integer> node8 = new BinNode<>(8);
        BinNode<Integer> root  = new BinNode<>(6, node2, node8);
        return root;
    }

    public void preOrder(BinNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    public static void main(String[] args) {
        BinSearchTree searchTree = new BinSearchTree<>();
        BinNode<Integer> node = searchTree.init();
        searchTree.rootTree = node;
        System.out.print("遍历节点：");
        searchTree.preOrder(searchTree.rootTree);
        System.out.println("");
        System.out.println("删除节点： 4");
        searchTree.remove(4);
        System.out.print("遍历节点：");
        searchTree.preOrder(searchTree.rootTree);
        System.out.println("");
        System.out.println("最大值: " + searchTree.findMax());
        System.out.println("最小值: " + searchTree.findMin());
    }
}
