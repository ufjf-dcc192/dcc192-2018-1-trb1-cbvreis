
package trabalho01;

import java.util.ArrayList;
import java.util.List;

public class ListaDeMesas {
    private static List<Mesas> mesas;
        
    public static List<Mesas> getInstance() {
        if (mesas == null) {
            mesas = new ArrayList<>();
       }
        return mesas;
    }

}
