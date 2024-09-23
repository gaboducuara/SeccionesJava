# Curso de Java Bootcamp consiti 🙌

Los presentes trabajos son los que realice en la medida de lo posible.

## Tienda de libros 🌌

Se solicita capturar la siguiente información de una tienda de libros:

nombre (String)
ID (int)
Precio (Doble)
envioGratuito (boolean)
Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:
{nombre} #{id}
Precio: {simbolo}{precio}
Envio Gratuito: {envioGratuito}

## Rectangulo 🌋

En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:
alto (int)
ancho (int)

El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea)

- Proporciona el alto:
- Proporciona el ancho:
- Area: {area}
- Perimetro: {perimetro}

Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
Área: alto _ ancho
Perímetro: (alto + ancho) _ 2

## El mayor de dos numeros 🍇

Solicitar al usuario dos valores, y determinar cual número es el mayor.

- numero1 (int)
- numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

- Proporciona el numero1:
- Proporciona el numero2:
- El numero mayor es:
- {numeroMayor}

## Sistema de Calificaciones 🍓

Crear un sistema de calificaciones según se solicita.
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

- El usuario proporcionará un valor entre 0 y 10

- Si está entre 9 y 10: imprimir una A
- Si está entre 8 y menor a 9: imprimir una B
- Si está entre 7 y menor a 8: imprimir una C
- Si está entre 6 y menor a 7: imprimir una D
- Si está entre 0 y menor a 6: imprimir una F
- cualquier otro valor debe imprimir: Valor desconocido.

Por ejemplo:

- Proporciona un valor entre 0 y 10: 9
  A

## Laboratorio: Proyecto Caja. 🎨

Se solicita crear una clase llamada Caja con las siguientes características:

- Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
- Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada atributo de la clase.
- Debe tener el método que calcule el volumen de la caja según la formula: vol = ancho x alto x profundo
- Crear una clase de prueba para crear un objeto de tipo caja que tenga como valores: ancho=3, alto=2, profundo=6 y que mande a imprimir el volumen de la caja según los valores proporcionados anteriormente.

## Laboratorio: Proyecto Caja. 🎨

Se solicita crear una clase llamada Caja con las siguientes características:

- Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
- Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada atributo de la clase.
- Debe tener el método que calcule el volumen de la caja según la formula: vol = ancho x alto x profundo
- Crear una clase de prueba para crear un objeto de tipo caja que tenga como valores: ancho=3, alto=2, profundo=6 y que mande a imprimir el volumen de la caja según los valores proporcionados anteriormente.

## Mundo PC 🚀

- Se tiene el siguiente diagrama de clases. [Diagrama_de_Clases](https://drive.google.com/file/d/14mrBY0Sy6FHisXPSJu0SlYSswgTOiJrX/view)

- Se creará una aplicación llamada "MundoPC"
- Se creará una clase Computadora y este a su vez se va a componer 3 objetos más que será la clase Monitor, Ratón y Teclado.
- Para todas las clases se tienen sus atributos, sus constructores y sus metodos, y ademas, se deben agregar los metodos get y set para cada atributo.
- Como se mencionó anteriormente, la clase Computadora se compone de otros objetos, por lo tanto, para crear un objeto de tipo Computadora por completo necesitamos tener objetos de tipo Monitor, Ratón y Teclado.
- Para las clases Ratón y Teclado, estas descienden de la clase DispositivoEntrada, (recordar que cuando utilizamos herencia es porque vamos a extraer ciertas caracteristicas en la clase padre), es decir, de la clase padre se abstraen ciertas caracteristicas que tenemos en común entre las clase de Ratón y Teclado, como en este caso el tipo DispositivoEntrada.
- Las clases Ratón, Teclado y Monitor se relacionan por medio de una relación de agregación con la clase Computadora. Por ello, para crear un objeto de tipo Computadora primero se deben crear ejemplos de tipo Monitor, Ratón y Teclado.
- Se tiene además la clase Orden, la cual esta relacionada con la clase Computadora. Esta clase Orden contiene un arreglo de objetos de tipo Computadora, por lo tanto en dicho arreglo se pueden agregar uno o más objetos de tipo Computadora. Esta clase tendrá el metodo agregarComputadora y mostrarOrden, en donde se va imprimir todas las computadoras y todo el detalle de cada objeto de tipo computadora a consola.
- Se tiene además la clase de prueba llamada MundoPC en otro paquete denominado mundopc, la cual deberá contener el metodo principal (main).
- Las clases Computadora, Orden, Monitor, Ratón y Teclado se encuentran en el paquete com.gm.mundopc.
