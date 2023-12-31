package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED) );
    }

    public List<TaskItem> getAll() {
        System.out.println("Get all: ");
        return this.tasks;
    }

    public void getByStatus (Status status){
        System.out.println("\nGet by status: ");
        List<TaskItem> filteredTasks = tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
        for (TaskItem taskItem : filteredTasks){
            System.out.println(taskItem.getTaskId() + " " +
            taskItem.getTaskDescription() + " " + taskItem.getStatus());
        }
    }

    public List<TaskItem> getIdGreaterOrEqual2 (){
        System.out.println("\nTask ID greater than or equal to 2");
        return tasks.stream()
                .filter(task -> task.getTaskId() >= 2)
                .collect(Collectors.toList());
    }

    public void printDescription(){
        System.out.println("Description: ");
        tasks.stream().map(task -> task.getTaskDescription())
                .forEach(t -> {
                    System.out.println(t);
                });
    }



}
