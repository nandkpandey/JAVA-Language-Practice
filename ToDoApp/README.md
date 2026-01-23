# Simple To-Do App

A console-based to-do list application written in Java.

## Features

- **Add Tasks**: Create new tasks with descriptions
- **View Tasks**: Display all tasks with their completion status
- **Mark Complete**: Mark tasks as completed
- **Delete Tasks**: Remove tasks from the list
- **Statistics**: View task statistics (total, completed, pending)

## How to Run

1. Compile the application:
   ```bash
   javac ToDoApp/*.java
   ```

2. Run the application:
   ```bash
   java ToDoApp.ToDoApp
   ```

## Usage

When you run the application, you'll see a menu with the following options:

1. **Add Task** - Enter a task description to add it to your list
2. **View All Tasks** - Display all tasks with their IDs and completion status
3. **Mark Task as Complete** - Enter a task ID to mark it as done
4. **Delete Task** - Enter a task ID to remove it from the list
5. **Show Statistics** - View summary of total, completed, and pending tasks
6. **Exit** - Close the application

## Example

```
Welcome to Simple To-Do App!

===== MENU =====
1. Add Task
2. View All Tasks
3. Mark Task as Complete
4. Delete Task
5. Show Statistics
6. Exit
Enter your choice: 1
Enter task description: Buy groceries
Task added successfully!
```

## Project Structure

- **Task.java** - Represents a single task with ID, description, and completion status
- **ToDoList.java** - Manages the collection of tasks and operations
- **ToDoApp.java** - Main application with console interface
