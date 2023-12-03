package test;
import currencyConverter.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrencyTest {


    @Test // a boite noire
    public void currencyConvert() {
        double test1 = Currency.convert(-500d, 0.85d);
        Assertions.assertEquals(0.0, test1, 0.00001);

        double test2 = Currency.convert(-500d, 0.-85d);
        Assertions.assertEquals(0.0, test2, 0.00001);

    }

    //Pour les tests a boite blanche, nous allons utiliser le critere suivant:
    //1. Couverture des instructions
    @Test
    public void currencyConvertCodeCoverage(){
        // Test pour couvrir différentes parties de la méthode convert
        //On verifie pour chacun que le resultat n'est pas nul et qu'il est arrondi
        //afin d'avoir la confirmation que chaque ligne du code fut exectuee

        // D1 = {(amount > 0, exchange > 0)}
        Double result1 = Currency.convert(100.0, 0.93);
        Assertions.assertNotNull(result1);
        Assertions.assertEquals(Math.round((100.0 * 0.93 * 100d) / 100d), result1, 0.0001);

        // D2 = {(amount = 0, exchange > 0)}
        Double result2 = Currency.convert(0.0, 0.93);
        Assertions.assertNotNull(result2);
        Assertions.assertEquals(Math.round((0.0 * 0.93 * 100d) / 100d), result2, 0.0001);

        // D3 = {(amount < 0, exchange > 0)}
        Double result3 = Currency.convert(-50.0, 0.93);
        Assertions.assertNotNull(result3);
        Assertions.assertEquals(Math.round((-50.0 * 0.93 * 100d) / 100d), result3, 0.0001);


    }





}
