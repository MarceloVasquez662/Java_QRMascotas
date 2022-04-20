## Nombre del Proyecto

QR para Mascotas en Java

## Descripcion

Proyecto pensado para ser usado como Totem público, donde poder acceder a registrar tu mascota, tu hogar si es que deseas adoptar, y reportar como perdida tu mascota si llegase a dar. Al registrar tu mascota,
se genera un QR donde al ser escaneado, se te dirige a una página con todos los datos y si llegase a estar perdido, la persona que accedio, podria ponerse en contacto contigo.

## Instalacion y pruebas

Si desea descargar el programa,  se describen los pasos a seguir para su ejecución:

- Copiamos el repositorio en la dirección deseada (Ejecutamos *https://github.com/MarceloVasquez662/java_qrmascotas.git*)
- Nos desplazamos dentro del proyecto, en la carpeta *dist* encontraremos el ejecutable en formato .jar donde podremos iniciar el programa.
- Si desea revisar el codigo, es accedible con algun editor de código. En mi caso se utilizo Apache Netbeans.

*Para el proceso es necesario tener instalado Java*

## Uso

La aplicacion cuenta con algunos módulos con diferentes funcionalidades, que están detalladas a continuación:

- Primer módulo: El primer módulo permite agregar tu mascota al sistema guardando datos esenciales y generando un código QR escaneable para visualizar sus datos. Su princiapl función es utilizar este QR como una alternativa de collar moderno. 
- Segundo módulo: Éste cuenta con una interfaz para recuperar el código QR de nuestra mascota en el caso de pérdida o deterioro.
- Tercer módulo: Aquí podemos encontrar opciones como agregar tu hogar como disponible para adoptar o darlo de baja si es que cambia de opinión. Además, puedes visualizar todos los hogares disponibles para adopción.
- Cuarto módulo: En el caso de que tu mascota se extravíe puedes reportarla en este módulo ingresando tus datos para luego ser mostradas en la siguiente interfaz.
- Quinto módulo: En esta última pantalla puedes ver las mascotas pérdidas junto a su última ubicación (en desarollo). También, si reportaste tu mascota puedes confirmar si es que ha aparecido.

## Estado del proyecto

- Version 1.0
Fase inicial terminada, conectado a base de datos MYSQL en línea y pagina web hosteada en Heroku para la visualización de los datos de las mascotas registradas.

## Detalles técnicos

- Base de datos
MYSQL está desplegada en un servidor gratuito por lo que los tiempos de respuesta y el número de conexiones permitidas esta limitada.
- Página web 
Al igual que la base de datos se encuentra alojada en un servicio gratuito por lo que puede presentarse lentitud o intermitencia en el servicio.

