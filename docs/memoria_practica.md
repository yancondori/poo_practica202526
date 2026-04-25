# Memoria de la Practica — Sistema de Gestion de Fabrica de Vehiculos

**Asignatura:** Programacion Orientada a Objetos (POO)  
**Curso:** 2025-2026  
**Autor:** Yan Carlos Condori Tello
**Nivel implementado:** Nivel 3  
**Clase principal:** `factory_main.class`

---

## Indice

1. [Nivel 1 — Planteamiento y diseño (3 puntos)](#nivel-1)
   - 1.1 Planteamiento del problema
   - 1.2 Actores participantes y relaciones
   - 1.3 Diagrama de clases
   - 1.4 Jerarquias de herencia
   - 1.5 Logica y dependencias entre clases
2. [Nivel 2 — Implementacion (hasta 7 puntos)](#nivel-2)
   - 2.1 Gestion de almacen
   - 2.2 Gestion de trabajadores
   - 2.3 Simulacion Simple (Planificador)
   - 2.4 Consultas y stock
   - 2.5 Menu textual
3. [Nivel 3 — Implementacion (hasta 10 puntos)](#nivel-3)
   - 3.1 Simulacion Compleja
   - 3.2 Simulacion Muy Compleja
   - 3.3 Dashboard — listados y estadisticas
   - 3.4 Interfaz textual completa
   - 3.5 Supuestos adicionales del Nivel 3
4. [Supuestos y decisiones de diseño](#asunciones)
5. [Conceptos de Programacion Orientada a Objetos aplicados](#conceptos-poo)
6. [Estructura de ficheros](#estructura)

---

<a id="nivel-1"></a>

## 1. Nivel 1 — Planteamiento y diseño

### 1.1 Planteamiento del problema

En este proyecto se modela una fabrica de vehiculos con dos unidades operativas principales:

1. **Cadena de montaje**: construye los vehiculos ensamblando componentes (chasis, motor, tapiceria, ruedas) a traves de 3 cadenas paralelas, una por tipo de vehiculo.
2. **Sistema de gestion de fabrica**: gestiona el almacen de datos, los trabajadores, el dashboard de estado y el planificador que coordina las cadenas.

El sistema permite tres niveles de simulacion:
- **Simple** (Nivel 2): sin averias, solo varia el tiempo segun tipo de operario.
- **Compleja** (Nivel 3): intervienen mecanicos para reparar problemas en las cintas.
- **Muy compleja** (Nivel 3): mecanicos + administrador gestionando caidas de luz.

### 1.2 Actores participantes y relaciones

A continuación se presentan los actores o trabajadores que interactúan en este sistema:

| Actor | Rol | Clase(s) |
|-------|-----|----------|
| Operario eficiente | Controla robots de montaje. >10 montajes, 1 seg/tarea | `OperarioEficiente` |
| Operario estandar | Controla robots de montaje. <=10 montajes, 3 seg/tarea (triple) | `OperarioEstandar` |
| Gestor de planta | Representa el rol de gestion en el almacen. No requiere logica activa: el Planificador gestiona directamente el monitoreo y los mecanicos | `GestorPlanta` |
| Administrador del sistema | Restaura el sistema ante caidas (2s gestion + 3s cadenas) | `AdminSistema` |
| Mecanico efectivo | Repara cintas. >20 reparaciones, 1 seg/reparacion | `MecanicoEfectivo` |
| Mecanico estandar | Repara cintas. <=20 reparaciones, 2-5 seg/reparacion (aleatorio) | `MecanicoEstandar` |

**Relaciones entre actores y componentes del sistema:**

Los actores de la tabla anterior (Operarios, Mecanicos, GestorPlanta, AdminSistema) son todos subclases de `Trabajador` y se almacenan en el `Almacen`. Ademas del personal, el sistema cuenta con tres componentes de gestion que **no son trabajadores** sino clases independientes que coordinan, almacenan o visualizan:

- El **Planificador** (`Planificador.java`) es el proceso coordinador del sistema. Funciona como un reloj: cada segundo ejecuta una accion sobre las 3 cadenas de montaje. Es quien invoca a los mecanicos y al admin cuando se producen averias o caidas de luz.
- La **CadenaMontaje** (`CadenaMontaje.java`) es la estructura donde se ensambla un vehiculo. Contiene 4 operarios (uno por fase: CHASIS, MOTOR, TAPICERIA, RUEDAS) y avanza estado a estado hasta completar el vehiculo.
- El **Almacen** (`Almacen.java`)  es el almacen central de datos. Guarda trabajadores (en un HashMap por DNI), componentes (motores, tapicerias, ruedas) y vehiculos fabricados. No conoce al resto del sistema — otros lo usan a el.
- El **Dashboard** (`Dashboard.java`)  es la vista del sistema. Lee datos del Almacen y de las cadenas pero nunca los modifica (patron lectura-solo, similar a la Vista en MVC).

En cuanto a los trabajadores y su participacion en la simulacion:

- Los **Operarios** (subclases de `Trabajador`) estan asignados a estaciones dentro de cada cadena. Su tipo (eficiente o estandar) determina el tiempo de cada fase via polimorfismo (`getTiempoTarea()`). Participan en los 3 niveles de simulacion.
- Los **Mecanicos** (subclases de `Trabajador` via `MecanicoCinta`) intervienen en las simulaciones Compleja y MuyCompleja (Nivel 3). Su tipo determina el tiempo de reparacion via polimorfismo (`getTiempoReparacion()`).
- El **AdminSistema** (subclase de `Trabajador`) interviene solo en la simulacion MuyCompleja para restaurar el sistema tras una caida de luz (2s gestion + 3s cadenas).
- El **GestorPlanta** (subclase de `Trabajador`) existe como representacion del rol en el almacen; no requiere logica activa porque el Planificador gestiona directamente el monitoreo y la coordinacion de mecanicos.

### 1.3 Diagrama de clases

El diagrama de clases completo (cubre los 3 niveles del enunciado) se encuentra en:

> **`docs/diagram_class_practica2526.png`**

Este diagrama fue generado desde BlueJ y muestra todas las clases con sus relaciones de herencia (flechas solidas) y dependencias de uso (flechas punteadas).

### 1.4 Jerarquias de herencia

Se presentaran las jerarquías de cada clase usada en el proyecto:

#### 1.4.1 Jerarquia de Trabajadores

```
Trabajador (abstract)
  |-- Operario (abstract)          <-- anade: montajesPieza, getTiempoTarea() [abstracto]
  |     |-- OperarioEficiente      <-- getTiempoTarea() = 1
  |     |-- OperarioEstandar       <-- getTiempoTarea() = 3
  |
  |-- MecanicoCinta (abstract)     <-- anade: numReparaciones, getTiempoReparacion() [abstracto]
  |     |-- MecanicoEfectivo       <-- getTiempoReparacion() = 1
  |     |-- MecanicoEstandar       <-- getTiempoReparacion() = aleatorio 2-5
  |
  |-- GestorPlanta                 <-- sin campos adicionales, rol representacional
  |-- AdminSistema                 <-- getTiempoRestaurarGestion()=2, getTiempoRestaurarCadenas()=3
```

**Polimorfismo clave:** `getTiempoTarea()` se declara como `abstract` en `Operario`. Cada subclase lo implementa con su propio valor. Cuando `CadenaMontaje` llama a `getOperarioActual().getTiempoTarea()`, Java resuelve en tiempo de ejecucion que version ejecutar segun el tipo real del objeto (enlace dinamico). Lo mismo ocurre con `getTiempoReparacion()` en la rama de mecanicos.

#### 1.4.2 Jerarquia de Vehiculos

```
Vehiculo (abstract)                <-- color, numPlaza, tara, pesoMax, motor, tapiceria, rueda
  |-- BiplazaDeportivo
  |-- Turismo
  |-- Furgoneta
```

Las subclases no anaden campos propios; su funcion es identificar el tipo de vehiculo en el sistema y disponer de un `toString()` diferenciado.

#### 1.4.3 Jerarquia de Motores

```
Motor (abstract)                   <-- potencia
  |-- MotorCombustion (abstract)   <-- cilindrada, numCilindros
  |     |-- MotorGasolina
  |     |-- MotorHibrido
  |-- MotorElectrico               <-- hereda solo potencia (sin cilindrada ni cilindros)
```

**Nota de diseno:** `cilindrada` y `numCilindros` se ubican en `MotorCombustion` (no en `Motor`) porque un motor electrico no tiene cilindros. Esto evita que `MotorElectrico` herede campos irrelevantes.

#### 1.4.4 Jerarquia de Tapicerias

```
Tapiceria (abstract)               <-- color, metrosCuadrados
  |-- TapiceriaCuero
  |-- TapiceriaAlcantara
  |-- TapiceriaTela
```

#### 1.4.5 Jerarquia de Ruedas

```
Rueda (abstract)                   <-- ancho(mm), diametro(pulgadas), carga(kg), codigo(km/h)
  |-- RuedaNormal
  |-- RuedaDeportiva
  |-- RuedaTodoT
```

### 1.5 Logica y dependencias entre clases

A continuacion se describe como interactuan las clases del sistema, agrupadas en paquetes logicos.

#### 1.5.1 Paquete de control: `factory_main`

`factory_main` es la clase principal y punto de entrada del programa (`main()`). Es la unica clase que instancia directamente los tres componentes centrales del sistema:

```
factory_main
  |-- CREA --> Almacen              (paso 1: sin dependencias)
  |-- CREA --> Planificador         (paso 2: recibe Almacen, dashboard=null)
  |-- CREA --> Dashboard            (paso 3: recibe Almacen + cadenas del Planificador)
  |-- INYECTA --> Planificador.setDashboard(dashboard)   (paso 4: cierra referencia circular)
```

**Dependencias directas:** `Almacen`, `Planificador`, `Dashboard`, y transitivamente todas las clases que estos usan (`CadenaMontaje`, `Vehiculo`, `Operario`, `Motor`, `Tapiceria`, `Rueda`).

**Por que este orden importa:** Planificador necesita Dashboard para mostrar el estado tras cada tick, pero Dashboard necesita las cadenas del Planificador para leerlas. Se rompe el circulo creando Planificador con `dashboard=null` y luego inyectandolo con `setDashboard()`.

#### 1.5.2 Paquete de datos: `Almacen`

`Almacen` es el almacen central y la clase mas independiente del sistema. No conoce a ninguna otra clase del sistema de gestion (ni Planificador, ni Dashboard, ni CadenaMontaje).

```
Almacen
  |-- CONTIENE --> HashMap<String, Trabajador>    (clave: DNI)
  |-- CONTIENE --> ArrayList<Motor>               (stock de motores)
  |-- CONTIENE --> ArrayList<Tapiceria>            (stock de tapicerias)
  |-- CONTIENE --> ArrayList<Rueda>                (stock de ruedas)
  |-- CONTIENE --> ArrayList<Vehiculo>             (vehiculos fabricados)
```

**Quien lo usa:**
- `factory_main` lo crea y lo pasa como parametro a `Planificador` y `Dashboard`.
- `Planificador` lo usa para guardar vehiculos terminados (`addVehiculosFabricados()`).
- `Dashboard` lo usa para leer el stock (getters de tamanio).

**Desacoplamiento:** si se cambiara la estructura interna (por ejemplo, reemplazar HashMap por TreeMap, o ArrayList por LinkedList), ningun otro componente se veria afectado, ya que solo se accede a Almacen a traves de sus metodos publicos.

#### 1.5.3 Paquete de simulacion: `Planificador` + `CadenaMontaje` + `EstadoMontaje`

Este es el nucleo de la logica de simulacion.

**Planificador** actua como un reloj:

```
Planificador
  |-- TIENE --> ArrayList<CadenaMontaje> cadenas   (exactamente 3, una por tipo de vehiculo)
  |-- USA  --> Almacen                             (para guardar vehiculos terminados)
  |-- USA  --> Dashboard                           (para mostrar estado tras cada segundo)
  |
  |-- ejecutarSimple():
  |     Bucle while: mientras alguna cadena este funcionando:
  |       segundo++
  |       Para cada cadena activa:
  |         cadena.avanzarTiempo()  -->  si retorna true, vehiculo completado
  |         almacen.addVehiculosFabricados(vehiculo)
  |       dashboard.mostrarConsolidado()
```

**CadenaMontaje** contiene la logica de ensamblaje de un vehiculo:

```
CadenaMontaje
  |-- TIENE --> Vehiculo vehiculo            (el coche que se esta montando)
  |-- TIENE --> EstadoMontaje estadoActual   (CHASIS -> MOTOR -> TAPICERIA -> RUEDAS)
  |-- TIENE --> ArrayList<Operario> operarios (4 operarios, uno por estado)
  |-- TIENE --> boolean funcionando          (interruptor encendido/apagado)
  |-- TIENE --> int tiempoRestante           (cuenta atras del operario actual)
  |
  |-- avanzarTiempo():
  |     Si tiempoRestante > 0: decrementar y esperar
  |     Si tiempoRestante == 0: la fase actual se completa
  |       switch(estadoActual):
  |         CHASIS  --> pasar a MOTOR,     asignar tiempo del operario[1]
  |         MOTOR   --> pasar a TAPICERIA, asignar tiempo del operario[2]
  |         TAPICERIA -> pasar a RUEDAS,   asignar tiempo del operario[3]
  |         RUEDAS  --> vehiculo completo, funcionando=false, return true
```

**EstadoMontaje** es un `enum` con 4 valores cuyo `ordinal()` mapea directamente al indice del operario:

```
EstadoMontaje.CHASIS    ordinal=0  -->  operarios.get(0)
EstadoMontaje.MOTOR     ordinal=1  -->  operarios.get(1)
EstadoMontaje.TAPICERIA ordinal=2  -->  operarios.get(2)
EstadoMontaje.RUEDAS    ordinal=3  -->  operarios.get(3)
```

**Relacion CadenaMontaje --> Operario (polimorfismo):**
CadenaMontaje no sabe si el operario es eficiente o estandar. Solo llama a `getOperarioActual().getTiempoTarea()`, y Java resuelve la llamada al metodo correcto segun el tipo real del objeto en tiempo de ejecucion. Esto permite que una cadena con operarios mixtos tenga tiempos distintos en cada fase.

#### 1.5.4 Paquete de visualizacion: `Dashboard`

```
Dashboard
  |-- RECIBE --> Almacen                        (referencia de solo lectura)
  |-- RECIBE --> ArrayList<CadenaMontaje>       (referencia de solo lectura)
  |
  |-- mostrarEstadoCadenas(): imprime el toString() de cada cadena
  |-- mostrarStockAlmacen():  imprime contadores del almacen
  |-- mostrarConsolidado():   llama a ambos metodos
```

**Dashboard NO modifica nada.** Solo lee y muestra. Esto sigue el patron MVC (Modelo-Vista-Controlador): Almacen y CadenaMontaje son el **Modelo**, Planificador es el **Controlador**, y Dashboard es la **Vista**. Si en el futuro se quisiera reemplazar la salida por consola con una interfaz grafica, solo habria que crear un nuevo Dashboard sin tocar el resto del sistema.

#### 1.5.5 Paquete de entidades: Vehiculo + componentes

```
Vehiculo (abstract)
  |-- TIENE --> Motor motor          (composicion: el vehiculo contiene un motor)
  |-- TIENE --> Tapiceria tapiceria  (composicion)
  |-- TIENE --> Rueda rueda          (composicion: 1 objeto = tipo de neumatico)
```

Cada subclase de `Vehiculo` (`BiplazaDeportivo`, `Turismo`, `Furgoneta`) hereda estas referencias. Los componentes son objetos independientes creados y almacenados en `Almacen`, luego asignados al vehiculo antes de entrar a la cadena de montaje.

#### 1.5.6 Resumen visual de dependencias

```
                    factory_main
                   /      |      \
                  v       v       v
             Almacen  Planificador  Dashboard
               ^       /    |          |
               |      v     v          |
               |  CadenaMontaje(x3)    |
               |      |                |
               |      v                |
               +-- Vehiculo <---------+
               |      |
               |      +-- Motor / Tapiceria / Rueda
               |
               +-- Trabajador
                     |-- Operario (usado por CadenaMontaje)
                     |-- MecanicoCinta (Nivel 3)
                     |-- GestorPlanta
                     |-- AdminSistema (Nivel 3)
```

Leyenda:
- Flechas `-->` = "crea" o "depende de"
- `factory_main` es la unica clase que crea los componentes centrales
- `Almacen` no tiene flechas salientes: no conoce a nadie, otros lo usan a el

---

<a id="nivel-2"></a>

## 2. Nivel 2 — Implementacion

### 2.1 Gestion de almacen

El requerimiento de implementacion de la Gestion de almacen se realiza en la clase `Almacen.java` que  permite:

- **Anadir componentes:** `addMotor()`, `addTapiceria()`, `addRueda()` insertan piezas en las listas.
- **Quitar componentes (FIFO):** `quitarMotor()`, `quitarTapiceria()`, `quitarRueda()` extraen el primer elemento, preparado para un flujo futuro donde la cadena consuma piezas del stock.
- **Anadir vehiculos fabricados:** `addVehiculosFabricados()`, invocado por el Planificador cuando una cadena completa un vehiculo.
- **Consultar stock:** getters de tamanio (`getMotoresSize()`, etc.) para el Dashboard.
- **Mostrar inventario:** `mostrarInventario()` imprime un resumen consolidado.

**Estructura de datos elegida:**
- `HashMap<String, Trabajador>` para trabajadores: permite busqueda directa por DNI en O(1).
- `ArrayList` para motores, tapicerias, ruedas, vehiculos: mantiene el orden de insercion y permite acceso por indice.

### 2.2 Gestion de trabajadores

El requerimiento de implementacion de la Gestion de trabajadores se realiza en la clase `Almacen.java` que permite:

- **Alta de trabajadores:** `addTrabajador(dni, trabajador)` inserta en el HashMap con el DNI como clave.
- **Busqueda por DNI:** `buscarTrabajadorDni()` — busqueda directa al HashMap, O(1).
- **Busqueda por nombres:** `buscarTrabajadorNombres()` — recorre todos los valores, comparacion case-insensitive con `equalsIgnoreCase()`.
- **Busqueda por nombres + apellidos:** `buscarTrabajadorNombresApellidos()` — misma estrategia de recorrido con dos criterios.
- **Listado completo:** `listarTrabajadores()` imprime el `toString()` de cada trabajador.

**Decision de diseno (busquedas sencillas):** el enunciado pide "busquedas sencillas" sin especificar por que criterio. Se adopta la decision de implementar busqueda por DNI (la mas eficiente), por nombres, y por nombres+apellidos. Esto cubre los casos de uso mas habituales sin acomplejidad innecesaria.

### 2.3 Simulacion Simple (Planificador)

El Planificador simple es Implementado en la clase `Planificador.ejecutarSimple()` cuyo flujo es:

1. El gestor de planta configura cada cadena con un vehiculo y 4 operarios (`configurarCadenas()`).
2. El planificador inicia un bucle `while` que avanza segundo a segundo.
3. En cada segundo, para cada cadena activa:
   - Se llama a `cadena.avanzarTiempo()`.
   - Si retorna `true`, el vehiculo se marca como completado y se mueve al almacen.
4. Tras cada segundo se llama a `dashboard.mostrarConsolidado()` para mostrar el estado.
5. El bucle termina cuando las 3 cadenas han terminado.

**Ejemplo de ejecucion con operarios mixtos (1 eficiente + 1 estandar):**

```
Segundo 1: Cadena 1 en CHASIS, operario eficiente -> tiempoRestante = 0 (1 seg)
Segundo 1: Pasa a MOTOR, operario eficiente -> tiempoRestante = 0
Segundo 1: Pasa a TAPICERIA, operario estandar -> tiempoRestante = 2 (3 seg - 1)
Segundo 2: tiempoRestante = 1
Segundo 3: tiempoRestante = 0, pasa a RUEDAS
...
```

### 2.4 Consultas y stock de vehiculos

Las consultas y actualizacion del stock de vehiculos es Implementado en la `Dashboard.java`:

- `mostrarEstadoCadenas()`: recorre las 3 cadenas con un for clasico (para numerar "Cadena 1, 2, 3") e imprime su `toString()`.
- `mostrarStockAlmacen()`: llama a los getters de tamanio del Almacen para imprimir el stock de motores, tapicerias, ruedas y vehiculos completados.
- `mostrarConsolidado()`: llama a ambos metodos con cabecera visual.

Tambien en `Almacen.mostrarInventario()`: imprime el total de trabajadores registrados y componentes en stock.

### 2.5 Menu textual

> **Nota de requisito:** segun el enunciado, la interfaz textual es un requisito del **Nivel 3** ("desarrollar una interfaz textual del sistema para que las funciones identificadas en el nivel 2 funcionen correctamente"). Esta seccion documenta la version basica del menu (Nivel 2), cuya version completa con todas las opciones se describe en la seccion 3.4.

Implementado en `factory_main.menuPrincipal()` con `Scanner` y un `switch`. La version de Nivel 2 expone las funciones basicas:

```
=== Fabrica de Vehiculos ===
1. Mostrar inventario
2. Listar trabajadores
3. Ejecutar simulacion simple
4. Mostrar dashboard
5. Cargar datos de ejemplo
0. Salir
```

`cargarDatosEjemplo()` crea instancias de prueba (operarios, motor, tapiceria, rueda, vehiculo) y configura la cadena 0 con ellos. El menu se amplia a 12 opciones en Nivel 3 (ver seccion 3.4).

---

<a id="nivel-3"></a>

## 3. Nivel 3 — Implementacion

### 3.1 Simulacion Compleja — `ejecutarCompleja()`

Implementada en `Planificador.java`. Logica:

- Se pre-programan **2 averias por cadena** en segundos determinados (aleatorios entre 2-3 y 5-6).
- Cuando una cadena sufre una averia, queda bloqueada (`averiada=true` en `CadenaMontaje`).
- Se asigna un mecanico que inicia la reparacion con su tiempo correspondiente.
- Las averias se alternan entre mecanico efectivo (1 seg) y mecanico estandar (2-5 seg aleatorio), cumpliendo el requisito de que al menos 1 de cada perfil repare al menos 2 problemas.
- Mientras la cadena esta averiada, `avanzarTiempo()` no se ejecuta; solo avanza la reparacion.
- Al finalizar se muestra un resumen de reparaciones por cadena y por perfil.

**Campos anadidos a `CadenaMontaje`:** `averiada`, `tiempoReparacion`, `totalAverias`.
**Metodos anadidos:** `provocarAveria()`, `estaAveriada()`, `iniciarReparacion()`, `avanzarReparacion()`.

### 3.2 Simulacion Muy Compleja — `ejecutarMuyCompleja()`

Implementada en `Planificador.java`. Logica:

- Se pre-programan **2 a 3 averias por cadena** (aleatorio), reparadas por mecanico estandar.
- Se programa **1 caida de luz** en el segundo 4 que detiene todas las cadenas.
- El `AdminSistema` restaura: primero el sistema de gestion (2 segundos), luego las cadenas de montaje (3 segundos). Total: 5 segundos de parada global.
- Durante la restauracion, ningun tick de cadena se procesa (se usa `continue` en el bucle).
- Las averias de cintas y la caida de luz pueden coexistir; la restauracion de luz tiene prioridad.

### 3.3 Dashboard — listados y estadisticas

Implementados en `Dashboard.java`:

- **`listarOperariosPorProductividad()`**: obtiene operarios del almacen, los ordena por `montajesPieza` de mayor a menor (burbuja), y muestra nombre, apellidos, montajes y tipo.
- **`listarOperariosAlfabetico()`**: misma lista, ordenada por apellidos (burbuja, `compareToIgnoreCase`).
- **`listarVehiculosFabricados()`**: delega a `Almacen.listarVehiculosFabricados()` que muestra cada vehiculo con todos sus componentes.
- **`mostrarEstadoCadenasDetallado()`**: muestra cada cadena con indicador de averia y total de averias.

**Nota:** se usa ordenacion burbuja para no depender de `Collections.sort()` ni `Comparator`, manteniendo la simplicidad acorde al nivel del curso.

### 3.4 Interfaz textual completa

Implementada en `factory_main.java` con un menu de 12 opciones + salir:

```
[Datos]       1-4: cargar datos, inventario, listar/buscar trabajadores
[Simulaciones] 5-7: Simple, Compleja, Muy Compleja
[Dashboard]   8-12: consolidado, estado detallado, productividad, alfabetico, vehiculos
[Salir]       0
```

El metodo `cargarDatosEjemplo()` ahora crea un juego completo de datos de prueba:
- 6 operarios (3 eficientes, 3 estandar)
- 1 mecanico efectivo + 1 mecanico estandar
- 1 admin del sistema + 1 gestor de planta
- 3 motores (gasolina, electrico, hibrido), 3 tapicerias, 3 ruedas
- 3 vehiculos (BiplazaDeportivo, Turismo, Furgoneta)
- Las 3 cadenas configuradas con vehiculos y operarios

### 3.5 Supuestos adicionales del Nivel 3

**S1. Averias pre-programadas:** el enunciado dice que debe haber "al menos dos problemas por cinta". Se opto por pre-programar las averias en segundos determinados (con variacion aleatoria) en lugar de generarlas con probabilidad en cada tick. Esto garantiza que se cumplen los minimos exigidos sin depender del azar.

**S2. Caida de luz fija en segundo 4:** el enunciado pide "al menos un problema de caida de luz". Se fija en el segundo 4 para que ocurra a mitad de la simulacion, maximizando el impacto visible. La restauracion es secuencial: primero gestion (2s), luego cadenas (3s).

**S3. Mecanicos como parametros:** `ejecutarCompleja()` recibe un `MecanicoEfectivo` y un `MecanicoEstandar` como parametros en lugar de buscarlos internamente. Esto permite al menu buscarlos en el almacen y validar que existen antes de lanzar la simulacion.

**S4. Ordenacion con burbuja:** se usa el algoritmo de burbuja para ordenar listas en los listados del Dashboard, ya que es el mas sencillo y no requiere importar `Collections` ni implementar `Comparable`. Para los volumenes de datos de esta practica, el rendimiento no es un problema.

---

<a id="asunciones"></a>

## 4. Supuestos y decisiones de diseno

Segun el enunciado: *"para cualquier otro detalle de diseno que no se encuentre descrito expresamente, el alumno tiene libertad para tomar cuantas decisiones considere oportunas"*. A continuacion se documentan las decisiones tomadas.

### 4.1 Fechas como String

Las fechas (`fechaIngreso` en `Trabajador`) se almacenan como `String`, no como `Date` ni `LocalDateTime`. Esta es una decision del curso para mantener la simplicidad. El formato usado es "AAAA-MM-DD".

### 4.2 Una Rueda por vehiculo

Cada `Vehiculo` tiene una referencia a un unico objeto `Rueda`, que representa el modelo/tipo de neumatico, no las 4 ruedas fisicas individuales. Esto simplifica el diseno sin perder informacion sobre el tipo de rueda montada.

### 4.3 Motor: jerarquia con clase intermedia MotorCombustion

El enunciado dice que los atributos tecnicos del motor son: cilindrada, potencia y numero de cilindros. Sin embargo, un motor electrico no tiene cilindrada ni cilindros. Se opto por crear una clase intermedia `MotorCombustion` que agrupa estos campos, y que `MotorElectrico` herede directamente de `Motor` (solo potencia). Esto respeta el principio de que una subclase no debe heredar atributos que no le corresponden.

### 4.4 Almacen desacoplado

`Almacen` no conoce a `Planificador`, `Dashboard` ni `CadenaMontaje`. Solo almacena y devuelve datos. Las clases que necesitan datos del almacen reciben una referencia a el en su constructor (inyeccion de dependencias). Si se cambiara la estructura interna de `Almacen`, ningun otro componente necesitaria modificaciones.

### 4.5 Dashboard como Vista (patron MVC)

`Dashboard` solo lee datos del `Almacen` y de las cadenas de montaje; nunca los modifica. Esto responde al requisito del enunciado de que el subsistema de visualizacion este desacoplado y sea facilmente reemplazable. En la practica, esto se asemeja al patron Modelo-Vista-Controlador (MVC): `Almacen` y `CadenaMontaje` son el Modelo, `Planificador` es el Controlador, y `Dashboard` es la Vista.

### 4.6 Referencia circular Planificador-Dashboard

`Planificador` necesita `Dashboard` para mostrar el estado despues de cada segundo, pero `Dashboard` necesita las cadenas del `Planificador` para leer su estado. Se resuelve en `factory_main` con una inicializacion en 3 pasos:
1. Crear `Planificador` con `dashboard=null`
2. Crear `Dashboard` con `almacen` + `planificador.getCadenas()`
3. Inyectar: `planificador.setDashboard(dashboard)`

### 4.7 Operarios: tipo fijo, no dinamico

El enunciado define que un operario eficiente tiene >10 montajes y uno estandar <=10. En esta implementacion, el tipo se fija al crear el objeto (se instancia `OperarioEficiente` o `OperarioEstandar`). No se implementa una promocion automatica de estandar a eficiente al superar los 10 montajes. Esta es la decision mas sencilla y coherente con el uso de clases concretas separadas.

### 4.8 Seleccion de operarios en simulacion Simple

El enunciado indica que la seleccion de operarios se realiza "de manera aleatoria". En la implementacion actual del metodo `cargarDatosEjemplo()`, los operarios se asignan manualmente para facilitar las pruebas. En una version completa se podria aleatorizar la asignacion.

### 4.9 Consumo de componentes del Almacen

Los vehiculos se crean ya con sus componentes asignados (motor, tapiceria, rueda) antes de entrar a la cadena. El `Almacen` tiene metodos `quitarMotor()`, `quitarTapiceria()`, `quitarRueda()` preparados para un flujo donde la cadena consuma componentes del stock durante el montaje, pero este flujo no se usa en la simulacion Simple actual.

### 4.10 Uso del enum EstadoMontaje con ordinal()

Se aprovecha el metodo `ordinal()` del enum para mapear cada estado (CHASIS=0, MOTOR=1, TAPICERIA=2, RUEDAS=3) al indice del operario correspondiente en el ArrayList de operarios de la cadena. Esto simplifica el codigo pero crea una dependencia implicita: el orden de los valores del enum debe coincidir con el orden de insercion de los operarios.

### 4.11 Busquedas sencillas

Como el enunciado no especifica por que criterio deben hacerse las busquedas de empleados, se adopta la decision de implementar tres tipos: por DNI (busqueda directa en HashMap), por nombres (recorrido lineal con `equalsIgnoreCase`), y por nombres + apellidos (recorrido lineal con dos criterios). Se prioriza la sencillez sobre la flexibilidad.

### 4.12 GestorPlanta como clase representacional

`GestorPlanta` no implementa logica activa en la simulacion. Su funcion es representar el rol de gestor dentro del almacen de trabajadores, cumpliendo con la jerarquia de herencia de `Trabajador`. La logica de monitoreo de cadenas y coordinacion de mecanicos la ejecuta directamente `Planificador`, ya que este es quien controla el bucle de tiempo y tiene acceso a las cadenas y al dashboard.

---

<a id="conceptos-poo"></a>

## 5. Conceptos de POO aplicados

### 5.1 Abstraccion

Las clases `Trabajador`, `Vehiculo`, `Motor`, `Tapiceria`, `Rueda`, `Operario` y `MecanicoCinta` son abstractas. Definen la estructura comun sin poder instanciarse directamente. Solo las subclases concretas (como `OperarioEficiente`, `Turismo`, `MotorGasolina`) se pueden instanciar.

Los metodos abstractos (`getTiempoTarea()`, `getTiempoReparacion()`) obligan a cada subclase a proporcionar su propia implementacion.

### 5.2 Encapsulamiento

Todos los campos de las clases son `private`. Se accede a ellos exclusivamente mediante getters y setters publicos. Metodos como `registrarMontaje()` controlan la modificacion del campo `montajesPieza` con un incremento unitario (+1), en lugar de permitir un setter con valor arbitrario. Esto protege la integridad de los datos.

### 5.3 Herencia

Se utilizan multiples niveles de herencia:
- `OperarioEficiente` -> `Operario` -> `Trabajador` (3 niveles)
- `MotorGasolina` -> `MotorCombustion` -> `Motor` (3 niveles)
- `RuedaDeportiva` -> `Rueda` (2 niveles)

Las subclases reutilizan todo el codigo de las superclases via `super()` en constructores y `super.toString()` en metodos. Esto evita duplicacion de codigo: los 8 campos de `Trabajador` se declaran una sola vez y los heredan las 8 subclases.

### 5.4 Polimorfismo

El ejemplo mas claro es `getTiempoTarea()`:
- Declarado como `abstract` en `Operario`.
- `OperarioEficiente` retorna 1, `OperarioEstandar` retorna 3.
- `CadenaMontaje.avanzarTiempo()` llama a `getOperarioActual().getTiempoTarea()` sin saber que tipo concreto de operario es; Java resuelve la llamada en tiempo de ejecucion (enlace dinamico o dynamic dispatch).

Otro ejemplo: `getTiempoReparacion()` en `MecanicoCinta`, con implementaciones distintas en `MecanicoEfectivo` (fijo 1) y `MecanicoEstandar` (aleatorio 2-5).

Tambien `toString()` esta sobreescrito en todas las subclases, componiendo la informacion de la clase actual con `super.toString()` de la superclase.

---

<a id="estructura"></a>

## 6. Estructura de ficheros

Todos los ficheros `.java` se encuentran en la raiz del proyecto (requisito de BlueJ). La documentacion se ubica en la carpeta `docs/`.

```
poo_practica202526/
  |
  |-- factory_main.java          -- Punto de entrada, main(), menu principal
  |-- Almacen.java               -- Almacen central de datos (HashMap + ArrayLists)
  |-- Planificador.java          -- Reloj y coordinador de las 3 cadenas
  |-- CadenaMontaje.java         -- Logica de ensamblaje por estados (switch + ordinal)
  |-- Dashboard.java             -- Vista de solo lectura (patron MVC)
  |-- EstadoMontaje.java         -- Enum: CHASIS, MOTOR, TAPICERIA, RUEDAS
  |
  |-- Trabajador.java            -- Clase abstracta raiz (datos personales)
  |-- Operario.java              -- Abstracta intermedia (montajesPieza, getTiempoTarea)
  |-- OperarioEficiente.java     -- getTiempoTarea() = 1 (>10 montajes)
  |-- OperarioEstandar.java      -- getTiempoTarea() = 3 (<=10 montajes)
  |-- MecanicoCinta.java         -- Abstracta intermedia (numReparaciones, getTiempoReparacion)
  |-- MecanicoEfectivo.java      -- getTiempoReparacion() = 1 (>20 reparaciones)
  |-- MecanicoEstandar.java      -- getTiempoReparacion() = aleatorio 2-5 (<=20 reparaciones)
  |-- GestorPlanta.java          -- Rol representacional en almacen (sin campos extra)
  |-- AdminSistema.java          -- Restaura sistema (2s gestion, 3s cadenas)
  |
  |-- Vehiculo.java              -- Abstracta raiz (color, plazas, tara, peso, componentes)
  |-- BiplazaDeportivo.java      -- Vehiculo biplaza deportivo
  |-- Turismo.java               -- Vehiculo turismo
  |-- Furgoneta.java             -- Vehiculo furgoneta
  |
  |-- Motor.java                 -- Abstracta raiz (potencia)
  |-- MotorCombustion.java       -- Abstracta intermedia (cilindrada, numCilindros)
  |-- MotorGasolina.java         -- Motor de gasolina
  |-- MotorHibrido.java          -- Motor hibrido
  |-- MotorElectrico.java        -- Motor electrico (solo potencia)
  |
  |-- Tapiceria.java             -- Abstracta raiz (color, metrosCuadrados)
  |-- TapiceriaCuero.java        -- Tapiceria de cuero
  |-- TapiceriaAlcantara.java    -- Tapiceria de alcantara
  |-- TapiceriaTela.java         -- Tapiceria de tela
  |
  |-- Rueda.java                 -- Abstracta raiz (ancho, diametro, carga, codigo)
  |-- RuedaNormal.java           -- Rueda normal
  |-- RuedaDeportiva.java        -- Rueda deportiva
  |-- RuedaTodoT.java            -- Rueda todoterreno
  |
  |-- docs/
        |-- memoria_practica.md            -- Este documento (memoria de la practica)
        |-- diagram_class_practica2526.png -- Diagrama de clases (BlueJ)
        |-- practica2526.md                -- Enunciado de la practica (texto)
        |-- PracticaOOP202526_goodnotes.pdf -- Enunciado anotado (PDF)
        |-- telegram_poo.docx             -- Guia y tips del grupo de Telegram
        |-- progra_poo_s6.docx            -- Transcripcion sesion 6 del tutor
        |-- session_notes.md              -- Notas de sesiones de desarrollo
        |-- session_project_parts_notes.md -- Notas explicativas de conceptos Java del proyecto
```
