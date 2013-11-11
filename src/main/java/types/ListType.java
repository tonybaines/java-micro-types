package types;

import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class ListType<T, C extends List<T>> implements Iterable<T> {
    protected C list;

    protected ListType() {
        list = init();
    }

    protected ListType(C list) {
        this.list = list;
    }

    protected abstract C init();

    public int size() {
        return list.size();
    }

    public void add(T s) {
        list.add(s);
    }

    public T get(int i) {
        return list.get(i);
    }

    public void clear() {
        list.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return list == null ? "null" : list.toString();
    }

    public String debug() {
        return getClass().getSimpleName() + "{value=" + toString() + '}';
    }

    @Override
    public boolean equals(final Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
