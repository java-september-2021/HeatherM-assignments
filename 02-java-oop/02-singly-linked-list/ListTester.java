public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
      SinglyLinkedList node = new SinglyLinkedList();
      node.addToList(19);
      node.addToList(20);
      node.addToList(21);
      node.displayList();
      System.out.println(node.searchList(19));
      System.out.println(node.searchList(33));
    }
}