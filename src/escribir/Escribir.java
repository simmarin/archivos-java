package escribir;

import java.io.*;


public class Escribir {

    public void escribir(String entrada,String  token){
        File archivo;
        try{
            archivo=new File("C:\\archivos\\salida.txt");
            if ( archivo.createNewFile())
            {
                System.out.println("se creo archivo ");

            }
          FileWriter e=new FileWriter(archivo);
            e.write(entrada);
            e.write(token);
            e.close();

        } catch (IOException e)
        {
            System.out.println("no se ha creado ");
        }

    }

}
