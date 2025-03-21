package org.garbru.model.figura1;

import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;

public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo() {}

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {return diagonalMayor;    }

    public void setDiagonalMayor(double diagonalMayor) {this.diagonalMayor = diagonalMayor;    }

    public double getDiagonalMenor() {return diagonalMenor;    }

    public void setDiagonalMenor(double diagonalMenor) {this.diagonalMenor = diagonalMenor;    }

    @Override
    public double perimetro() {
        return (diagonalMayor + (diagonalMenor * 2)) / 2;    }

    @Override
    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;}

    @Override
    public void leeDatos() {
        Menu.leeDiagonalMayor();
        diagonalMayor = ReadUtil.readInt();
        Menu.leeDiagonalMenor();
        diagonalMenor = ReadUtil.readInt();
    }
}