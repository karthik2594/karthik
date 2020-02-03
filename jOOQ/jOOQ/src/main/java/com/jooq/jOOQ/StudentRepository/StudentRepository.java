package com.jooq.jOOQ.StudentRepository;


import com.jooq.jOOQ.model.tables.pojos.Student;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import java.util.List;
import static com.jooq.jOOQ.model.Tables.STUDENT;

@Repository
public class StudentRepository {

    private final DSLContext db;
    public StudentRepository(DSLContext db) {
        this.db = db;
    }
    public List<Student> getDetails() {
        return db.selectFrom(STUDENT).fetchInto(Student.class);
    }
    public Student getById(int id){
       return db.selectFrom(STUDENT)
                .where(STUDENT.ID.eq(id))
                .fetchOneInto(Student.class);

    }
    public void add(Student student) {
        db.insertInto(STUDENT,STUDENT.ID,STUDENT.NAME, STUDENT.DOB, STUDENT.DEPARTMENT,
                STUDENT.COLLEGE, STUDENT.PLACE)
                .values(student.getId(), student.getName(), student.getDob(), student.getDepartment(),
                        student.getCollege(), student.getPlace())
                .execute();
    }
    public void update(Student student, int id) {
        db.update(STUDENT)
                .set(STUDENT.NAME, student.getName())
                .set(STUDENT.DOB, student.getDob())
                .set(STUDENT.DEPARTMENT, student.getDepartment())
                .set(STUDENT.COLLEGE, student.getCollege())
                .set(STUDENT.PLACE, student.getPlace())
                .where(STUDENT.ID.eq(id))
                .execute();
    }
    public void delete(int id) {
        db.delete(STUDENT)
                .where(STUDENT.ID.eq(id))
                .execute();
    }
}


