package set;

import java.util.Arrays;

class IntegerSet {

    public Integer[] set;

    public IntegerSet(Integer[] set) {
        this.set = set;
    }

    public void sort() {
        Arrays.sort(set);
    }

    public Integer size() {
        return set.length;
    }

    public Integer get(Integer idx) {
        return set[idx];
    }

}