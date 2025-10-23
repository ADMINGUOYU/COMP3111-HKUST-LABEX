package Lab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest
{

    @Test
    void add_session()
    {
        // create course
        Course course = new Course("COMP 3111", "Kenneth");
        // create session
        Course.Session session_1 = new Course.Session("Wednesday 12:30PM - 02:20PM", "LT-J");
        Course.Session session_2 = new Course.Session("Thursday 11:30AM - 01:20PM", "Rm 2465");
        Course.Session[] sessions = new Course.Session[2];
        sessions[0] = session_1;
        sessions[1] = session_2;
        // add sessions
        course.add_session(session_1);
        course.add_session(session_2);

        // assert
        assertEquals(course.m_name, "COMP 3111");
        assertEquals(course.m_instructor, "Kenneth");
        assertArrayEquals(course.get_sessions(), sessions);
    }

    @Test
    void add_session_array_version()
    {
        // create course
        Course course = new Course("COMP 3111", "Kenneth");
        // create session
        Course.Session session_1 = new Course.Session("Wednesday 12:30PM - 02:20PM", "LT-J");
        Course.Session session_2 = new Course.Session("Thursday 11:30AM - 01:20PM", "Rm 2465");
        Course.Session[] sessions = new Course.Session[2];
        sessions[0] = session_1;
        sessions[1] = session_2;
        // add sessions
        course.add_session(sessions);

        // assert
        assertEquals(course.m_name, "COMP 3111");
        assertEquals(course.m_instructor, "Kenneth");
        assertArrayEquals(course.get_sessions(), sessions);
    }

    @Test
    void add_session_append()
    {
        // create course
        Course course = new Course("COMP 3111", "Kenneth");
        // create session
        Course.Session session_1 = new Course.Session("Wednesday 12:30PM - 02:20PM", "LT-J");
        Course.Session session_2 = new Course.Session("Thursday 11:30AM - 01:20PM", "Rm 2465");
        Course.Session[] sessions = new Course.Session[2];
        sessions[0] = new Course.Session("Append", "LT-J");
        sessions[1] = new Course.Session("Append", "LT-J");
        Course.Session[] verify = new Course.Session[4];
        verify[0] = session_1;
        verify[1] = session_2;
        verify[2] = sessions[0];
        verify[3] = sessions[1];
        // add sessions
        course.add_session(session_1);
        course.add_session(session_2);
        course.add_session(sessions);

        // assert
        assertEquals(course.m_name, "COMP 3111");
        assertEquals(course.m_instructor, "Kenneth");
        assertArrayEquals(course.get_sessions(), verify);
    }

}