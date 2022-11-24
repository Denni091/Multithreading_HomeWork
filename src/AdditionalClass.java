import java.util.concurrent.FutureTask;

public class AdditionalClass {
    public static void workWithVariableAndFlow() {
        String userName = "qwerty";

        Threads threads = new Threads();
        threads.setName("Nick");
        System.out.println("Stream thread name: " + threads.getName());

        Runnables runnables = new Runnables();
        Thread threadForRunnable = new Thread(runnables);
        threadForRunnable.setName("Tom");
        System.out.println("Stream runnable name: " + threadForRunnable.getName());

        Callables callables = new Callables();
        FutureTask<String> stringFutureTask = new FutureTask<String>(callables);
        Thread threadForCallable = new Thread(stringFutureTask);
        threadForCallable.setName("Andrew");
        System.out.println("Stream callable name: " + threadForCallable.getName());

        for (int i = 0; i < 2; i++) {
            System.out.println(userName);
        }
    }
}
