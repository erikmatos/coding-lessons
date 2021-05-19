package ca.ematos.codeshare;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Supplier;

public class Assynchronous {


}

abstract class Queue {
    private int parallelism;

    public Queue(int parallelism) {
        this.parallelism = parallelism;
    }

    public abstract <T> CompletableFuture<T> execute(Supplier<T> supplier);
}
