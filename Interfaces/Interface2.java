interface Drivable {
    void drive();
}

interface Rechargeable {
    void recharge();
}

class ElectricCar implements Drivable, Rechargeable {

    @Override
    public void drive() {
        System.out.println("The electric car is driving silently.");
    }

    @Override
    public void recharge() {
        System.out.println("The electric car is recharging its battery.");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        car.drive();
        car.recharge();
    }
}