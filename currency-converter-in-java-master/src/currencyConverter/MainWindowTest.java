package currencyConverter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.*;
public class MainWindowTest {
    MainWindow mw = new MainWindow();

    @Test
    public boolean currencyTest(){
        //On definit la classe d'equi. des valeurs valides.
        ArrayList<String> validCurr = new ArrayList<>(
                Arrays.asList( "USD", "CAD", "GBP", "EUR", "CHF", "AUD"));
        //Une autre classe d’équivalence pour les valeurs d’entrées invalides.
        ArrayList<String> invalidCurr = new ArrayList<>(
                Arrays.asList("RUB", "DZD", "JPY", "ZWD" ));

/*        Les 3 classes d'equivalences pour les montants sont
         M1 = [0, 1M]
         M2 = [1M+1, +inf]
         M3 = [-inf, -1]
*/
        //Jeu de test exemple
        // ["USD", "RUB", 500k, 0, 1M, 1M+1, -1, 1M+500, -9000]
        return false;
    }

}
