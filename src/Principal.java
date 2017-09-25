import leer.LeerEntrada;
import leer.LeerToken;
import comparar.Comparar;
public class Principal {
    public static void main(String[] args) {


        LeerToken l=new LeerToken();
        l.leer("C:\\archivos\\tokens.txt");
        LeerEntrada l2=new LeerEntrada();
        l2.leer("C:\\archivos\\entrada.txt");
        Comparar c=new Comparar();
        System.out.println("patron "+l.matriz[0][0]);
        System.out.println("Entrada "+l2.matriz2[0][0]);

        System.out.println(c.validate(l.matriz,l2.matriz2));

       /*

        if(C.resultado==true) {
            E.escribir(LE.texto,LP.texto);

        }
        else {
            E.escribir(LE.texto,"error");
        }


     System.out.println("Entrada "+leeEntrada.linea);
       System.out.println("Patron "+leeToken.linea);

      System.out.println( compara.validate(leeEntrada.linea,"^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"));
      System.out.println(compara.validate(leeEntrada.linea,leeToken.linea));
*/


    }

}
