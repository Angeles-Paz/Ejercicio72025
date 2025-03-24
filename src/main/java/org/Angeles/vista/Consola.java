package org.Angeles.vista;

import org.Angeles.model.figura.Figura;
import org.Angeles.model.figura.Equilatero;
import org.Angeles.model.figura2.Isosceles;
import org.Angeles.model.figura2.Escaleno;
import org.Angeles.model.figura3.Circulo;
import org.Angeles.model.figura.Cuadrado;
import org.Angeles.model.figura3.Rectangulo;
import org.Angeles.model.figura3.Pentagono;
import org.Angeles.model.figura3.Rombo;
import org.Angeles.util.ReadUtil;
import org.gerdoc.historial.Historiales;

public class Consola implements Ejecutable {
    private static Consola consola;
    private Historiales historiales;

    private Consola() {
    }

    public static Consola getInstance() {
        if (consola == null) {
            consola = new Consola();
        }
        return consola;
    }

    @Override
    public void run() {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;
        while (flag) {
            figura = null;
            Menu.principal();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    figura = new Equilatero();
                    break;
                case 2:
                    figura = new Isosceles();
                    break;
                case 3:
                    figura = new Escaleno();
                    break;
                case 4:
                    figura = new Circulo();
                    break;
                case 5:
                    figura = new Cuadrado();
                    break;
                case 6:
                    figura = new Rectangulo();
                    break;
                case 7:
                    figura = new Pentagono();
                    break;
                case 8:
                    figura = new Rombo();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (figura != null) {
                ((SolicitaDatos) figura).leerDatos();
                Menu.print(figura);
                historiales.addFigura(figura);
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}
