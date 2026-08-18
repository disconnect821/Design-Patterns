package DesginPattern.BehaviouralPattern.statePattern;

public class HasCoinState implements VendingMachineState {
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coin) {
        machine.setCurrentInsertedCoinCount(machine.getCurrentInsertedCoinCount() + coin);
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState refill(VendingMachine machine, int itemCount) {
        return machine.getHasCoinState();
    }

    @Override
    public void getCurrentState() {
        System.out.println("Has Coin state");
    }
}
