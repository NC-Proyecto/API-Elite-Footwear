# API Elite footwear
<a href="https://ibb.co/vwFRWC6"><img src="https://i.ibb.co/RvFdKGk/homeimg1.png" alt="homeimg1" border="0" /></a>
 
## Stack

![Java Logo](https://camo.githubusercontent.com/a363b1646fc174ef8a1bdac7693c4c6952d0fccbe68550211c7e4be8d26f4d65/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4a6176612d25323532334544384230302e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d6f7261636c65266c6f676f436f6c6f723d72656426636f6c6f723d7768697465) 

![Springboot](https://camo.githubusercontent.com/c2a58428fe9b38967494da3b0a098f1d28f9cc395e3bbf123cbc14fb36bc1b07/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f737072696e672d2532333644423333462e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d737072696e67266c6f676f436f6c6f723d7768697465)

![Hibernate](https://camo.githubusercontent.com/3cfd3a68bd2a9a7a46bfb2baac67777f164122d1c8d5947eddd465442b588037/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f48696265726e6174652d3539363636433f7374796c653d666f722d7468652d6261646765266c6f676f3d48696265726e617465266c6f676f436f6c6f723d7768697465)

![PostgreSQL](https://camo.githubusercontent.com/aaf7d409d95158427f9389c20305d66299f4e15d96bfa9d4f0792b21ad01e327/68747470733a2f2f696d672e736869656c64732e696f2f7374617469632f76313f7374796c653d666f722d7468652d6261646765266d6573736167653d506f737467726553514c26636f6c6f723d343136394531266c6f676f3d506f737467726553514c266c6f676f436f6c6f723d464646464646266c6162656c3d)




## Models

### Product
* Long id
* String name
* Category category
* String price
* String image

### Category
* Long id
* String name
* List<Product>products;

#### Relation
A product has a category, and a category can be in multiple products

## Endpoints


#### List of categories

```http
  GET localhost:8080/api/category
```

#### Create a category

```http
  POST localhost:8080/api/category
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Delete a category

```http
  DELETE localhost:8080/api/category/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Update a category

```http
  PUT  localhost:8080/api/category
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |


#### List of products

```http
  GET localhost:8080/api/product
```

#### Create a product

```http
  POST localhost:8080/api/product
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un objeto para crear un registro | **Objeto por Body**        |

#### Delete a product

```http
  DELETE localhost:8080/mascota/eliminar/{id}
```

| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se requiere un id para eliminar un registro | **Id de tipo Long**        |


#### Update a product

```http
  PUT  localhost:8080/api/product
```
| Descripcion              | Requerido                      |
| :--------------------- | :----------------------------- |
| Se edita un registro ya creado | **Objeto por Body**        |













