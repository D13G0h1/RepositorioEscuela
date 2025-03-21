package org.garbru.vista;

import org.garbru.model.figura1.*;
import org.garbru.util.FiguraFactory;
import org.garbru.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        FiguraEnum figuraEnum = null;
        Figura figura = null;
        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            figuraEnum = FiguraEnum.getFiguraEnumById( opcion );

            if( FiguraEnum.SALIR.equals( figuraEnum ) )
            {
                flag = false;
            }
            if( FiguraEnum.OPCION_ERRONEA.equals( figuraEnum ) )
            {
                Menu.opcionInvalida( );
            }

            figura = FiguraFactory.getFiguraByFiguraEnum( figuraEnum );
            if( figura != null )
            {
                ((SolicitaDatos)figura).leeDatos( );
                Menu.calcula( figura );
                if( historiales != null )
                {
                    historiales.addFigura( figura );
                }
            }
        }

    }

    @Override
    public void addHistoriales(Historiales historiales)
    {
        this.historiales = historiales;
    }
}
