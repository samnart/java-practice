public class Inventory
{
    private static final int MAX_ITEMS = 100;
    private Item[] items;
    private int itemCount;

    public Inventory (){
        this.items = new Item[MAX_ITEMS];
        this.itemCount = 0;
    }

    public void addItem(Item item) {
        if (itemCount < MAX_ITEMS) {
            items[itemCount++] = item;
        } else {
            System.out.println("Inventory is full. Cannot add more items.");
        }
    }

    public void removeItem(Item item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(item)) {
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCount - 1] = null;
                itemCount--;
                break;
            }
        }
    }

    public void displayInventory() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Name: " + items[i].getName() + ", Quantity: " + items[i].getQuantity());
        }
    }

    public Item[] getItems() {
        return items;
    }
}
