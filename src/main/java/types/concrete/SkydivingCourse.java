package types.concrete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import types.ListType;

@SuppressWarnings("serial")
public class SkydivingCourse extends ListType<Attendee, List<Attendee>> {

    public SkydivingCourse(List<Attendee> attendees) {
        super(attendees);
    }

    public SkydivingCourse() {
        super();
    }

    public SkydivingCourse sortedCopy() {
        ArrayList<Attendee> sortedAttendees = new ArrayList<Attendee>(list);
        Collections.sort(sortedAttendees);
        return new SkydivingCourse(Collections.unmodifiableList(sortedAttendees));
    }

    @Override
    protected List<Attendee> init() {
        return new ArrayList<Attendee>();
    }
}
