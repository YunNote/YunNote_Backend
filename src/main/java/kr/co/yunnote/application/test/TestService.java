package kr.co.yunnote.application.test;

import kr.co.yunnote.domain.Test;
import kr.co.yunnote.infrastructor.test.TestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional
    public void persistTestData() {
        Test test = new Test("테스트 데이터");
        testRepository.save(test);
    }

    @Transactional
    public Test findTestById(Long id ){
        Test findTest = testRepository.findTestById(id);
        return findTest;
    }
}
