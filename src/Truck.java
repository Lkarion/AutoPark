public class Truck extends Auto{
    private int load;

    public Truck(int stateNumber, int year, int load) {
        super(stateNumber, year);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public void goToRace() {
        System.out.println(String.format("грузовик №%s повез %s тонн груза",this.getStateNumber(), this.load));
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                '}';
    }
}
