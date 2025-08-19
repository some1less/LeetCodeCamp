package linkedList;

import java.util.ArrayList;
import java.util.List;

public class ListsManipul {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Anton");
        list.add("Bob");
        list.add("Vlad");
        list.add("Dan");
        list.add("Jack");
        list.add("John");
        list.add("Mary");
        System.out.println(list);

        deleteFirstCharacterInList(list);
        System.out.println(list);
    }

    public static void deleteFirstCharacterInList(List<String> list) {

        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);
            if (s.length() > 1) list.set(i, s.substring(1));
            else list.set(i, "");

        }

        list.sort(String::compareTo);

    }
}
