WEBVTT

Kind: captions

Language: es

00:00:02.960 \--\> 00:00:15.880

Vale, os paso el papelito este para los

que estáis aquí, por favor, que pongáis

00:00:08.840 \--\> 00:00:15.880

el DNI, el DNI, ¿vale? El día 25.

00:00:35.120 \--\> 00:00:46.120

Bueno, eh la práctica hace aquí una

pequeña

00:00:41.640 \--\> 00:00:46.120

recordatorio de probación de objetos,

00:00:47.800 \--\> 00:00:51.320

¿vale? Sobre herencia.

00:00:54.239 \--\> 00:01:00.800

que eso ya lo hemos visto. Y luego viene

aquí la descripción de la práctica.

00:00:57.520 \--\> 00:01:06.680

Entonces, eh la práctica es sobre

implementar un sistema, ¿vale?

00:01:03.600 \--\> 00:01:13.000

eh de una fábrica de vehículos donde por

un lado hay que gestionar la parte de la

00:01:09.439 \--\> 00:01:13.000

cadena de montaje.

00:01:20.680 \--\> 00:01:28.360

Por un lado, hay que gestionar la parte

de la cadena de montaje de construcción

00:01:26.000 \--\> 00:01:34.799

de los coches y por otro lado, hay que

gestionar, ¿vale?, la parte de eh de

00:01:32.119 \--\> 00:01:38.520

administración del de la fábrica, ¿no?

Es gestionar el almacén, gestionar

00:01:36.880 \--\> 00:01:42.799

también los trabajadores, darle alta de

baja a los trabajadores, gestionar

00:01:40.680 \--\> 00:01:48.000

también un

eh un tasboard eh un cuadro de mando,

00:01:46.280 \--\> 00:01:52.799

¿no?, donde se pueda ver ahí en qué

situación están los coches, la

00:01:49.880 \--\> 00:01:58.640

construcción de los coches,

incluso esto del planificador simula la

00:01:55.680 \--\> 00:02:05.320

fabricación de los coches. Vale, ahora

veremos, entraremos en detalle, ¿vale?

00:02:02.320 \--\> 00:02:05.320

Eh,

00:02:05.439 \--\> 00:02:15.000

vale, esta simulación pues hay de varios

tipos, una simulación más sencilla y

00:02:10.239 \--\> 00:02:15.000

otras dos que son un poco más complejas.

00:02:16.400 \--\> 00:02:21.440

Estas simulaciones depende también del

tipo de trabajador y te dice aquí los

00:02:20.080 \--\> 00:02:25.560

tipos de trabajadores que hay, en qué

consiste cada. Vale,

00:02:23.959 \--\> 00:02:29.280

la cuestión es que antes de ver en

detalle todo eso, porque es un montón de

00:02:27.160 \--\> 00:02:33.680

información lo que viene ahí, vamos a

ver primero qué es lo que pide la

00:02:30.680 \--\> 00:02:38.400

práctica, ¿vale?

y qué es lo que hay que hacer y luego ya

00:02:35.319 \--\> 00:02:44.519

entramos en detalle en interpretar ese

enunciado que nos

00:02:41.519 \--\> 00:02:44.519

eh

00:02:46.959 \--\> 00:02:53.440

hay que tener en cuenta que, como dice

aquí, que la nota mínima para aprobar la

00:02:50.920 \--\> 00:02:59.440

práctica es un cinco y luego veremos más

adelante es necesario aprobar la

00:02:55.080 \--\> 00:02:59.440

práctica para poder hacer el examen.

00:03:02.560 \--\> 00:03:05.920

Eh, hola.

00:03:07.159 \--\> 00:03:16.080

Vale, la práctica

el está organizado en tres partes. Cada

00:03:13.840 \--\> 00:03:23.920

una de estas partes tiene un nivel de

complejidad diferente y y son niveles de

00:03:20.159 \--\> 00:03:27.239

complejidades que van increchendo

y claro, como tiene diferentes

00:03:25.440 \--\> 00:03:31.680

complejidad, pues cada parte te da una

puntuación.

00:03:29.480 \--\> 00:03:35.920

Eh,

estos tres niveles

00:03:34.360 \--\> 00:03:40.439

tienes que empezar por el nivel más

básico y hasta que no terminas todo el

00:03:38.840 \--\> 00:03:45.560

nivel ese básico, no puedes pasar al

siguiente nivel y así sucesivamente. Es

00:03:43.040 \--\> 00:03:49.799

decir, que si quieres sacar un ocho, por

ejemplo, o un cinco, no puede ser que te

00:03:48.120 \--\> 00:03:53.319

vayas al nivel dos e implementes

determinadas partes del nivel dos y con

00:03:51.599 \--\> 00:03:58.560

eso ya tienes un cinco. Aunque el nivel

dos te dé un cinco, ¿no? El nivel dos te

00:03:56.120 \--\> 00:04:02.120

da un cinco. ya has hecho antes el nivel

uno y si no has hecho el nivel uno por

00:04:00.799 \--\> 00:04:06.720

completo, si no has terminado por

completo, aunque hagas cosas del nivel

00:04:04.079 \--\> 00:04:09.720

dos, el nivel dos te da cero puntos.

¿Vale?

00:04:09.920 \--\> 00:04:15.720

Dice, \"Es es importante considerar que

para obtar a la calificación de un nivel

00:04:13.680 \--\> 00:04:22.959

superior han de cumplirse todas y cada

una de las funcionalidades de nivel

00:04:17.880 \--\> 00:04:22.959

inmediatamente anterior. ¿Vale?

00:04:23.479 \--\> 00:04:29.840

dice, \"De no cumplir con todos los

requerimientos de un nivel, no se puede

00:04:27.199 \--\> 00:04:34.520

obtener una calificación superior a la

marcada por el nivel cuyas restricciones

00:04:31.720 \--\> 00:04:38.840

no se cumplen en su totalidad.

Y si yo estoy en nivel intermedio y no

00:04:37.160 \--\> 00:04:42.800

termino el nivel intermedio y me faltan

cosas, nunca, aunque haga cosas del

00:04:41.080 \--\> 00:04:46.880

nivel superior, nunca voy a tener más

puntuación que la del nivel intermedio.

00:04:48.960 \--\> 00:04:55.479

Eh, dice, \"Para cada uno de los niveles

se van a indicar unos requisitos mínimos

00:04:53.280 \--\> 00:05:00.000

de cumplimiento. Esto quiere decir que

para cualquier otro detalle de diseño

00:04:57.120 \--\> 00:05:04.600

que no se encuentre descrito presamente

expresamente, ¿vale? El alumno tiene

00:05:02.520 \--\> 00:05:08.759

libertad para tomar cuántas decisiones

considere oportun, es decir, tomas de

00:05:06.160 \--\> 00:05:14.400

diseño, decisiones tomas de decisiones

de de diseño, ¿no? Entonces, lo que te

00:05:12.479 \--\> 00:05:18.120

está diciendo es que el enunciado es muy

amplio

00:05:16.320 \--\> 00:05:22.240

y se dicen muchas cosas. Ya veis que

tenéis ahí tres enunciad, tres páginas

00:05:20.600 \--\> 00:05:25.520

solamente escribiendo el sistema. O sea,

el enunciado es muy amplio, pero aunque

00:05:24.080 \--\> 00:05:30.080

sea muy amplio, cuando vayas a

implementar no sé qué cosas, seguro es

00:05:28.199 \--\> 00:05:36.280

posible que el enunciado no te diga cómo

tiene que funcionar al 100%. Y hay cosas

00:05:32.759 \--\> 00:05:40.880

lagunas que no te las de esa situación.

Perfectamente podéis \[&nbsp;\_\_&nbsp;\] y tomar la

00:05:38.639 \--\> 00:05:44.080

decisión que creáis. Eso sí, siempre lo

tenéis que decir en la memoria. La

00:05:42.560 \--\> 00:05:48.560

documentación que se aporta se dice,

\"Bueno, pues eh

00:05:49.000 \--\> 00:05:55.919

simular la cadena de fabricación.\"

Bueno, pues a la hora de simular la

00:05:52.600 \--\> 00:06:00.720

cadena de fabricación no se dice x cosa

y yo asumo que se va a hacer de esta

00:05:57.919 \--\> 00:06:05.400

manera. Lo cogí lo dices. Asumo que como

no se eh no se establece el

00:06:03.319 \--\> 00:06:11.400

requerimiento de que el operario A tenga

que ser de tal forma, pues yo asumo que

00:06:09.039 \--\> 00:06:15.400

el operario A es de tal forma. Perfecto,

no hay ningún problema, lo podéis hacer.

00:06:13.280 \--\> 00:06:20.360

Eso sí, si en el enunciado viene que el

operario A tiene que ser de la forma, lo

00:06:17.919 \--\> 00:06:23.919

tienes que hacer de la forma.

Si no te lo especifica el enunciado y tú

00:06:22.759 \--\> 00:06:27.479

tienes que todo y tienes que

implementarlo, tomas la decisión que tú

00:06:25.680 \--\> 00:06:30.840

creas. Yo luego os recomiendo que

siempre toméis la decisión más fácil,

00:06:29.400 \--\> 00:06:34.560

más sencilla. No vayáis a hacer cosas

más complicadas,

00:06:32.680 \--\> 00:06:39.440

pero tenéis total libertad para poder

hacer eso, ¿vale? Y que lo documentáis

00:06:37.479 \--\> 00:06:43.599

en la memoria, lo documentáis. Como el

enunciado nos dice qué pasa ante esta

00:06:41.280 \--\> 00:06:46.599

situación, yo he tomado esta decisión.

Perfecto.

00:06:52.599 \--\> 00:06:58.599

Vale. Dice, \"Para obtener la la nota

mínima para probar la práctica, hay que

00:06:57.199 \--\> 00:07:02.240

hacer los dos niveles.\" ¿Por qué? Porque

el primer nivel te da tres puntos y,

00:07:00.599 \--\> 00:07:05.599

evidentemente con tres puntos no llegas

al cinco que te piden, con lo cual

00:07:04.199 \--\> 00:07:09.280

tienes que hacer el segundo nivel. El

segundo nivel llegas hasta siete puntos.

00:07:07.639 \--\> 00:07:14.639

Si no tienes implementado el segundo

nivel al 100%, no pasa nada. Mientras

00:07:12.000 \--\> 00:07:20.039

que tengas implementados partes, todo el

primer nivel por completo y partes del

00:07:17.080 \--\> 00:07:23.599

segundo nivel, puedes llegar al cinco.

Puedes llegar al cinco.

00:07:24.039 \--\> 00:07:31.080

Vale. Y luego hay un tercer nivel que te

da, que es el que te permite llegar a

00:07:28.639 \--\> 00:07:35.919

los 10 puntos. De si a 10 puntos tienes

que hacer el tercer nivel. Vale,

00:07:34.560 \--\> 00:07:40.960

vamos a ver cada uno de estos niveles

qué es lo que te pide. En el nivel uno,

00:07:38.479 \--\> 00:07:46.879

la puntuación máxima que tener es un

siete, ¿vale? Perdón, tres, son tres

00:07:43.919 \--\> 00:07:50.800

puntos,

¿vale? ¿Y qué es lo que se pide aquí?

00:07:48.360 \--\> 00:07:55.599

Bueno, pues que aquí plantees las

relaciones de las clases que tú crees

00:07:52.479 \--\> 00:07:59.599

que necesitas, la herencia y todo lo que

tú crees que necesitas, solamente que lo

00:07:57.360 \--\> 00:08:02.840

plantees, no que lo implementes. ¿Vale?

Te dice que plantees el problema y

00:08:01.360 \--\> 00:08:06.960

digas, \"Bueno, ¿qué actores hay?\" que

oye, pues hay eh hay una parte que es de

00:08:05.400 \--\> 00:08:10.759

gestión de almacén, hay otra parte que

es de gestión de operarios, hay varios

00:08:08.560 \--\> 00:08:14.840

tipos de operarios, hay varios tipos de

cadenas de fabricación, todo eso que lo

00:08:12.520 \--\> 00:08:19.720

