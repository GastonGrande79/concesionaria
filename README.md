# Concesionaria de Autos y Motos

## Descripción del proyecto

Aplicación desarrollada en Java que simula el funcionamiento básico de una concesionaria de automóviles y motocicletas.

El proyecto corresponde a la Segunda Actividad Entregable Obligatoria del curso de Programación Orientada a Objetos (POO).

La aplicación permite cargar vehículos, mostrar sus características, identificar los de mayor y menor precio, buscar modelos que contengan una letra determinada y ordenar la colección según diferentes criterios.

## Objetivos

Aplicar los principales conceptos de la Programación Orientada a Objetos:

- Abstracción.
- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Interfaces.
- Sobrescritura de métodos.
- Colecciones de objetos.
- Ordenamiento natural y personalizado.
- Uso de Stream API.

## Tecnologías utilizadas

| Tecnología | Utilización |
|---|---|
| Java 25 | Lenguaje de programación |
| Spring Boot 4.1.2 | Estructura y configuración del proyecto |
| Maven | Gestión de dependencias |
| Lombok | Generación automática de métodos |
| Java Collections Framework | Administración de vehículos |
| Stream API | Búsquedas y ordenamientos |
| Git / GitHub | Control de versiones |

## Estructura del proyecto

```text
concesionaria/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ar/com/centro8/java/curso/concesionaria/
│   │   │       │
│   │   │       ├── ConcesionariaApplication.java
│   │   │       │
│   │   │       ├── implementacion/
│   │   │       │   └── Concesionaria.java
│   │   │       │
│   │   │       ├── interfaz/
│   │   │       │   └── IConcesionaria.java
│   │   │       │
│   │   │       ├── unidades/
│   │   │       │   ├── Vehiculo.java
│   │   │       │   ├── Auto.java
│   │   │       │   └── Moto.java
│   │   │       │
│   │   │       └── test/
│   │   │           └── TestConcesionaria.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── ar/com/centro8/java/curso/concesionaria/
│               └── ConcesionariaApplicationTests.java
│
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Descripción de las clases e interfaces

### Vehiculo (clase abstracta)

Es la clase base de todos los vehículos.

Contiene los atributos comunes:

- marca
- modelo
- precio

Implementa la interfaz `Comparable<Vehiculo>`, estableciendo el orden natural de los vehículos mediante el método `compareTo()`.

El criterio de comparación es:

1. Marca.
2. Modelo.
3. Precio.

También contiene el método `formatearPrecio()`, que utiliza `DecimalFormat` para representar los importes monetarios.

Utiliza las anotaciones Lombok `@Getter` y `@AllArgsConstructor`.

### Auto

Hereda de la clase abstracta `Vehiculo`.

Agrega el atributo específico:

- cantidadPuertas.

Sobrescribe el método `toString()` para representar la información del automóvil, incluyendo marca, modelo, cantidad de puertas y precio.

Utiliza Lombok mediante la anotación `@Getter`.

### Moto

Hereda de la clase abstracta `Vehiculo`.

Agrega el atributo específico:

- cilindrada.

Sobrescribe el método `toString()` para representar la información de la motocicleta, incluyendo marca, modelo, cilindrada y precio.

Utiliza Lombok mediante la anotación `@Getter`.

### IConcesionaria (interfaz)

Define el contrato que debe implementar la clase encargada de gestionar las operaciones de la concesionaria.

Declara el método:

`void ejecutar();`

### Concesionaria (clase de implementación)

Implementa la interfaz `IConcesionaria`.

Es responsable de:

- Cargar los vehículos en una colección `List<Vehiculo>`.
- Ejecutar las operaciones de búsqueda.
- Identificar el vehículo más caro.
- Identificar el vehículo más barato.
- Buscar modelos que contienen la letra Y.
- Ordenar los vehículos por precio descendente.
- Ordenar los vehículos según su orden natural.

Utiliza `ArrayList`, `Stream API`, `Comparator` y `Collections.sort()`.

### TestConcesionaria

Es la clase de prueba que contiene el método `main()`.

Crea una instancia de `Concesionaria` y llama al método `ejecutar()` para iniciar las operaciones y mostrar los resultados por consola.

### ConcesionariaApplication

Es la clase principal de Spring Boot.

Contiene el método `main()` que inicia la aplicación mediante `SpringApplication.run()`.

## Vehículos cargados

La aplicación trabaja con los siguientes vehículos:

| Marca | Modelo | Tipo | Característica | Precio |
|---|---|---|---|---:|
| Peugeot | 206 | Automóvil | 4 puertas | $200.000,00 |
| Honda | Titan | Motocicleta | 125 cc | $60.000,00 |
| Peugeot | 208 | Automóvil | 5 puertas | $250.000,00 |
| Yamaha | YBR | Motocicleta | 160 cc | $80.500,50 |

## Funcionalidades implementadas

### 1. Listado de vehículos

Muestra todos los vehículos cargados, utilizando `toString()` para obtener la descripción de cada objeto.

### 2. Vehículo de mayor precio

Utiliza Stream API y `max()` junto con `Comparator.comparingDouble()` para identificar el vehículo más caro.

### 3. Vehículo de menor precio

Utiliza Stream API y `min()` para identificar el vehículo de menor valor.

### 4. Búsqueda por letra Y

Utiliza `filter()` para encontrar los vehículos cuyo modelo contiene la letra Y, sin distinguir entre mayúsculas y minúsculas.

### 5. Ordenamiento por precio descendente

Utiliza `sorted()` y `Comparator.comparingDouble().reversed()` para ordenar los vehículos desde el precio más alto hasta el más bajo.

### 6. Ordenamiento natural

Utiliza `Collections.sort()` para ordenar la colección según el criterio definido en el método `compareTo()` de la clase `Vehiculo`.

El orden establecido es marca, modelo y precio.

## Resultado esperado

Al ejecutar el programa se muestran:

- Los cuatro vehículos cargados.
- El vehículo de mayor precio.
- El vehículo de menor precio.
- El vehículo cuyo modelo contiene la letra Y.
- El listado ordenado por precio descendente.
- El listado ordenado naturalmente por marca, modelo y precio.


Actividad académica – Programación Orientada a Objetos (Java).

Repositorio GitHub:

https://github.com/GastonGrande79/concesionaria



