package ua.edu.ucu.apps.task1;

public abstract class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Tray next) {
        this.next = next;
    }
    
    public void process(int amount) {
        System.out.println("You received " + amount/denomination + " of " + denomination);
        amount = amount % denomination;
        if (next != null) {
            next.process(amount);

    } else if (amount > 0) {
        throw new IllegalArgumentException();
    }
}
}