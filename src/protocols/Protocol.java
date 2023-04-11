package protocols;

import java.util.ArrayList;

/**
 * <h1>Protokol</h1>
 * Postup instrukcí a událostí s deterministickým výsledkem.
 * @author Jakub Štych
 * @version 11.4.2023
 */
public abstract class Protocol {

    /**
     * <h3>Číslo protokolu</h3>
     * Rozsah 0-999
     * @see #getNumber() Getter
     * @see #setNumber(int) Setter
     */
    private int number;

    /**
     * <h3>Jméno protokolu</h3>
     * Jméno <u>nemusí</u> odpovídat jeho účelu.
     * @see #getName() Getter
     * @see #setName(String) Setter
     */
    private String name;

    /**
     * <h3>Popis protokolu</h3>
     * Popis činnosí protokolu.
     * @see #getDescription() Getter
     * @see #setDescription(String) Setter
     */
    private String description;

    /**
     * <h2>Getter protokolu</h2>
     * @return Číslo protokolu
     * @see #number
     */
    public int getNumber() {
        return number;
    }

    /**
     * <h2>Setter protokolu</h2>
     * @param number Číslo protokolu
     * @see #number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * <h2>Getter protokolu</h2>
     * @return Jméno protokolu
     * @see #name
     */
    public String getName() {
        return name;
    }

    /**
     * <h2>Setter protokolu</h2>
     * @param name Jméno protokolu
     * @see #name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>Getter protokolu</h2>
     * @return Popis protokolu
     * @see #description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <h2>Setter protokolu</h2>
     * @param description Popis protokolu
     * @see #description
     */
    public void setDescription(String description) {
        this.description = description;
    }












    /**
     * <h3>Kolekce zbývajících úkolů</h3>
     */
    private ArrayList<Task> remainingTasks;

    /**
     * <h3>Kolekce dokončených úkolů</h3>
     */
    private ArrayList<Task> completedTasks;

    /**
     * <h3>Kolekce opuštěných úkolů</h3>
     */
    private ArrayList<Task> abandonedTasks;

    /**
     *
     * @param remainingTasks
     */
    public void fillRemainingTasks(ArrayList<Task> remainingTasks) {
        this.remainingTasks = remainingTasks;
    }

    public void completeTask(Task task, int position) {
        remainingTasks.remove(position);
        completedTasks.add(task);
    }

    public void abandonTask(Task task, int position) {
        remainingTasks.remove(position);
        abandonedTasks.add(task);
    }

    public boolean allTasksCompleted() {
        return remainingTasks.isEmpty();
    }

    public Task getRemainingTask(int position) {
        return remainingTasks.get(position);
    }

    public Task getCompletedTask(int position) {
        return completedTasks.get(position);
    }

    public Task getAbandonedTask(int position) {
        return abandonedTasks.get(position);
    }

}
