package dataAccess.instructor;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jbbs ile veritabanina eklendi. " + instructor.getFirstName());
    }
}
