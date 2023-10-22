package week3;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        //Task Item
        TaskItem taskItem = new TaskItem(1, "Palindrome", Status.TO_DO);
        System.out.println(taskItem.getTaskId());
        System.out.println(taskItem.getTaskDescription());
        System.out.println(taskItem.getStatus());

        taskItem.setTaskId(2);
        taskItem.setTaskDescription("Sum of even numbers");
        taskItem.setStatus(Status.IN_PROGRESS);

        System.out.println("\nAFTER MODIFICATION:\n");

        System.out.println(taskItem.getTaskId());
        System.out.println(taskItem.getTaskDescription());
        System.out.println(taskItem.getStatus());

        //DbConnection
        DbConnect dbConnect = new DbConnect();
        try {
            dbConnect.getAll();
            dbConnect.getByStatus(Status.IN_PROGRESS);
            dbConnect.getIdGreaterOrEqual2();
            dbConnect.printDescription();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        // DataStructures
        DataStructures labDataStructures = new DataStructures();
        System.out.println(labDataStructures.getAll());
        labDataStructures.getByStatus(Status.CANCELLED);

        List<TaskItem> filteredTasks = labDataStructures.getIdGreaterOrEqual2();
        for (TaskItem task : filteredTasks){
            System.out.println(task);
        }
        labDataStructures.printDescription();

    }
}
