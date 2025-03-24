package org.Angeles.model.figura3;

import org.Angeles.model.figura.Figura;
import org.Angeles.util.ReadUtil;
import org.Angeles.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double perimetro() {
        return (2 * radio) * Math.PI;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio = ReadUtil.getInstance().leerDouble();
    }
}
