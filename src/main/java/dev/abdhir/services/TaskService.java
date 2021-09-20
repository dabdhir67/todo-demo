package dev.abdhir.services;

import dev.abdhir.models.Task;
import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskService(){
        tasks.add(new Task("Research Generics", true));
        tasks.add(new Task("Work on Project O", false));
        tasks.add(new Task("Study for QC", false));
    }

    public void addNewTask(String name){
        Task newTask = new Task(name);
        tasks.add(newTask);
    }

    public void addNewTask(Task newTask){
        tasks.add(newTask);
    }

    public ArrayList<Task> displayPending(){
        ArrayList<Task> pendingTasks = new ArrayList<>();
        for(Task task: tasks){
            if(!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }
}
