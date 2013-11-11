package types.concrete;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import types.Type;

public class Host extends Type<String> {
    public static Host NULL = new Host("INVALID") {
        @Override
        public boolean isValid() {
            return false;
        }
    };

    protected Host(String value) {
        super(value);
    }

    public static Host is(String hostname) {
        try {
            Inet4Address.getByName(hostname);
            if ((hostname == null || hostname.trim().isEmpty())) {
                return Host.NULL;
            }
            return new Host(hostname);
        } catch (UnknownHostException e) {
            return Host.NULL;
        }
    }

    public boolean isValid() {
        return true;
    }
}
