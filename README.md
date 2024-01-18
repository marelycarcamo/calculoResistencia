# Cálculo de Resistencia Total

<p align="justify">Este repositorio contiene un programa en Java llamado Resistencia. Este programa se utiliza para calcular la resistencia total de tres resistencias en paralelo.</p>

## Descripción
<p align="justify">El programa Resistencia solicita al usuario que ingrese los valores de tres resistencias. Luego, calcula la resistencia total de estas resistencias cuando están en paralelo utilizando la fórmula:</p>

````R_T = 1 / (1/R1 + 1/R2 + 1/R3)````

<p align="justify">Donde R1, R2 y R3 son las resistencias ingresadas por el usuario y R_T es la resistencia total.</p>

<p align="justify">El programa valida cada entrada del usuario para asegurarse de que sea un número positivo. Si el usuario ingresa un valor que no es un número o un número no positivo, el programa muestra un mensaje de error y solicita al usuario que ingrese el valor nuevamente.</p>

<p align="justify">Finalmente, el programa muestra la resistencia total calculada.</p>

## Cómo ejecutar el programa
<p align="justify">Para ejecutar el programa, necesitas tener instalado Java en tu máquina. Luego, puedes compilar y ejecutar el programa utilizando los siguientes comandos en la terminal:</p>

````
javac Resistencia.java
java Resistencia
