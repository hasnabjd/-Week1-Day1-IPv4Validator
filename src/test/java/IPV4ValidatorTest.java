import org.junit.Test;
import static org.junit.Assert.*;

public class IPV4ValidatorTest {

    @Test
    public void testValidIPv4Address() {
        String ipAddr = "192.168.1.1";
        assertTrue(IPV4Validator.validateIPv4Address(ipAddr));
    }

    @Test
    public void testIPv4Address_InvalidBlock() {
        String ipAddr = "192.168.1.256";
        assertFalse(IPV4Validator.validateIPv4Address(ipAddr));
    }

    @Test
    public void testIPv4Address_InvalidLength() {
        String ipAddr = "192.168.1";
        assertFalse(IPV4Validator.validateIPv4Address(ipAddr));
    }

    @Test
    public void testIPv4Address_InvalidCharacter() {
        String ipAddr = "192.168.1.has";
        assertFalse(IPV4Validator.validateIPv4Address(ipAddr));
    }

    @Test
    public void ttestIPv4Address_NetworkSegment() {
        String ipAddr = "192.168.1.0";
        assertFalse(IPV4Validator.validateIPv4Address(ipAddr));
    }

    @Test
    public void testIPv4Address_Broadcast() {
        String ipAddr = "192.168.1.255";
        assertFalse(IPV4Validator.validateIPv4Address(ipAddr));
    }
}
