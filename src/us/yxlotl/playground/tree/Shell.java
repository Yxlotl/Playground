package us.yxlotl.playground.tree;

public class Shell {
    public static void main(String[] args) {
        //init nodes
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        //add two subnodes to A -- B and C
        A.addSubnode(B);
        C.addSubnode(D);
        A.addSubnode(C);

        //print full list
        A.print();
    }
}
