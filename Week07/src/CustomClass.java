public class CustomClass implements Comparable<CustomClass> {

    private int value;

    public CustomClass(int valueToSortBy) {
        this.value = valueToSortBy;
    }

    public int compareTo(CustomClass other) {
        if (this.value > other.value) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return "" + this.value;
    }
}
