package dataAccess.course;

import core.Logging.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jbbs ile veritabanina eklendi. " + course.getName());
    }
}
