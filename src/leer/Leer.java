package leer;
import java.io.*;

public class Leer
{
    public String leer(String direccion)
    {
        String texto="";
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String temp="";
        String bfread="";
        while ((bfread=bf.readLine())!=null){
            temp=temp+bfread;
        }
            texto=temp;
        }catch (Exception e)
        {
          System.out.println("no se encontró tu archivo de mierda");
        }
    return  texto;

    }

}

