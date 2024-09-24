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


  @VIEW_CELLPHONES_BY_SCREEN
  Esquema del escenario: Ver celulares filtrados por pantalla
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona un tamanio de pantalla en categoria celulares
      | tamanioPantalla   |
      | <tamanioPantalla> |
    Entonces Valida filtro correspondiente al tamanio de pantalla elegido
      | tamanioPantalla   |
      | <tamanioPantalla> |


    Ejemplos:
      | tamanioPantalla |
      | De 6.1' a 8'    |
      | De 4.1' a 5'    |
      | De 3.1' a 4'    |

  @VIEW_CELLPHONES_BY_BACKCAMERA
  Esquema del escenario: Ver celulares filtrados por camara trasera
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Selecciona una camara trasera en categoria celulares
      | camaraTrasera   |
      | <camaraTrasera> |
    Entonces Valida filtro correspondiente a la camara elegida
      | camaraTrasera   |
      | <camaraTrasera> |


    Ejemplos:
      | camaraTrasera |



















