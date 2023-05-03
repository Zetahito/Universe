package protocols;

import universe.interfaces.Habitable;

import java.util.ArrayList;

public class Protocol999 extends Protocol {

    public Protocol999(Habitable habitablePlace) {

        setNumber(999);
        setName("The bringer of End");
        setDescription("Destroy habitable planet or habitat and its inhabitants");

        ArrayList<Task> remainingTasks = new ArrayList<>();

        Task p999t1 = new Task();
        p999t1.setDescription("Kill population");
        p999t1.setProgress(0);
        p999t1.setCompleted(false);
        remainingTasks.add(p999t1);

        Task p999t2 = new Task();
        p999t2.setDescription("Remove capital city");
        p999t2.setProgress(0);
        p999t2.setCompleted(false);
        remainingTasks.add(p999t2);

        Task p999t3 = new Task();
        p999t3.setDescription("Remove civilisation");
        p999t3.setProgress(0);
        p999t3.setCompleted(false);
        remainingTasks.add(p999t3);

        Task p999t4 = new Task();
        p999t4.setDescription("Remove stability");
        p999t4.setProgress(0);
        p999t4.setCompleted(false);
        remainingTasks.add(p999t4);

        Task p999t5 = new Task();
        p999t5.setDescription("Remove dominant political party");
        p999t5.setProgress(0);
        p999t5.setCompleted(false);
        remainingTasks.add(p999t5);

        Task p999t6 = new Task();
        p999t6.setDescription("Set inhospitable");
        p999t6.setProgress(0);
        p999t6.setCompleted(false);
        remainingTasks.add(p999t6);

        Task p999t7 = new Task();
        p999t7.setDescription("Analyze");
        p999t7.setProgress(0);
        p999t7.setCompleted(false);
        remainingTasks.add(p999t7);

        fillRemainingTasks(remainingTasks);
    }
}
