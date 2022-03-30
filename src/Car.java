public class Car extends Auto{
    private int load;
    private int passangers;

    public Car(int stateNumber, int year, int load, int passangers) {
        super(stateNumber, year);
        this.load = load;
        this.passangers = passangers;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "load=" + load +
                ", passangers=" + passangers +
                '}';
    }

    @Override
    public void goToRace() {
        System.out.println(String.format("легковая машина №%s повезла %s пассажиров",this.getStateNumber(), this.passangers));
    }
}
