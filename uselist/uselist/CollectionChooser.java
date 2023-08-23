package uselist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CollectionChooser<T> {
    private final List<T> choiceList;

    public CollectionChooser(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }

    public T chooseOf() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}