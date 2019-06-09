package stacks;

/
        **
        * A Stack is a data structure in which objects are inserted into
        and removed from the same end (i.e., Last-In, First-Out).
@param <E> The element type denoted by the generic parameterised type E,
        which allows a stack to contain elements of any specific reference type

        * Created by Ganesh.r.hegde on 07-Apr-18.
        */
public interface Stack<E> {

    /**Pushes an element onto the top of the stack and returns the item pushed.
     *
     * @param i The element to be inserted
     * @return The element inserted
     */
    E push(E i);


    /**
     * Returns the element at the top of the stack without removing it.
     * @post The stack remains unchanged
     * @return The element at the top of the stack
     */
    E peek();

    /**
     * Returns the number of elements in the stack
     * @return The number of elements in the stack
     */
    int size();


    /**
     * Returns the object at the top of the stack and removes it.
     * @post The stack reduces by one in size
     * @return The element at the top of the stack (or null if empty)
     */
    E pop();


    /**
     * Returns true if the stack has no elements or false otherwise
     * @return true if the stack is empty or else returns false
     */
    boolean isEmpty();
}