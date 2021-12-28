import java.util.Scanner;

class A {
    static int x, y, summ;
    Scanner sc = new Scanner(System.in);
}

class B extends A {

    void input() {
        System.out.print("Enter two numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
    }
}

class Main extends A {

    void add() {
        summ = x + y;
    }

    void result() {
        System.out.println("Sum is:" + summ);
    }

    public static void main(String args[]) {
        B obj1 = new B();
        obj1.input();

        Main obj2 = new Main();
        obj2.add();
        obj2.result();
    }
}