vayas a ir planteando, ¿vale? Eh, vaya

viendo qué actores más o menos de qué se

00:08:18.039 \--\> 00:08:25.560

encarga cada uno de estos actores,

¿vale? y eh establecer las diferentes

00:08:22.840 \--\> 00:08:29.360

clases. Es decir, básicamente hay es un

diagrama de clases, o sea, no lo dice

00:08:27.400 \--\> 00:08:33.320

ahí explícitamente, luego más adelante

lo dice, pero aquí en esta sección no lo

00:08:31.120 \--\> 00:08:38.719

dicen explícitamente, pero aunque no lo

diga explícitamente y se trata de que

00:08:35.680 \--\> 00:08:42.519

ahí pensemos eh la jerarquía de clases y

la estructura de clases que yo tengo que

00:08:40.399 \--\> 00:08:47.279

montar para gestionar todo el sistema

que las páginas previas me han

00:08:43.880 \--\> 00:08:52.440

explicado, ¿vale?

ver las relaciones que pueda haber, todo

00:08:49.080 \--\> 00:08:59.839

este tipo de cosas, ¿no? Y elaborar una

memoria donde vaya todo esto.

00:08:56.240 \--\> 00:09:04.320

A ver qué es lo que decís aquí.

En el nivel, en el nivel no pide que se

00:09:02.519 \--\> 00:09:07.839

den de alta a trabajadores, pero no se

asigna a nadie en concreto en el

00:09:05.839 \--\> 00:09:10.839

enunciado. ¿En qué nivel dices eso,

Manuel?

00:09:15.040 \--\> 00:09:22.040

El nivel dos. Vale, ahora cuando

lleguemos al nivel dos, si quieres lo

00:09:18.160 \--\> 00:09:25.600

vemos esa la duda esa. ¿Vale? Entonces,

eh

00:09:23.560 \--\> 00:09:28.760

en este en el nivel uno se trata de que

pensemos

00:09:27.120 \--\> 00:09:32.240

qué entidades hay, cómo voy a

transformar estos agentes que

00:09:30.160 \--\> 00:09:38.279

intervienen en todo el sistema, cómo los

voy a modelar con clases, qué eh

00:09:35.480 \--\> 00:09:42.560

jerarquía de clases voy a establecer,

qué voy a implementar eh como una

00:09:40.399 \--\> 00:09:46.120

interfaz o como una clase abstracta o

herencia o lo que sea. Todos estos

00:09:44.399 \--\> 00:09:50.360

elementos cuando tenga todo eso pensado,

hago una memoria donde explico esto y

00:09:48.800 \--\> 00:09:54.040

planteamos un diagrama de clase.

dibujamos un diagrama de clase. Muchas

00:09:52.240 \--\> 00:10:00.920

veces cogéis el diagrama de clase de

bruj y lo plantáis, ¿vale? Pues mal si

00:09:59.160 \--\> 00:10:04.120

aquí van a salir un montón de clases.

Entonces, mal porque el diagrama de

00:10:02.240 \--\> 00:10:08.680

clases de UJ empieza a pintarte cada vez

que haces un uso de una clase te la

00:10:06.079 \--\> 00:10:13.959

pinta una línea punteada. Entonces, te

empieza a pintar un montón de líneas, un

00:10:10.720 \--\> 00:10:17.920

montón de líneas y es ileible el

diagrama de textos. ¿Vale?

00:10:30.440 \--\> 00:10:36.880

Vale, está claro. El nivel uno. El nivel

uno tenemos que hacer el diagrama de

00:10:34.079 \--\> 00:10:40.320

clases y hacerlo. Eh, lo podéis hacer si

queréis a mano o podéis utilizar

00:10:38.600 \--\> 00:10:45.720

cualquier herramienta. Podéis utilizar,

por ejemplo, herramienta como el Draio

00:10:42.600 \--\> 00:10:48.720

de Google, que nos viene muy bien. A

ver,

00:11:17.760 \--\> 00:11:21.519

A ver, comparto la pantalla.

00:11:55.639 \--\> 00:11:58.639

Super

00:12:08.760 \--\> 00:12:15.399

Mento. La clase anterior. Yo no sé si es

porque estamos muchos conectados,

00:12:15.920 \--\> 00:12:20.240

pero la clase anterior no iba tan lenta.

00:12:26.600 \--\> 00:12:32.279

Vale, digo que el diagrama de clase lo

podéis pintar a mano si queréis en un

00:12:29.920 \--\> 00:12:36.040

papel, hacéis una foto o lo escaneáis y

lo ponéis, pero si queréis hacer algo

00:12:34.120 \--\> 00:12:40.680

más más fino, ¿vale? Por ejemplo, podéis

utilizar la herramienta esta de Google,

00:12:38.160 \--\> 00:12:49.079

el drayo

diagrams.net, como se llamaba, ¿vale?

00:12:43.519 \--\> 00:12:53.720

Pero radio como o diagrams.net

cualquiera de manera lo vais a

00:12:50.320 \--\> 00:12:53.720

encontrar, ¿vale?

00:12:57.240 \--\> 00:13:01.000

Y aquí tenéis el UML,

00:13:01.839 \--\> 00:13:11.079

aquí tenéis pues para dibujar eh pues

una clase, un objeto,

00:13:08.320 \--\> 00:13:17.839

una interfaz.

Hola. una clase. Entonces aquí podéis

00:13:14.440 \--\> 00:13:17.839

poner una clase

00:13:22.480 \--\> 00:13:29.160

y aquí se van haciendo los diagramas de

manera muy sencillita, ¿vale?

00:13:30.360 \--\> 00:13:36.000

Que sea, ¿no? Entonces podéis utilizar

si queréis esto y si no podéis utilizar

00:13:34.160 \--\> 00:13:41.839

Word. O también otra herramienta que

podéis utilizar es el vicio. El visio

00:13:38.360 \--\> 00:13:41.839

que creo recordar.

00:14:03.639 \--\> 00:14:07.320

A ver, la

00:14:17.639 \--\> 00:14:27.000

dentro del campus

si lo encuentro y ahora si lo encuentro

00:14:22.199 \--\> 00:14:27.000

lo enseño. Si no que

00:15:22.920 \--\> 00:15:25.920

¿Dónde

00:15:28.560 \--\> 00:15:31.560

está?

00:16:00.079 \--\> 00:16:04.480

Bueno, porque lo han cambiado, pero de

todas formas

00:16:33.000 \--\> 00:16:36.639

Vale, de todas formas

00:16:39.240 \--\> 00:16:46.279

a ver si me deja.

Voy a compartir la pantalla.

00:17:08.720 \--\> 00:17:12.679

A ver si se carga aquí la

00:17:13.679 \--\> 00:17:22.520

de todas formas, si entráis dentro,

¿vale? Si entráis dentro de la cuenta

00:17:19.880 \--\> 00:17:28.039

vuestra, por ejemplo, de Outlook, ¿vale?

Aquí cuando estéis en los loop, aquí en

00:17:26.280 \--\> 00:17:31.799

los puntitos

estos aparece las herramientas de

00:17:30.600 \--\> 00:17:35.600

Microsoft a la que tenéis acceso y aquí

os aparece Visio pues podéis utilizar

00:17:33.320 \--\> 00:17:40.480

también Visio que me permite dibujar

diagramas

00:17:38.600 \--\> 00:17:44.240

de flujo y todo este tipo de cosas,

¿vale? Diagramas de clase muy

00:17:41.720 \--\> 00:17:48.320

fácilmente, como veis aquí, ¿vale?

Entonces, podéis utilizar eh este

00:17:46.559 \--\> 00:17:54.480

también para dibujar el diagrama de

clases.

00:17:50.799 \--\> 00:17:54.480

Perdón que no lo he compartido.

00:18:17.280 \--\> 00:18:25.720

Vale, estaba diciendo para los que

estáis en casas que cuando os metáis

00:18:21.320 \--\> 00:18:29.960

dentro del outlook de la UNER, aquí os

aparecerá visio, si no buscáis más,

00:18:27.919 \--\> 00:18:34.960

¿vale? Pero os aparecerá visio. Cuando

le dais a visio,

00:18:33.159 \--\> 00:18:43.240

entonces os aparece la herramienta

visio, que es para eh escribir

00:18:38.400 \--\> 00:18:47.440

diagramas y cosas de este tipo, ¿vale?

Tipos,

00:18:45.880 \--\> 00:18:51.400

¿vale? Esto para hacer los diagramas de

clase

00:18:49.679 \--\> 00:18:54.679

y si no queréis complicar la vida, pues

lo hacéis a mano, que se entiendan las

00:18:53.000 \--\> 00:18:59.919

letras y eso, los nombres de las clases

y todo eso y ya está. Vale.

00:18:58.559 \--\> 00:19:03.799

Vale. Creo que había aquí preguntas,

¿no? Si

00:19:04.799 \--\> 00:19:08.960

a ver si si oyeron.

00:19:14.679 \--\> 00:19:18.559

Madre mía, esto lentísimo.

00:19:34.320 \--\> 00:19:41.080

Se puede hacer el UMN en varias páginas

y relacionarnos.

00:19:38.520 \--\> 00:19:45.520

Sí, lo que podéis hacer es hacer

paquetes, es decir, varias clases que

00:19:43.799 \--\> 00:19:51.640

tengan una cierta relación un paquete y

hay un diagrama UML general. dentro del

00:19:48.280 \--\> 00:19:58.200

diagrama UML, yo no os he enseñado a no

solamente os comenté al principio eh

00:19:54.760 \--\> 00:20:03.600

únicamente diagramas, herencia y

agregación y cosas de ese tipo, pero en

00:20:01.320 \--\> 00:20:07.120

UML puedes representar un paquete que es

una forma cuadradita así con un piquito.

00:20:05.760 \--\> 00:20:10.280

ese paquete le pones un nombre y ese

paquete está relacionado con otro

00:20:08.440 \--\> 00:20:15.360

paquete o con otro paquete lo puedes

hacer en un diagrama principal que ese

00:20:12.240 \--\> 00:20:18.600

diagrama principal habrá las clases y eh

otras clases que están agrupadas en un

00:20:16.919 \--\> 00:20:23.320

paquete y habrá clases y paquetes,

¿vale? Y luego en otras páginas tendrás

00:20:21.679 \--\> 00:20:29.320

pues el paquete uno y pondrás el

diagrama de clases del paquete,

00:20:26.720 \--\> 00:20:32.760

entonces si lo puedes hacer, ¿vale? Si

nos cabe todo en un solo diagrama, pues

00:20:31.240 \--\> 00:20:36.320

lo hacemos. Que se queda tan chiquitito,

tan chiquitito todo y hay tantas líneas

00:20:34.440 \--\> 00:20:42.480

y tal que no se entiende nada. Pues

hacéis como como está diciendo vuestro

00:20:39.120 \--\> 00:20:46.280

compañero, ¿vale? Manuel, ¿vale?

Efectivamente,

00:20:44.240 \--\> 00:20:51.320

se puede hacer perfectamente. Y luego

dice Milagros, el diagrama de la memoria

00:20:48.320 \--\> 00:20:55.200

sería de la implementación de cada uno o

con el nivel que se haga o del total de

00:20:53.480 \--\> 00:21:00.520

lo que dice el enunciado para los tres

niveles. Es del total de lo que dice el

00:20:57.120 \--\> 00:21:06.960

enunciado para todos los niveles.

Es decir, el enunciado de la práctica lo

00:21:03.600 \--\> 00:21:06.960

que te dice,

00:21:07.159 \--\> 00:21:10.880

ah, ¿dónde está?

00:21:23.000 \--\> 00:21:29.600

El enunciado de la práctica, ¿vale? es

esto. Estas páginas previas es lo que te

00:21:28.120 \--\> 00:21:37.679

dice el enunciado. Entonces, el nivel

uno lo que te dice es que modeles, que

00:21:32.480 \--\> 00:21:37.679

modeles ese enunciado anterior. ¿Vale?

00:21:38.880 \--\> 00:21:48.080

Bueno, aquí hay un poco que está más

