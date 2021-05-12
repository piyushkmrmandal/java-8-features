package core.java8.lambdas;

public class RunnableLambda {
    public static void main(String[] args) {
        /**
         * Prior java-8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Traditional Runnable calling..");
            }
        };

        new Thread(runnable).start();

        /**
         * Using Java-8 Lambda
         */

        Runnable runnableLambda = () -> {
            System.out.println("Using Lambda printing multiple line:: statement 1");
            System.out.println("Using Lambda printing multiple line:: statement 2");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambdaSingle = () -> System.out.println("Using Lambda printing single line");

        new Thread(runnableLambdaSingle).start();

        new Thread(() -> System.out.println("Direct assigning to thread")).start();

    }
}
