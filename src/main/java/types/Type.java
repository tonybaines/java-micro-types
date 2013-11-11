package types;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class Type<T extends Comparable> implements Comparable<Type<T>> {
    private final T value;

    protected Type(final T value) {
        this.value = value;
    }

    public T value() {
        return value;
    }

    @Override
    public String toString() {
        return value == null ? "null" : value.toString();
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

    @Override
    public int compareTo(Type o) {
        return this.value().compareTo(o.value());
    }

}
