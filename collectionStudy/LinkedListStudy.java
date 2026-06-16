package collectionStudy;



import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    public static void main(String[] args){
        LinkedList<Integer> LinkedList=new LinkedList<>();
        LinkedList.add(12);
        LinkedList.add(12);
        LinkedList.add(null);
        LinkedList.add(null);
        LinkedList.add(13);
        LinkedList.add(19);
        LinkedList.add(22);
        System.out.println(LinkedList);
        LinkedList.add(1,100);
        System.out.println(LinkedList);
        System.out.println(LinkedList.get(1));
        LinkedList.addLast(111);
        LinkedList.clone();
        LinkedList.addFirst(99);
        LinkedList.contains(22);
        LinkedList.offer(99);
        LinkedList.offerFirst(77);
        LinkedList.offerLast(78);
        System.out.println(LinkedList);

        System.out.println(LinkedList.peek());
        System.out.println(LinkedList);
        System.out.println(LinkedList.peekFirst());
        System.out.println(LinkedList.peekLast());
        System.out.println(LinkedList);


        System.out.println(LinkedList.poll());
        System.out.println(LinkedList.pollFirst());
        System.out.println(LinkedList.pollLast());
        System.out.println(LinkedList);
        LinkedList.pop();
        System.out.println(LinkedList);
        //traversing
        //for for each  iterator list-iterator
        ListIterator<Integer> lit = LinkedList.listIterator();
        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }
    }
}




