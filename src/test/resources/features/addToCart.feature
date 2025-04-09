# language: es
@ADD_TO_CART_DEMO
Característica: Modulo carro de compras

  @ADD_CELLPHONE_TO_CART
  Esquema del escenario: Agregar producto al carro de compra
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona un almacenamiento en categoria celulares
      | almacenamiento   |
      | <almacenamiento> |
    Entonces Valida filtro correspondiente al almacenamiento elegido
      | almacenamiento   |
      | <almacenamiento> |
    Cuando Agrega al carro de compra el primer producto de la lista


    Ejemplos:
      | almacenamiento |
      | 64 GB          |















