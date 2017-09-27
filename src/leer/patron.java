package leer;

public class patron {
    public String matriz3[][]= new String[5][1];
    public void  leerPatron(){

        matriz3[0][0] = new String("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        matriz3[1][0]= new String("[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]");
        matriz3[2][0]= new String("SsXCa");
        matriz3[3][0]= new String("SsXCa");
        matriz3[4][0]= new String("SsXCa");

    }

}
