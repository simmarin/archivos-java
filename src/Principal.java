import escribir.Escribir;
import leer.LeerEntrada;
import leer.LeerToken;
import comparar.Comparar;
public class Principal {
    public static void main(String[] args) {
        LeerToken ltoken=new LeerToken();
        ltoken.leer("C:\\archivos\\tokens.txt");
        LeerEntrada lentrada=new LeerEntrada();
        lentrada.leer("C:\\archivos\\entrada.txt");
        Comparar c=new Comparar();
        Escribir E=new Escribir();

        ////////EMAIL
        c.valida("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",ltoken.matriz,"email", lentrada.matriz2);
        System.out.println("entrada: "+c.entrada+" nombre del token: "+c.nomToken);
        E.escribir(c.entrada,c.nomToken);

        ////////CURP
        c.valida( "[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]",ltoken.matriz,"curp", lentrada.matriz2);
        System.out.println("entrada: "+c.entrada+" nombre del token: "+c.nomToken);
        E.escribir(c.entrada,c.nomToken);
    }

}
