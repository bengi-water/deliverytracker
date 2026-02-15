/*
Bengisu Bilgen

The Program creates a package tracker that uses
a lambda expression, an anonymous class, and a named subclass
to create an instance of an interface.
*/
interface Item {
    String getDescription();
}

class Letter {
    private String text;

    public Letter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class DeliveryPackage {
    private Item[] items;

    public DeliveryPackage(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }
}

abstract class TransportVehicle {
    abstract void load(DeliveryPackage deliveryPackage);
}

class CargoShip extends TransportVehicle {
    @Override
    void load(DeliveryPackage deliveryPackage) {
        System.out.println("Loading onto Cargo Ship: " + deliveryPackage);
    }
}

class CargoAirplane extends TransportVehicle {
    @Override
    void load(DeliveryPackage deliveryPackage) {
        System.out.println("Loading onto Cargo Airplane: " + deliveryPackage);
    }
}

class MailTruck extends TransportVehicle {
    @Override
    void load(DeliveryPackage deliveryPackage) {
        System.out.println("Loading onto Mail Truck: " + deliveryPackage);
    }
}

public class DeliveryTracker {
    public static void main(String[] args) {
        TransportVehicle cargoShip = new CargoShip();
        TransportVehicle cargoAirplane = new CargoAirplane();
        TransportVehicle mailTruck = new MailTruck();

        // Named subclass of Item
        class Pants implements Item {
            @Override
            public String getDescription() {
                return "pants";
            }
        }

        DeliveryPackage package1 = new DeliveryPackage(new Pants());
        cargoShip.load(package1);

        // Anonymous class
        DeliveryPackage package2 = new DeliveryPackage(new Item() {
            @Override
            public String getDescription() {
                return "backpack";
            }
        });
        cargoAirplane.load(package2);

        // Lambda expression
        DeliveryPackage package3 = new DeliveryPackage(() -> "chips");
        mailTruck.load(package3);
    }
}