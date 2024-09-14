package ru.vsu.shegoleva;

class IndividualClient extends Client {
    private String passport;

    public IndividualClient(int id, String name, String phone, String passport) {
        super(id, name, phone);
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "id=" + getId() +
                ", имя='" + getName() + '\'' +
                ", номер телефона='" + getPhone() + '\'' +
                ", паспорт='" + passport + '\'' +
                '}';
    }
}

