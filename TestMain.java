import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testDiagonal();
    }

    @Test
    public void testDiagonal() {
       Main.runJerooCode();
       assertTrue("flower should be planted 5 spaces away", Map.getInstance().isFlower(5,0));
       assertTrue("jeroo should be 6 spaces away", Map.getInstance().isJeroo(6,0));
    }


}
