package collectionStudy;
import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Velocity");
        arrayList.add(null);
        arrayList.add(123);
        arrayList.add('A');
        arrayList.add('C');
        arrayList.add('B');
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(null);
        arrayList.add(122.2f);
        arrayList.add("velocity");
        System.out.println(arrayList);
        arrayList.add(1,"testing");
        System.out.println(arrayList);
    }

}
