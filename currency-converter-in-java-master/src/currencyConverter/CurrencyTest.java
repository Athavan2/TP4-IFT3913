package currencyConverter;
import org.junit.Assert;
import org.junit.Test;

public class CurrencyTest {


    @Test // a boite noire
    public void currencyConvert() {
        double test1 = Currency.convert(-500d, 0.85d);
        Assert.assertEquals(0.0, test1, 0.00001);

        double test2 = Currency.convert(-500d, 0.-85d);
        Assert.assertEquals(0.0, test2, 0.00001);

    }

    //Pour les tests a boite blanche, nous allons utiliser les criteres suivants:
    //1. Couverture des instructions
    //2. Couverture des conditions

    @Test
    public void currencyConvertCodeCoverage(){

    }

    @Test
    public void currencyConvertConditionCoverage() {

    }




}
