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
     * <h3>Kolekce zbývajících úkolů protokolu</h3>
     * Úkoly, které nebyly dokončeny, ale ještě budou.
     * @see #getRemainingTask(int) Getter
     * @see #fillRemainingTasks(ArrayList) Setter
     */
    private ArrayList<Task> remainingTasks;

    /**
     * <h3>Kolekce dokončených úkolů protokolu</h3>
     * Splněné úkoly, které dosáhly svého cíle.
     * @see #getCompletedTask(int) Getter
     * @see #completeTask(Task, int) Setter
     */
    private ArrayList<Task> completedTasks;

    /**
     * <h3>Kolekce opuštěných úkolů protokolu</h3>
     * Úkoly, které nebyly dokončeny a nikdy už nebudou.
     * @see #getAbandonedTask(int) Getter
     * @see #abandonTask(Task, int) Setter
     */
    private ArrayList<Task> abandonedTasks;

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
     * <h2>Getter protokolu</h2>
     * @param position pozice zbývajícího úkolu
     * @return Zbývající úkol
     * @see #remainingTasks
     */
    public Task getRemainingTask(int position) {
        return remainingTasks.get(position);
    }

    /**
     * <h2>Setter protokolu</h2>
     * @param remainingTasks Kolekce zbývajících úkolů
     * @see #remainingTasks
     */
    public void fillRemainingTasks(ArrayList<Task> remainingTasks) {
        this.remainingTasks = remainingTasks;
    }

    /**
     * <h2>Getter protokolu</h2>
     * @param position pozice dokončeného úkolu
     * @return Dokončený úkol
     * @see #completedTasks
     */
    public Task getCompletedTask(int position) {
        return completedTasks.get(position);
    }

    /**
     * <h2>Setter protokolu</h2>
     * Odstraní úkol z kolekce zbývajících úkolů a přidá jej do kolekce dokončených úkolů.
     * @param task Úkol, který byl dokončen
     * @param position Pozice úkolu v kolekci zbývajících úkolů
     * @see #remainingTasks
     * @see #completedTasks
     */
    public void completeTask(Task task, int position) {
        remainingTasks.remove(position);
        completedTasks.add(task);
    }

    /**
     * <h2>Getter protokolu</h2>
     * @param position Pozice opuštěného úkolu
     * @return Opuštěný úkol
     * @see #abandonedTasks
     */
    public Task getAbandonedTask(int position) {
        return abandonedTasks.get(position);
    }

    /**
     * <h2>Setter protokolu</h2>
     * Odstraní úkol z kolekce zbývajících úkolů a přidá jej do kolekce opuštěných úkolů.
     * @param task Úkol, který nebyl dokončen
     * @param position Pozice úkolu v kolekci zbývajících úkolů
     * @see #remainingTasks
     * @see #abandonedTasks
     */
    public void abandonTask(Task task, int position) {
        remainingTasks.remove(position);
        abandonedTasks.add(task);
    }

    /**
     * <h2>Ověří přítomnost zbývajících úkolů</h2>
     * <ul>
     *    <li><b>true</b> - Kolekce zbývajících úkolů <u>je</u> prázdná</li>
     *    <li><b>false</b> - Kolekce zbývajících úkolů <u>není</u> prázdná</li>
     *</ul>
     * @return Práznost kolekce zbývajících úkolů
     * @see #remainingTasks
     */
    public boolean allTasksCompleted() {
        return remainingTasks.isEmpty();
    }
}
