package comparar;
import java.util.regex.*;
import leer.LeerToken;
import  leer.LeerEntrada;

public class Comparar {


    public static boolean validate( String patron[][],String Entrada[][]) {


        String PATTERN_EMAIL ="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        //String PATTERN_EMAIL =(patron[0][0]);

                Pattern pattern = Pattern.compile(PATTERN_EMAIL);


        Matcher matcher = pattern.matcher(Entrada[0][0]);
        return matcher.matches();


    }
}

