package ru.math;

public class App {

    public static void main(String[] args) {
        Project project = new Project(50); 
        int days = 0;

        
        while (!project.isCompleted()) {
            System.out.println("День " + (++days) + ":");
            project.simulateDay();
            System.out.println();
        }
        
        System.out.println("Проект завершен за " + days + " дней.");
    }
}
