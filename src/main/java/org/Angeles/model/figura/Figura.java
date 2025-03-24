package org.Angeles.model.figura;

import org.Angeles.vista.SolicitaDatos;

public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos {

    public Figura() {
    }

    public abstract double area();

    public abstract double perimetro();
}