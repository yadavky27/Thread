class Displayed {
    public void wish(String name) {
        //you can write 1000000 line os code.
        synchronized (Displayed.class) {
            System.out.println("Thread which is the getting is lock is " + Thread.currentThread());
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning sir "+name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.print(name);
                }
                System.out.println("Thread which is the realising is lock "+Thread.currentThread());
                //you can write 1000 line of code
            }
        }
    }
}
            class mythreadsystem extends Thread{
                String name;
                Displayed d;
                mythreadsystem(Displayed d,String name)
                {
                    this.d=d;
                    this.name=name;
                }

                @Override
                public void run() {
                    d.wish(name);
                }
            }
public class L7 {
    public static void main(String[] args) {
        System.out.println();
        Displayed d1=new Displayed();
        Displayed d2=new Displayed();
        mythreadsystem t1=new mythreadsystem(d1,"krishna");
        mythreadsystem t2=new mythreadsystem(d2,"ajay");
t1.setName("krishna thread");
t2.setName("ajay thread");
t1.start();
t2.start();
    }
}
