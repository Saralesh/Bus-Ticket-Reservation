package BusRes;

public class Bus {
    private int BusNo;
    private boolean AC;
    private int Capacity;

    public Bus(int BusNo,boolean AC,int Capacity) {
        this.BusNo = BusNo;
        this.Capacity = Capacity;
        this.AC = AC;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public int getBusNo() {
        return BusNo;
    }

    public boolean isAC() {
        return AC;
    }


    public void setAC(boolean AC) {
        this.AC = AC;
    }
    public void displayBusInfo(){
        System.out.println("Bus No : "+ BusNo + " AC : " + AC + " Total Capacity : " + Capacity);
    }

}
