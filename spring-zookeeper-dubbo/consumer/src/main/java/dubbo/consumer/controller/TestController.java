package dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.HelloService;

/**
 * Created by chenkesheng on 2017/3/1.
 */
@Controller
@RequestMapping("dubbo")
public class TestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/test")
    public @ResponseBody String index(){
        System.out.println("服务调用");
        return helloService.sayHello("Dubbo");
    }
}
