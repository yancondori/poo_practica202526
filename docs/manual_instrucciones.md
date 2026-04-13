# Manual de Instrucciones — Sistema de Gestion de Fabrica de Vehiculos

**Clase principal:** `factory_main.class`  
**Entorno:** BlueJ / Terminal con javac + java

---

## 1. Como ejecutar el programa

### Opcion A: Desde BlueJ

1. Abrir la carpeta `poo_practica202526` como proyecto en BlueJ.
2. Pulsar **Compilar** (o `Ctrl+K`) para compilar todas las clases.
3. Clic derecho sobre la clase `factory_main` en el diagrama.
4. Seleccionar `void main(String[] args)`.
5. El menu aparecera en la consola de BlueJ.

### Opcion B: Desde terminal

```bash
cd poo_practica202526
javac *.java          # compila todos los ficheros
java factory_main     # ejecuta el programa
```

---

## 2. Menu principal

Al ejecutar el programa aparece el siguiente menu:

```
========================================
   FABRICA DE VEHICULOS - MENU PRINCIPAL
========================================
 [Datos]
  1. Cargar datos de ejemplo
  2. Mostrar inventario del almacen
  3. Listar trabajadores
  4. Buscar trabajador por DNI
 [Simulaciones]
  5. Ejecutar simulacion Simple
  6. Ejecutar simulacion Compleja
  7. Ejecutar simulacion Muy Compleja
 [Dashboard y listados]
  8. Mostrar dashboard consolidado
  9. Estado detallado de cadenas
 10. Operarios por productividad
 11. Operarios en orden alfabetico
 12. Vehiculos fabricados
  0. Salir
```

Se introduce el numero de opcion y se pulsa Enter.

---

## 3. Orden recomendado para probar el sistema

### Paso 1: Cargar datos de ejemplo (opcion 1)

**Importante: siempre ejecutar primero.** Esta opcion crea todos los datos necesarios:
- 10 trabajadores (6 operarios, 2 mecanicos, 1 admin, 1 gestor)
- 3 componentes de cada tipo (motores, tapicerias, ruedas)
- 3 vehiculos (BiplazaDeportivo, Turismo, Furgoneta)
- Configura las 3 cadenas de montaje con vehiculos y operarios

Si se intenta ejecutar una simulacion sin cargar datos, el programa avisara que faltan trabajadores.

### Paso 2: Verificar los datos (opciones 2, 3, 4)

- **Opcion 2** — Muestra el inventario: cuantos trabajadores, motores, tapicerias, ruedas y vehiculos terminados hay.
- **Opcion 3** — Lista todos los trabajadores con sus datos personales.
- **Opcion 4** — Pide un DNI y muestra al trabajador si existe.

DNIs de ejemplo para buscar:
```
12345678A  ->  Juan Garcia (OperarioEficiente)
87654321B  ->  Maria Lopez (OperarioEstandar)
55555555G  ->  Carlos Vega (MecanicoEfectivo)
77777777I  ->  Miguel Sanchez (AdminSistema)
```

### Paso 3: Ejecutar una simulacion (opciones 5, 6 o 7)

#### Opcion 5 — Simulacion Simple (Nivel 2)

- Las 3 cadenas ensamblan vehiculos sin averias.
- Cada segundo, el planificador avanza las cadenas.
- El tiempo de cada fase depende del tipo de operario:
  - Operario eficiente: 1 segundo por fase
  - Operario estandar: 3 segundos por fase
- Se muestra el dashboard despues de cada segundo.
- Al completar un vehiculo se anade al almacen.

**Que observar:** como las cadenas con operarios estandar tardan mas (3s por fase) que las eficientes (1s por fase), los vehiculos se completan en momentos distintos.

#### Opcion 6 — Simulacion Compleja (Nivel 3)

- Igual que la Simple, pero se producen **2 averias por cadena**.
- Cada averia detiene la cadena afectada.
- Un mecanico repara la averia:
  - Averia 1: reparada por mecanico efectivo (1 segundo)
  - Averia 2: reparada por mecanico estandar (2-5 segundos, aleatorio)
- Al final se muestra un resumen de reparaciones.

**Que observar:** las cadenas se detienen durante las averias y retoman el montaje tras la reparacion. El mecanico estandar tarda mas que el efectivo.

#### Opcion 7 — Simulacion Muy Compleja (Nivel 3)

- Igual que la Compleja, pero ademas:
  - Se producen **2-3 averias por cadena** (reparadas por mecanico estandar).
  - Se produce **1 caida de luz** en el segundo 4:
    - Todas las cadenas se detienen.
    - El administrador restaura el sistema de gestion (2 segundos).
    - Luego restaura las cadenas de montaje (3 segundos).
    - Total: 5 segundos de parada global.

**Que observar:** durante la caida de luz ninguna cadena avanza. Tras la restauracion, las cadenas reanudan donde se quedaron.

### Paso 4: Consultar resultados (opciones 8-12)