memoria que contenga el primer punto y

00:21:46.559 \--\> 00:21:52.919

los correspondientes ficheros para BlueJ

que implementan el segundo.

00:21:51.039 \--\> 00:21:56.840

Evidentemente está mal porque los

ficheros de BlueJ no pueden estar

00:21:54.880 \--\> 00:22:00.640

contenidos dentro de una memoria. Un

fichero es un fichero, ¿vale? Otra cosa

00:21:58.720 \--\> 00:22:05.760

es el código fuente o lo que sea, pero

no le hagáis caso.

00:22:03.320 \--\> 00:22:08.320

Es una falta de de expresión ahí, ¿vale?

Entonces, esto es elaboración de un

00:22:07.120 \--\> 00:22:12.559

documento escrito, que es la memoria,

que contiene eh este primer punto, es

00:22:10.279 \--\> 00:22:16.279

decir, el planteamiento del problema y

los diferentes clases y todo esto que

00:22:14.320 \--\> 00:22:20.200

intervienen en la práctica por completo

en todas ellas. ¿Vale?

00:22:31.400 \--\> 00:22:38.120

Vale, ahí tenéis el comentario de Manuel

que os propone ahí el lentino este que

00:22:35.880 \--\> 00:22:42.520

yo no lo conozco

y el viso está dentro del team. Vale,

00:22:40.000 \--\> 00:22:46.840

perfecto. Pues sí, sí, sí, es verdad.

Había caído en eso. El Viso también

00:22:44.000 \--\> 00:22:49.880

tenéis acceso al vo también, por lo

menos antes, por eso estaba buscando la

00:22:48.360 \--\> 00:22:54.600

página web. Os podéis descargar,

instalar programas de Microsoft que

00:22:52.279 \--\> 00:23:00.520

tiene concertado la UNET.

Entre ellos estaba el visio,

00:22:57.279 \--\> 00:23:04.600

el Word, todos estos.

Entonces hay

00:23:02.360 \--\> 00:23:08.960

un sitio dentro de que no lo he

encontrado, lo buscáis vosotros si

00:23:06.080 \--\> 00:23:13.880

queréis,

¿vale? dentro de del campus UNET donde

00:23:11.640 \--\> 00:23:16.880

os proporcionan licencias y software.

Vale,

00:23:18.520 \--\> 00:23:21.520

vale.

00:23:21.640 \--\> 00:23:29.320

Nivel uno, el diagrama de clases y la

memoria, tres puntos. Nivel dos, hasta

00:23:26.880 \--\> 00:23:33.799

siete puntos. Puedo llegar si tengo el

nivel uno hecho y paso a hacer cosas de

00:23:31.600 \--\> 00:23:37.760

nivel dos.

En el nivel dos lo que nos piden es que

00:23:35.120 \--\> 00:23:42.120

hagamos implementación, ¿vale? Entonces,

eh hay que desarrollar partes de cosas

00:23:40.360 \--\> 00:23:47.679

del sistema. ¿Qué partes de cosas del

sistema normal? Bueno, ya sabéis que la

00:23:44.880 \--\> 00:23:50.279

calificación en este nivel

solo se puede obter si se ha

00:23:48.840 \--\> 00:23:54.159

implementado de manera satisfactoria

todos los puntos de nivel uno. Es decir,

00:23:53.039 \--\> 00:23:57.640

antes de llegar a un nivel tienes que

terminar el nivel anterior que has

00:23:55.400 \--\> 00:24:00.840

comentado.

¿Vale? ¿Qué es lo que nos piden? Que

00:23:58.799 \--\> 00:24:04.000

implementemos aquí ya que implementemos,

no que diseñemos

00:24:02.799 \--\> 00:24:08.440

eh ni nada de eso, sino que

implementemos. tenemos que implementar

00:24:05.520 \--\> 00:24:12.320

la gestión del almacén.

¿Y qué cosas tiene que permitir esta

00:24:09.840 \--\> 00:24:19.039

gestión del almacén? pues poder añadir y

actualizar vehículos eh y componentes

00:24:16.799 \--\> 00:24:22.640

asociados, motores, tapería, ruedas,

etcétera. Lo que venga ahí en la

00:24:20.520 \--\> 00:24:28.000

descripción del sistema, tenemos que

implementarlo, es decir, hacer un gestor

00:24:24.600 \--\> 00:24:32.200

de almacenami del almacén,

hacer también un gestor de trabajadores,

00:24:30.559 \--\> 00:24:37.399

pues dar de alta un trabajador con los

diferentes tipos de empleo Skype y con

00:24:34.360 \--\> 00:24:41.480

sus trabajador Skype y con sus datos.

Implementar, ¿vale? El planificador

00:24:39.919 \--\> 00:24:45.799

simple. que ahora lo veremos, que es

simular

00:24:43.000 \--\> 00:24:49.520

eh la cadena de fabricación

eh y luego que nos permita realizar

00:24:47.600 \--\> 00:24:53.480

búsquedas sencillas, por ejemplo, buscar

un empleado, ¿vale? No buscar el

00:24:51.919 \--\> 00:24:59.120

empleado pues a ver, búscame todos los

empleados que empiecen con la letra

00:24:55.080 \--\> 00:25:02.399

mayúscula, búsquedas complejas, no,

sino solamente decir, pues a lo mejor el

00:25:00.760 \--\> 00:25:05.720

nombre del empleado, el DN del empleado

y ya está. ¿Vale? ¿Veis? Por ejemplo,

00:25:04.000 \--\> 00:25:08.520

aquí dice, \"Realizar búsquedas sencillas

sobre los empleados del sistema.\" te

00:25:07.159 \--\> 00:25:11.880

dice cómo tienes que hacer esa búsqueda,

si es por el nombre, por el apellido,

00:25:09.679 \--\> 00:25:17.159

por la fecha de nacimiento, por el DNI,

¿no? Bueno, pues tú cógelo, eh, y tomas

00:25:15.240 \--\> 00:25:20.320

la decisión de diseño y dices, como se

pide que se haga una búsqueda sencilla y

00:25:18.679 \--\> 00:25:24.360

no se dice por qué criterio se tiene que

hacer esa búsqueda sencilla, adopto o

00:25:22.600 \--\> 00:25:27.799

toma la decisión de diseño de hacer una

búsqueda sencilla por el nombre y

00:25:26.000 \--\> 00:25:33.320

apellido. Hacer una búsqueda sencilla

por el DNI, por el teléfono. Los más

00:25:30.000 \--\> 00:25:37.200

fácil es por DNI o por teléfono, ¿no?

Pues ya está. Pues ese tipo de cosas lo

00:25:34.880 \--\> 00:25:41.080

que me refería antes, ¿vale? Y luego

realizar también consulta y

00:25:38.600 \--\> 00:25:47.360

actualizaciones del eh, o sea,

visualizar el stock de vehículos del

00:25:43.679 \--\> 00:25:51.399

sistema. V, visualizar, pues también

consulta, hay tantos coches eléctricos,

00:25:49.799 \--\> 00:25:55.039

tantos coches de no sé qué tipo y tantos

coches de no sé cuánto.

00:25:55.120 \--\> 00:26:02.440

Ese es el nivel dos. Y luego ya

para pasar al nivel tres tienes que

00:26:00.200 \--\> 00:26:06.640

haber hecho todos los puntos del nivel

uno, el diagrama, la memoria y todo

00:26:04.720 \--\> 00:26:10.559

esto. Tienes que haber hecho todos los

puntos de nivel dos, es decir, haber

00:26:08.080 \--\> 00:26:15.480

implementado todas las clases y todos

los procedimientos para poder satisfacer

00:26:12.880 \--\> 00:26:20.399

estas estos requerimientos y entonces ya

puedes pasar a nivel tres. Y en el nivel

00:26:17.000 \--\> 00:26:25.320

tres te piden

eh que además hagas una implementación

00:26:23.000 \--\> 00:26:30.080

completa del planificador,

¿vale? de la simulación de la academia

00:26:27.120 \--\> 00:26:34.000

de montaje,

hagas también una implementación

00:26:31.880 \--\> 00:26:37.520

completa del almacén, de tal forma que

puedas almacenar todas las cosas que

00:26:36.000 \--\> 00:26:43.000

aparecen en el sistema se puedan

almacenar, ¿vale?

00:26:39.679 \--\> 00:26:46.799

Eh, dice, \"Además, su diseño debe estar

desacoplado del sistema de gestión para

00:26:45.360 \--\> 00:26:50.240

facilitar el cambio de estructura de

datos sin requerir modificaciones

00:26:48.240 \--\> 00:26:53.799

enormes en el diseño original.\" Es

decir, lo que se está diciendo es que

00:26:51.840 \--\> 00:26:57.600

ahora que vas a añadir más cosas al

sistema de gestión de almacenamiento,

00:26:55.320 \--\> 00:27:00.600

pues no solamente aquí lo que nos decían

era

00:27:01.240 \--\> 00:27:09.320

eran vehículos, ¿no? Eh, dice añadir y

actualizar datos de vehículos

00:27:07.640 \--\> 00:27:13.080

y los componentes asociados, motores,

tapiferías y ruedas. Bueno, pues a lo

00:27:11.279 \--\> 00:27:16.919

mejor hay más cosas relacionadas en el

en la gestión del almacén, donde cuando

00:27:14.559 \--\> 00:27:20.600

tú le has el enunciado las tres páginas

anteriores donde te dice el sistema cómo

00:27:18.679 \--\> 00:27:24.200

es, pues a lo mejor ves que también en

el en la gestión del almacén, no

00:27:22.399 \--\> 00:27:32.279

solamente las piezas, sino que también

se almacena, pues yo que sé, eh,

00:27:29.440 \--\> 00:27:36.240

pero qué deciros, eh, e información

sobre la venta de los coches, ¿no?, o de

00:27:34.320 \--\> 00:27:40.039

distribución de los coches. Vale, pues

también hay por ahí un punto que te dice

00:27:38.080 \--\> 00:27:44.240

sobre eso, ¿vale? Pues en el punto tres

lo que te dice es que complementes y

00:27:42.039 \--\> 00:27:48.120

termines esa gestión de almacén con

todas las cosas que tú veas que hay que

00:27:45.679 \--\> 00:27:51.360

gestionar el

del enunciado,

00:27:51.960 \--\> 00:27:58.880

¿vale? Y lo que te pide es que separes,

es decir, que si tienes una clase que

00:27:56.640 \--\> 00:28:02.559

has implementado en la gestión anterior

y ahora te ves que tienes que añadir una

00:28:00.320 \--\> 00:28:05.760

gestión para distribución de vehículos,

por ejemplo, pues hombre, que lo hagas

00:28:04.200 \--\> 00:28:09.000

en clases diferentes, en paquetes

agrupados, etcétera, para que no haya

00:28:07.279 \--\> 00:28:15.000

fuerte acoplamiento. Es lo que te está

diciendo.

00:28:11.679 \--\> 00:28:19.039

Luego implementar ese ese cuadro de

bandos, el dashboard, ¿vale? incluyendo

00:28:17.559 \--\> 00:28:22.960

una opción que te permita gestionar

vehículos, que te permita gestionar el

00:28:21.600 \--\> 00:28:27.159

la cadena de montaje y te permita

gestionar el almacén. Vale.

00:28:32.039 \--\> 00:28:35.880

Bueno, aquí implementación completa del

planificador y las cadenas de montaje,

00:28:34.799 \--\> 00:28:38.760

implementar todas las funciones

relacionadas con el planificador,

00:28:37.200 \--\> 00:28:42.840

opciones simple, compleja o compleja.

Esto es lo mismo que esto. Yo entiendo

00:28:41.159 \--\> 00:28:46.159

que aquí

es

00:28:44.399 \--\> 00:28:50.320

implementación completa del planificador

y aquí

00:28:48.240 \--\> 00:28:54.039

es el planificador tiene tres

funcionamientos, simple, complejo, muy

00:28:51.919 \--\> 00:28:59.279

complejo, y te pide, o sea, que esa

línea y esta línea es la misma.

