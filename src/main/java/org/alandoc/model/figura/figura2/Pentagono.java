package org.alandoc.model.figura.figura2;

import org.alandoc.model.figura.Cuadrado;
import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

public class Pentagono extends Cuadrado {

    public Pentagono() {
    }
    protected double apotema;

    public Pentagono(double apotema) {
        this.apotema = apotema;
    }

    public Pentagono(double lado, double apotema) {
        super(lado);
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return ((5*lado)*apotema)/2;
    }

    @Override
    public double perimetro() {
        return 5*lado;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();

    }

    @Override
    public double getLado() {
        return super.getLado();
    }

    @Override
    public void setLado(double lado) {
        super.setLado(lado);
    }
}

