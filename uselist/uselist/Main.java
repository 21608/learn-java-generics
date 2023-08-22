package uselist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("one");
        sList.add("two");
        sList.add("three");

        Chooser<String> chooser = new Chooser<>(sList);
        System.out.println(chooser.choose());
    }
}
