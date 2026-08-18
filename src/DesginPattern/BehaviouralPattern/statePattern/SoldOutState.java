package DesginPattern.BehaviouralPattern.statePattern;

public class SoldOutState implements VendingMachineState {

    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coin) {
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState refill(VendingMachine machine, int itemCount) {
        machine.setItemCount(itemCount);
        return machine.getNoCoinState();
    }

    @Override
    public void getCurrentState() {
        System.out.println("Sold Out state");
    }

}
