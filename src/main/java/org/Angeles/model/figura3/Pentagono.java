package org.Angeles.model.figura3;

import org.Angeles.model.figura.Figura;
import org.Angeles.util.ReadUtil;
import org.Angeles.vista.Menu;

public class Pentagono extends Figura {

    private double lado;
    private double apotema;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Pentagono() {
    }

    @Override
    public double area() {
        return (perimetro() * apotema) / 2;
    }

    @Override
    public double perimetro() {
        return (5 * lado);
    }

    @Override
    public void leerDatos() {
        Menu.menuLado();
        lado = ReadUtil.getInstance().leerDouble();
        Menu.menuApotema();
        apotema = ReadUtil.getInstance().leerDouble();
    }
}