package week3;
// In this task, your goal is to create a Java program that exemplifies object-oriented programming principles
// by implementing a Task Management System. Your task is to design a class named TaskItem which should have three attributes:
// taskId (an integer representing a unique identifier for each task), taskDescription (a string describing the task), and taskStatus
// (an enum representing the status of the task with values such as TO_DO, IN_PROGRESS, COMPLETED, and CANCELLED).
public class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status status;

    public TaskItem(int taskId, String taskDescription, Status status) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getStatus() {
        return status;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
