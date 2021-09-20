package dev.abdhir;

import dev.abdhir.models.Task;
import dev.abdhir.services.TaskService;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){
//        Task myTask = new Task();
//        //myTask.taskName = "Fold Laundry";
//        myTask.setTaskName("Fold Laundry");
//
//        Task myTask2 = new Task("Take out trash");
//        System.out.println(myTask2.getTaskName());
//
//        Task myTask3 = new Task("Empty Dishwasher", true);
        TaskService taskService = new TaskService();
        ArrayList<Task> pendingTasks = taskService.displayPending();

        System.out.println("Here are your tasks:");
        for(Task task: pendingTasks){
            System.out.println(pendingTasks.indexOf(task) + " - " + task.getTaskName());
        }

        System.out.println("Which task would you like to complete?");
        Scanner scanner = new Scanner(System.in);
        int taskIndex = scanner.nextInt();
        Task currentTask = pendingTasks.get(taskIndex);
        currentTask.setCompleted(true);

        pendingTasks = taskService.displayPending();
        System.out.println("Here are your tasks:");
        for(Task task: pendingTasks){
            System.out.println(pendingTasks.indexOf(task) + " - " + task.getTaskName());
        }

    }
}