00:28:57.559 \--\> 00:29:04.440

Y luego te dice que le incorpores. Aquí

ya nos decían algunos listados, ¿no?

00:29:01.600 \--\> 00:29:07.519

Aquí había búsquedas, ¿vale? Búsquedas.

Bueno, pues aquí lo que nos dicen es que

00:29:05.760 \--\> 00:29:13.679

hagamos algunos listados, ¿vale? y nos

pide listado de los de los operarios.

00:29:11.880 \--\> 00:29:18.600

De tal forma que oye, listame todos los

operarios, pero los operarios que tengan

00:29:16.000 \--\> 00:29:23.279

la productividad B no por el contrario,

los que tengan la productividad C son

00:29:21.559 \--\> 00:29:28.840

los que quieran listar. Entonces, que se

hagan listados con con filtros, listado

00:29:26.880 \--\> 00:29:32.480

de operarios y opciones de ordenación

alfabética

00:29:30.840 \--\> 00:29:37.640

que me lo muestre, que pueda yo decir,

quiero ordenarlos de menor a mayor o de

00:29:35.519 \--\> 00:29:41.640

mayor a menor en orden alfabético.

Listado de vehículos ensamblados con

00:29:39.880 \--\> 00:29:46.200

filtrados también de componentes. Pues

quiero los que tienen el componente del

00:29:43.640 \--\> 00:29:51.159

motor, no sé qué tipo. Listado de

configuración de vehículos.

00:29:49.480 \--\> 00:29:57.679

Habría que ver esto de las

configuraciones, ¿vale? Eh, si es a

00:29:54.840 \--\> 00:30:01.640

motores o a qué se refiere en el y luego

listado de cadenas de montaje con

00:29:59.399 \--\> 00:30:06.519

filtrado de fechas, ¿vale? Entonces, se

trata de hacer buscados, mostrar

00:30:03.679 \--\> 00:30:12.320

listados y que esos esa búsqueda no sea

solamente lista menos operarios como

00:30:08.760 \--\> 00:30:15.640

teníamos en el en el nivel dos, sino que

ahora es listame los operarios, pero que

00:30:14.039 \--\> 00:30:20.519

tengan esta condición, que por ejemplo

sean operarios de tipo A o lo que sea.

00:30:18.159 \--\> 00:30:23.519

Entonces, como veis también aquí, por

ejemplo,

00:30:24.840 \--\> 00:30:30.480

¿vale? Si tenéis que tomar alguna

decisión de diseño que no esté claro,

00:30:27.960 \--\> 00:30:36.159

pues aquí la tomáis.

Vale, me he pasado al nivel dos, que

00:30:32.200 \--\> 00:30:39.440

antes me habéis hecho aquí la pregunta

y decía,

00:30:40.440 \--\> 00:30:46.000

¿dónde estás? Aquí, valuel, no decía.

00:30:47.000 \--\> 00:30:52.159

A ver, que es que va tan lento esto que

cuando muevo el ratón,

00:30:53.720 \--\> 00:31:00.279

¿vale? A ver, Manuel decía en el nivel,

pide, nivel dos dice, no pide que se den

00:30:57.799 \--\> 00:31:04.399

de alta trabajadores, pero no se asigna

a nadie en concreto en el enunciado

00:31:08.240 \--\> 00:31:14.760

que se de alta un trabajador, ¿a qué te

refieres de que no se asigne

00:31:12.600 \--\> 00:31:18.840

a nadie en concreto? Es decir, cuando se

da un alta un trabajador, ahora vemos lo

00:31:17.039 \--\> 00:31:21.960

iniciado, ¿vale? Pero hay varios tipos

de trabajadores. Cuando se den un alta a

00:31:20.360 \--\> 00:31:26.320

un trabajador, pues pues se da de alta

en el sistema y ya está. No sé a qué te

00:31:24.320 \--\> 00:31:34.320

refieres.

Manuel, si lo comentas lo vemos. A ver,

00:31:30.399 \--\> 00:31:40.039

aquí había alguna duda más.

Vale, esa de milagros ya ya la hemos

00:31:37.200 \--\> 00:31:43.120

visto.

Milagros, si se hacen los niveles uno y

00:31:41.519 \--\> 00:31:46.600

dos y se quieren incluir algunos

detalles del nivel tres, supongo que no

00:31:44.720 \--\> 00:31:50.760

es necesario respetar el orden en que se

numeran enunciado los puntos de nivel

00:31:48.679 \--\> 00:31:54.480

tres. No se podría \[&nbsp;\_\_&nbsp;\] Sí,

efectivamente dentro del nivel tres,

00:31:52.880 \--\> 00:32:00.039

como ya es el último y es el máximo,

pues puedes si no te da la vida para

00:31:58.559 \--\> 00:32:03.519

hacer todos los puntos que te piden,

puedes hacer dos puntos o tres puntos y

00:32:02.360 \--\> 00:32:07.960

en lugar de llegar a un 10, pues a lo

mejor llegas a un ocho llegas a un

00:32:04.679 \--\> 00:32:12.679

nueve. Vale,

dice que no lo tiene asignado ni el

00:32:10.039 \--\> 00:32:16.039

gestor

ni el administrador.

00:32:16.639 \--\> 00:32:22.559

Bueno, pues si no te lo da ninguno, pues

tú decides a lo mejor el administrador

00:32:20.840 \--\> 00:32:28.600

que sea el que da de alta o el gestor.

Tomas tú la decisión que quieras de dar

00:32:24.880 \--\> 00:32:28.600

de alta a operar.

00:32:29.279 \--\> 00:32:37.399

Y luego dice, \"¿Se puede hacer como si

hiciera desde fuera una opción del

00:32:34.399 \--\> 00:32:37.399

programa?

00:32:41.120 \--\> 00:32:45.960

Desde fuera como una opción del

programma,

00:32:44.399 \--\> 00:32:51.240

como una opción del menú.\" dices, a lo

mejor, perdón, aquí

00:32:48.960 \--\> 00:32:56.519

en el menú, o sea, aquí, perdón, en el

nivel tres, el las funcionalidades

00:32:53.960 \--\> 00:33:00.399

anteriores no se piden en una, ¿vale? Y

ahora en el nivel tres dice,

00:32:58.799 \--\> 00:33:04.960

\"Desarrollar un interfaz textual del

sistema que ofrezca el menú, es decir,

00:33:02.200 \--\> 00:33:08.960

que diga, a ver, la opción uno, pues dar

de alta a trabajadores, opción dos,

00:33:07.240 \--\> 00:33:13.240

gestionar el almacén y dentro de

gestionar el almacén, pues darle alta a

00:33:10.600 \--\> 00:33:17.200

un vehículo o ver el listado de los

vehículos que hay o cosas de, ¿no?

00:33:16.000 \--\> 00:33:21.039

Entonces, hay que hacer un menú con

varios submenús en la interfaz. Me

00:33:19.600 \--\> 00:33:25.600

imagino que te estás refiriendo a eso,

¿no? Que si se puede poner una opción

00:33:22.440 \--\> 00:33:25.600

del menú.

00:33:43.919 \--\> 00:33:51.039

Vale. Y luego habrá no veo que el

enunciado comente nada de la interfaz

00:33:49.080 \--\> 00:33:54.840

gráfica. Entiendo que entonces todos los

menús serán por consola. parecida a la

00:33:53.159 \--\> 00:33:59.399

práctica de fundamentos sin usar clase

switch. Efectivamente,

00:33:57.440 \--\> 00:34:04.080

fijaros que en la asignatura no hay

interfaces de usuario gráfica temario no

00:34:01.559 \--\> 00:34:09.520

hay. Ya lo quitaron. Al principio había,

pero luego ya lo quitaron. No sé si está

00:34:05.799 \--\> 00:34:15.000

puesto como complemento. A ver,

eh,

00:34:11.480 \--\> 00:34:15.000

¿dónde está esto?

00:34:15.079 \--\> 00:34:20.040

Cierre esto. Cierre esto.

00:34:32.560 \--\> 00:34:35.679

A ver.

00:35:08.200 \--\> 00:35:11.920

Eh, no

00:35:14.359 \--\> 00:35:22.680

contenidos, agrupación concetos,

resolverencia, técnica de extracción y

00:35:19.839 \--\> 00:35:28.640

tratamiento de como vena e interfaces

del usuario gráficas

00:35:25.720 \--\> 00:35:31.920

en el en el contenido en la en los

contenidos de asignatura, con lo cual no

00:35:30.359 \--\> 00:35:36.960

se pide que se desarrolle una interfaz

de usuario gráfica una interfaz de

00:35:33.760 \--\> 00:35:41.680

usuario texto mediante consola. es

suficiente. Es más que suficiente.

00:35:45.520 \--\> 00:35:51.520

Dice Mirinagro, \"Las expresiones Lambda

y los bucles for each se explican en el

00:35:49.800 \--\> 00:35:55.560

libro en el tema cinco que no se

incluyen en contenido de asignatura. Se

00:35:53.520 \--\> 00:36:01.480

pueden usar igualmente en la prácticas,

¿vale? Los brokers for each son mucho

00:35:57.880 \--\> 00:36:04.480

más comunes, ¿vale?

Eh,

00:36:08.640 \--\> 00:36:18.160

pero sí se incluyen los sí se incluye en

el en el contenido de la señal.

00:36:14.440 \--\> 00:36:18.160

No recuerdo en qué tema.

00:36:19.240 \--\> 00:36:26.680

Supongo que será a ver

el cual

00:36:25.119 \--\> 00:36:30.560

agrupación de objetos. Efectivamente, de

ahí probablemente aparezcan.

00:36:32.359 \--\> 00:36:35.359

Vale.

00:36:36.200 \--\> 00:36:45.040

Eh, pero los lobo, los lamda no

se contemplan, no vienen en el libro ni

00:36:43.240 \--\> 00:36:51.119

en el contenido de asignatura y nada,

con lo cual landas no uses.

00:36:47.960 \--\> 00:36:51.119

Esa forch

00:36:53.040 \--\> 00:36:58.760

de nada.

Vale, vamos a ver entonces si no hay más

00:36:56.200 \--\> 00:37:01.880

preguntas.

Vamos a seguir con con el enunciado. Yo

00:37:01.240 \--\> 00:37:05.760

tengo una pregunta.

Sí, dime. Adelante.

00:37:03.440 \--\> 00:37:10.760

Eh, si inicias el programa de cero, no

tienes nada cuando tienes vehículo,

00:37:07.720 \--\> 00:37:14.319

tienes tienes tienes que cargarlos todos

para que empiece a funcionar todo o

00:37:12.520 \--\> 00:37:18.440

puedes recargar de alguna manera.

Podéis hacer eso. Lo ideal sería que se

00:37:16.079 \--\> 00:37:23.000

precargue, como bien has dicho, ¿vale?

Es decir, si queréis dentro, si llegáis

00:37:20.119 \--\> 00:37:26.800

a hacer el nivel el nivel tres donde hay

un menú, pues lo ideal sería que pongáis

00:37:25.000 \--\> 00:37:30.880

una opción que sea cargar datos

iniciales, ¿vale? Y ahí pues que meta

00:37:28.720 \--\> 00:37:34.839

dos o tres coches, dos o tres usuarios,

dos o tres operarios, etcétera. ¿Vale?

00:37:33.599 \--\> 00:37:40.520

Para no tener que estar cada vez que se

pruebe ten que estar ahí

00:37:37.440 \--\> 00:37:44.680

eh haciendo metiendo datos. Sí, sí, eso

es muy buena pregunta. Efectivamente.

00:37:46.839 \--\> 00:37:50.480

Vale. Eh,

00:37:56.640 \--\> 00:38:01.599

bueno, aquí viene un poco el plan de

trabajo.

00:38:03.119 \--\> 00:38:11.520

Ojo con el tema del plagio de las

prácticas. os leéis eso, ¿vale?

00:38:08.160 \--\> 00:38:14.760

Yo no voy a estar aquí ya inventándolo,

¿vale? Eh, y aquí en las normas de

00:38:13.400 \--\> 00:38:18.280

