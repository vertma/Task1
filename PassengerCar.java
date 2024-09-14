package ru.vsu.shegoleva;

class PassengerCar extends Car {
    private int passengerCapacity;

    public PassengerCar(String vin, String make, String model, int year, int passengerCapacity) {
        super(vin, make, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "vin='" + getVin() + '\'' +
                ", марка='" + getMake() + '\'' +
                ", модель='" + getModel() + '\'' +
                ", год выпуска=" + getYear() +
                ", Вместимость пассажиров=" + passengerCapacity +
                '}';
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }
}

