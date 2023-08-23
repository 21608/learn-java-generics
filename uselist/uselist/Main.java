package uselist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("one");
        sList.add("two");
        sList.add("three");

        CollectionChooser<String> collectionChooser = new CollectionChooser<>(sList);
        System.out.println(collectionChooser.chooseOf());
    }
}
