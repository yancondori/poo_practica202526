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

---

## The `new` keyword: when you need it and when you don't

The rule is simple: **`new` allocates a new object on the heap**. You only need it when you are *creating* an object. Primitives and already-created objects passed in as parameters never need it.

### Case 1 — Primitives: no `new`, ever

In `Trabajador.java:24`, `salario` is declared as `double`:

```java
private double salario;
```

`double`, `int`, `boolean`, `char`, etc. are **primitive types**. They live directly in the variable slot — there is no object, no heap allocation, no constructor to call. Assignment is just copying a value:

```java
this.salario = salario;   // copies the number 1500.0 — no object involved
```

### Case 2 — Strings passed as parameters: no `new`

Every `String` parameter in `Trabajador`'s constructor (`nombres`, `dni`, `fechaIngreso`, etc.) was *already created by the caller*. The constructor just stores the reference:

```java
this.nombres = nombres;   // stores a reference to an existing String object
```

No `new` is needed because you are not creating anything — the object already exists. You are only pointing your field at it.

### Case 3 — Abstract class constructor: no `new` by definition

`Trabajador` is `abstract`. You **can never call `new Trabajador(...)`** directly — Java forbids it. The constructor exists only so that subclasses can call `super(...)`:

```java
// In OperarioEstandar (hypothetically):
public OperarioEstandar(String nombres, ...) {
    super(nombres, apellidos, dni, ...);  // runs Trabajador's constructor
}
```

The `new` keyword fires once — on the concrete subclass (e.g., `new OperarioEstandar(...)`). That single `new` triggers the whole chain up through `super()`. The abstract class constructor never needs `new` because it is never called directly.

### Case 4 — Object fields that need `new`: `Almacen`

In `Almacen.java:20-24`, the fields are `HashMap` and `ArrayList` — complex objects that must be constructed:

```java
this.trabajadores = new HashMap<>();   // creates a new, empty HashMap object on the heap
this.motores      = new ArrayList<>(); // creates a new, empty ArrayList object on the heap
```

These fields are **not primitives** and they are **not passed in from outside** — they must be born right here. That is exactly what `new` does: it calls the class constructor and returns a fresh object.

### The decision tree

```
Is it a primitive (int, double, boolean, char...)?
  └─ YES → never use new, just assign the value

Is it an object passed in as a parameter?
  └─ YES → already exists, just assign the reference (this.x = x)

Is it an object this class must create from scratch?
  └─ YES → use new to construct it (new ArrayList<>(), new HashMap<>())

Is the class abstract?
  └─ new can never be called on it directly; only concrete subclasses use new
```

The key insight: `new` means **"build me a brand-new object right now"**. If the object already exists (parameter) or isn't an object at all (primitive), there is nothing to build.

---

## `instanceof` keyword — `getOperarios()` in `Almacen.java:205`

### The problem this method solves

`trabajadores` is a `HashMap<String, Trabajador>`. It stores **all** worker types mixed together — `Operario`, `GestorPlanta`, `AdminSistema`, `MecanicoCinta`, etc. But this method needs to return **only the ones that are `Operario`**.

How do you filter by type at runtime? That is exactly what `instanceof` does.

### What `instanceof` does

```java
if (t instanceof Operario)
```

This asks: **"Is the object that `t` points to, or any subclass of, `Operario`?"**

- Returns `true` → the object is an `Operario` (or a subclass like `OperarioEstandar`, `OperarioEficiente`)
- Returns `false` → it's a `GestorPlanta`, `MecanicoCinta`, etc.

It checks the **actual runtime type** of the object, not the declared type of the variable. `t` is declared as `Trabajador`, but `instanceof` looks at what the object *really is* underneath.

### The cast `(Operario) t`

```java
lista.add((Operario) t);
```

After `instanceof` confirms the object is an `Operario`, you still need to **cast** it. Why?

- `t` is declared as `Trabajador` — the compiler only knows that
- The `ArrayList<Operario>` only accepts `Operario` references
- The cast tells the compiler: *"trust me, I already checked — treat this as `Operario`"*

Without the `instanceof` check first, this cast would throw a `ClassCastException` at runtime if `t` turned out to be a `GestorPlanta`. The check makes the cast safe.

### Line by line

```java
ArrayList<Operario> lista = new ArrayList<>();       // 1. empty result list
for (Trabajador t : trabajadores.values())           // 2. loop every worker
{
    if (t instanceof Operario)                       // 3. is this worker an Operario?
    {
        lista.add((Operario) t);                     // 4. yes → cast and add to result
    }
}
return lista;                                        // 5. return only the Operarios
```

### Why it works with subclasses too

Your inheritance tree:

```
Trabajador
  └── Operario (abstract)
        ├── OperarioEficiente   ← instanceof Operario → true
        └── OperarioEstandar    ← instanceof Operario → true
  └── GestorPlanta              ← instanceof Operario → false
  └── MecanicoCinta             ← instanceof Operario → false
```

`instanceof` is **inherited-aware** — it returns `true` for the class itself and all its subclasses. So `new OperarioEficiente(...)` passes the `instanceof Operario` check even though `OperarioEficiente` is not directly `Operario`.

### One-sentence summary

`instanceof` asks *"is this object a member of this type's family?"* and lets you safely narrow a broad reference (`Trabajador`) down to a specific one (`Operario`) before using it.

---

## Índice manual vs for-each — `mostrarEstadoCadenas()` en `Dashboard.java:20`

### El output que necesitas

```
Cadena 1: [estado...]
Cadena 2: [estado...]
Cadena 3: [estado...]
```

Para imprimir **"Cadena 1"**, **"Cadena 2"**, etc., necesitas saber **en qué posición estás**. Eso es exactamente lo que `i` te da.

### Comparación directa

**Con índice manual (el código actual):**
```java
for (int i = 0; i < cadenas.size(); i++)
{
    System.out.println("Cadena " + (i + 1) + ": " + cadenas.get(i));
    //                              ↑ posición legible   ↑ elemento
}
```
- `i` te da la posición → puedes construir `"Cadena 1"`, `"Cadena 2"`, etc.
- `cadenas.get(i)` recupera el elemento en esa posición

**Con for-each:**
```java
for (CadenaMontaje c : cadenas)
{
    System.out.println("Cadena ??: " + c);  // ← no sabes el número
}
```
- `c` es el elemento directamente — no tienes ninguna variable que te diga en qué posición estás
- Tendrías que añadir un contador externo extra, lo cual es más feo que el `for` clásico

### La regla general para elegir entre los dos

| Situación | Loop recomendado |
|---|---|
| Necesitas el **índice/posición** (este caso) | `for` clásico con `i` |
| Solo necesitas **cada elemento**, sin importar posición | `for-each` |
| Quieres **modificar** elementos por posición | `for` clásico |
| Solo quieres **leer/procesar** cada elemento | `for-each` |

### Por qué `(i + 1)` y no solo `i`

Los arrays/ArrayLists en Java empiezan en índice `0`, pero los humanos contamos desde `1`. Sin la suma:

```
Cadena 0: ...   ← confuso para el usuario
Cadena 1: ...
Cadena 2: ...
```

Con `(i + 1)`:
```
Cadena 1: ...   ← natural y legible
Cadena 2: ...
Cadena 3: ...
```

### Resumen

No es que el índice manual sea más eficiente en velocidad — `ArrayList.get(i)` es O(1), igual de rápido que el for-each. Es eficiente en **legibilidad y propósito**: cuando el número de cadena forma parte del output, el `for` clásico con `i` es la herramienta correcta porque te da esa información de posición gratis, sin código extra.
