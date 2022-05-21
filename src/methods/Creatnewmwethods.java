package methods;
import java.util.Collections;

import java.util.LinkedList;
import java.util.List;

public class Creatnewmwethods {

    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        list.add("arif");
        list.add("barish");
        list.add("zapam");
        list.add("faraz");
        System.out.println("print list "+list);
        Collections.sort(list);
        System.out.println("sotred list "+list);
    }
}
