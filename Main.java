package ru.vsu.shegoleva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        IndividualClient individualClient = inputIndividualClientData(scanner);
        PassengerCar passengerCar = inputPassengerCarData(scanner);


        RepairRequest repairRequest1 = new RepairRequest(1, individualClient, passengerCar, "Неисправен двигатель");

        // Вывод информации о клиентах, автомобилях и заявках
        System.out.println(individualClient);
        System.out.println(passengerCar);
        System.out.println(repairRequest1);

        scanner.close();
    }

    private static IndividualClient inputIndividualClientData(Scanner scanner) {
        System.out.println("Введите данные физического лица:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        System.out.print("ФИО: ");
        String name = scanner.nextLine();
        System.out.print("Телефон: ");
        String phone = scanner.nextLine();
        System.out.print("Паспорт: ");
        String passport = scanner.nextLine();
        return new IndividualClient(id, name, phone, passport);
    }

    private static PassengerCar inputPassengerCarData(Scanner scanner) {
        System.out.println("Введите данные легкового автомобиля:");
        System.out.print("VIN: ");
        String vin = scanner.nextLine();
        System.out.print("Марка: ");
        String make = scanner.nextLine();
        System.out.print("Модель: ");
        String model = scanner.nextLine();
        System.out.print("Год выпуска: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Вместимость пассажиров: ");
        int passengerCapacity = scanner.nextInt();
        scanner.nextLine();
        return new PassengerCar(vin, make, model, year, passengerCapacity);
    }
}
