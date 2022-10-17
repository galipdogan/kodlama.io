import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.Logging.DatabaseLogger;
import core.Logging.FileLogger;
import core.Logging.Logger;
import core.Logging.MailLogger;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.category.JdbcCategoryDao;
import dataAccess.course.HibernateCourseDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.HibernateInstructorDao;
import dataAccess.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Instructor instructor = new Instructor("Ali", "Dogan");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);

        Course course1 = new Course("C++","Backend",1500);



        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course1);
        courseManager1.add(course1);


        Category category = new Category();
        category.setName("Java");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        CategoryManager categoryManager1 = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category);
        categoryManager1.add(category);


    }
}