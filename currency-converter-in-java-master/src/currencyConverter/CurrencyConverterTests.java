package currencyConverter;
import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CurrencyConverterTests {


    ArrayList<currencyConverter.Currency> validCurrs = Currency.init();
    @Test
    public void mainWindowCurrencyTest(){


/*        Les 3 classes d'equivalences pour les montants sont
         M1 = [0, 1M]
         M2 = [1M+1, +inf]
         M3 = [-inf, -1]
*/

        //Test avec devise mal entree pour verifier notre hypothese
        Double test1 = MainWindow.convert("US Dollar", "Eurro", validCurrs, 100000.0);
        Assert.assertEquals(0.0, test1, 0.00001);

        //Test avec valeur frontiere comme montant
        Double valFront = MainWindow.convert("US Dollar", "Euro", validCurrs, -1.0);
//        Assert.assertEquals(0.0, valFront, 0.00001);

        Double valFront2 = MainWindow.convert("US Dollar", "Euro", validCurrs, 1000001.0);
//        Assert.assertEquals(0.0, valFront2, 0.00001);


        //Test avec valeur typique comme montant
        Double valTyp = MainWindow.convert("US Dollar", "Euro", validCurrs, 100000.0);
        Assert.assertEquals(93000.0, valTyp, 0.00001);

    }


    @Test
    public void currencyConvert() {


    }




}
