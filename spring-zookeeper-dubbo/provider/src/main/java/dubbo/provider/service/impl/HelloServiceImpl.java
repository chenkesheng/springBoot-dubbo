package dubbo.provider.service.impl;

import service.HelloService;

/**
 * Created by chenkesheng on 2017/3/1.
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String dubbo) {
        System.out.println("Leo大煞笔");
        return "Hello" + dubbo;
    }
}