realizción de la práctica, la práctica

es obligatorio, solo se evaluó el examen

00:38:16.880 \--\> 00:38:23.720

si la práctica ha sido previamente

aprobada. Vale.

00:38:21.720 \--\> 00:38:27.760

Vale. Hay que utilizar el entorno de

desarrollo bluej. Esta práctica ha de

00:38:25.760 \--\> 00:38:30.920

desarrollarse íntegramente empleando el

entorno de desarrollo bluej y eso es

00:38:29.480 \--\> 00:38:34.359

así.

que no queréis hacerlo con brujota, pues

00:38:32.680 \--\> 00:38:38.440

no lo hagáis, pero luego cuando vayáis a

entregar el proyecto, cuando vayáis a

00:38:36.200 \--\> 00:38:44.160

entregar en la práctica, cogéis y el

proyecto con que habéis hecho lo

00:38:39.760 \--\> 00:38:49.480

exportáis y lo importáis a BlueJ,

que al final la importación de BlueJ es

00:38:47.359 \--\> 00:38:54.000

malísima, ¿vale? Y probablemente lo que

tengas que hacer es acabar cogiendo ahí

00:38:51.400 \--\> 00:38:58.319

las clases, ¿vale? Y pegándolas en la

carpeta del proyecto de BlueJ para que

00:38:56.400 \--\> 00:39:01.599

las veas, porque si no puede ser que no

la entienda.

00:39:00.000 \--\> 00:39:03.880

Pero si no queréis utilizar Bluj, podéis

utilizar otro entorno de desarrollo,

00:39:02.720 \--\> 00:39:08.680

pero tenéis que entregar el proyecto de

Blujot, ¿vale? Entrar el proyecto de

00:39:05.680 \--\> 00:39:08.680

Blu.

00:39:10.880 \--\> 00:39:17.440

Las prácticas son individuales, ¿vale?

Ojo con lo de copiadores y copiados

00:39:15.480 \--\> 00:39:24.040

porque todos van para adelante, ¿vale?

Todos se los proban.

00:39:20.599 \--\> 00:39:28.920

¿Vale? Eh, yo organizo las sesiones de

control presencial en tutor y y o

00:39:26.440 \--\> 00:39:32.640

virtuales. Al menos una de hechas al

menos una de dichas sesiones de control

00:39:31.240 \--\> 00:39:38.119

debe ser obligatoria. Entonces, en

nuestro caso, esto es una sesión, ¿vale?

00:39:35.200 \--\> 00:39:44.079

Y la segunda sesión es el último día de

clase, es decir, el 20 el 20is.

00:39:45.520 \--\> 00:39:48.680

A ver.

00:39:59.240 \--\> 00:40:07.760

Vale, entonces el último día, el día 20

de mayo, es el día de entrega de la

00:40:04.079 \--\> 00:40:12.319

práctica, día final.

Aunque Nágora aparezca hasta el día 1 o

00:40:10.240 \--\> 00:40:16.280

el día 28 o el día 25, no sé qué día lo

tienen puesto, esa fecha que está puesto

00:40:14.680 \--\> 00:40:19.839

es para que los tutores podamos meter la

nota, pero no es para que vosotros

00:40:17.839 \--\> 00:40:23.200

entreguéis la práctica.

Cada tutor fija el horario de la

00:40:21.560 \--\> 00:40:27.400

práctica, la entrega de la práctica.

Entonces, la nuestra es el 20 de mayo.

00:40:25.760 \--\> 00:40:34.000

Esa es la fecha máxima para entregar la

práctica.

00:40:30.280 \--\> 00:40:34.000

Anotarlo, por favor.

00:40:37.520 \--\> 00:40:40.520

Eh,

00:40:44.280 \--\> 00:40:51.240

bueno, eh, organizar la sesión al final

del cuatrimestre para comprobar, ¿vale?

00:40:48.640 \--\> 00:40:55.000

¿Qué es lo que hago en esa sesión?

Ahora os voy a poner un formulario,

00:40:52.839 \--\> 00:40:58.680

¿vale? Voy a activar el formulario para

que podáis inscribiros en ese formulario

00:40:56.960 \--\> 00:41:02.839

y os podéis os vais a poder escribir

hasta el día 6 de mayo, me parece que el

00:41:00.359 \--\> 00:41:06.440

5 de mayo vais a tener de plan. De tal

forma que hasta el 5 de mayo la gente

00:41:04.839 \--\> 00:41:11.240

que está apuntada en ese formulario, yo

luego cojo ese formulario y hago un

00:41:08.040 \--\> 00:41:15.000

listado y digo, \"A tal hora, en hora de

tutoría, a tal hora fulanito, fulanito,

00:41:13.480 \--\> 00:41:19.119

fulanito, a tal hora venganito,

menganito, venganito.\" ¿Vale? Entonces

00:41:17.200 \--\> 00:41:24.440

cada uno vais a tener una franja de

hora. En esa franja de hora venís y ahí

00:41:21.760 \--\> 00:41:30.760

es donde hacemos esa sesión de control

del final del cuatrimestre que dice ahí.

00:41:28.240 \--\> 00:41:33.480

Venís y os podéis traer vuestro portátil

perfectamente. Vale,

00:41:33.079 \--\> 00:41:36.200

el

eso será antes del

00:41:34.359 \--\> 00:41:39.640

Eso será el día 20, es decir, os tenéis

que apuntar antes del día 20, que será

00:41:38.160 \--\> 00:41:44.440

el día 5 como máximo para que os

apuntéis y luego el día 20 os venís con

00:41:42.720 \--\> 00:41:48.280

el ordenador, ¿vale? con vuestro

ordenador o podemos utilizar este

00:41:45.800 \--\> 00:41:52.480

ordenador de aquí queráis y con la

memoria y todo terminado porque ese día

00:41:50.400 \--\> 00:41:56.480

se entrega la práctica aquí, ¿vale? Y

entonces vienes, no tenéis que traer

00:41:54.280 \--\> 00:42:01.000

físicamente ni la memoria en papel ni en

CD ni nada de eso, ¿no? Porque se va a

00:41:57.960 \--\> 00:42:04.720

entregar todo por ahora,

pero venís aquí físicamente, os

00:42:02.920 \--\> 00:42:11.359

presentáis físicamente con vuestro

portátil o con un penrive o con la nube

00:42:07.480 \--\> 00:42:15.480

o como sea, lo descargáis y vemos. Os

reviso la práctica, reviso cómo está

00:42:13.480 \--\> 00:42:20.559

hecha, reviso la memoria y reviso

también la ejecución del programa y todo

00:42:17.200 \--\> 00:42:24.720

esto. Si hay fallos

que son muy gordos, digo, mira, la

00:42:22.760 \--\> 00:42:28.760

práctica está suspensa por esto, por

esto y por esto. Y te voy a dar unos

00:42:26.760 \--\> 00:42:33.119

días

que te voy a decir los días que son.

00:42:37.240 \--\> 00:42:46.400

El tutor eh podrá fijar como fecha de

entr una fecha posterior al último

00:42:41.640 \--\> 00:42:46.400

domingo antes de venir a no

00:42:52.160 \--\> 00:42:58.800

fijar como fecha de entrega una fecha

posterior al último domingo antes de

00:42:55.160 \--\> 00:42:58.800

inicio la primera semana

00:43:00.079 \--\> 00:43:06.640

y cuánto me piden a mí el día

A ver,

00:43:07.520 \--\> 00:43:10.800

ahora la convocate.

00:43:16.960 \--\> 00:43:24.160

Vale, no me dicen, pero bueno, será

probablemente sobre el día uno. Vale,

00:43:20.400 \--\> 00:43:27.880

pues entonces probablemente el

el día 20 de mayo, que es miércoles,

00:43:26.280 \--\> 00:43:32.160

¿vale? Pues tendréis jueves, viernes,

sábado y domingo esos cuatro días para

00:43:29.720 \--\> 00:43:37.839

poder rectificar la práctica.

y el lunes entregarla. Definitivamente

00:43:35.119 \--\> 00:43:41.559

las entregas se hacen por agua, ¿vale?

No hay que venir luego el lunes aquí ni

00:43:39.280 \--\> 00:43:45.319

nada de eso. Tendréis esos cuatro días,

pero solo para las prácticas que estén

00:43:43.160 \--\> 00:43:48.920

suspensas. las que no están suspensas.

Te digo, \"Perfecto, súbela que ya la

00:43:47.200 \--\> 00:43:53.680

terminaré de corregir y ya te pondré la

nota.\" Luego, cuando veas la nota,

00:43:51.160 \--\> 00:43:56.680

puedes reclamar revisión si quieres,

lógicamente.

00:43:58.359 \--\> 00:44:03.599

Vale, se entiende este el procedimiento

este que os digo.

00:44:03.720 \--\> 00:44:08.760

A ver, aquí había alguna cuestión.

00:44:11.880 \--\> 00:44:19.119

No lo sé, Cristian. O sea, desde CLE

sabes que puedes exportar. Ahora, eh,

00:44:16.160 \--\> 00:44:25.200

luego ya el importador ya decidirá si

entiende lo que exporta Clicse o no.

00:44:23.400 \--\> 00:44:29.200

Claro. O lo copiando, pegando clases.

Claro, eso era lo que te decía, hombre.

00:44:27.520 \--\> 00:44:34.359

Copiando el texto del código fuente,

¿no? Sino cogerte los ficheros pun Java

00:44:31.359 \--\> 00:44:40.520

y los metes en la carpeta de Bluej para

que vea que hay clases definidas y las

00:44:36.920 \--\> 00:44:40.520

las pueda compilar.

00:44:42.079 \--\> 00:44:48.400

Pero vamos, de clise no hay una opción

particular para exportar al J. Quiero

00:44:47.000 \--\> 00:44:52.559

entender, no lo he mirado, pero

seguramente no hay para exportar tu

00:44:50.119 \--\> 00:44:55.760

fichero y ya está.

Ese

00:44:54.440 \--\> 00:44:59.520

es el único día que se tiene que ir

presencialmente. Efectivamente, el día

00:44:58.000 \--\> 00:45:05.280

20 de mayo es el único día que se tiene

que ir presencialmente.

00:45:01.520 \--\> 00:45:05.280

Vale, os voy a poner,

00:45:05.559 \--\> 00:45:12.240

vamos a ver, os voy a poner el eh

00:45:17.720 \--\> 00:45:23.280

el formulario.

A ver.

00:45:37.240 \--\> 00:45:41.200

Esto es para

00:45:54.800 \--\> 00:46:01.760

aquí está este el de

Bueno, es un formulario para

00:46:00.119 \--\> 00:46:06.880

asignaturas, pero da igual, vosotros

apuntáis ahí aparece el nombre de

00:46:03.599 \--\> 00:46:06.880

vuestra asignatura.

00:46:12.720 \--\> 00:46:19.559

Vale, entonces el día

20 de mayo

00:46:27.559 \--\> 00:46:31.000

y el día 5 de mayo.

00:46:37.720 \--\> 00:46:41.280

Vale. Eh,

00:46:48.839 \--\> 00:46:54.440

por favor, lo que sí os pido es que os

apuntéis cuando tengáis claro que vais a

00:46:52.839 \--\> 00:47:00.240

venir y que vais a presentar la

práctica, porque si no es un hueco que

00:46:57.720 \--\> 00:47:04.040

vais a quitar a otra persona, ¿vale?,

que a lo mejor sí que quiere entregar la

00:47:02.400 \--\> 00:47:08.000

práctica.

Lógicamente hay hora y media. Yo voy a

00:47:06.000 \--\> 00:47:12.040

intentar poner a todo el mundo, pero no

puedo revisar tu práctica lo mismo si

00:47:09.599 \--\> 00:47:14.920

tengo 3 minutos que si tengo un minuto.

Entonces, cuanto y hago una

00:47:13.400 \--\> 00:47:17.480

planificación. Entonces, cuando se haga

esa planificación, por favor, intentar

00:47:16.359 \--\> 00:47:22.000

apuntaroslo, pero de verdad estáis

seguros. Ahora, si queréis, no os

