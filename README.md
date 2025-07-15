Se desea desarrollar un sistema para calificar autos de carrera y sus respectivos pilotos.

El objetivo del modelo es que sea extensible, permitiendo agregar fácilmente nuevas características del piloto o del auto. Por ejemplo, en el futuro se podrían incluir factores como el tipo de neumáticos, accidentes previos, etc.

Descripción general:
Un Auto tiene asignado un Piloto y posee un conjunto de características técnicas que influyen en su rendimiento.

Un Piloto tiene un nombre y puede tener varias características personales que afectan su desempeño.

Existen distintas características tanto para los autos como para los pilotos. Cada característica suma puntos que contribuyen al rendimiento total del auto.

Características personales del piloto:
Experiencia:

Más de 5 años: suma 10 puntos
Entre 2 y 5 años: suma 5 puntos
Menos de 2 años: suma 1 punto

Condición física:
"Excelente": suma 10 puntos
"Buena": suma 5 puntos
"Regular": no suma puntos

Títulos obtenidos:
Cada título suma 2 puntos

Características técnicas del auto:
Velocidad máxima:
Mayor a 300 km/h: suma 10 puntos
Entre 250 y 300 km/h: suma 5 puntos
Menor a 250 km/h: no suma puntos

Peso:
Menor a 900 kg: suma 5 puntos
Entre 900 y 1000 kg: suma 3 puntos
Más de 1000 kg: no suma puntos

Características especiales:
Si el piloto tiene más de 3 títulos, el puntaje total del auto se incrementa un 10%.
Si el piloto tiene condición física “Excelente”, el puntaje total del auto se duplica.

Casos de uso:
Calcular el puntaje de un auto cuyo piloto tiene:

4 años de experiencia

Condición física “Buena”

2 títulos
Y el auto tiene:

Velocidad máxima de 280 km/h

Peso de 890 kg

Calcular el puntaje de un auto cuyo piloto tiene:

6 años de experiencia

Condición física “Excelente”

4 títulos
Y el auto tiene:

Velocidad máxima de 310 km/h

Peso de 880 kg

Se pide:
Realizar un diagrama de clases completo que represente el modelo propuesto.

Realizar diagramas de secuencia para los dos casos de uso indicados.
