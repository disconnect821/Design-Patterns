package DesginPattern.BehaviouralPattern.statePattern;

public interface VendingMachineState {
    VendingMachineState insertCoin(VendingMachine machine, int coin);
    VendingMachineState selectItem(VendingMachine machine);
    VendingMachineState dispense(VendingMachine machine);
    VendingMachineState refill(VendingMachine machine, int count);
    void getCurrentState();
}
