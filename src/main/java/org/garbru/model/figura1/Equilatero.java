package org.garbru.model.figura1;

import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;

public class Equilatero extends Triangulo {

    public Equilatero()     {}

    protected double lado1;

    public Equilatero(double base, double altura, double lado1)    {
        super(base, altura);
        this.lado1 = lado1;
    }

    public double getLado1() {return lado1;}

    public void setLado1(double lado1)    {this.lado1 = lado1;}


    @Override
    public double perimetro() {
        return lado1 * 3;
    }

    @Override
    public void leeDatos()    {
        super.leeDatos();
        Menu.leeLado1( );
        lado1 = ReadUtil.readInt( );
    }
}