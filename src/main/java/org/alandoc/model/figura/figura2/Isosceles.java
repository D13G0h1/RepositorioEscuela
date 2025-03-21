package org.alandoc.model.figura.figura2;

import org.alandoc.model.figura.Equilatero;
import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles()
    {
    }

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public double getLado2()
    {
        return lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro()
    {
        return 2*lado1+ lado2;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readDouble();
    }
}
