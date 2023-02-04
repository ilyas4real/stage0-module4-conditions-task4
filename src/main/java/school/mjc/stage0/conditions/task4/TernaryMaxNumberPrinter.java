package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int largest, temp;
        temp = first > second ? first:second;
        largest = third > temp ? third:temp;
        System.out.println(largest);
    }
}
