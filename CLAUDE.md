# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Vehicle factory simulation in Java, developed in BlueJ for a university OOP course (POO). All `.java` files live flat in the repo root — this is a BlueJ constraint, not a choice.

## How to run

Open the project folder in BlueJ. Entry point is `factory_main.java` — right-click the class and call `main()`. BlueJ compiles automatically on run.

To run from terminal:
```bash
javac *.java
java factory_main
```

## Architecture

The system simulates a vehicle factory with three assembly lines running in a time-step loop.

**Core flow:**
```
factory_main → Planificador → CadenaMontaje (x3) → Vehiculo
                           ↘ Dashboard ← Almacen
```

**Key classes:**

- `factory_main` — entry point; owns `Almacen`, `Planificador`, `Dashboard`. Has a circular-reference issue in the constructor (planificador used before initialized).
- `Almacen` — central data store. Uses `HashMap<String, Trabajador>` (keyed by DNI) for workers; `ArrayList` for motors, tapicerias, ruedas, and finished vehicles.
- `Planificador` — drives the simulation. Holds 3 `CadenaMontaje` instances (one per vehicle type). `ejecutarSimple()` runs a tick-based loop until all lines finish.
- `CadenaMontaje` — one assembly line. Progresses through 4 states: `CHASIS → MOTOR → TAPICERIA → RUEDAS` (defined in `EstadoMontaje` enum). Uses `estadoActual.ordinal()` to map each state to the corresponding `Operario` index in its ArrayList.
- `Dashboard` — reads from `Almacen` and `Planificador` to print consolidated status.

**Inheritance trees:**

```
Trabajador (abstract)
  └── Operario (abstract)  ← getTiempoTarea() is polymorphic
        ├── OperarioEficiente
        └── OperarioEstandar
  └── MecanicoCinta (abstract)
        ├── MecanicoEfectivo
        └── MecanicoEstandar
  └── GestorPlanta
  └── AdminSistema

Vehiculo (abstract)
  ├── Turismo
  ├── Furgoneta
  └── BiplazaDeportivo

Motor (abstract)
  ├── MotorCombustion (abstract)
  │     ├── MotorGasolina
  │     └── MotorHibrido
  └── MotorElectrico

Tapiceria (abstract)
  ├── TapiceriaCuero
  ├── TapiceriaAlcantara
  └── TapiceriaTela

Rueda (abstract)
  ├── RuedaNormal
  ├── RuedaDeportiva
  └── RuedaTodoT
```

**Simulation levels (in progress):**
- Level 2 (done): `ejecutarSimple()` — no breakdowns, only worker type affects time.
- Level 3 (pending): `ejecutarCompleja()` — mechanics (`MecanicoCinta`) intervene to fix problems on the lines.

## Naming conventions

- Fields, parameters, local variables, methods: `camelCase` (e.g. `numSegSoc`)
- Classes: `PascalCase`
- Dates stored as `String` (not `Date`/`LocalDateTime`) — intentional course decision
