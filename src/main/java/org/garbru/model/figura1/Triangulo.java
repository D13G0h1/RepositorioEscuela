package org.garbru.model.figura1;

import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;

public abstract class Triangulo extends Figura {

    public Triangulo()    {}

    protected double base;
    protected double altura;

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }

    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leeDatos( )
    {
        Menu.leeBase( );
        base = ReadUtil.readInt( );
        Menu.leeAltura( );
        altura = ReadUtil.readInt( );
    }
}