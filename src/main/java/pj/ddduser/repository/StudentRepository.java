package pj.ddduser.repository;

import pj.ddduser.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    // Notice, there are no methods here, but we still can use all those, which we inherit from JpaRepository
}