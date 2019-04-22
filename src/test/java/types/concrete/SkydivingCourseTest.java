package types.concrete;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SkydivingCourseTest {

    @Test
    public void canBeSorted() {
        SkydivingCourse unordered = new SkydivingCourse().apply(it -> {
            it.add(Attendee.is("B"));
            it.add(Attendee.is("Z"));
            it.add(Attendee.is("Q"));
            it.add(Attendee.is("A"));
        });

        SkydivingCourse ordered = new SkydivingCourse().apply(it -> {
            it.add(Attendee.is("A"));
            it.add(Attendee.is("B"));
            it.add(Attendee.is("Q"));
            it.add(Attendee.is("Z"));
        });

        System.out.println(unordered);
        System.out.println(ordered);

        assertThat(unordered.sortedCopy(), is(ordered));
    }

}
