package dev.abdhir;

import dev.abdhir.models.Task;
import dev.abdhir.services.TaskService;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    TaskService taskService = new TaskService();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        /*
        Task myTask = new Task();
//        myTask.taskName = "Fold Laundry";
        myTask.setTaskName("Fold Laundry");

        Task myTask2 = new Task("Take out trash");

        Task myTask3 = new Task("Empty Dishwasher", true);

        for(int i=0; i<5; i++){
            System.out.println(i);
        }
         */

//        String x = null;
//        x.equals("hello");
//        "hello".equals(x);


        Application app = new Application();
        app.menu();

    }


    public void menu(){
        System.out.println("Choose an action:");
        System.out.println("1 - add a task");
        System.out.println("2 - mark a task as complete");
        System.out.println("3 - view pending tasks");
        System.out.println("4 - exit program");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        switch(selection){
            case 1:
                addTask();
                break; // important for preventing case 2 from also being executed
            case 2:
                completeTask();
                break;
            case 3:
                displayTasks();
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid Input");
        }
        menu();
    }

    public void completeTask(){
        System.out.println("Which task would you like to complete?");
        int taskIndex = scanner.nextInt();

        ArrayList<Task> pendingTasks = taskService.displayPending();
        Task currentTask = pendingTasks.get(taskIndex);
        currentTask.setCompleted(true);
    }

    public void displayTasks(){
        ArrayList<Task> pendingTasks = taskService.displayPending();

        System.out.println("Here are your tasks:");
        for(Task task: pendingTasks){
            System.out.println(pendingTasks.indexOf(task)+" - "+ task.getTaskName());
        }
    }

    public void addTask(){
        System.out.println("What is the name of the task you would like to add:");
        String taskName = scanner.nextLine();
        taskService.addNewTask(taskName);
    }


}
