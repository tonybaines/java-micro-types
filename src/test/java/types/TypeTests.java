package types;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class TypeTests<T> {

    @Test
    public void theNULLValueIsReturnedWhenAppropriate() {
        assertThat(fromString(null), is(nullValue()));
        assertThat(fromString(""), is(nullValue()));
        assertThat(fromString("  "), is(nullValue()));
    }

    protected abstract T fromString(String s);

    protected abstract T nullValue();
}