00:47:19.200 \--\> 00:47:26.680

apuntéis, ¿vale? Perfecto. Antes del 6

de mayo, tenéis que estar apuntado, el 5

00:47:23.960 \--\> 00:47:29.760

de mayo, como es muy tarde, ¿vale? Pues

yo que sé, a la vuelta de Semana Santa,

00:47:28.319 \--\> 00:47:33.440

mediados de abril o por ahí, tú ya vas

viendo que más o menos tiene la práctica

00:47:31.839 \--\> 00:47:36.960

eh trabajadilla. Oye, la voy a

presentar, pues entonces me escribo,

00:47:34.800 \--\> 00:47:40.559

¿vale? Pero no os apuntéis solo para

\[&nbsp;\_\_&nbsp;\] sitio, porque solo para \[&nbsp;\_\_&nbsp;\]

00:47:39.119 \--\> 00:47:45.880

sitio lo que hacéis es fastidiar a otros

compañeros.

00:47:42.920 \--\> 00:47:49.359

Vale. Eh, voy a

poner el enlace.

00:47:56.160 \--\> 00:47:59.720

Vale, lo pongo.

00:48:00.040 \--\> 00:48:04.040

Vamos a ver, lo voy a poner en ahora.

00:48:07.599 \--\> 00:48:11.119

Lo perdido ya.

00:48:26.040 \--\> 00:48:29.400

Vamos a veres

00:48:30.200 \--\> 00:48:38.119

e

tutoría,

00:48:34.240 \--\> 00:48:38.119

en el foro de la tutoría.

00:48:53.680 \--\> 00:48:55.799

Eh,

00:49:15.559 \--\> 00:49:17.720

Vale.

00:50:08.119 \--\> 00:50:18.280

Vale, pues lo acabo de colgar ahí en el

foro y lo pongo también aquí en el

00:50:14.839 \--\> 00:50:18.280

en en el chat.

00:50:32.359 \--\> 00:50:39.280

Vale. Y luego dice Manuel, \"Lo que hemos

aprobado el año pasado,

00:50:37.240 \--\> 00:50:43.920

te la podemos enviar por correo para que

le eches un vistazo. Es que luego el

00:50:41.559 \--\> 00:50:49.280

examen se basa

mucho en la práctica a este año.

00:50:47.440 \--\> 00:50:53.040

Si quieres mándame dudas que tengas en

concreto, ¿vale? Pero no voy a revisar

00:50:51.319 \--\> 00:50:57.200

la práctica tuya ni la voy a corregir,

entre otras cosas porque por correo

00:50:54.680 \--\> 00:51:01.880

electrónico suele rebotar los correos

electrónicos,

00:50:59.119 \--\> 00:51:09.599

sobre todo como examen ficheros. Los

rebotan los los servidores por amenazas.

00:51:06.000 \--\> 00:51:09.599

Entonces es un rollo.

00:51:17.839 \--\> 00:51:21.760

Vale, está accesible el fichero,

¿verdad?

00:51:23.280 \--\> 00:51:27.200

el sombrario que repito.

00:51:42.559 \--\> 00:51:46.559

Vale. Okay. Muchas gracias, Man.

00:51:46.920 \--\> 00:51:56.440

Bueno, y ya eh yo creo que de dinámica y

metodología del funcionamiento de la

00:51:55.160 \--\> 00:52:01.480

práctica, yo creo que está. A ver que

miremos si falta alguna cosa más.

00:52:12.079 \--\> 00:52:17.799

Vale, la entrega se hace por agora.

Todos los ficheros hay que subir. Ah,

00:52:15.680 \--\> 00:52:22.000

bueno, sí. A ver, eh, efectivamente, que

hay que entregar, que hay que entregar.

00:52:19.119 \--\> 00:52:25.359

Vale,

ya hemos visto

00:52:40.880 \--\> 00:52:45.480

dice, \"La única vía de entrega de la

práctica es a través de la plataforma

00:52:44.079 \--\> 00:52:49.599

Agora.\"

Vale, entonces por favor entregarlo a

00:52:47.680 \--\> 00:52:55.240

través de la plataforma de voy a

compartir la

00:52:52.000 \--\> 00:52:55.240

la pantalla.

00:53:07.280 \--\> 00:53:16.520

Vale. ¿Y qué hay que entregar?

Vale, hay que entregar por un lado una

00:53:12.599 \--\> 00:53:20.040

memoria. La memoria, una portada, por

favor. Parece una tontería, pero hay

00:53:18.240 \--\> 00:53:23.640

gente que entrega cosas y no pone el

nombre. No pones nombre, por favor.

00:53:22.359 \--\> 00:53:29.440

¿Cómo puedes entregar algo sin tu

nombre? No eres el autor, tienes un

00:53:25.760 \--\> 00:53:33.920

cero, lógicamente. Entonces, una portada

donde ponga vuestros datos, nombre, el

00:53:32.160 \--\> 00:53:38.520

apellido, la dirección de correo

electrónico. También es interesante que

00:53:35.760 \--\> 00:53:43.319

pongáis el DNI, ¿vale? Muchos de los

sistemas con el D os localizan más

00:53:40.920 \--\> 00:53:48.359

fácilmente.

Luego eh en esa memoria la portada,

00:53:46.119 \--\> 00:53:53.079

luego ya la estructura de la portada de

un documento académico formal como el

00:53:50.359 \--\> 00:53:58.200

que estáis haciendo. Es decir, eh no

hace falta decirlo, pero bueno, lo suyo

00:53:56.040 \--\> 00:54:03.160

es que hubiese un índice. Si hay figuras

y hay tablas, las figuras y las tablas

00:54:00.040 \--\> 00:54:07.400

están enumeradas, tienen un pie, están

citadas en el texto, hay un índice de

00:54:05.520 \--\> 00:54:12.520

tablas, un índice de figuras. un

documento académico, ¿vale? Eso es lo

00:54:09.400 \--\> 00:54:17.480

que se espera de la memoria.

Esas cosas dan calidad a la memoria. Yo

00:54:14.760 \--\> 00:54:22.079

la memoria dedico un punto a la memoria,

¿vale? A la calidad de la memoria según

00:54:18.880 \--\> 00:54:27.440

esté escrita la memoria, según esté bien

bien organizado y todo esto y con buen

00:54:24.400 \--\> 00:54:31.160

formato y bien estructurada, ¿vale? La

calidad de la memoria que es todo esto,

00:54:28.960 \--\> 00:54:35.200

¿no? Que está apaginada,

que hay índices, que las figuras están

00:54:33.559 \--\> 00:54:38.760

numeradas y tienen su pie, etcétera,

todo ese tipo de cosas, ¿vale? Eso

00:54:36.920 \--\> 00:54:44.200

mejora la nota, evidentemente sube la

calidad.

00:54:41.680 \--\> 00:54:48.680

Eh, dice, \"Análisis de la aplicación

realizada, ¿vale? Mostrando el

00:54:45.680 \--\> 00:54:48.680

funcionamiento.

00:54:50.480 \--\> 00:54:56.559

Eh, estrategias que se han implementado,

decisiones de diseño establecida.\" Esto

00:54:54.000 \--\> 00:55:04.440

es lo que os decía. Oye, no dice, como

decía antes vuestro compañero,

00:55:01.280 \--\> 00:55:07.160

no dice no sé qué cosas o no dice si el

alta la tiene que dar el gestor o el

00:55:05.799 \--\> 00:55:10.720

administrador, pues tomas la decisión

que tú creas, pues a la memoria lo

00:55:08.599 \--\> 00:55:16.880

dices, como no se especifica quién tiene

que dar el alta, he decidido queer el

00:55:12.880 \--\> 00:55:16.880

administrador. Pues ya está.

00:55:17.119 \--\> 00:55:23.280

Eh, el diagrama de clases, aquí sí que

pide diagrama de clases. El diagrama de

00:55:20.599 \--\> 00:55:27.039

clases, ¿vale?

conteniendo, evidentemente, la relación

00:55:24.760 \--\> 00:55:30.920

que hay entre las clases.

Y luego, bueno, aquí hay un texto que

00:55:28.280 \--\> 00:55:35.079

describa cada clase eh justificando,

pero brevemente y enrollaros y y

00:55:33.119 \--\> 00:55:42.799

destacando a lo mejor el método, los

métodos más importantes,

00:55:38.480 \--\> 00:55:46.799

¿vale? Eso es eh la memoria, ¿vale? cómo

tiene que organizada. Y luego al final

00:55:44.480 \--\> 00:55:52.520

de la memoria un anexo.

Un anexo donde se indica

00:55:50.240 \--\> 00:55:56.960

eh

eh donde se colocas el código fuente, el

00:55:55.280 \--\> 00:56:01.599

código fuente de las clases que que has

implementado, pues lo coges y lo colocas

00:55:58.599 \--\> 00:56:01.599

ahí,

00:56:03.839 \--\> 00:56:14.039

¿vale? Pero un solo documento, un solo

PDF, por favor, no hagáis tres anexos

00:56:11.200 \--\> 00:56:18.599

y son tres PDF, lo que hago más el PDF

de la memoria y cada uno por su lado.

00:56:15.799 \--\> 00:56:24.920

No, no. Un solo PDF y ahí al principio

la portada, tu índice, tus secciones y

00:56:22.559 \--\> 00:56:29.039

luego anexo uno, anexo 2, los anexos

pces, un solo PDF.

00:56:30.160 \--\> 00:56:36.880

Y luego además de la memoria pues

evidentemente el el código punto el

00:56:34.760 \--\> 00:56:41.440

código fuente los fichers pun Java y el

código

00:56:39.039 \--\> 00:56:45.079

el código ejecutable los ficheros punc

cl los interpretables los ficheros punc

00:56:43.400 \--\> 00:56:49.559

clas

yo os recomiendo que cojáis el fichero

00:56:46.839 \--\> 00:56:55.400

el proyecto bluej por completo lo

comprimís y ya está junto con la memoria

00:56:51.839 \--\> 00:56:55.400

y ya está vale.

00:56:57.680 \--\> 00:57:04.319

Bueno, aquí viene algunas notas. Leeros

lo del tema de los virus y todas estas

00:57:00.839 \--\> 00:57:07.559

cosas y ya está. Vale, ¿alguna pregunta

en casa?

00:57:09.839 \--\> 00:57:17.520

No, vale,

vale. Vamos a volver al enunciado

00:57:13.440 \--\> 00:57:17.520

entonces al principio. Las

00:57:29.119 \--\> 00:57:33.119

sí.

Una pregunta,

00:57:31.000 \--\> 00:57:36.240

eh, entonces la memoria al final, por

ejemplo, todo lo que viene en el nivel

00:57:34.559 \--\> 00:57:40.000

uno realmente es lo que va a continuar

ahí en la memoria. En la memoria. Eso es

00:57:38.039 \--\> 00:57:42.839

eso es lo del nivel uno es que tú lo

pienses, lo hagas y en la memoria pues

00:57:42.079 \--\> 00:57:45.760

escribes.

Ahí metes enora de clases, planteamiento

00:57:45.359 \--\> 00:57:50.160

y

justo eso es eso es. Si queréis la

00:57:48.559 \--\> 00:57:54.160

memoria la podéis estructurar la sección

de contenido, es decir, índice, portada,

00:57:52.119 \--\> 00:57:58.240

índice y luego contenido. La sección de

contenido la podéis eh organizar por

00:57:56.440 \--\> 00:58:01.640

tres secciones principales. Nivel uno y

lo ponéis así, nivel uno, como pone el

00:58:00.319 \--\> 00:58:04.920

enunciado, nivel uno, no sé qué, no sé

cuánto, tres puntos. Hola. Y ahí me

00:58:03.319 \--\> 00:58:08.240

metes todo. Me pones el diagrama de

clases, me pones la explicación de las

00:58:06.319 \--\> 00:58:12.039

clases, de no sé qué, no sé cuánto. Y

luego nivel dos, pues el anexo tal, que

00:58:10.599 \--\> 00:58:15.799

es donde está el código fuente del nivel

