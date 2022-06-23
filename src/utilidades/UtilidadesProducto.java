package utilidades;

import bebidas.Agua;
import bebidas.Alcohol;
import bebidas.Refrescos;
import java.util.ArrayList;
import pojo.Producto;
import postres.Helado;
import postres.Pastel;
import postres.Tarta;

public class UtilidadesProducto {

    public static ArrayList<Producto> llenarComida() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("01", "De Res", "80");
        Producto Pollo = new Producto("02", "De Pollo", "60");
        Producto Tocino = new Producto("03", "De tocino", "80");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;
    }

    public static ArrayList<Producto> llenartacos() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("01", "De suadero", "16");
        Producto Pollo = new Producto("02", "De pastor", "15");
        Producto Tocino = new Producto("03", "De carnitas", "12");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;

    }

    public static ArrayList<Producto> llenarhambu() {
        ArrayList<Producto> ListaComida = new ArrayList<>();
        Producto Res = new Producto("01", "De Res", "80");
        Producto Pollo = new Producto("02", "De Pollo", "60");
        Producto Tocino = new Producto("03", "De tocino", "75");

        ListaComida.add(Res);
        ListaComida.add(Pollo);
        ListaComida.add(Tocino);
        return ListaComida;

    }

    public static ArrayList<Producto> llenarAlcohol() {
        ArrayList<Producto> ListaAlcohol = new ArrayList<>();
        Producto Res = new Producto("01", "Cerveza", "40");
        Producto Pollo = new Producto("02", "Tequila", "30");
        Producto Tocino = new Producto("03", "Whisky", "20");

        ListaAlcohol.add(Res);
        ListaAlcohol.add(Pollo);
        ListaAlcohol.add(Tocino);
        return ListaAlcohol;
    }

    public static ArrayList<Producto> llenarAgua() {
        ArrayList<Producto> ListaAgua = new ArrayList<>();
        Producto Res = new Producto("01", "Jamaica", "35");
        Producto Pollo = new Producto("02", "Tamarindo", "30");
        Producto Tocino = new Producto("03", "Limon", "40");

        ListaAgua.add(Res);
        ListaAgua.add(Pollo);
        ListaAgua.add(Tocino);
        return ListaAgua;
    }

    public static ArrayList<Producto> llenarRefresco() {
        ArrayList<Producto> ListaRefrescos = new ArrayList<>();
        Producto Res = new Producto("01", "Manzanita", "45");
        Producto Pollo = new Producto("02", "Coca cola", "30");
        Producto Tocino = new Producto("03", "Fanta", "40");
        ListaRefrescos.add(Res);
        ListaRefrescos.add(Pollo);
        ListaRefrescos.add(Tocino);
        return ListaRefrescos;
    }

    public static ArrayList<Producto> llenarHelado() {
        ArrayList<Producto> ListaHelado = new ArrayList<>();
        Producto Res = new Producto("01", "De vainilla", "45");
        Producto Pollo = new Producto("02", "De chocolate", "35");
        Producto Tocino = new Producto("03", "DE fresa", "50");
        ListaHelado.add(Res);
        ListaHelado.add(Pollo);
        ListaHelado.add(Tocino);
        return ListaHelado;
    }

    public static ArrayList<Producto> llenarPastel() {
        ArrayList<Producto> ListaPastel = new ArrayList<>();
        Producto Res = new Producto("01", "De chocolate", "50");
        Producto Pollo = new Producto("02", "Tres leches", "60");
        Producto Tocino = new Producto("03", "Fresa", "40");
        ListaPastel.add(Res);
        ListaPastel.add(Pollo);
        ListaPastel.add(Tocino);
        return ListaPastel;
    }

    public static ArrayList<Producto> llenarTarta() {
        ArrayList<Producto> ListaTarta = new ArrayList<>();
        Producto Res = new Producto("01", "De queso", "80");
        Producto Pollo = new Producto("02", "De manzana", "60");
        Producto Tocino = new Producto("03", "De limon", "45");
        ListaTarta.add(Res);
        ListaTarta.add(Pollo);
        ListaTarta.add(Tocino);
        return ListaTarta;
               
    }
}
