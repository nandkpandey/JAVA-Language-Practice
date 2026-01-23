package ToDoApp;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    private int nextId;

    public ToDoList() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public void addTask(String description) {
        Task task = new Task(nextId++, description);
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }

        System.out.println("\n===== TO-DO LIST =====");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("======================\n");
    }

    public void markTaskAsCompleted(int taskId) {
        Task task = findTaskById(taskId);
        if (task != null) {
            if (task.isCompleted()) {
                System.out.println("Task is already completed!");
            } else {
                task.markAsCompleted();
                System.out.println("Task marked as completed!");
            }
        } else {
            System.out.println("Task not found!");
        }
    }

    public void deleteTask(int taskId) {
        Task task = findTaskById(taskId);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    private Task findTaskById(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public int getCompletedTaskCount() {
        int count = 0;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                count++;
            }
        }
        return count;
    }
}
