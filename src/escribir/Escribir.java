package escribir;

import java.io.*;


public class Escribir {

    public void escribir(String dato){
        File archivo;
        try{
            archivo=new File("C:\\archivos\\Archivo.txt");
            if ( archivo.createNewFile())
            {
                System.out.println("se creo archivo en la concha de tu hermana");

            }
FileWriter e=new FileWriter(archivo);
            e.write(dato);
            e.close();

        } catch (IOException e)
        {
            System.out.println("no se ha creado por imbecil");
        }

    }

}
