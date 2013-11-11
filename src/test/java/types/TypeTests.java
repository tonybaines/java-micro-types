package types;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public abstract class TypeTests<T> {

    @Test
    public void theNULLValueIsReturnedWhenAppropriate() throws Exception {
        assertThat(fromString(null), is(nullValue()));
        assertThat(fromString(""), is(nullValue()));
        assertThat(fromString("  "), is(nullValue()));
    }

    protected abstract T fromString(String s);

    protected abstract T nullValue();
}
