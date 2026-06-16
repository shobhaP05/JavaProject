package vectorAssignment;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
    public static void main (String[] args){
        Vector<String> v=new Vector<>();
        v.add("Java");
        v.add("Selinium");
        v.add("python");
        v.add("Assignment");
        v.add("c#");
        System.out.println("====For loop==========");
        for(int i=0; i<=v.size()-1;i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("===========For each=========");
        for(String v1:v)
        {
            System.out.println(v1);
        }
        System.out.println("=========iterator=========");
        Iterator<String> itr= v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("=================listIterator==============");
        ListIterator<String> lit=v.listIterator();
        while(lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("=======================Enumarator=========");
        Enumeration<String> enm=v.elements();
        while(enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }

        }

        }
    

