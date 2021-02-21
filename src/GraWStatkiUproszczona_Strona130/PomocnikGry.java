package GraWStatkiUproszczona_Strona130;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PomocnikGry {

    public String pobierzDaneWejsciowe(String komunikat) throws IOException {

        String wierszWej = null;
        System.out.println(komunikat + " ");

        try {
            BufferedReader sw = new BufferedReader(
                    new InputStreamReader(System.in));
            wierszWej = sw.readLine();
            if (wierszWej.length() == 0)
                return null;
        } catch (IIOException e) {
            System.out.println("IOException: " + e);
        }
        return wierszWej;
    }
}
