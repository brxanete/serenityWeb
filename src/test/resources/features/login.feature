# language: es
@LOGIN_DEMO
Característica: Modulo inicio de sesión

  @CORRECT_LOGIN
  Esquema del escenario: Iniciar sesión correctamente en Ktronix
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Verifica correo electronico
      | correoElectronico   |
      | <correoElectronico> |
    Cuando Se autentica ingresando clave
      | contrasena   |
      | <contrasena> |
    Entonces Valida el inicio de sesion con su correo
      | correoElectronico   |
      | <correoElectronico> |

    Ejemplos:
      | correoElectronico            | contrasena      |
      | pruebas.corbetantt@gmail.com | 1234Contrasena! |



  @INCORRECT_PASSWORD
  Esquema del escenario: Iniciar sesión incorrectamente en Ktronix
    Dado Que el usuario ingresa a Ktronix.com
    Cuando Verifica correo electronico
      | correoElectronico   |
      | <correoElectronico> |
    Cuando Se autentica ingresando clave
      | contrasena   |
      | <contrasena> |
    Entonces Valida mensaje de error por contraseña incorrecta

    Ejemplos:
      | correoElectronico            | contrasena           |
      | pruebas.corbetantt@gmail.com | contrasenaIncorrecta |












