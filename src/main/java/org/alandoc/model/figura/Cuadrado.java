package org.alandoc.model.figura;

import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

/**
 * 
 */
public class Cuadrado extends Figura
{

    protected double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado = ReadUtil.readDouble();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}