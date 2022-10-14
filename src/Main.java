import business.CourseManager;
import core.Logging.DatabaseLogger;
import core.Logging.FileLogger;
import core.Logging.Logger;
import core.Logging.MailLogger;
import dataAccess.course.HibernateCourseDao;
import dataAccess.course.JdbcCourseDao;
import core.Logging.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

//        Instructor instructor = new Instructor("Galip", "Dogan");
//        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
//        InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(), loggers);
//        instructorManager.add(instructor);

        Course course1 = new Course("Java","Backend",1500);
        Course course2 = new Course("Javascript", "Frontend", 1000);
        Course course3 = new Course("React", "Frontend", 0);


        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);


//        Category category = new Category();
//        category.setName("Java");
//        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
//        CategoryManager categoryManager1 = new CategoryManager(new JdbcCategoryDao(), loggers);
//        categoryManager.add(category);


    }
}