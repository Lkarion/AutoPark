public class Bus extends Auto{
    private int passangers;

    public Bus(int stateNumber, int year, int passangers) {
        super(stateNumber, year);
        this.passangers = passangers;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    @Override
    public String toString() {
        return "Bus" +
                "passangers=" + passangers;
    }

    @Override
    public void goToRace() {
        System.out.println(String.format("автобус №%s повез %s пассажиров",this.getStateNumber(), this.passangers));
    }
}
