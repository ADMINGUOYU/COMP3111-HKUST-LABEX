package Lab7;
import java.lang.System;

/* This class manages a course -> i.e. COMP 3111 */
public class Course
{
    final public String m_name;
    final public String m_instructor;
    private int m_session_count;
    private Session[] m_sessions;

    static public class Session
    {
        public String time;
        public String venue;
        public Session(String time, String venue)
        {
            this.time = time;
            this.venue = venue;
        }
    }

    // constructor
    public Course(String name, String instructor)
    {
        this.m_name = name;
        this.m_instructor = instructor;
        this.m_session_count = 0;
    }

    // add a session
    public void add_session(Session session)
    {
        Session[] temp = new Session[++this.m_session_count];
        if (this.m_session_count > 1)
            System.arraycopy(this.m_sessions, 0, temp, 0, this.m_session_count - 1);
        temp[this.m_session_count - 1] = session;
        this.m_sessions = temp;
        return;
    }

    // add_session (overload: add more than one)
    public void add_session(Session[] session)
    {
        int length = session.length;
        Session[] temp = new Session[this.m_session_count + length];
        if (this.m_session_count > 0)
            System.arraycopy(this.m_sessions, 0, temp, 0, this.m_session_count);
        System.arraycopy(session, 0, temp, this.m_session_count, length);
        this.m_session_count += length;
        this.m_sessions = temp;
        return;
    }

    // display
    public Session[] get_sessions()
    {
        return this.m_sessions.clone();
    }

}
