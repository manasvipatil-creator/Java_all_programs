package corejava;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a= "";
            for (int j = 0; j < 10000000; j++) {
                a += "a";

            }
            System.out.println(Thread.currentThread().getName() + "- Priority:" + Thread.currentThread().getPriority() + "-count:" + i);
            try {
                Thread.sleep(100);


            } catch (Exception e) {

            }
        }


    }



    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread h =new MyThread("High Priority Thread");
       l.setPriority(Thread.MIN_PRIORITY);
       m.setPriority(Thread.NORM_PRIORITY);
       h.setPriority(Thread.MAX_PRIORITY);
       l.start();
       m.start();
       h.start();

    }
}


