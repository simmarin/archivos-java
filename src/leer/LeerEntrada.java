package leer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerEntrada {
    public String matriz2[][]= new String[5][1];

    public void  leer(String archivo){
        FileReader fr=null;
        BufferedReader br=null;
        try {
            File arch = new File (archivo);

            fr = new FileReader (archivo);

            br = new BufferedReader(fr);

            String linea;
            String delimiter = ";" ;

            int h=0;
            String a[]=new String[10];
            while(((linea=br.readLine())!=null)&& (h<5)) {

                a=linea.split(delimiter);
                for(int j=0;j<a.length;j++)
                {
                    matriz2[h][j]=a[j];
                }
                h++;
            }

            System.out.print ("ENTRADAS\n\n");
            for (int j= 0; j <matriz2.length; j++) {

                for(int o= 0; o <matriz2[0].length; o++) {

                    System.out.print(matriz2[j][o] + " ");

                }
                System.out.println();
            }
        }
        catch(IOException e){

            System.out.println(e);
        }

    }

}






