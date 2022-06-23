/**
 *Nombre del autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación: 16/05/2021
 *Última fecha de actualización: 21/05/2021
 *Descripción de la clase: Aquí es donde se guardan las listas de 
 * todos los productos
 */
package utilidades;

import java.util.ArrayList;
import pojo.Producto;

//lista de productos
public class UtilidadesProducto {

    public static ArrayList<Producto> llenarComida() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("01", "Con albóndigas", "80");
        Producto Pollo = new Producto("02", "De cuatro quesos", "60");
        Producto Tocino = new Producto("03", "A la boloñesa", "80");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;
    }

    public static ArrayList<Producto> llenartacos() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("04", "De suadero", "16");
        Producto Pollo = new Producto("05", "De pastor", "15");
        Producto Tocino = new Producto("06", "De carnitas", "12");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;

    }

    public static ArrayList<Producto> llenarhambu() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("07", "De Res", "80");
        Producto Pollo = new Producto("08", "De Pollo", "60");
        Producto Tocino = new Producto("09", "De tocino", "75");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;

    }

    public static ArrayList<Producto> llenarAlcohol() {
        ArrayList<Producto> ListaAlcohol = new ArrayList<>();
        Producto Res = new Producto("10", "Cerveza", "40");
        Producto Pollo = new Producto("11", "Tequila", "30");
        Producto Tocino = new Producto("12", "Whisky", "20");

        ListaAlcohol.add(Res);
        ListaAlcohol.add(Pollo);
        ListaAlcohol.add(Tocino);
        return ListaAlcohol;
    }

    public static ArrayList<Producto> llenarAgua() {
        ArrayList<Producto> ListaAgua = new ArrayList<>();
        Producto Res = new Producto("13", "Jamaica", "35");
        Producto Pollo = new Producto("14", "Tamarindo", "30");
        Producto Tocino = new Producto("15", "Limon", "40");

        ListaAgua.add(Res);
        ListaAgua.add(Pollo);
        ListaAgua.add(Tocino);
        return ListaAgua;
    }

    public static ArrayList<Producto> llenarRefresco() {
        ArrayList<Producto> ListaRefrescos = new ArrayList<>();
        Producto Res = new Producto("16", "Manzanita", "45");
        Producto Pollo = new Producto("17", "Coca cola", "30");
        Producto Tocino = new Producto("18", "Fanta", "40");
        ListaRefrescos.add(Res);
        ListaRefrescos.add(Pollo);
        ListaRefrescos.add(Tocino);
        return ListaRefrescos;
    }

    public static ArrayList<Producto> llenarHelado() {
        ArrayList<Producto> ListaHelado = new ArrayList<>();
        Producto Res = new Producto("19", "De vainilla", "45");
        Producto Pollo = new Producto("20", "De chocolate", "35");
        Producto Tocino = new Producto("21", "DE fresa", "50");
        ListaHelado.add(Res);
        ListaHelado.add(Pollo);
        ListaHelado.add(Tocino);
        return ListaHelado;
    }

    public static ArrayList<Producto> llenarPastel() {
        ArrayList<Producto> ListaPastel = new ArrayList<>();
        Producto Res = new Producto("22", "De chocolate", "50");
        Producto Pollo = new Producto("23", "Tres leches", "60");
        Producto Tocino = new Producto("24", "Fresa", "40");
        ListaPastel.add(Res);
        ListaPastel.add(Pollo);
        ListaPastel.add(Tocino);
        return ListaPastel;
    }

    public static ArrayList<Producto> llenarTarta() {
        ArrayList<Producto> ListaTarta = new ArrayList<>();
        Producto Res = new Producto("25", "De queso", "80");
        Producto Pollo = new Producto("26", "De manzana", "60");
        Producto Tocino = new Producto("27", "De limon", "45");
        ListaTarta.add(Res);
        ListaTarta.add(Pollo);
        ListaTarta.add(Tocino);
        return ListaTarta;
               
    }
}
