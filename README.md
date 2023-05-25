# ejerciciosDSS
(a) Aplicación del patrón Command:
Para automatizar el procesamiento de diferentes tipos de formularios y permitir la adición de nuevos tipos en el futuro, se puede aplicar el patrón de diseño Command. Este patrón permite encapsular una solicitud como un objeto, lo que permite parametrizar diferentes solicitudes y hacerlas ejecutables de manera flexible.
En el contexto del ejercicio, cada tipo de formulario se puede representar como un comando concreto. El procesamiento del formulario se convierte en la ejecución del comando correspondiente, y cada tipo de formulario generará una respuesta específica. Esto permite desacoplar el procesamiento de formularios de los tipos de formularios individuales.
De esta manera, el patrón Command permite agregar nuevos tipos de formularios y acciones asociadas sin afectar el resto de la aplicación. La estructura de clases relacionada al patrón Command podría ser similar a la siguiente:
Command: Interfaz que define el método execute() para ejecutar la acción del comando.
ConcreteCommand: Implementaciones concretas de comandos para cada tipo de formulario. Cada implementación define la lógica de procesamiento específica y genera la respuesta correspondiente.
Invoker: Clase que invoca los comandos y maneja las solicitudes de procesamiento de formularios.
Receiver: Clases que representan los diferentes sujetos (almacén, clientes, proveedores, empleados, etc.) responsables de procesar las respuestas generadas por los comandos.

https://github.com/arevalo8/ejerciciosDSS/blob/main/Diagrama%20sin%20t%C3%ADtulo.drawio.png


(b) Diagrama de secuencia:

El diagrama de secuencia que describe el procesamiento de un formularioPedido hasta su finalización en el almacén sería el siguiente:


(c) Patrón de diseño para mostrar formularios de manera flexible:
Para manejar la presentación de los diferentes formularios, considerando su longitud, la necesidad de barras de desplazamiento y la posibilidad de resaltar algunos de ellos, se puede utilizar el patrón de diseño Decorator.
El Decorator permite agregar funcionalidades adicionales a un objeto de manera transparente, sin afectar el código existente. En este caso, se pueden definir decoradores específicos para controlar la presentación de los formularios, como la longitud, las barras de desplazamiento y los resaltados.
El diseño del patrón Decorator para mostrar formularios se podría representar de la siguiente manera:
Component: Interfaz que define el comportamiento básico para mostrar un formulario.
ConcreteComponent: Implementación concreta de un formulario.
Decorator: Clase abstracta que implementa la interfaz Component y tiene una referencia al Component original. Define métodos adicionales para agregar funcionalidades al formulario.
ConcreteDecorator: Implementaciones concretas de decoradores que agregan funcionalidades específicas al formulario, como la gestión de la longitud, barras de desplazamiento y resaltado.
Este diseño permitirá mostrar los diferentes formularios sin que el resto del código tenga que preocuparse por los detalles de presentación.




