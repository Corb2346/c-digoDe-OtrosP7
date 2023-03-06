/*
 * Este programa solicita que ingreses el nombre de un país
 * Posteriormente revisa en su bd si contiene el país y te devuelve 
 * la capital que le corresponde, de lo contrario
 * te avisa que no sabe la capital del país, por lo que 
 * debes agregar la capital del país y el programa 
 * te agradece por "enseñarle" un nuevo país con 
 * una nueva capital
 * */

package codigoDeotroSP7;

import java.util.HashMap;
import java.util.Scanner;//Se importa la libreria para que java utilice el scanner

public class Código7 {
	
	public static void main(String[] args) { //se agrega método main para que funcione el programa
		
    Scanner s = new Scanner(System.in);//Se agrega el system.in para que pueda leer desde teclado

    HashMap<String,String> capitales = new HashMap<>(); //se importa la libreria hashmap
    //se renombra la variable ca por capitales ademas 
    //Se cambia la estructura del hashmap de byte, double a String, String
    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador","San Salvador");//se agrega la capital de El Salvador
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Se reescribe correctamente sting a String

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: "); //se cambia de el in por out para completar el system.out.print
      c = s.nextLine(); // se cambia la lectura de double a String
      
      if (!c.equals("salir")) { //falta una s en equal para que funcione correctamente
        if (capitales.containsValue(c)) { //se renombra ca por capitales
          System.out.print("La capital de " + c); //falta el out para completar la accion de imprimir pantalla
          System.out.println(" es " + capitales.get(c));//se renombra ca por capitales para buscar un valor se utiliza get 
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);//se renombre ca por capitales
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//se reescribe correctamente el wile a while además falta un paréntesis para completar los paréntesis
	s.close();
  }


}