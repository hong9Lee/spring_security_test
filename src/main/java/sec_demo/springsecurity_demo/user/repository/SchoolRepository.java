package sec_demo.springsecurity_demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sec_demo.springsecurity_demo.user.domain.School;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Long> {

    @Query("select distinct(city) from School")
    List<String> getCities();
}
