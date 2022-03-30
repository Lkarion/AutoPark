public abstract class Auto {
    // Представите, мы создаем программу для автопарка. Допустим, у нас есть Автобусы, Грузовики и легковые машины
    // (Bus, Truck и Car соответственно). Каждое транспортное средство имеет гос.номер и год выпуска.
    // Основная характеристика автобуса - сколько пассажиров он может перевести. Для грузовика важно,
    // сколько тон груза он может перевести. Для автомобиля важна и грузоподъёмность и пассажировместимость.
    // Реализуйте структуру классов для нашей программы.
    //Кроме стандартных toString, необходимых геттеров и сеттеров, реализуйте для всех транспортных средств метод
    // goToRace который моделирует поездку (пусть он выводит на экран что то типа "автобус №.... повез 10 пассажиров"
    // или "грузовик № …. повез .... тон").
    private int stateNumber;
    private int year;

    public Auto(int stateNumber, int year) {
        this.stateNumber = stateNumber;
        this.year = year;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void goToRace();

    @Override
    public String toString() {
        return "Auto{" +
                "stateNumber=" + stateNumber +
                ", year=" + year +
                '}';
    }
}
