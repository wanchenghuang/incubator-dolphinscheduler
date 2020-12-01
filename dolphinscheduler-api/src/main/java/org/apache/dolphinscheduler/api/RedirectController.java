package org.apache.dolphinscheduler.api;

import org.apache.dolphinscheduler.api.exceptions.ApiException;
import org.apache.dolphinscheduler.api.utils.Result;
import org.apache.dolphinscheduler.common.Constants;
import org.apache.dolphinscheduler.dao.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

import static org.apache.dolphinscheduler.api.enums.Status.CREATE_ACCESS_TOKEN_ERROR;

/**
 * @Author cheng
 * @create 2020-09-06 19:18
 */
@RestController
public class RedirectController {

    @GetMapping(value = "/ui2")
    public String test() {
        return "forward:/Users/cheng/Downloads/git/cvte/incubator-dolphinscheduler/dolphinscheduler-ui/dist/index.html";
        //return "forward:./dolphinscheduler-ui/dist/index.html";
    }
}