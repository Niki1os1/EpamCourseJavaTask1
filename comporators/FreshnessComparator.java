package comporators;

import models.Flower;

import java.util.Comparator;

public class FreshnessComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower f1, Flower f2) {
        return Integer.compare(f1.getFreshness(), f2.getFreshness());
    }
}
