package collection.map.test.queue;

import java.util.Queue;
import java.util.ArrayDeque;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {

        tasks.offer(task);
    }

    public void processNextTask() {


        Task task = tasks.poll();
        task.execute();
    }

    public int getRemainingTasks() {
        return tasks.size();
    }
}
