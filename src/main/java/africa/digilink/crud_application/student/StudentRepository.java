package africa.digilink.crud_application.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {
  // @Query("SELECT s FROM STUDENT s WHERE s.email = ?")
    Optional<Student> findStudentByEmail(String email);
}
