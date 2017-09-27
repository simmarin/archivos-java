import escribir.Escribir;
import leer.LeerEntrada;
import leer.LeerToken;
import comparar.Comparar;
import leer.patron;
public class Principal {
    public static void main(String[] args) {
        LeerToken ltoken=new LeerToken();
        ltoken.leer("C:\\archivos\\tokens.txt");
        LeerEntrada lentrada=new LeerEntrada();
        lentrada.leer("C:\\archivos\\entrada.txt");
        patron lpatron=new patron();
        lpatron.leerPatron();
        Comparar c=new Comparar();
        Escribir E=new Escribir();

        ////////EMAIL
       c.valida(lpatron.matriz3[0][0],lentrada.matriz2,ltoken.matriz,"email");
        System.out.println("entrada  "+c.entrada+" "+"  "+c.resultado+"  "+ "nombre del token: "+c.nomToken);
        E.escribir(c.entrada,c.nomToken);
        ///////RFC

        c.valida(lpatron.matriz3[1][0],lentrada.matriz2,ltoken.matriz,"rfc");
        System.out.println("entrada  "+c.entrada+"  "+" "+c.resultado+" "+ "nombre del token: "+c.nomToken);
        E.escribir(c.entrada,c.nomToken);



    }
}
