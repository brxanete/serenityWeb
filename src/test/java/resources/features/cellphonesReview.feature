# language: es
@CELLPHONES_CATEGORY_DEMO
Característica: Modulo categoria de productos


  @VIEW_CELLPHONES_BY_BRAND

  Esquema del escenario: Ver celulares filtrados por marca
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona una marca en categoria celulares
      | marca   |
      | <marca> |
    Entonces Valida encabezado correspondiente a la marca de celular elegida
      | marca   |
      | <marca> |


    Ejemplos:
      | marca |
      | TCL   |
#      | zte      |
#      | iPhone   |
#      | Samsung  |
#      | Kalley   |
#      | TCL      |
#      | Honor    |
#      | Huawei   |
#      | Alcatel  |
#      | TECNO    |
#      | vivo     |
#      | Nokia    |
#      | Motorola |
#      | OPPO     |
#      | Xiaomi   |


  @VIEW_CELLPHONES_BY_STORAGE
  Esquema del escenario: Ver celulares filtrados por almacenamiento
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona un almacenamiento en categoria celulares
      | almacenamiento   |
      | <almacenamiento> |
    Entonces Valida filtro correspondiente al almacenamiento elegido
      | almacenamiento   |
      | <almacenamiento> |


    Ejemplos:
      | almacenamiento |
      | 32 GB          |
      | 64 GB          |
      | 128 GB         |
      | 256 GB         |
      | 512 GB         |
      | 1 Tera         |



  @VIEW_CELLPHONES_BY_RAM
  Esquema del escenario: Ver celulares filtrados por RAM
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona una memoria ram en categoria
      | ram   |
      | <ram> |
    Entonces Valida filtro correspondiente a la ram elegida
      | ram   |
      | <ram> |


    Ejemplos:
      | ram  |
      | 2 GB |



















