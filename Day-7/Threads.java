class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            try{
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Beeebebee");
            }
            System.out.println("Exec : Thread A");
        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("Exec : Thread B");
        }
    }
}

class Threads extends Thread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
