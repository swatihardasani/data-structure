import java.util.LinkedList;

/**
 * Created by swati on 6/14/18.
 */
public class LinkedListExample {
    public static void main(String args[]){

        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();

        /* add(String Element) is used for adding the elements to the linked list */
        linkedList.add("Item 1");
        linkedList.add("Item 5");
        linkedList.add("Item 3");
        linkedList.add("Item 2");
        linkedList.add("Item 4");

        /* Display linked list content */
        System.out.println("Linked List Content: " + linkedList);

        /* Add First and Last Element */
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("Linked List Content after addition: " +linkedList);

        /* This is how to get and set values */
        Object firstvar = linkedList.get(0);
        System.out.println("First element: " + firstvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);
        System.out.println("First element after update by set method:  " +firstvar2);

        /* Remove first and last element */
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedList);

        /* Add to a Position and remove from a position */
        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println("Final Content: " +linkedList);
    }

}
