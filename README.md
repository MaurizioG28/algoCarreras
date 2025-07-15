# algoCarreras
# 🏎️ Ejercicio Modelo: AlgoCarreras

Necesitamos desarrollar parte de un sistema para calificar autos de carrera y sus pilotos.

---

## ✅ Requisitos Generales

> 💡 Sugerencia: Pensá un modelo que permita extenderse fácilmente (por ejemplo, agregar nuevos tipos de características del auto o del piloto).

---

## 🚗 Descripción de un Auto

- Un Auto tiene:
  - Un **piloto**
  - Una serie de **características** que influyen en su rendimiento

---

## 👨‍✈️ Descripción de un Piloto

- Tiene un **nombre**
- Puede tener varias **características personales** que afectan su desempeño

---

## 🧩 Descripción de una Característica

Actualmente existen:

### 🔹 Experiencia
- Más de 5 años → **10 puntos**
- Entre 2 y 5 años → **5 puntos**
- Menos de 2 años → **1 punto**

### 🔹 Condición física
- `"Excelente"` → **10 puntos**
- `"Buena"` → **5 puntos**
- `"Regular"` → **0 puntos**

### 🔹 Títulos obtenidos
- **2 puntos por título**

---

## 🚘 Características del Auto

### 🔹 Velocidad máxima
- > 300 km/h → **10 puntos**
- 250 a 300 km/h → **5 puntos**
- < 250 km/h → **0 puntos**

### 🔹 Peso
- < 900 kg → **5 puntos**
- 900 a 1000 kg → **3 puntos**
- > 1000 kg → **0 puntos**

---

## ⭐ Características Especiales

- Si el piloto tiene **más de 3 títulos**, el auto gana un **bono del 10%**
- Si el piloto tiene condición física **"Excelente"**, se **duplica** el puntaje del auto

---

## 🧪 Casos de Uso

### ⚙️ Caso 1:
- Piloto:
  - 4 años de experiencia
  - Condición física: “Buena”
  - 2 títulos
- Auto:
  - Velocidad máxima: 280 km/h
  - Peso: 890 kg

### ⚙️ Caso 2:
- Piloto:
  - 6 años de experiencia
  - Condición física: “Excelente”
  - 4 títulos
- Auto:
  - Velocidad máxima: 310 km/h
  - Peso: 880 kg

---

## 📝 Se pide

- ✅ Diagrama de **clases completo** que represente el modelo
- ✅ Diagrama de **secuencia para cada uno de los casos de uso**

> 🎯 Pensar el diseño de forma extensible  
> Por ejemplo: que se pueda agregar fácilmente una nueva característica como “Tipo de neumáticos” o “Número de accidentes”.
