class A {
    public void run() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Exec : Thread 1");
    }
}

class B {
    A a;

    B(A a) {
        this.a = a;
    }

    public void run() {
        System.out.println("Exec : Thread 2");

        synchronized (a) {
            a.notify();
        }
    }
}

public class Sync {

}
