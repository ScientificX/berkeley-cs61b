public interface Deque<T> {
    public void addFirst(T item);
    public void addLast(T item);
    public default boolean isEmpty() {
        return size() == 0;
    };
    public void printDeque();
    public int size();
    public T removeFirst();
    public T removeLast();
    public T get(int index);
}