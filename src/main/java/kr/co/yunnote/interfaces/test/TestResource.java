package kr.co.yunnote.interfaces.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.co.yunnote.application.test.TestService;
import kr.co.yunnote.base.ApiSuccessResponseMessage;
import kr.co.yunnote.base.StatusInfo;
import kr.co.yunnote.domain.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@Api(value = "V1 Test")
@RequestMapping("/api/v1")
public class TestResource {


    private final TestService testService;

    public TestResource(TestService testService) {
        this.testService = testService;
    }

    @ApiOperation(value = "test" , notes = "Test API 입니다.")
    @GetMapping("/test")
    public ResponseEntity test() {

        testService.persistTestData();
        return ResponseEntity.ok().body(new ApiSuccessResponseMessage<>(StatusInfo.OK).appendData("data", "test"));
    }

    @GetMapping("/test/{id}")
    public ResponseEntity getTestDataById(@PathVariable("id") Long id) {
        Test findTest= testService.findTestById(id);

        return ResponseEntity.ok().body(new ApiSuccessResponseMessage<>(StatusInfo.OK).appendData("data", findTest));
    }
}
