import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar (33, 54);
        System.out.println(somaDasIdades);
        int subtracaoDasIdades = calculadoraDeIdades.subtrai (54, 33);
        System.out.println(subtracaoDasIdades);
        int multiplicacaoDasIdades = calculadoraDeIdades.multiplica (3, 10);
        System.out.println(multiplicacaoDasIdades);
        double divisaoDasIdades = calculadoraDeIdades.divide (10, 2
        );
        System.out.println(divisaoDasIdades);
    }
}


