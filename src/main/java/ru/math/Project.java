package ru.math;

import java.util.Random;

public class Project {

    private final int totalTasks;
    private int completedTasks;
    private final Random random;

    public Project(int totalTasks) {
        this.totalTasks = totalTasks;
        this.completedTasks = 0;
        this.random = new Random();
    }

    public void simulateDay() {
        int tasksCompletedToday = getDailyProgress();
        completedTasks += tasksCompletedToday;
        if (completedTasks > totalTasks) {
            completedTasks = totalTasks;
        }
        System.out.println("Завершено задач сегодня: " + tasksCompletedToday + ". Всего завершено: " + completedTasks);
    }

    private int getDailyProgress() {
        int baseProgress = 5;

        if (random.nextDouble() < 0.2) {
            System.out.println("Сегодня случились проблемы с багами!");
            baseProgress -= 2;
        }
        if (random.nextDouble() < 0.1) {
            System.out.println("Кто-то из команды отсутствует.");
            baseProgress -= 3;
        }
        if (random.nextDouble() < 0.05) {
            System.out.println("Возникли внешние задержки.");
            baseProgress = 0;
        }
        return Math.max(baseProgress, 0);
    }

    public boolean isCompleted() {
        return completedTasks >= totalTasks;
    }

}
