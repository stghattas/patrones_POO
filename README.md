# 🧩 Proyecto Java – Ejemplo de 3 Patrones de Diseño (POO)

Este proyecto muestra la implementación de **tres patrones de diseño**, uno por cada categoría clásica:  
- **Creacional:** Factory Method  
- **Estructural:** Decorator  
- **Comportamiento:** Observer  

El programa simula un **sistema de creación, envío y registro de mensajes**, donde cada patrón cumple un rol diferente dentro del flujo.

---

# 📁 Estructura del Proyecto

src/  
│  
├── main/  
│ └── Main.java  
│  
├── factory/ (Patrón Creacional: Factory Method)  
│ ├── Mensaje.java  
│ ├── Email.java  
│ ├── SMS.java  
│ ├── Push.java  
│ ├── CreadorMensaje.java  
│ ├── CreadorEmail.java  
│ ├── CreadorSMS.java  
│ └── CreadorPush.java  
│  
├── decorator/ (Patrón Estructural: Decorator)  
│ ├── MensajeDecorator.java  
│ ├── EncriptadoDecorator.java  
│ └── ComprimidoDecorator.java  
│  
└── observer/ (Patrón Comportamiento: Observer)  
├── Observador.java  
├── ObservadorConsola.java  
├── ObservadorLog.java  
└── NotificadorEventos.java  


---

# 🏗️ Patrones de Diseño Implementados

## 🔹 **1. Factory Method – Creación de mensajes**
Permite crear distintos tipos de mensajes (Email, SMS, Push) sin acoplar el código a las clases concretas.

- `Mensaje` → clase abstracta  
- `Email`, `SMS`, `Push` → productos concretos  
- `CreadorMensaje` → fábrica abstracta  
- `CreadorEmail`, `CreadorSMS`, `CreadorPush` → fábricas concretas  

✔ Beneficio: Facilita la extensión y evita `new` repetidos.

---

## 🔹 **2. Decorator – Añadir comportamiento dinámico**
Permite agregar funcionalidades a un objeto sin modificar su clase.

Decoradores usados:
- `EncriptadoDecorator` → agrega encriptación  
- `ComprimidoDecorator` → agrega compresión  

✔ Beneficio: Comportamiento flexible sin romper la clase base.

---

## 🔹 **3. Observer – Sistema de notificaciones**
Permite que múltiples objetos reciban notificaciones cuando ocurre un evento.

Elementos:
- `Observador` → interfaz  
- `ObservadorConsola`, `ObservadorLog` → observadores concretos  
- `NotificadorEventos` → sujeto que dispara eventos  

✔ Beneficio: Permite un sistema extensible de monitoreo.

---
