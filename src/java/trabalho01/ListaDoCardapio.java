
package trabalho01;

import java.util.ArrayList;
import java.util.List;

public class ListaDoCardapio {
    
    private static List<Cardapio> itensDoCardapio;
    

    
    public static List<Cardapio> getInstance() {
        if (itensDoCardapio == null) {
            itensDoCardapio = new ArrayList<>();
            itensDoCardapio.add(new Cardapio("File",10));
            itensDoCardapio.add(new Cardapio("Fritas",16));
            itensDoCardapio.add(new Cardapio("Brahma",8));
            itensDoCardapio.add(new Cardapio("Skol",7));
            itensDoCardapio.add(new Cardapio("Cerveja Artenasal",15));
            itensDoCardapio.add(new Cardapio("Torresmo",18));
            itensDoCardapio.add(new Cardapio("Pizza",35));

        }
        return itensDoCardapio;
    }

    
    
}
