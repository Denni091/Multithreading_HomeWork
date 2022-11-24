public class Threads extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.workWithVariableAndFlow();
        }
    }
}
