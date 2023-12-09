package ua.edu.ucu.apps.task1;

public class ATM {
    public Tray firstTray;
    public ATM() {
        Tray tray100 = new Tray100();
        Tray tray50 = new Tray50();
        Tray tray2 = new Tray2();
        firstTray = tray100;
        tray100.setNext(tray50);
        tray50.setNext(tray2);
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