dos. Y nivel tres, pues el anexo tal,

00:58:14.559 \--\> 00:58:20.599

que es donde está el código fuente del

nivel tres y ya está.

00:58:19.079 \--\> 00:58:25.839

Bueno, podéis organizar la estructura

como queráis, eh, pero esa puede ser una

00:58:22.920 \--\> 00:58:30.520

estructura válida. Vale, volviendo,

dice, bueno, hay dos partes en el

00:58:28.799 \--\> 00:58:33.359

sistema este de gestión de la fábrica de

vehículos. Hay una parte que es la

00:58:31.760 \--\> 00:58:39.119

cadena de montaje y otra parte que es el

sistema de de gestión de la fábrica,

00:58:35.839 \--\> 00:58:43.720

¿vale? En la cadena de montaje

dice tiene la misión de construir

00:58:41.079 \--\> 00:58:48.640

coches. ¿Vale? Eh, los tipos de coches

que se construyen en esta factoría son

00:58:45.720 \--\> 00:58:51.839

biplaza, deportivo, turístico. Aquí se

puede pintar

00:58:53.880 \--\> 00:58:58.319

nada que lo poco que me diga este

00:59:10.000 \--\> 00:59:13.920

super lento esto. Voy que no sé.

00:59:15.920 \--\> 00:59:23.680

Entonces dices, los tipos de coche que

se construyen a factoría son,

00:59:20.079 \--\> 00:59:28.160

vale, esos son tipos de coche.

Madre mía, hasta que se termina eso de

00:59:28.319 \--\> 00:59:37.880

Vale, son tenemos tres tipos: deportivo,

turístico y furbolizar.

00:59:35.000 \--\> 00:59:43.680

Eh, cada coche tiene una serie de

información, tiene el color, el número

00:59:40.520 \--\> 00:59:47.039

de plazas, la tara del vehículo y el

peso máximo.

00:59:48.760 \--\> 00:59:55.599

Vale.

Vale. Cada tipo de vehículo tiene una

00:59:53.520 \--\> 01:00:01.039

cadena de montaje diferente. Por lo

tanto, existen tres tipos de vehículos,

00:59:59.240 \--\> 01:00:04.720

¿vale? Existos tipos de vehículos. Hay

tres. La factoría de coche dispone de

01:00:03.079 \--\> 01:00:11.480

tres tipos de cadena de montaje. Los

tipos de motores que se puede montar son

01:00:08.920 \--\> 01:00:17.680

estos son tipo de motores

que son eléctrico, gasolina e híbrido.

01:00:15.799 \--\> 01:00:24.559

Y las características técnicas de los

motores son cilindradas, potencia y

01:00:21.079 \--\> 01:00:24.559

número de cilindro.

01:00:25.240 \--\> 01:00:30.960

También tenemos eh, o sea, un coche

tiene esta información, pero luego

01:00:29.640 \--\> 01:00:37.160

también tiene el tipo de motor y luego

también tiene el tipo de tapicería,

01:00:33.839 \--\> 01:00:42.640

¿vale? El tipo de de tapicería es tela,

cuero y alcanza.

01:00:39.920 \--\> 01:00:49.319

Las características de la tapicería son

color, metros y cuadrado de tela. Y por

01:00:46.760 \--\> 01:00:56.520

último, las ruedas. También tenemos

ruedas, ¿vale? Y las ruedas son normal,

01:00:53.359 \--\> 01:01:01.119

deportivo y todoterreno. Y aquí viene la

información de cada una de las ruedas.

01:01:01.240 \--\> 01:01:09.640

Eh, las ruedas son ancho, diámetro,

llanta, pulvala, índice, etcétera.

01:01:10.680 \--\> 01:01:18.799

Vale, de ahí ya podemos sacar un poco

una serie de clases que estamos

01:01:15.200 \--\> 01:01:25.880

identificando ahí, ¿no? Porque

aquí se puede poner,

01:01:22.520 \--\> 01:01:25.880

se han instalado

01:01:44.400 \--\> 01:01:51.920

mía, aquí es que le das para arrancar

una aplicación y y nada.

01:02:18.520 \--\> 01:02:20.640

esto.

01:02:43.000 \--\> 01:02:46.000

Bueno,

01:03:06.559 \--\> 01:03:09.799

Aquí va

01:03:11.359 \--\> 01:03:16.119

encima que va lento es que para acá.

01:03:18.359 \--\> 01:03:24.240

Eh,

¿cómo puedo ver esto?

01:03:27.119 \--\> 01:03:31.680

cambiando. A ver,

01:03:32.920 \--\> 01:03:36.319

vale, voy

01:03:44.279 \--\> 01:03:48.079

aquí si no lo voy dibujando.

01:03:49.079 \--\> 01:03:55.400

Vale, entonces,

¿qué diagrama de clase podemos tener?

01:03:59.520 \--\> 01:04:07.200

Vale, en rojo. Bueno, pues fijaros dice,

nosotros tenemos varios tipos de coches,

01:04:05.160 \--\> 01:04:13.480

con lo cual nosotros lo que tenemos es

nuestra clase coche, ¿vale? Y esa clase

01:04:10.400 \--\> 01:04:17.039

coche va a ser de tres tipos, ¿no? El

tipos de coche que se construyen esta

01:04:14.799 \--\> 01:04:21.240

factorio son

pues deportivo,

01:04:22.000 \--\> 01:04:26.599

otro es turismo y otro es furgoneta

01:04:31.680 \--\> 01:04:39.599

y furgonetas, ¿no?

Y dice eso por un lado, dice, \"Cada tipo

01:04:37.839 \--\> 01:04:44.319

de vehículo tiene una cadena de montaje

diferente, por tanto existen tres tipos

01:04:42.680 \--\> 01:04:49.480

de cadenas. Entonces tendré por otro

lado

01:04:47.039 \--\> 01:04:53.119

cadenas de montaje\", ¿no? Entonces,

cadena de montaje también hay tres

01:04:50.760 \--\> 01:04:56.119

tipos, ¿vale? que eléctrico, gasolina,

hídro

01:04:58.319 \--\> 01:05:01.319

eléctrico,

01:05:02.599 \--\> 01:05:05.599

gasolina,

01:05:06.640 \--\> 01:05:12.240

híbrido. Oye, los que estáis en casa

estáis viendo lo que estoy pintando

01:05:13.720 \--\> 01:05:19.480

No, no se ve.

No sé.

01:05:56.480 \--\> 01:06:05.599

A ver si

esto reacciona. Es que haces un click y

01:06:00.880 \--\> 01:06:05.599

se tira 4 segundos

01:06:05.640 \--\> 01:06:08.839

para reaccionar.

01:06:44.680 \--\> 01:06:48.799

Vale, ahora creo que sí, No,

Maxi,

01:06:48.240 \--\> 01:06:54.559

sí,

ahí en cameras no serían eléctrico,

01:06:52.079 \--\> 01:07:00.920

esto se llama motores no

pues bueno, motores, ¿vale? Sí, podéis

01:06:56.839 \--\> 01:07:05.240

poner si queréis motores,

¿vale? motores quizás sea un nombre,

01:07:07.960 \--\> 01:07:13.279

pero las cadenas sí sería la si habría

cadenas de todas maneras, ¿no? Cadenas

01:07:12.760 \--\> 01:07:17.880

igualmente.

Sí tiene información diferente porque

01:07:14.880 \--\> 01:07:21.119

dice los tipos de Por tanto existen tres

tipos de vehículos, ¿no? No está. Cada

01:07:19.839 \--\> 01:07:23.920

tipo de vehículo tiene una cadena de

montaje, por lo tanto existen tres tipos

01:07:22.480 \--\> 01:07:27.599

de vehículos. La factoría de coches

tiene tres tipos de cadenas de montaje

01:07:25.440 \--\> 01:07:34.119

diferentes. Los tipos de motores que se

pueden montar son eléctricos.

01:07:31.319 \--\> 01:07:39.000

los motores, el tipo de tapicería es lo

mismo, eh, porque fíjate que una cadena

01:07:36.160 \--\> 01:07:42.520

de montaje es de un tipo de motor.

Entonces,

01:07:40.039 \--\> 01:07:47.039

el tipo de motor eléctrico o la cadena

de montaje eléctrico es lo mismo.

01:07:44.760 \--\> 01:07:51.520

Pero es lo que estáendo son motores y

los tipos de cadenas o las cadenas

01:07:49.119 \--\> 01:07:55.200

diferentes que hay son de

son de

01:07:52.039 \--\> 01:07:55.200

y plazas.

01:07:56.160 \--\> 01:08:02.839

No lo veo yo aquí tanto porque dice,

\"Estos son los tipos de coche.\" Sí.

01:08:00.640 \--\> 01:08:07.640

¿Vale? y te dice, \"Y cada tipo de coche

tiene un mon cadena de montaje y esa

01:08:05.680 \--\> 01:08:10.960

cadena de montaje está especializada

para un vehículo, o sea, perdón, para un

01:08:09.640 \--\> 01:08:14.760

motor eléctrico, para un motor de

gasolina o un motor de

01:08:16.279 \--\> 01:08:21.440

no sería cadena la que montaría,

digamos, porque al final lo de arriba

01:08:19.799 \--\> 01:08:25.719

sería el chassi, la parte donde pones

coche, ¿no? lo arriba, o sea, lo que es

01:08:23.920 \--\> 01:08:30.000

el coche y la cadena montaría todo lo

demás, montaría ahí el motor, la

01:08:27.600 \--\> 01:08:33.960

tapería, el

Claro, pero ¿qué cadenas tenemos? Las

01:08:32.159 \--\> 01:08:39.920

mismas que los tipos de motores que

tenemos. ¿Qué te dice? Hay tres tipos de

01:08:36.719 \--\> 01:08:42.600

cadena y cada cadena es para cada uno de

los vehículos porque dice, mira, por

01:08:41.040 \--\> 01:08:46.719

tanto, al existir tres tipos de

vehículos, la factoría dispone de tres

01:08:44.839 \--\> 01:08:50.679

tipos de cadena

y y te pone y los tipos de motores que

01:08:49.359 \--\> 01:08:54.920

se pueden montar para cada una de estas

cadenas son estos tres.

01:08:52.719 \--\> 01:08:58.199

Yo lo que he interpretado es que hay

tres tipos de vehículos que son la

01:08:56.520 \--\> 01:09:03.080

factura y 1040 y a cada uno de ellos se

le puede poner un motor distinto, un rad

01:09:00.080 \--\> 01:09:05.759

distinto, una vitía distinta.

Mm.

01:09:04.520 \--\> 01:09:09.239

puede ha un turismo que tenga motor

eléctrico o pasina

01:09:07.359 \--\> 01:09:14.440

también puede ser a lo mejor así como tú

dices también puede ser

01:09:11.960 \--\> 01:09:20.679

esto de aquí

vale esto de aquí son motores, lo vamos

01:09:16.480 \--\> 01:09:25.120

a llamar motor, ¿vale? Bueno, eh, a ver,

cada tipo de vehículo tiene una cadena

01:09:22.159 \--\> 01:09:30.400

de montaje.

Los tipos de vehículos

01:09:28.120 \--\> 01:09:37.920

son los eh cada tipo de vehículo y los

tipos de vehículos son estos y cada uno

01:09:33.799 \--\> 01:09:41.799

sí tiene una cadena de montaje, ¿vale?

Es tres tipos de vehículos, ¿vale? Eh,

01:09:40.080 \--\> 01:09:45.920

pero esto es mejor llamarlo motor, como

bien decís, ¿vale? Porque estos son

01:09:43.440 \--\> 01:09:50.799

tipos de motor. Las cadenas por ahora,

hasta ahora que yo vea, no tenemos, no

01:09:48.359 \--\> 01:09:54.719

tenemos necesidad de modelar cadenas

hasta ahora. Luego más adelante a lo

01:09:52.640 \--\> 01:09:59.360

mejor sí. Y ponen de tres tipos de

cadena de montajes diferentes, no nos

01:09:56.760 \--\> 01:10:03.880

dan información,

¿vale? Y los tipos de motores son estos

