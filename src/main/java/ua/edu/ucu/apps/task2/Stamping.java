package ua.edu.ucu.apps.task2;

public class Stamping {

    public static <T> Group<T> stamp(Group<T> group) {
        for (Task<T> task : group.getTasks()) {
            processTask(task, group);
        }
        return group;
    }

    private static <T> void processTask(Task<T> task, Group<T> group) {
        if (task instanceof Signature) {
            setSignatureHeader((Signature<T>) task, group);
        } else if (task instanceof Group) {
            stamp((Group<T>) task);
        }
    }

    private static <T> void setSignatureHeader(Signature<T> signature, Group<T> group) {
        signature.setHeader("groupId", group.getGroupUuid());
    }
}
