public class Main2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Turtle1());
        Thread t2 = new Thread(new Turtle2());

        t1.start();
        t2.start();

    }
}

class Turtle1 implements Runnable {
    public void run() {
        walk();
    }

    public void walk() {
        Turtle t = new Turtle();
        t.speed(2);

        t.up();
        t.home();
        t.left(180);
        t.forward(300);
        t.right(90);
        t.forward(90);
        t.right(90);
        t.down();

        for (int i = 0; i < 200; i++) {
            t.penColor("orange");
            t.forward(45);
            t.left(5);
        }
    }
}

class Turtle2 implements Runnable {
    public void run() {
        walk();
    }

    public void walk() {
        Turtle t = new Turtle();
        t.speed(2);


        for (int i = 0; i < 200; i++) {
            t.penColor("red");
            t.left(100);

            for (int j = 0; j < 5; j++) {
                t.forward(60);
                t.left(50);
            }
        }

        t.up();

    }
}

class Turtle3 implements Runnable {
    public void run() {
        walk();
    }

    public void walk() {
        Turtle t = new Turtle();
        t.speed(2);

        t.up();
        t.home();
        t.left(180);
        t.forward(300);
        t.right(90);
        t.forward(90);
        t.right(90);
        t.down();

        for (int i = 0; i < 200; i++) {
            t.penColor("yellow");
            t.forward(45);
            t.left(5);
        }
    }
}