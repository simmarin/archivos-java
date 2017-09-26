package escribir;

import java.io.*;


public class Escribir {

    public void escribir(String entrada,String  token){

        /*try {
            FileWriter fstream = new FileWriter("C:\\archivos\\salida.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);

            out.write(entrada);
            out.write(token);
            out.close();
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
*/
        int i;
        try {
            FileWriter fstream = new FileWriter("C:\\archivos\\salida.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.newLine();
            out.write(entrada+"  ");
            out.write(token);
            out.close();
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    }


