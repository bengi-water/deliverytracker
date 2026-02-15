# DeliveryTracker

A small Java demo that models simple package delivery tracking and demonstrates three ways to create implementations of an interface: a named subclass, an anonymous class, and a lambda expression.

Author: Bengisu Bilgen

## Contents
- `DeliveryTracker.java` — main program demonstrating `Item`, `DeliveryPackage`, and `TransportVehicle` classes.

## What it demonstrates
- `Item` interface with a `getDescription()` method.
- Creating `Item` instances via:
  - a named subclass (`Pants`),
  - an anonymous class (example: `backpack`), and
  - a lambda expression (example: `chips`).
- An abstract `TransportVehicle` with concrete implementations: `CargoShip`, `CargoAirplane`, and `MailTruck`.
- `DeliveryPackage` that holds one or more `Item` instances.

## Requirements
- Java (JDK) 8 or newer.

## Build & Run
From the repository root, compile and run with:

```bash
javac DeliveryTracker.java
java DeliveryTracker
```

## Sample output
Object identity values vary, but output will look like:

```
Loading onto Cargo Ship: DeliveryPackage@1a2b3c4
Loading onto Cargo Airplane: DeliveryPackage@5d6e7f8
Loading onto Mail Truck: DeliveryPackage@9a0b1c2
```

Each line shows which `TransportVehicle` is loading a `DeliveryPackage` (the printed package is the default `toString()` representation).

## Extending the project
- Add new `Item` implementations (named classes, anonymous classes, or lambdas).
- Add new `TransportVehicle` subclasses and override `load()`.
- Override `DeliveryPackage#toString()` to print a friendlier representation of contained items.

## License
MIT
