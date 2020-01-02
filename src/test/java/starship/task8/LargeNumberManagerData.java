package starship.task8;

public class LargeNumberManagerData {
    private int countAdjacentNumbers;
    private String numericString;
    private int actual;

    public LargeNumberManagerData(int countAdjacentNumbers, String numericString, int actual) {
        this.countAdjacentNumbers = countAdjacentNumbers;
        this.numericString = numericString;
        this.actual = actual;
    }

    public int getCountAdjacentNumbers() {
        return countAdjacentNumbers;
    }

    public String getNumericString() {
        return numericString;
    }

    public int getActual() {
        return actual;
    }
}
