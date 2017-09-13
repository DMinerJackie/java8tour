package lambda;

/**
 * 启动线程，使用lambda和未使用lambda
 * Created by jackie on 17/9/13.
 */
public class ThreadLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runable thread");
            }
        });

        thread.start();

        Thread lambdaThread = new Thread(() -> System.out.println("This is lambda runnable thread"));
        lambdaThread.start();
    }
}
