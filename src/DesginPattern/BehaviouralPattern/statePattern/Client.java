package DesginPattern.BehaviouralPattern.statePattern;

public class Client {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.getCurrentState();

        machine.insertCoin(1);
        machine.setItemCount(2);

        machine.getCurrentState();

        machine.selectItem();

        machine.getCurrentState();

        machine.dispense();

        machine.getCurrentState();

        machine.insertCoin(1);
        machine.insertCoin(1);
        System.out.println(machine.getCurrentInsertedCoinCount());
        machine.selectItem();
        machine.dispense();
        machine.getCurrentState();
    }
}
