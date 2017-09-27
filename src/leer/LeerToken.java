package leer;
import java.io.*;
import  java.util.*;

public class LeerToken {
    public String matriz[][]= new String[5][1];

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
                    matriz[h][j]=a[j];
                }
                h++;
            }

            System.out.print ("NOMBRE TOKEN\n\n");
            for (int j= 0; j <matriz.length; j++) {

                for(int o= 0; o <matriz[0].length; o++) {

                   System.out.print(matriz[j][o] + " ");

                }
               System.out.println();
            }
        }
        catch(IOException e){

            System.out.println(e);
        }

    }

}







