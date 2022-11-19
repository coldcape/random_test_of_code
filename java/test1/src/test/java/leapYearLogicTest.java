import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/*
Akseptansekriterier:

Et år er et skuddår

- Når det er delelig med 4, men ikke 100
- Når det er delelig med 400 (For eksempel var år 2000 et skuddår)
- Et år er ikke et skuddår

- Når det ikke er delelig med 4
- Når det er delelig med 100, men ikke 400. (For eksempel var ikke 1700, 1800 og 1900 skuddår, ei heller blir 2100 et)
*/
public class leapYearLogicTest {
    leapYearLogic lyl;

    public leapYearLogicTest() {

    }

    @BeforeEach
    public void setup() { this.lyl = new leapYearLogic();
    }

    //
    @ParameterizedTest
    @ValueSource(
            ints = {140, 120, 2000, 2016, 2020}
    )

 public void Year_Divisible_By_4_But_Not_100(int year) {
        Assertions.assertTrue(this.lyl.isLeapYear(year));
    }

 @Test
 public void  Year_Divisible_By_400_Result_True() {
        Assertions.assertTrue(this.lyl.isLeapYear(2000));}

 @Test
 public void Year_Not_Divisible_By_4_Result_False() {
        Assertions.assertFalse(this.lyl.isLeapYear(1999));
 }

 @ParameterizedTest
    @ValueSource(
            ints = {1700, 1800, 1900, 2100}
    )
    public void Year_Divisible_By_100_But_Not_400_Result_False(int year) {
        Assertions.assertFalse(this.lyl.isLeapYear(year));
 }

 @Test
    public void Year_Divisible_By_4000_Result_True() {
        Assertions.assertTrue(this.lyl.isLeapYear(8000));
    }

}
