import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;





public class romanTest {

 RomanNumbersTestErling roman;
 @BeforeEach
 public void initClass(){
  roman = new RomanNumbersTestErling();
 }

    @Test
    public void shouldConvert1ToI(){
        assertEquals("I", roman.toRoman(1));
    }

    @Test
    public void ShouldConvert2ToII(){ assertEquals ("II", roman.toRoman(2));}

    @Test
    public void ShouldConvert3ToIII(){ assertEquals ("III", roman.toRoman(3));}

    @Test
    public void ShouldConvert4ToIV(){ assertEquals ("IV", new RomanNumbersTestErling().toRoman(4));} //Just another way of calling the .java class

    @Test
    public void ShouldConvert5ToV(){ assertEquals ("V", new RomanNumbersTestErling().toRoman(5));}


    @Test
    public void ShouldConvert8ToVIII(){ assertEquals ("VIII", new RomanNumbersTestErling().toRoman(8));}


   @Test
    public void ShouldConvert9ToIX(){ assertEquals ("IX", new RomanNumbersTestErling().toRoman(9));}


   @Test
    public void ShouldConvert10ToX(){ assertEquals ("X", new RomanNumbersTestErling().toRoman(10));}
    @Test
    public void ShouldConvert21ToXXI(){ assertEquals ("XXXVII", new RomanNumbersTestErling().toRoman(37));}
}


