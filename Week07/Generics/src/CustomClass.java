public class CustomClass implements Comparable<CustomClass> {

    private int eventTime;

    public CustomClass(int valueToSortBy) {
        this.eventTime = valueToSortBy;
    }

    public int compareTo(CustomClass other) {
        if (this.eventTime > other.eventTime) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return "CustomClass " + this.eventTime;
    }
}
