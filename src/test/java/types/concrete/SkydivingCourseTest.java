package types.concrete;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SkydivingCourseTest {

    @Test
    public void canBeSorted() throws Exception {
        SkydivingCourse unordered = new SkydivingCourse();
        unordered.add(Attendee.is("B"));
        unordered.add(Attendee.is("Z"));
        unordered.add(Attendee.is("Q"));
        unordered.add(Attendee.is("A"));

        SkydivingCourse ordered = new SkydivingCourse();
        ordered.add(Attendee.is("A"));
        ordered.add(Attendee.is("B"));
        ordered.add(Attendee.is("Q"));
        ordered.add(Attendee.is("Z"));

        System.out.println(unordered);
        System.out.println(ordered);

        assertThat(unordered.sortedCopy(), is(ordered));
    }

}
