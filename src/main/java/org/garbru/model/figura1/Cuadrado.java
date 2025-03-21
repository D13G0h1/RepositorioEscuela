package org.garbru.model.figura1;

import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;

public class Cuadrado extends Figura
{
    protected double ladoA;

    public Cuadrado()    {    }

    public Cuadrado(double lado)
    {
        this.ladoA = ladoA;
    }

    public double getLado() {
        return ladoA;
    }

    public void setLado(double lado) {
        this.ladoA = ladoA;
    }

    @Override
    public double area()
    {
        return ladoA*ladoA;
    }

    @Override
    public double perimetro()
    {
        return ladoA*4;
    }

    @Override
    public void leeDatos()    {
        Menu.leeLadoA( );
        ladoA = ReadUtil.readInt( );
    }
}