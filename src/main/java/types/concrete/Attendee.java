package types.concrete;

import types.Type;

public class Attendee extends Type<String> {
    public static final Attendee NULL = new Attendee("NULL");

    private Attendee(String s) {
        super(s);
    }

    public static Attendee is(String s) {
        if (s == null || s.trim().isEmpty()) {
            return Attendee.NULL;
        }
        return new Attendee(s);
    }

}
