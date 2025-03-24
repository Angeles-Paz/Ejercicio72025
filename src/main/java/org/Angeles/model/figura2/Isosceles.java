package org.Angeles.model.figura2;

import org.Angeles.model.figura.Equilatero;
import org.Angeles.util.ReadUtil;
import org.Angeles.vista.Menu;

public class Isosceles extends Equilatero {
    protected double lado2;

    public Isosceles() {
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro() {
        return lado1 + 2 * lado2;
    }

    @Override
    public void leerDatos() {
        super.leerDatos();
        Menu.menuLado2();
        lado2 = ReadUtil.getInstance().leerDouble();
    }
}
