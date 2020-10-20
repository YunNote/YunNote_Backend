package kr.co.yunnote.interfaces.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.co.yunnote.base.ApiSuccessResponseMessage;
import kr.co.yunnote.base.StatusInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "V1 Test")
@RequestMapping("/api/v1")
public class TestResource {

    @ApiOperation(value = "test" , notes = "Test API 입니다.")
    @GetMapping("/test")
    public ResponseEntity test() {

        return ResponseEntity.ok().body(new ApiSuccessResponseMessage<>(StatusInfo.OK).appendData("data", "test"));
    }
}
