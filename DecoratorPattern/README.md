# Patron Decorator - Gestión de Interacciones

## Problema:

En un sistema de gestión de interacciones, se necesita la capacidad de registrar diferentes tipos de interacciones entre empleados y clientes, como visitas a clientes y reuniones en la oficina. Cada tipo de interacción puede requerir información adicional, como la dirección, notas, fecha y hora de la interacción, etc. Es necesario implementar una solución que permita agregar esta información adicional de manera flexible y dinámica, sin modificar la estructura básica de las interacciones.

## Justificación:

- **Flexibilidad para agregar funcionalidad adicional:** El patrón Decorador permite agregar funcionalidad adicional a un objeto de manera dinámica y flexible. Esto nos permite añadir información adicional a las interacciones según sea necesario, por ejemplo, notas adicionales, direccion de oficina o cliente segun sea el caso, sin modificar la estructura básica de las mismas.

- **Separación de preocupaciones:** Al aplicar el patrón Decorador, podemos separar las diferentes responsabilidades en clases separadas. Tenemos una clase base que representa la estructura básica de una interacción, y luego podemos agregar clases decoradoras que agregan funcionalidad específica, como la ubicación dependiendo del tipo de interaccion, etc. Esto hace que nuestro código sea más modular y fácil de mantener.

- **Reusabilidad del código:** Al utilizar el patrón Decorador, podemos reutilizar las clases decoradoras en diferentes tipos de interacciones sin necesidad de duplicar código, por ejemplo un nuevo tipo de interaccion denominada llamadas al cliente.

- **Cumplimiento del principio de apertura/cerrado:** El patrón Decorador nos permite extender la funcionalidad de las interacciones existentes sin modificar el código fuente. Esto cumple con el principio de diseño de software conocido como el principio de apertura/cerrado (Open/Closed), que establece que las clases deben estar abiertas para la extensión pero cerradas para la modificación.
