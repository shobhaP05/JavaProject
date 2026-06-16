package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();
        System.out.println(vector);
        vector.add("test");
        vector.add(null);
        vector.add(null);
        vector.add(123);
        vector.add(123);
        vector.add(null);
        vector.add(true);
        vector.add('A');
        vector.add("test");
        System.out.println(vector);


        vector.add(2, 90);
        System.out.println(vector);


        System.out.println(vector.get(5));
        vector.addElement(12);
        System.out.println(vector);


        System.out.println(vector.elementAt(0));
        vector.firstElement();
        vector.lastElement();


        vector.insertElementAt(888, 1);
        System.out.println(vector);
        System.out.println("==============for loop=================");
        for (int i = 0; i <= vector.size() - 1; i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("==============for each loop=================");
        for (Object v : vector) {
            System.out.println(v);
        }
        System.out.println("==============iterator=================");
        Iterator<Object> it = vector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("==============List-iterator=================");
        ListIterator<Object> lit = vector.listIterator();
        // while (lit.hasNext()) {
        //         System.out.println(lit.next());
//            lit.add(12);//add
//            lit.remove();//remove
//            lit.set(23);//update


        //      }


        System.out.println(vector);
        System.out.println(lit.next());
        lit.next();
        lit.next();
        lit.next();
        lit.remove();
//        System.out.println(vector);
//        lit.next();
//        lit.set("velocity");
//        System.out.println(vector);
//        lit.add("classes");
        lit.next();
        lit.set("velocity");


        System.out.println(vector);


        System.out.println("===========Enumeration============");
        Enumeration<Object> ele = vector.elements();
        while (ele.hasMoreElements()) {
            System.out.println(ele.nextElement());//only read
        }




    }
}



