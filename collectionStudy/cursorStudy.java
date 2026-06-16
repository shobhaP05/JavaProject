package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class cursorStudy {
  public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList<>();

      arrayList.add(22);
      arrayList.add(56);
      arrayList.add(34);
      arrayList.add(89);
      arrayList.add(90);
      arrayList.add(45);
      arrayList.add(34);
      System.out.println(arrayList);

      //for loop
      //int=0;  condition=object.size()-1; i++;
      for (int i = 0; i <= arrayList.size() - 1; i++)
      {
          System.out.println(arrayList.get(i));
      }


      //for each loop----->advanced for loop
      for(Integer a1 : arrayList) {
          System.out.println(a1);
      }
      //iterator----->cursor
      Iterator<Integer>it = arrayList.iterator();
      while (it.hasNext()) {
          System.out.println(it.next());
          it .remove();
      }
      System.out.println(arrayList);
      //list-iterator
      ListIterator<Integer>lit= arrayList.listIterator();
      while(lit.hasNext()) {
          System.out.println(lit.next());
      }
      //reverse-iterator
      while(lit.hasPrevious()){
          System.out.println(lit.previous());
      }



      }
  }






