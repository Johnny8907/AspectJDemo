package Shopping;

import java.util.List;
import java.util.Vector;

public class Inventory {
    private List _items = new Vector();
    public void addItem(Item item) {
        _items.add(item);
    }
    public void removeItem(Item item) {
        _items.remove(item);
    }
}
