# Session Notes — Project Parts Explained

---

## Local variables and HashMap `.get()`

### Code in question (`Almacen.java`)
```java
public Trabajador buscarTrabajadorDni(String dni)
{
    Trabajador t = trabajadores.get(dni);
```

### Is `t` a local variable?
Yes, `t` is a local variable — it only exists inside that method.

### Breaking down the line
```java
Trabajador t = trabajadores.get(dni);
```
- `Trabajador t` — declares a local variable of type `Trabajador`
- `=` — assigns it a value
- `trabajadores.get(dni)` — calls `.get()` on the HashMap, passing `dni` as the key

The right side **evaluates to a value** and that result gets stored in `t`. Since `trabajadores` is a `HashMap<String, Trabajador>`, `.get(dni)` looks up the key `dni` and returns the `Trabajador` object associated with it — or `null` if not found.

So after that line, `t` holds either the worker with that DNI, or `null`.

---

## Is `t` a HashMap collection?

No, `t` is a single `Trabajador` object, not a collection.

The HashMap **contains** many workers, but `.get(dni)` **extracts just one** from it using the key. Think of it like:

- `trabajadores` = the whole HashMap (the "drawer with many files")
- `.get(dni)` = "give me the one file with this label"
- `t` = that one file (a single `Trabajador`)

---

## Is `Trabajador` a String?

No. `Trabajador` is a **class** (an object), not a String.

```java
HashMap<String, Trabajador>
//       ↑ key    ↑ value
```

- The key is a `String` (the DNI)
- The value is a `Trabajador` object

So `.get(dni)` says: "find the entry whose key equals `dni`, and return its **value**" — which is a `Trabajador` object, not a String.

`t` is just a variable that holds a reference to that `Trabajador` object.

---

## What kind of object does `t` hold?

Yes, `t` holds a reference to an **instance (object)** of the class `Trabajador`.

In other words, `t` points to one specific worker object that was previously stored in the HashMap.

---

## What can a variable hold? (primitives vs objects)

A variable can hold anything — it depends on how you declare it. The **type** you write before the variable name determines what it holds:

```java
int x = 5;              // holds a primitive (int)
String name = "Juan";   // holds a String object
Trabajador t = ...;     // holds a reference to a Trabajador object
```

**Two categories:**

1. **Primitives** — `int`, `double`, `boolean`, `char`, etc. — hold the **value directly**
2. **Objects/References** — any class (`String`, `Trabajador`, `ArrayList`, etc.) — hold a **reference** (like an address) pointing to the object in memory

**For local variables specifically** — it purely depends on what the method needs to do:
- If it needs a counter → `int`
- If it needs to work with a worker → `Trabajador`
- If it needs a result from a HashMap → whatever the HashMap's value type is

There's no rule that local variables prefer primitives or objects. It's always driven by the **purpose of the method**.

---

## Most common local variable assignment patterns

`Trabajador t = trabajadores.get(dni)` is one of many common scenarios:

**1. Assigned from a collection (your case)**
```java
Trabajador t = trabajadores.get(dni); // retrieve from HashMap
Vehiculo v = listaVehiculos.get(0);   // retrieve from ArrayList
```

**2. Assigned from a method call**
```java
int total = calcularTotal();
String nombre = trabajador.getNombre();
```

**3. Assigned from a constructor (creating a new object)**
```java
Trabajador t = new OperarioEstandar("Juan", ...);
ArrayList<Motor> lista = new ArrayList<>();
```

**4. Assigned a direct value (primitives)**
```java
int contador = 0;
boolean encontrado = false;
double precio = 19.99;
```

**5. Assigned from an operation/expression**
```java
int suma = a + b;
boolean valido = edad > 18;
```

**In practice**, the most common pattern depends on the method's job:
- Methods that **search** → assign from collections
- Methods that **calculate** → assign from expressions
- Methods that **build things** → assign from constructors
- Methods that **delegate** → assign from other method calls

It's not that collection assignment is the most common overall — it just happens to be the right tool for a search method like `buscarTrabajadorDni`.

---

## Control Structures: Conditionals vs Loops

### Why are they called "control structures"?

Because they **control the flow of execution** — without them, Java would just run every line top to bottom, once, in order. Control structures let you decide:
- *which* lines run (conditionals)
- *how many times* lines run (loops)
- *where* to jump (`break`/`return`)

The word "control" = you are controlling the **path** the program takes through the code.

### Key insight connecting loops and conditionals

Both are control structures and share the same underlying mechanic:
```
evaluate a boolean condition → decide what to execute
```

The only difference is **what happens after the block finishes**:
- `if` → done, move on
- `while` → go back and re-evaluate

So a `while` loop is essentially an `if` that **asks the same question again** at the end.

### Other types of structures in Java

| Category | Examples |
|---|---|
| **Selection** (conditionals) | `if`, `if-else`, `switch` |
| **Iteration** (loops) | `for`, `while`, `do-while`, `for-each` |
| **Jump** (transfer control) | `break`, `continue`, `return` |
| **Exception handling** | `try-catch-finally` |

---

## Control Flow — What it means with examples

"Flow of execution" means **the order in which lines run**.

**Without control structures** — Java just goes line by line, top to bottom, no choices:
```java
int x = 5;
System.out.println("hello");
System.out.println("world");
// runs line 1, then 2, then 3. Always. No way to skip or repeat.
```

**With a conditional** — you control WHICH lines run:
```java
int x = 5;
if (x > 3) {
    System.out.println("x is big");   // only runs if condition is true
}
System.out.println("done");           // always runs
```

**With a loop** — you control HOW MANY TIMES lines run:
```java
int i = 0;
while (i < 3) {
    System.out.println("tick");   // runs 3 times, not 1, not forever
    i++;
}
```

**Contrafactual — what if control structures didn't exist?**

Imagine `buscarTrabajadorDni` without `if`:
```java
public Trabajador buscarTrabajadorDni(String dni) {
    Trabajador t = trabajadores.get(dni);
    // you CANNOT check if t is null
    // you CANNOT choose what to return
    // program crashes if dni doesn't exist
    return t;
}
```
The `if (t != null)` is literally **controlling** whether the return or the error path executes. Without it, you lose that decision.

**Summary:** "Controlling the flow" = deciding the order and number of times lines execute, instead of always running everything once, top to bottom.
