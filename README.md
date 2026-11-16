# Concesionaria de Autos y Motos

## Descripción del proyecto

Este proyecto consiste en el desarrollo de una aplicación de consola en Java que simula el funcionamiento básico de una concesionaria de automóviles y motocicletas.

Fue realizado como parte de la **Segunda Actividad Entregable Obligatoria** del curso de Programación Orientada a Objetos (POO).

La aplicación permite cargar una colección de vehículos y realizar diferentes operaciones sobre ellos, mostrando los resultados por consola sin solicitar datos al usuario.

## Objetivos

Aplicar los conceptos fundamentales de la programación orientada a objetos y utilizar herramientas del ecosistema Java para trabajar con colecciones de objetos.

Entre los objetivos principales se encuentran:

- Implementar herencia y abstracción.
- Utilizar interfaces.
- Aplicar polimorfismo.
- Trabajar con colecciones mediante Java Collections Framework.
- Utilizar la API Stream para procesar y filtrar información.
- Implementar la interfaz `Comparable` para establecer un orden natural.
- Sobrescribir métodos como `toString()`.
- Utilizar Lombok para reducir código repetitivo.
- Desarrollar y ejecutar el proyecto utilizando Spring Boot y Maven.

## Tecnologías utilizadas

| Tecnología | Aplicación |
|---|---|
| Java 25 | Lenguaje de programación |
| Spring Boot 4.1.2 | Framework de desarrollo |
| Maven | Gestión del proyecto y dependencias |
| Lombok | Reducción de código repetitivo |
| Collections Framework | Administración de colecciones |
| Stream API | Procesamiento de datos |
| Comparable | Ordenamiento natural de vehículos |
| Git y GitHub | Control de versiones y alojamiento del código |

## Estructura del proyecto

El proyecto está organizado en paquetes para separar las responsabilidades de cada componente.

```text
concesionaria/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ar/com/centro8/java/curso/concesionaria/
│   │           │
│   │           ├── TestConcesionaria.java
│   │           │
│   │           ├── interfaces/
│   │           │   └── Imprimible.java
│   │           │
│   │           ├── modelo/
│   │           │   ├── Vehiculo.java
│   │           │   ├── Auto.java
│   │           │   └── Moto.java
│   │           │
│   │           └── servicio/
│   │               └── Concesionaria.java
│   │
│   └── test/
│
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

### Descripción de las clases

**Vehiculo (clase abstracta)**

Es la clase base del modelo. Contiene los atributos comunes a todos los vehículos: marca, modelo y precio.

Implementa la interfaz `Comparable<Vehiculo>` para establecer el orden natural por marca, modelo y precio.

**Auto**

Hereda de `Vehiculo` y agrega el atributo cantidad de puertas.

**Moto**

Hereda de `Vehiculo` y agrega el atributo cilindrada.

**Imprimible (interfaz)**

Define el método `obtenerDescripcion()`, que permite obtener la descripción de cada vehículo.

**Concesionaria**

Es la clase encargada de cargar los vehículos y centralizar las operaciones realizadas sobre la colección.

**TestConcesionaria**

Es la clase principal de ejecución de la aplicación. Utiliza Spring Boot y `CommandLineRunner` para ejecutar las operaciones automáticamente al iniciar el programa.

## Funcionalidades

Al ejecutar la aplicación se realizan las siguientes operaciones:

1. Carga de vehículos en una única colección.
2. Impresión de la descripción de cada vehículo.
3. Identificación del vehículo de mayor precio.
4. Identificación del vehículo de menor precio.
5. Búsqueda de vehículos cuyo modelo contiene la letra Y.
6. Ordenamiento de vehículos por precio de mayor a menor.
7. Ordenamiento natural por marca, modelo y precio.

Los vehículos utilizados para las pruebas son:

- Peugeot 206 – Auto – 4 puertas.
- Honda Titan – Moto – 125 cc.
- Peugeot 208 – Auto – 5 puertas.
- Yamaha YBR – Moto – 160 cc.

## Ejecución del proyecto

### Requisitos previos

- Tener instalado Java JDK 25.
- Contar con un entorno de desarrollo compatible con Java, como Visual Studio Code, IntelliJ IDEA o Eclipse.

### Clonar el repositorio

Desde una terminal ejecutar:

```bash
git clone https://github.com/GastonGrande79/concesionaria.git
```

Ingresar a la carpeta del proyecto:

```bash
cd concesionaria
```

### Ejecutar con Maven Wrapper

En Windows:

```bash
mvnw.cmd spring-boot:run
```

En Linux o macOS:

```bash
./mvnw spring-boot:run
```

También se puede importar el proyecto desde un IDE y ejecutar la clase `TestConcesionaria`.

## Resultado esperado

La aplicación muestra por consola el listado de vehículos, los resultados de las búsquedas y los diferentes criterios de ordenamiento, respetando el formato solicitado en la consigna.

No requiere ingreso de datos por teclado y finaliza automáticamente una vez completadas las operaciones.

## Autor

**Gaston Grande**

Proyecto académico – Programación Orientada a Objetos (Java).



