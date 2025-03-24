package org.Angeles.model.figura3;

import org.Angeles.model.figura.Figura;
import org.Angeles.util.ReadUtil;
import org.Angeles.vista.Menu;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public void leerDatos() {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerDouble();
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerDouble();
    }
}