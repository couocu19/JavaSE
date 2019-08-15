package collection;

public class Node {

    Node previous;//上一个节点
    Node next;  //下一个节点
    Object element;  //数据本身

    //构造器
    public Node(Node previous, Node next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
