import org.example.StringCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorPrueba {

    @Test
    @DisplayName("Cadena Vacia")
    public void addPrueba0(){
        String entrada = "";
        assertEquals(0,StringCalculator.add(entrada));
    }

    @Test
    @DisplayName("Una entrada")
    public void addPrueba1(){
        String entrada = "13";
        assertEquals(13,StringCalculator.add(entrada));
    }

    @Test
    @DisplayName("Dos entradas")
    public void addPrueba2(){
        String entrada = "13,43";
        assertEquals(56,StringCalculator.add(entrada));
    }

}
