public class Main {

    public static void main(String[] args) {
	// Представите, мы создаем программу для автопарка. Допустим, у нас есть Автобусы, Грузовики и легковые машины
        // (Bus, Truck и Car соответственно). Каждое транспортное средство имеет гос.номер и год выпуска.
        // Основная характеристика автобуса - сколько пассажиров он может перевести. Для грузовика важно,
        // сколько тон груза он может перевести. Для автомобиля важна и грузоподъёмность и пассажировместимость.
        // Реализуйте структуру классов для нашей программы.
        //Кроме стандартных toString, необходимых геттеров и сеттеров, реализуйте для всех транспортных средств метод
        // goToRace который моделирует поездку (пусть он выводит на экран что то типа "автобус №.... повез 10 пассажиров"
        // или "грузовик № …. повез .... тон").

        Bus bus1 = new Bus(2134,2004,35);
        bus1.goToRace();
        Car car = new Car(12431,2000,3, 4);
        car.goToRace();
        Truck truck = new Truck(12351232,2020,22);
        truck.goToRace();
    }
}