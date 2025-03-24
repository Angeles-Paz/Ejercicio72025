package org.Torres.muciño.emmanuel.figura.curvas;

import org.Torres.muciño.emmanuel.figura.Figura;
import org.Torres.util.ReadUtil;
import org.Torres.vista.Menu;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(radio, 2));
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuRadio();
        radio = ReadUtil.getInstance().leerInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
