package dataAccess.course;

import core.Logging.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanina eklendi. "+ course.getName());
    }
}
