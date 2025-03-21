package org.alandoc.util;

import org.alandoc.model.figura.*;
import org.alandoc.model.figura.figura2.*;

public class FiguraFactory
{

    public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado( );
            case ESCALENO:
                return new Escaleno( );
            case ISOSCELES:
                return new Isosceles( );
            case EQUILATERO:
                return new Equilatero( );
            case RECTANGULO:
                return new Rectangulo( );
            case PENTAGONO:
                return new Pentagono( );
            case HEXAGONO:
                return new Hexagono( );
            case CIRCULO:
                return new Circulo( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}