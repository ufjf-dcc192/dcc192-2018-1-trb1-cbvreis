
package trabalho01;

import java.util.ArrayList;
import java.util.List;

public class ListaDoCardapio {
    
    private static List<Cardapio> itensDoCardapio;
    

    
    public static List<Cardapio> getInstance() {
        if (itensDoCardapio == null) {
            itensDoCardapio = new ArrayList<>();
            itensDoCardapio.add(new Cardapio("File",10.75));
            itensDoCardapio.add(new Cardapio("Fritas",16.90));
            itensDoCardapio.add(new Cardapio("Brahma",8.30));
            itensDoCardapio.add(new Cardapio("Skol",7.15));
            itensDoCardapio.add(new Cardapio("Cerveja Artenasal",15.35));
            itensDoCardapio.add(new Cardapio("Torresmo",18.90));
            itensDoCardapio.add(new Cardapio("Pizza",35.90));

        }
        return itensDoCardapio;
    }
   
}
