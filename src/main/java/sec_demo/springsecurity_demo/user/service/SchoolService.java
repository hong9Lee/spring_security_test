package sec_demo.springsecurity_demo.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sec_demo.springsecurity_demo.user.domain.School;
import sec_demo.springsecurity_demo.user.repository.SchoolRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;


    public School save(School school) {
        if (school.getSchoolId() == null) school.setCreated(LocalDateTime.now());
        school.setUpdated(LocalDateTime.now());
        return schoolRepository.save(school);
    }

    public List<String> cities() {
        return schoolRepository.getCities();
    }




}
