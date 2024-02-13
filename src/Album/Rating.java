/**
 * Represents a node in a singly linked list for managing ratings. Each node stores a rating value and a reference to the next node in the list.
 * This class allows for the creation of a linked list structure to store and manage multiple rating values sequentially.
 *
 * @author aeshashah
 */
public class Rating {
    private int star; // Represents the rating value
    private Rating next; // Pointer to the next node in the list

    /**
     * Constructs a Rating node with a specified star value.
     *
     * @param star the rating value for this node
     */
    public Rating(int star) {
        this.star = star;
        this.next = null; // Initially, there is no next Rating node
    }

    /**
     * Returns the rating value of this node.
     *
     * @return the star rating
     */
    public int getStar() {
        return star;
    }

    /**
     * Sets the rating value of this node.
     *
     * @param star the new star rating
     */
    public void setStar(int star) {
        this.star = star;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next Rating node
     */
    public Rating getNext() {
        return next;
    }

    /**
     * Sets the reference to the next node in the list.
     *
     * @param next the next Rating node
     */
    public void setNext(Rating next) {
        this.next = next;
    }
}
