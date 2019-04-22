package types.concrete;

import types.ListType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("serial")
public class SkydivingCourse extends ListType<Attendee, List<Attendee>> {

    public SkydivingCourse(List<Attendee> attendees) {
        super(attendees);
    }

    public SkydivingCourse() {
        super();
    }

    /**
     * The purpose of apply() is to perform operations on a newly-created
     * instance, making it clear that it's part of the initialisation
     *
     * (Inspired by Kotlin)
     */
    public SkydivingCourse apply(Consumer<SkydivingCourse> a) {
        a.accept(this);
        return this;
    }

    public SkydivingCourse sortedCopy() {
        ArrayList<Attendee> sortedAttendees = new ArrayList<>(list);
        Collections.sort(sortedAttendees);
        return new SkydivingCourse(Collections.unmodifiableList(sortedAttendees));
    }

    @Override
    protected List<Attendee> init() {
        return new ArrayList<>();
    }
}
