package org.Angeles.model.figura3;

import org.Angeles.model.figura.Figura;
import org.Angeles.util.ReadUtil;
import org.Angeles.vista.Menu;

public class Rombo extends Figura {

    private double diagMayor;
    private double diagMenor;
    private double lado;

    public void setDiagMayor(double diagMayor) {
        this.diagMayor = diagMayor;
    }

    public void setDiagMenor(double diagMenor) {
        this.diagMenor = diagMenor;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Rombo() {
    }

    @Override
    public double area() {
        return (diagMayor * diagMenor) / 2;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void leerDatos() {
        Menu.menuDiagMayor();
        diagMayor = ReadUtil.getInstance().leerDouble();
        Menu.menuDiagMenor();
        diagMenor = ReadUtil.getInstance().leerDouble();
        Menu.menuLado();
        lado = ReadUtil.getInstance().leerDouble();
    }
}