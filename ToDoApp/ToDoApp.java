package ToDoApp;

import java.util.Scanner;

public class ToDoApp {
    private static ToDoList toDoList = new ToDoList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Simple To-Do App!");

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskComplete();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    showStatistics();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using To-Do App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Add Task");
        System.out.println("2. View All Tasks");
        System.out.println("3. Mark Task as Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Show Statistics");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        if (description.trim().isEmpty()) {
            System.out.println("Task description cannot be empty!");
            return;
        }

        toDoList.addTask(description);
    }

    private static void viewTasks() {
        toDoList.viewAllTasks();
    }

    private static void markTaskComplete() {
        System.out.print("Enter task ID to mark as complete: ");
        try {
            int taskId = Integer.parseInt(scanner.nextLine());
            toDoList.markTaskAsCompleted(taskId);
        } catch (NumberFormatException e) {
            System.out.println("Invalid task ID!");
        }
    }

    private static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        try {
            int taskId = Integer.parseInt(scanner.nextLine());
            toDoList.deleteTask(taskId);
        } catch (NumberFormatException e) {
            System.out.println("Invalid task ID!");
        }
    }

    private static void showStatistics() {
        int total = toDoList.getTaskCount();
        int completed = toDoList.getCompletedTaskCount();
        int pending = total - completed;

        System.out.println("\n===== STATISTICS =====");
        System.out.println("Total Tasks: " + total);
        System.out.println("Completed: " + completed);
        System.out.println("Pending: " + pending);
        System.out.println("======================\n");
    }
}
