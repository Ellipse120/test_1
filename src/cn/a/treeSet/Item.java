package cn.a.treeSet;
import java.util.*;
/**
 * An item with a description and a part number.
 * Created by lusai on 12/11/15.
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Contructs an item.
     * @param aDescription the item's description
     * @param aPartNumber the item's part number
     */
    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description = " + description + ", partNumber = " + partNumber + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;
    }


    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(partNumber,other.partNumber);
    }
}
