package h11;

import org.jetbrains.annotations.NotNull;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A recursive implementation of a self-organizing list that transposes accessed elements with their previous element.
 *
 * @param <T> the type of elements in the list
 * @author Nhan Huynh
 */
@DoNotTouch
public class TransposeListRecursive<T> extends TransposeList<T> implements SelfOrganizingList<T> {

    /**
     * Creates a new empty list.
     */
    @DoNotTouch
    public TransposeListRecursive() {
    }

    /**
     * Creates a list with the given elements.
     *
     * @param elements the elements to be added to the list
     */
    @DoNotTouch
    public TransposeListRecursive(@NotNull T[] elements) {
        super(elements);
    }

    @StudentImplementationRequired("H11.2")
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        // TODO H11.2
        return org.tudalgo.algoutils.student.Student.crash("H11.2 - Remove if implemented");
    }
}
