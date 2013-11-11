package types.concrete;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import types.TypeTests;

public class HostTest extends TypeTests<Host> {
    @Test
    public void aValidHostnameYieldsAValidHost() throws Exception {
        assertThat(Host.is("localhost").isValid(), is(true));
    }

    @Test
    public void anInvalidHostnameYieldsAInvalidHost() throws Exception {
        assertThat(Host.is("blarg.moc").isValid(), is(false));
    }

    @Override
    protected Host fromString(String s) {
        return Host.is(s);
    }

    @Override
    protected Host nullValue() {
        return Host.NULL;
    }
}
