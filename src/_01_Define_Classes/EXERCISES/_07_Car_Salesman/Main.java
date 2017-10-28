package _01_Define_Classes.EXERCISES._07_Car_Salesman;

public class Main {

    String a;
    String b;
    String c;
    String d;

    public Main(String a, String b, String[]...arr) {
        this.a = a;
        this.b=b;
    }


    public Main(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Main(String a, String b, String c, String d) {
        this(a,b);
        this.c = c;
        this.d = d;
    }
}
