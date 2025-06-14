package com.springboot.collections.advancelevel.queue.blockings;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        // Thread safe unbounded blocking queue
        // Elements can only be taken from the queue when their delay has expired
        // useful for scheduling task to be executed after a certain delay
        // internally priority queue

        BlockingQueue<DelayTask> delayQueue = new DelayQueue<>();

        delayQueue.put(new DelayTask("Task 1",2,TimeUnit.SECONDS));
        delayQueue.put(new DelayTask("Task 2",5,TimeUnit.SECONDS));
        delayQueue.put(new DelayTask("Task 3",3,TimeUnit.SECONDS));
        delayQueue.put(new DelayTask("Task 4",7,TimeUnit.SECONDS));

        while (!delayQueue.isEmpty()) {
            DelayTask delayTask = delayQueue.take();    // Blocks until a task's delay has expired.
            System.out.println("Executed: "+delayTask.getTaskName()+" at "+ System.currentTimeMillis());
        }


    }

}

class DelayTask implements Delayed {

    private final String taskName;
    private final long startTime;

    public DelayTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }


    @Override
    public long getDelay(TimeUnit unit) {
        long remainingTime = startTime - System.currentTimeMillis();
        return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayTask) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }

}
