package materials.src.main.java.org.example.books.grokking_algorithms.main;

public class Factorial {

    public int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }

    public int getFactorial(int number) {
        if (isZeroOrOne(number)) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }

    public boolean isZeroOrOne(int number) {
        if (number > 1) {
            return false;
        }
        return true;
    }
}


