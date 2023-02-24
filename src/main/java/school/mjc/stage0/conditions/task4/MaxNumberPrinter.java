package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if ((first >= second && first > third) || (first > second && first >= third))
            System.out.println(first);
        if ((second >= first && second > third) || (second > first && second >= third))
            System.out.println(second);
        if ((third >= first && third > second) || (third > first && third >= second))
            System.out.println(third);
    }
}
