//package test;

//import domain.Exercise;

public class TestResult {

    public static void main(String[] args)
    {
        String text = "ATTACKATONCE";
        int n = 4;
        System.out.println("Слово  : " + text);
        System.out.println("Зсув : " + n);
        System.out.println("Шифр: " + Exercise.Calculate(text, n));
    }
}
