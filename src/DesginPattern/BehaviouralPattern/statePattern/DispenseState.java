package DesginPattern.BehaviouralPattern.statePattern;

public class DispenseState implements VendingMachineState {
    @Override
    public VendingMachineState insertCoin(VendingMachine machine, int coin) {
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState selectItem(VendingMachine machine) {
        return machine.getDispenseState();
    }

    @Override
    public VendingMachineState dispense(VendingMachine machine) {
        if(machine.getItemCount() > 0 ){
            machine.setItemCount(machine.getItemCount() - 1);
            if(machine.getItemCount() > 0)
            {
                machine.setCurrentInsertedCoinCount(0);
                return machine.getNoCoinState();
            }

            else return machine.getSoldOutState();
        }
        return machine.getSoldOutState();
    }

    @Override
    public VendingMachineState refill(VendingMachine machine, int itemCount) {
        return machine.getDispenseState();
    }

    @Override
    public void getCurrentState() {
        System.out.println("Dispense state");
    }
}
