package protocols;

/**
 * <h1>Úkol</h1>
 * Instrukce daná protokolem.
 * @see Protocol
 * @author Jakub Štych
 * @version 12.4.2023
 */
public class Task {

    /**
     * <h3>Popis úkolu</h3>
     * @see #getDescription() Getter
     * @see #setDescription(String) Setter
     */
    private String description;

    /**
     * <h3>Progres úkolu</h3>
     * @see #getProgress() Getter
     * @see #setProgress(int) Setter
     */
    private int progress;

    /**
     * <h3>Dokončení úkolu</h3>
     * <ul>
     *    <li><b>true</b> - Úkol <u>je</u> dokončen</li>
     *    <li><b>false</b> - Úkol <u>není</u> dokončen</li>
     *</ul>
     * @see #isCompleted() Getter
     * @see #setCompleted(boolean) Setter
     */
    private boolean completed;

    /**
     * <h2>Getter úkolu</h2>
     * @return Popis úkolu
     * @see #description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <h2>Setter úkolu</h2>
     * @param description Popis úkolu
     * @see #description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <h2>Getter úkolu</h2>
     * @return Progres úkolu
     * @see #progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * <h2>Setter úkolu</h2>
     * @param progress Progres úkolu
     * @see #progress
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

    /**
     * <h2>Getter úkolu</h2>
     * @return Dokončení úkolu
     * @see #completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * <h2>Setter úkolu</h2>
     * @param completed Dokončení úkolu
     * @see #completed
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
