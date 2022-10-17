package business;

import core.Logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    Course course1 = new Course("Java","Backend",1500);
    Course course2 = new Course("Javascript", "Frontend", 1000);
    Course course3 = new Course("React", "Frontend", 0);


    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }

    public void add(Course course) throws  Exception{

        List<Course> courses=new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
       for (Course course1:courses){
           if (course1.getName().equals(course.getName())){
              throw new Exception("Kurs daha onceden kayitli!");
           }else if (course1.getUnitPrice()<0){
               throw new Exception("Kurs fiyati 0(sifir) dan kucuk olmaza!");
           }
       }

        if (course.getUnitPrice()<0){
            throw new Exception("Kurs fiyati 0(sifir) dan kucuk olmaza!");
        }
        courseDao.add(course);
        for (Logger logger : loggers) {// once database sonra mail yollandin
            logger.log(course.getName());
        }
    }
}
