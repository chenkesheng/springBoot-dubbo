package dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloService;

import java.io.IOException;

/**
 * Created by chenkesheng on 2017/3/1.
 */
public class StartConsumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo-consumer.xml" });
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService");
        String user = helloService.sayHello(" 调用接口成功.？？？ ");
        System.out.println(helloService.sayHello(user) + user);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
