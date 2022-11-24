import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.start();

        Runnables runnables = new Runnables();
        Thread threadForRunnable = new Thread(runnables);
        threadForRunnable.start();

        Callables callables = new Callables();
        FutureTask<String> stringFutureTask = new FutureTask<String>(callables);
        Thread threadForCallable = new Thread(stringFutureTask);
        threadForCallable.start();
    }
}
