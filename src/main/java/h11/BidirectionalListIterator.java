package h11;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.util.NoSuchElementException;

/**
 * An implementation of {@link BidirectionalIterator} that allows iterating over the list in both directions for
 * a {@link SelfOrganizingList}.
 */
class BidirectionalListIterator<T> implements BidirectionalIterator<T> {

    /**
     * The list to iterate over.
     */
    private final @NotNull AbstractSelfOrganizingList<T> list;

    /**
     * The last element returned by a call to {@code next()} or {@code previous()}.
     * This field is used to determine whether a subsequent call to {@code remove()}
     * is valid. A call to {@code remove()} is only allowed if it directly follows
     * a call to {@code next()} or {@code previous()}, and it cannot be called twice
     * in a row without an intervening cursor movement.
     * <p>
     * After a call to {@code add()}, this field is set to {@code null} to prevent
     * an immediate {@code remove()}. After a call to {@code remove()}, it is also
     * set to {@code null} because the previously returned element no longer exists
     * in the list.
     */
    @Nullable ListItem<T> lastReturned;

    /**
     * The cursor for the current position in the list.
     */
    @Nullable ListItem<T> cursor;

    /**
     * The previous references of the cursor for the reverse iteration.
     */
    @Nullable ListItem<ListItem<T>> previouses;

    /**
     * Creates a new iterator for the given list.
     *
     * @param list the list to iterate over
     */
    BidirectionalListIterator(@NotNull AbstractSelfOrganizingList<T> list) {
        this.list = list;
        this.cursor = list.head;
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public boolean hasPrevious() {
        // TODO H11.4.1
        return org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public T previous() throws NoSuchElementException {
        // TODO H11.4.1
        return org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public boolean hasNext() {
        return org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public T next() throws NoSuchElementException {
        // TODO H11.4.1
        return org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public void add(T element) {
        // TODO H11.4.1
        org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }

    @StudentImplementationRequired("H11.4.1")
    @Override
    public void remove() throws IllegalStateException {
        // TODO H11.4.1
        org.tudalgo.algoutils.student.Student.crash("H11.4.1 - Remove if implemented");
    }
}


