package ru.vsu.shegoleva;

class RepairRequest {
    private int requestId; //ID
    private Client client;
    private Car car;
    private String description;

    public RepairRequest(int requestId, Client client, Car car, String description) {
        this.requestId = requestId;
        this.client = client;
        this.car = car;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Заявка(ID: " + requestId + ", Клиент: " + client.getName() + ", " +
                "Автомобиль: " + car.getMake() + ',' + car.getYear() + ',' + " Описание проблемы: " + description + ")";
    }
}
