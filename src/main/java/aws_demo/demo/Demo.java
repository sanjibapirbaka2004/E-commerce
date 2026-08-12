package aws_demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/app")
    public String Manager(){
        return "hello sir good morning ";
    }
    @GetMapping("/app2")
    public int add(){
        int a=1;
        int b=2;
        int sum=a+b;
        return sum;

    }
}

