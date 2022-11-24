import java.util.concurrent.Callable;

public class Callables implements Callable {
    @Override
    public Object call() throws Exception {
         for (int i = 0; i < 1000; i++) {
            AdditionalClass.workWithVariableAndFlow();

        }
         return "Callables";
    }
}
