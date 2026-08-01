# Justificación técnica

## Stack

Elegí Java porque es un lenguaje orientado a objetos muy usado y facilita la separación de responsabilidades. Además, contando con el tiempo que se disponía era muy útil trabajar con él de manera que se garantizzara la creación de el CRUD funcional.

## Organización

El proyecto está dividido en:

- entities
- services
- database

De esta manera la entidad representa el modelo, el servicio contiene la lógica de negocio y el archivo JSON sirve como ejemplo de persistencia.

## Validaciones

Se implementaron validaciones para impedir:

- IDs inválidos.
- Precios negativos.
- Stock negativo.
- Nombre vacío.
- Categoría vacía.
- IDs duplicados.

## Retos

Los principales retos fueron: mantener el código organizado, aplicar de manera correcta las operaciones CRUD, saber como organizar el tiempo y llevar de manera simultanea el trabajo con git y github. Pero se logró con mucha estrategia y concocimientos base que se han adquirido con el tiempo.