- **Opcion 8** — Dashboard consolidado: estado de las 3 cadenas + stock del almacen.
- **Opcion 9** — Estado detallado: incluye indicador de averia y total de averias por cadena.
- **Opcion 10** — Operarios por productividad: ordenados de mayor a menor numero de montajes.
- **Opcion 11** — Operarios en orden alfabetico: ordenados por apellidos.
- **Opcion 12** — Vehiculos fabricados: lista con todos los componentes de cada vehiculo.

---

## 4. Flujo completo de prueba rapida

Para una demostracion rapida del sistema completo, ejecutar en este orden:

```
1  ->  Cargar datos
2  ->  Ver inventario (3 motores, 3 tapicerias, 3 ruedas, 0 vehiculos)
5  ->  Ejecutar Simple (3 vehiculos se ensamblan)
12 ->  Ver vehiculos fabricados (ahora hay 3)
10 ->  Operarios por productividad (los montajes se han incrementado)
```

Para probar Nivel 3, **reiniciar el programa** (opcion 0 + volver a ejecutar) y:

```
1  ->  Cargar datos
6  ->  Ejecutar Compleja (averias + reparaciones)
```

O para Muy Compleja:

```
1  ->  Cargar datos
7  ->  Ejecutar Muy Compleja (averias + caida de luz)
```

**Nota:** cada simulacion consume las cadenas configuradas. Para ejecutar otra simulacion hay que reiniciar el programa y cargar datos de nuevo.

---

## 5. Estructura del proyecto

```
poo_practica202526/
  |-- factory_main.java     <-- EJECUTAR AQUI (punto de entrada)
  |-- *.java                <-- 32 clases Java en la raiz (requisito BlueJ)
  |-- docs/
        |-- memoria_practica.md       <-- Memoria de la practica
        |-- manual_instrucciones.md   <-- Este documento
        |-- diagram_class_practica2526.png  <-- Diagrama de clases
        |-- practica2526.md           <-- Enunciado
        |-- PracticaOOP202526_goodnotes.pdf <-- Enunciado anotado
```

---

## 6. Preguntas frecuentes que podria hacer el instructor

### "Explicame el polimorfismo en tu practica."

El ejemplo principal esta en `CadenaMontaje.avanzarTiempo()`. Cuando llama a `getOperarioActual().getTiempoTarea()`, no sabe si el operario es eficiente o estandar. El metodo `getTiempoTarea()` es abstracto en `Operario` y cada subclase lo implementa con un valor distinto (1 o 3). Java resuelve en tiempo de ejecucion cual ejecutar segun el tipo real del objeto — esto es enlace dinamico (dynamic dispatch).

Lo mismo ocurre con `getTiempoReparacion()` en los mecanicos: efectivo retorna 1, estandar retorna aleatorio 2-5.

### "Por que Almacen usa HashMap para trabajadores y ArrayList para componentes?"

- **HashMap<String, Trabajador>**: permite busqueda directa por DNI en O(1). El DNI es unico por trabajador, asi que funciona perfectamente como clave.
- **ArrayList**: para motores, tapicerias y ruedas se necesita mantener el orden de insercion y poder quitar el primero (FIFO). No se necesita busqueda por clave.

### "Como se resuelve la referencia circular entre Planificador y Dashboard?"

En `factory_main`, el constructor crea primero el Planificador con `dashboard=null`, luego crea el Dashboard pasandole las cadenas del Planificador, y finalmente inyecta el Dashboard en el Planificador con `setDashboard()`. Esto rompe el circulo sin violar ninguna dependencia.

### "Que patron de diseno sigue el Dashboard?"

Sigue el patron MVC (Modelo-Vista-Controlador):
- **Modelo:** Almacen y CadenaMontaje (datos puros)
- **Controlador:** Planificador (modifica los datos)
- **Vista:** Dashboard (solo lee e imprime, nunca modifica)

Si quisieramos cambiar la salida (por ejemplo, a una interfaz grafica), solo habria que crear un nuevo Dashboard sin tocar el resto del codigo.

### "Por que Motor tiene una clase intermedia MotorCombustion?"

Porque cilindrada y numero de cilindros solo aplican a motores de combustion (gasolina e hibrido). Un motor electrico no tiene cilindros. Si pusieramos esos campos en Motor, MotorElectrico heredaria atributos irrelevantes. MotorCombustion evita eso.

### "Como funciona el enum EstadoMontaje con ordinal()?"

El enum tiene 4 valores: CHASIS(0), MOTOR(1), TAPICERIA(2), RUEDAS(3). El metodo `ordinal()` devuelve la posicion. En CadenaMontaje, los 4 operarios se guardan en un ArrayList con indices 0-3. Asi, `operarios.get(estadoActual.ordinal())` devuelve el operario correspondiente a la fase actual.

### "Que simplificaciones has hecho y por que?"

Estan documentadas en la seccion 4 de la memoria (Supuestos y decisiones de diseno). Las principales:
- Fechas como String (decision del curso)
- Una Rueda por vehiculo (representa el tipo, no 4 ruedas fisicas)
- Tipo de operario fijo (no cambia dinamicamente al superar 10 montajes)
- Averias pre-programadas (para garantizar los minimos del enunciado)
- Ordenacion con burbuja (simplicidad, sin Collections.sort)
