package dev.abdhir;

public class Application {

    public static void main(String[] args){
        Task myTask = new Task();
        myTask.taskName = "Fold Laundry";

        Task myTask2 = new Task("Take out trash");

        Task myTask3 = new Task("Empty Dishwasher", true);

    }
}
