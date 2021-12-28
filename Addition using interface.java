import java.util.Scanner;

interface First {
    void input();
    void add();
}

class Main implements First {

    int x, y, summ;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter two numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void add() {
        summ = x + y;
    }

    void display() {
        System.out.println("Sum is:" + summ);
    }

    public static void main(String args[]) {
        Main t = new Main();
        t.input();
        t.add();
        t.display();
    }
}
