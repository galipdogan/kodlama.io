package business;

import core.Logging.Logger;
import dataAccess.instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

       public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        Instructor[] instructors={new Instructor("Galip","Dogan"),
                new Instructor("Engin","Demirog"),
                new Instructor("Gencay","Yildiz")};

        for (Instructor instructor1 : instructors) {
            if (instructor.getFirstName().equals(instructor1.getFirstName()) && instructor.getLastName().equals(instructor1.getLastName()) ) {
                throw new Exception("Egitmen daha once kayitli!");
            }
        }
        instructorDao.add(instructor);
        for (Logger logger : loggers) {// once database sonra mail yollandin
            logger.log(instructor.getFirstName());
        }
    }
}
