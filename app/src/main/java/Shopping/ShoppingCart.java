package Shopping;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCart {
    private List _items = new Vector();
    static Logger _logger = Logger.getLogger("trace");
    public void addItem(Item item) {
//        _logger.logp(Level.INFO,
//                "ShoppingCart", "addItem", "Entering");
        _items.add(item);
    }
    public void removeItem(Item item) {
//        _logger.logp(Level.INFO,
//                "ShoppingCart", "removeItem", "Entering");
        _items.remove(item);
    }
    public void empty() {
//        _logger.logp(Level.INFO,
//                "ShoppingCart", "empty", "Entering");
        _items.clear();
    }
    public float totalValue() {
//        _logger.logp(Level.INFO,
//                "ShoppingCart", "totalValue", "Entering");
// unimplemented... free!
        return 0;
    }
}