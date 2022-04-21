import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HexadecimalConverterTest {
    HexadecimalConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new HexadecimalConverter();
    }

    @Test
    public void hex_converter_gets_bc_from_188() {
        Assert.assertEquals("BC", converter.hexConverter(188));
    }

    @Test
    public void hex_converter_gets_0_from_0() {
        Assert.assertEquals("0", converter.hexConverter(0));
    }

    @Test
    public void hex_converter_gets_1E240_from_123456() {
        Assert.assertEquals("1E240", converter.hexConverter(123456));
    }

    @Test
    public void binary_converter_gets_10111100_from_188(){
        Assert.assertEquals("10111100", converter.binaryConverter(188));
    }

    @Test
    public void binary_converter_gets_0_from_0(){
        Assert.assertEquals("0", converter.binaryConverter(0));
    }


    @Test
    public void binary_converter_gets_11110001001000000_from_123456(){
        Assert.assertEquals("11110001001000000", converter.binaryConverter(123456));
    }

}