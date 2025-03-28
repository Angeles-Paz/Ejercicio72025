package org.Torres.muciño.emmanuel.figura;

import org.Torres.util.ReadUtil;
import org.Torres.vista.Menu;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public void leerDatos() {
        Menu.menuCuadrado();
        lado = ReadUtil.getInstance().leerInt();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}