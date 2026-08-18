package DesginPattern.BehaviouralPattern.statePattern;

public class VendingMachine {
    public VendingMachineState currentState;
    private int currentInsertedCoinCount;
    private int itemCount = 0;

    private VendingMachineState noCoinState;
    private VendingMachineState hasCoinState;
    private VendingMachineState dispenseState;
    private VendingMachineState soldOutState;

    public VendingMachine(){
        noCoinState = new NoCoinState();
        hasCoinState = new HasCoinState();
        dispenseState = new DispenseState();
        soldOutState = new SoldOutState();

        currentState = noCoinState;
    }

    public void setCurrentInsertedCoinCount(int coin){
        currentInsertedCoinCount=coin;
    }

    public void insertCoin(int coin){
        currentState = currentState.insertCoin(this,coin);
    }

    void selectItem(){
        currentState = currentState.selectItem(this);
    }

    void dispense(){
        currentState = currentState.dispense(this);
    }

    void refill(int itemCount){
        currentState = currentState.refill(this, itemCount);
    }

    public int getCurrentInsertedCoinCount() {
        return currentInsertedCoinCount;
    }

    public VendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public VendingMachineState getHasCoinState() {
        return hasCoinState;
    }

    public VendingMachineState getDispenseState() {
        return dispenseState;
    }

    public VendingMachineState getSoldOutState() {
        return soldOutState;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public void getCurrentState(){
        currentState.getCurrentState();
    }
}
