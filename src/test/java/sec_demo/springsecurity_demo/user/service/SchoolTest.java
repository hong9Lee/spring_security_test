package sec_demo.springsecurity_demo.user.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import sec_demo.springsecurity_demo.user.domain.School;
import sec_demo.springsecurity_demo.user.repository.SchoolRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class SchoolTest {

    @Autowired
    private SchoolRepository schoolRepository;

    private SchoolService schoolService;

    @BeforeEach
    void before() {
        this.schoolService = new SchoolService(schoolRepository);
    }

    @DisplayName("1. 학교를 생성한다.")
    @Test
    void test_1() {
        School school = School.builder()
                .name("테스트 학교")
                .city("서울")
                .build();

        schoolService.save(school);

        List<School> list = schoolRepository.findAll();
        assertEquals(1, list.size());
        assertEquals("테스트 학교", list.get(0).getName());
        assertEquals("서울", list.get(0).getCity());
    }


}
