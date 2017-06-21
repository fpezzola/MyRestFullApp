# MyRestFullApp

La aplicacion se despliega en el puerto 8080 y el contextPath es "MyRestFullApp" Ejemplo: localhost:8080/MyRestFullApp/
--------------------------------------------
CONFIGURACION DEL DATASOURCE Y BASE DE DATOS

en src/main/resources

Se encuntra el application.properties donde se podran configurar la url de la base de datos, el usuario y contraseña. Asi tambien, es posible configurar el context-path de la app y la uri que se utilizara para consumir el servicio del dolar.
---------------------------------------------
Para el punto Nro 1 consultar los servicios:

localhost:8080/MyRestFullApp/Cotizacion/dolar --> cotizacion del dolar consumiento el servicio del banco provincia localhost:8080/MyRestFullApp/Cotizacion/pesos --> 401 unauthorized localhost:8080/MyRestFullApp/Cotizacion/real ---> 401 unauthorized

**Aclaracion: El servicio no tiene en cuenta el case sensitive en cuanto a la palabra dolar, pesos o real. Es posible escribir Dolar-DOLAR-DoLaR ... etc.
--------------------------------------------
Para el punto Nro 2:

Deje un script en el raiz del proyecto: script.sql que genera el schema, la tabla y corre unos insert de usuarios para las pruebas.

El servicio se consulta como:

localhost:8080/MyRestFullApp/usuarios --> devuelve un json con los usuarios de la base.
---------------------------------------------
Para el punto numero 3:

Los test realizados estan en src/test/java/com/MyRestFullApp/

service/UserServiceTest --> prueba los metodos de la capa de servicio de los usuarios. business/DolarBusinessTest --> prueba el webserviceDAO que se conecta con el BancoProvincia para obtener la cotizacion del dolar.
----------------------------------------------
Para el punto numero 4:

link de github: https://github.com/fpezzola/MyRestFullApp