01:10:01.480 \--\> 01:10:07.760

y ya está. Y las características de los

motores que se tienen que almacenar son

01:10:05.360 \--\> 01:10:11.360

cilindrada, potencia, ¿vale? El tipo de

tapicería. Pues aquí sí que tenemos tres

01:10:09.600 \--\> 01:10:15.719

tipos de tapicería porque además son

tres clases porque cada uno de los las

01:10:13.760 \--\> 01:10:18.880

características de de la tapicería se

almacenas serán color metro cuadrado y

01:10:17.400 \--\> 01:10:23.000

tela.

Entonces, aquí tendremos tapicería

01:10:24.239 \--\> 01:10:33.640

y estas tapicerías,

los tipos de tapicería son tela, cuero,

01:10:30.719 \--\> 01:10:39.199

tela,

cuero y

01:10:36.199 \--\> 01:10:39.199

alcanzar.

01:10:47.480 \--\> 01:10:52.199

Y luego tenemos las ruedas. También

tenemos ruedas

01:11:01.239 \--\> 01:11:05.199

normal, deportivo, todoterreno.

01:11:09.520 \--\> 01:11:15.159

deportivo,

todo

01:11:24.960 \--\> 01:11:30.880

vale. En principio es eso es lo que

tenemos en relación a eso.

01:11:32.880 \--\> 01:11:36.159

dice, \"Bueno,

01:11:36.840 \--\> 01:11:39.840

esto

01:11:48.840 \--\> 01:11:54.440

dice, el sistema de gestión de fábricas

se encarga de de gestionar el

01:11:53.040 \--\> 01:12:01.280

funcionamiento.\" Por lo tanto, dice, hay

una gestión de alma gel de datos que

01:11:57.239 \--\> 01:12:01.280

guarda todos los datos del sistema.

01:12:07.239 \--\> 01:12:13.360

Vale, entonces yo tendré que tener aquí

una clase que será al mato.

01:12:29.280 \--\> 01:12:33.320

Y ahora esta clase que es almacén

01:12:42.760 \--\> 01:12:48.920

esa clase que es almacén hará uso de

diferentes clases, ¿sabes? mediante R

01:12:47.760 \--\> 01:12:54.480

list Lis, a lo mejor, por ejemplo, pues

para almacenar eh 25 coches que tengo de

01:12:51.880 \--\> 01:12:58.080

un tipo o para almacenar eh 20 motores

que tengo de otro tipo, de lo que sea,

01:12:56.159 \--\> 01:13:03.040

pues tendré que utilizar clases como

Aray le list y o a Rise, ¿vale? Para

01:13:00.679 \--\> 01:13:07.040

almacenar este tipo de cosas.

Esa ya hará uso de otros, ¿no? Luego

01:13:05.320 \--\> 01:13:10.679

tendremos trabajadores. Pues con los

trabajadores igual ahí se desprende una

01:13:08.560 \--\> 01:13:15.719

jerarquía, ¿no?

A ver, porque dice que hay existen

01:13:13.080 \--\> 01:13:19.000

cuatro tipos de trabajadores: operario,

gestor de planta, administrador del

01:13:17.159 \--\> 01:13:21.600

sistema. Con lo mismo estará la clase

trabajador que tiene el DNI, la

01:13:20.280 \--\> 01:13:25.880

dirección, número de seguridad social,

todos ellos. Y luego habrá una herencia

01:13:24.199 \--\> 01:13:31.199

para cuatro tipos de trabajadores que

hay mecánicos, administrador.

01:13:28.400 \--\> 01:13:33.920

Luego el gestor. El sistema de gestión

dispone de un cuadro de mando que

01:13:32.480 \--\> 01:13:36.840

permite mostrar el balance de distintos

componentes del almacén y el estado de

01:13:35.560 \--\> 01:13:40.480

vehículos en construcción en la cadena

de montaje. Este cuadro de mando será la

01:13:38.600 \--\> 01:13:43.600

herramienta utilizar gestión de planta.

A ver,

01:13:44.320 \--\> 01:13:47.320

no.

01:13:54.920 \--\> 01:14:01.520

Vale, pues este cuadro de mando podéis

implementar una una clase que a lo mejor

01:14:00.000 \--\> 01:14:05.560

en esa clase es suficiente o se puede

descomponer en varias, ¿vale? Donde

01:14:03.280 \--\> 01:14:10.440

acumule toda esa información, ¿vale? Que

dice todas esas esas tareas que puede

01:14:07.440 \--\> 01:14:10.440

hacer.

01:14:11.040 \--\> 01:14:17.840

Eh, cuadra de mando, pues tiene que

acceder también al almacén, ¿no?, para

01:14:14.480 \--\> 01:14:17.840

ver los componentes,

01:14:18.440 \--\> 01:14:26.440

eh, el proceso de montaje, etcétera.

Luego está el planificador, pues otra

01:14:23.440 \--\> 01:14:31.840

clase que sea el planificador,

¿vale? Y el planificador tiene tres

01:14:28.440 \--\> 01:14:31.840

tipos de planificaciones.

01:14:32.159 \--\> 01:14:40.239

Planificación simple, compleja y muy

compleja. Pues igual

01:14:37.840 \--\> 01:14:43.920

ver ahí la herencia, ¿no? Que la simple

y la la compleja añade algo a la simple

01:14:42.480 \--\> 01:14:46.920

y la muy compleja añade algo a la

simple.

01:14:48.159 \--\> 01:14:57.920

¿Vale? El comportamiento de los métodos

estos aquí viene eh, ¿dónde estaba?

01:14:55.760 \--\> 01:15:01.880

Aquí viene lo de que la diferencia entre

una simple y una compleja es que la

01:14:59.719 \--\> 01:15:04.719

simple es que cadacio. O sea, nosotros

lo que tenemos que hacer es simular que

01:15:03.040 \--\> 01:15:08.120

estamos fabricando el coche. Entonces,

con la simple dice esta simulación no se

01:15:06.520 \--\> 01:15:11.080

produce ningún problema en las cintas,

solo hay que considerar los tipos

01:15:09.800 \--\> 01:15:15.320

operarios seleccionados en cada una de

las cintas,

01:15:13.920 \--\> 01:15:21.600

eh, cuya selección se ha realizado de

manera aleatoria.

01:15:17.719 \--\> 01:15:21.600

¿Vale? Entonces,

01:15:21.960 \--\> 01:15:27.520

¿dónde estaba lo del slop de tiempo este

que te decía? Aquí, ¿no? Cada segundo.

01:15:25.560 \--\> 01:15:32.480

Eso dice, cuando se inicia el proceso,

un segundo, los operarios de la cadena.

01:15:30.800 \--\> 01:15:37.040

Eh,

a ver, dice, en el segundo uno, los

01:15:34.600 \--\> 01:15:40.040

operarios de las cadenas 1, dos y tres

controlan los robots de montaje del

01:15:38.560 \--\> 01:15:43.480

chasis de cada una de las cadenas,

respectivamente, utilizando los robots

01:15:42.000 \--\> 01:15:46.480

para montar los chasis en cada una de

las cadenas del montaje, requiriendo el

01:15:45.000 \--\> 01:15:50.679

tiempo necesario y aplicando todas las

modificaciones necesarias. Entonces,

01:15:48.320 \--\> 01:15:55.400

cada vez que pasa un segundo se realiza

una acción en el montaje. En el simple

01:15:53.159 \--\> 01:15:59.600

no pasa nada, pero en los otros dos lo

que te dice es que puede haber como

01:15:57.199 \--\> 01:16:02.800

interrupciones, ¿no? Dice, \"Entran juego

los mecánicos, al menos uno de cada

01:16:01.400 \--\> 01:16:08.600

perfil debe reparar al menos dos

problemas en cada una de las cintas, con

01:16:04.719 \--\> 01:16:14.760

lo cual ya retrasa el tiempo, ¿vale?

Entonces, se trata de eh implementar el

01:16:11.120 \--\> 01:16:18.760

comportamiento eh un método que sea

planificación, simulación de la

01:16:16.320 \--\> 01:16:22.080

planificación simple. vosotros decidís

que es la construcción de la cadena por

01:16:20.400 \--\> 01:16:26.000

montar un coche, una rueda, o sea,

montar un motor, una rueda y una

01:16:23.960 \--\> 01:16:30.440

tapicería, por ejemplo. Ensamblar esas

tres cosas, pues crear objetos de

01:16:28.159 \--\> 01:16:35.280

tapicería de no sé qué tipo, motor de no

sé qué tipo y y lo otro que he dicho de

01:16:33.360 \--\> 01:16:39.440

no sé qué tipo y eso lo va ensamblando.

¿Vale?

01:16:37.719 \--\> 01:16:42.560

Vale. Y luego lo que tenéis que tener en

cuenta lo del tema de los operarios,

01:16:40.800 \--\> 01:16:46.600

porque los trabajadores hay varios tipos

de trabajadores y cada uno de los

01:16:44.480 \--\> 01:16:49.719

trabajadores, ¿vale?, es más o menos

eficiente. Entonces, a la hora de

01:16:48.159 \--\> 01:16:54.320

cometer fallos en el proceso de

fabricación puede afectar más o menos.

01:16:51.840 \--\> 01:16:58.280

¿Vale?

Bueno, pues lo dejamos aquí. Entonces,

01:16:55.880 \--\> 01:17:01.719

¿hay alguna pregunta?

Vale, hay que leerse el enunciado

01:16:59.679 \--\> 01:17:05.000

tranquilamente, ¿vale? Y como veis, se

trata de ir interpretando el enunciado

01:17:03.440 \--\> 01:17:11.840

porque hay quedan muchas cosas en

blanco, o sea, no se define todo. No se

01:17:07.480 \--\> 01:17:11.840

define todo. ¿Hay alguna pregunta?

01:17:14.679 \--\> 01:17:20.520

Bueno, pues entonces lo dejamos aquí. Yo

creo que ya podéis arrancar muchas cosas

01:17:18.840 \--\> 01:17:25.480

de la práctica. Vale. Puedo hacer un

favor

01:17:22.800 \--\> 01:17:27.159

el DNI, por favor.

No, si lo tienes ahí.

01:17:26.760 \--\> 01:17:29.440

No,

no tienes DNI. No tienes para

01:17:28.480 \--\> 01:17:34.800

identificarte.

No, no lo traes.

01:17:31.520 \--\> 01:17:34.800

Tengo que

01:17:35.480 \--\> 01:17:41.280

sacar el pillo.

La hoja puede

01:17:39.760 \--\> 01:17:46.960

la hoja está por ahí. La hoja no la

tenéis. La housa, ¿habéis firmado?

01:17:43.480 \--\> 01:17:46.960

¿Habéis puesto el denodo,

01:17:49.040 \--\> 01:17:55.199

por favor? a que te pongan

el sello ahí en la

01:18:23.400 \--\> 01:18:31.600

A ver, decir, las cadenas son según los

tipos de chasis y cada tipo de chasis se

01:18:27.760 \--\> 01:18:31.600

le puede poner distintos motores.

01:18:32.480 \--\> 01:18:40.239

Vale, bien, Manuel.

Y luego los mecánicos no se pueden

01:18:37.159 \--\> 01:18:43.280

elegir de manera aleatoria, ¿vale?

Y luego se acuerdo una pregunta, por lo

01:18:41.639 \--\> 01:18:48.639

que hemos visto antes, parece que solo

hay que hacer la planificación simple,

01:18:45.239 \--\> 01:18:52.840

¿no? La planificación simple te la pedía

en el nivel dos, me parece que era, te

01:18:50.639 \--\> 01:18:57.239

pedía la planificación y luego no sé si

alguna de las del nivel tres te exigiera

01:18:54.960 \--\> 01:19:00.840

algún tipo de planificación. Sí, sí, en

el nivel 3 me parece que te decía

01:18:58.520 \--\> 01:19:05.400

planificación compleja.

El nivel 3 te lo

01:19:03.360 \--\> 01:19:09.320

no. Bueno, pues lo dejamos aquí

entonces. Que paséis buena semana.
