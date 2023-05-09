package edu.kis.vh.nursery;

/**
 * Podstawowy Rhymer opearty o strukturę stosu LIFO.
 */
public class DefaultCountingOutRhymer {

    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int STACK_INITIAL_INDEX = -1;
    public static final int STACK_CAPACITY = 12;
    public static final int STACK_LAST_INDEX = STACK_CAPACITY-1;

    private final int[] numbers = new int[STACK_CAPACITY];

    private  int total = STACK_INITIAL_INDEX;

    /**
     * @return liczba elementów na stosie pomniejszona o jeden.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje element do stosu
     * @param in dodawany element
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * @return czy stos jest pusty
     */
    public boolean callCheck() {
        return total == STACK_INITIAL_INDEX;
    }

    /**
     * @return czy stos jest pełny
     */
    public boolean isFull() {
        return total == STACK_LAST_INDEX;
    }

    /**
     * Zwraca ostani element stosu bez usuwania go
     * @return ostatni element stosu
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    /**
     * Zwraca ostani element stosu usuwając go
     * @return ostatni element stosu
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

}
