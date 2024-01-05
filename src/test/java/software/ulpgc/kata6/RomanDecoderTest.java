package software.ulpgc.kata6;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

public class RomanDecoderTest {
    @Test
    public void should_return_1_given_I(){
        assertThat(new RomanDecoder().decode("I")).isEqualTo(1);
    }

    @Test
    public void should_return_5_given_V(){
        assertThat(new RomanDecoder().decode("V")).isEqualTo(5);
    }

    @Test
    public void should_return_10_given_X(){
        assertThat(new RomanDecoder().decode("X")).isEqualTo(10);
    }

    @Test
    public void should_return_50_given_L(){
        assertThat(new RomanDecoder().decode("L")).isEqualTo(50);
    }

    @Test
    public void should_return_100_given_C(){
        assertThat(new RomanDecoder().decode("C")).isEqualTo(100);
    }

    @Test
    public void should_return_500_given_D(){
        assertThat(new RomanDecoder().decode("D")).isEqualTo(500);
    }

    @Test
    public void should_return_1000_given_M(){
        assertThat(new RomanDecoder().decode("M")).isEqualTo(1000);
    }

    @Test
    public void should_return_2_given_II(){
        assertThat(new RomanDecoder().decode("II")).isEqualTo(2);
    }

    @Test
    public void should_return_3_given_III(){
        assertThat(new RomanDecoder().decode("III")).isEqualTo(3);
    }

    @Test
    public void should_return_6_given_VI(){
        assertThat(new RomanDecoder().decode("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_7_given_VII(){
        assertThat(new RomanDecoder().decode("VII")).isEqualTo(7);
    }

    @Test
    public void should_return_8_given_VIII(){
        assertThat(new RomanDecoder().decode("VIII")).isEqualTo(8);
    }

    @Test
    public void should_return_11_given_XI(){
        assertThat(new RomanDecoder().decode("XI")).isEqualTo(11);
    }

    @Test
    public void should_return_12_given_XII(){
        assertThat(new RomanDecoder().decode("XII")).isEqualTo(12);
    }

    @Test
    public void should_return_13_given_XIII(){
        assertThat(new RomanDecoder().decode("XIII")).isEqualTo(13);
    }

    @Test
    public void should_return_4_given_IV(){
        assertThat(new RomanDecoder().decode("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_9_given_IX(){
        assertThat(new RomanDecoder().decode("IX")).isEqualTo(9);
    }

    @Test
    public void should_return_40_given_XL(){
        assertThat(new RomanDecoder().decode("XL")).isEqualTo(40);
    }

    @Test
    public void should_return_90_given_XC(){
        assertThat(new RomanDecoder().decode("XC")).isEqualTo(90);
    }

    @Test
    public void should_return_400_given_CD(){
        assertThat(new RomanDecoder().decode("CD")).isEqualTo(400);
    }

    @Test
    public void should_return_CM_given_900(){
        assertThat(new RomanDecoder().decode("CM")).isEqualTo(900);
    }

    @Test
    public void should_return_1999_given_MCMXCIX(){
        assertThat(new RomanDecoder().decode("MCMXCIX")).isEqualTo(1999);
    }

    @Test
    public void should_return_1444_given_MCDXLIV(){
        assertThat(new RomanDecoder().decode("MCDXLIV")).isEqualTo(1444);
    }

    @Test
    public void should_return_3333_given_MMMCCCXXXIII(){
        assertThat(new RomanDecoder().decode("MMMCCCXXXIII")).isEqualTo(3333);
    }

    @Test
    public void should_return_3444_given_MMMCDXLIV(){
        assertThat(new RomanDecoder().decode("MMMCDXLIV")).isEqualTo(3444);
    }

    @Test
    public void should_throw_illegalargumentexception_given_null(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode(null));
    }

    @Test
    public void should_throw_illegalargumentexception_given_empty_number(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode(""));
    }

    @Test
    public void should_throw_illegalargumentexception_given_ABFG(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("ABFG"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_EHJKNOPQRSTUWYZ(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("EHJKNOPQRSTUWYZ"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_IIII(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("IIII"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_XXXX(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("XXXX"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_CCCC(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("CCCC"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_MMMM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("MMMM"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_VV(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VV"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_LL(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("LL"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_DD(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("DD"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_IL(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("IL"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_IC(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("IC"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_ID(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("ID"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_IM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("IM"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_XD(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("XD"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_XM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("XM"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_VX(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VX"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_VL(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VL"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_VC(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VC"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_VD(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VD"));
    }
    @Test
    public void should_throw_illegalargumentexception_given_VM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("VM"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_LC(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("LC"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_LD(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("LD"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_LM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("LM"));
    }

    @Test
    public void should_throw_illegalargumentexception_given_DM(){
        assertThrows(IllegalArgumentException.class, () -> new RomanDecoder().decode("DM"));
    }

    @Test
    public void should_return_200_given_CC(){
        assertThat(new RomanDecoder().decode("CC")).isEqualTo(200);
    }

    @Test
    public void should_return_300_given_CCC(){
        assertThat(new RomanDecoder().decode("CCC")).isEqualTo(300);
    }

    @Test
    public void should_return_2000_given_MM(){
        assertThat(new RomanDecoder().decode("MM")).isEqualTo(2000);
    }

    @Test
    public void should_return_3000_given_MMM(){
        assertThat(new RomanDecoder().decode("MMM")).isEqualTo(3000);
    }

    @Test
    public void should_return_53_given_LIII(){
        assertThat(new RomanDecoder().decode("LIII")).isEqualTo(53);
    }


}
