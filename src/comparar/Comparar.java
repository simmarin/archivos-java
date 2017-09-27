package comparar;
import java.util.regex.*;


public class Comparar {
    public boolean resultado;
    public String entrada;
    public String nomToken;
    public String nomAcept;

    public void valida( String patron,String archivoEntrada[][],String archivoToken[][],String nToken) {
        String PATTERN_EMAIL =(patron);
        //String PATTERN_EMAIL =(patron[0][0]);
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);


        for (int j= 0; j <archivoEntrada.length; j++) {

            for(int o= 0; o <archivoEntrada[0].length; o++) {

                Matcher matcher = pattern.matcher(archivoEntrada[j][o]);
                boolean mtemp= matcher.matches();
                String posiciontemp=archivoEntrada[j][o];

                if(mtemp==true) {
                    entrada=posiciontemp;
                    resultado=mtemp;
                    for (int m= 0; m <archivoToken.length; m++) {

                        for(int n= 0; n <archivoToken[0].length; n++) {
                            boolean ntemp= new String(nToken).equals(archivoToken[m][n]);
                            String postemp=archivoToken[m][n];

                            if(ntemp==true) {
                               nomToken=postemp;
                            }
                        }
                    }
                }

                }

                }
            }
        }







