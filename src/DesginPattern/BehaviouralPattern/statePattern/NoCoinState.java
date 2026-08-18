package DesginPattern.BehaviouralPattern.statePattern;

public class NoCoinState implements VendingMachineState {
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coin) {
        machine.setCurrentInsertedCoinCount(coin);
        return machine.getHasCoinState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        return machine.getNoCoinState();
    }

    @Override
    public VendingMachineState refill(VendingMachine machine, int itemCount) {
        return machine.getNoCoinState();
    }

    @Override
    public void getCurrentState() {
        System.out.println("No Coin state");
    }
}
