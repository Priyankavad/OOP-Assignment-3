import java.util.Scanner;

abstract class First {

    int a, b, summ;

    abstract void input();
    abstract void add();
    abstract void result();
    Scanner sc = new Scanner(System.in);
}

class Main extends First {

    void input() {
        System.out.print("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void add() {
        summ = a + b;
    }

    void result() {
        System.out.print("Sum of two numbers:" + summ);
    }

    public static void main(String args[]) {
        Main st = new Main();
        st.input();
        st.add();
        st.result();
    }
}
