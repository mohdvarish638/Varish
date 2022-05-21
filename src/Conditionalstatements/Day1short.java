package Conditionalstatements;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class Day1short {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Mohmmad");
        list.add("Arif");
        list.add("Mohan");
        list.add("Sameer");
        System.out.println("Print the list "+list);
        Collections.sort(list);
        System.out.println("print the sort list"+list);
        Collections.reverse(list);
        System.out.println("reverse the name "+list);
    }
}
