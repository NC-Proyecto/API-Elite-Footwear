# API Elite footwear
<a href="https://ibb.co/vwFRWC6"><img src="https://i.ibb.co/RvFdKGk/homeimg1.png" alt="homeimg1" border="0" /></a>
 
## Stack

![Java Logo](https://img.icons8.com/?size=48&id=13679&format=png) ![Spring Logo](https://img.icons8.com/?size=40&id=2oBx9FpXcbLa&format=png) ![My SQL Logo](https://img.icons8.com/?size=48&id=qGUfLiYi1bRN&format=png)


## Modelado

 Las siguientes clases son los modelos:

* Persona
* Mascota

### Persona
* Long id
* String nombre
* String apellido
* int edad
* List<Mascota> listaMascotas
  
### Mascota
* Long id
* String nombre
* String especie
* String raza
* String color


### Relacion
#### OneToMany
En donde una persona puede tener varias mascotas y varias mascotas pueden pertenecer a una persona.

## Endpoints


#### Lista de personas

```http
  GET localhost:8080/personas/traer
```

#### Crear una persona

```http
  POST localhost:8080/persona/crear
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Eliminar una persona

```http
  DELETE localhost:8080/persona/eliminar/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Actualizar una persona

```http
  PUT  localhost:8080/persona/editar
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |


#### Lista de Mascotas

```http
  GET localhost:8080/mascotas/traer
```

#### Crear una mascota

```http
  POST localhost:8080/mascota/crear
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Eliminar una mascota

```http
  DELETE localhost:8080/mascota/eliminar/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Actualizar una mascota

```http
  PUT  localhost:8080/mascota/editar
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |













