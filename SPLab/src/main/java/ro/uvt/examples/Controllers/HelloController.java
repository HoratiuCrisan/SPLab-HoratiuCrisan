package ro.uvt.examples.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.uvt.examples.ClientComponent;
import ro.uvt.examples.TransientComponent;

//@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Controller
public class HelloController {
    private final TransientComponent transientComponent;
    private final ClientComponent clientComponent1;
    private final ClientComponent clientComponent2;

    public HelloController(@Qualifier("clientComponent1") ClientComponent clientComponent1, @Qualifier("clientComponent2") ClientComponent clientComponent2, TransientComponent transientComponent) {
        this.clientComponent1 = clientComponent1;
        this.clientComponent2 = clientComponent2;
        this.transientComponent = transientComponent;
    }
    @RequestMapping(value = "")
    @ResponseBody
    public String hello() {
        return "Hello From Spring Boot!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloComponent() {
        return "Hello " + this.transientComponent;
    }

    @GetMapping("/client1")
    @ResponseBody
    public String helloClient() {
        return "Hello " +  this.clientComponent1;
    }

    @GetMapping("/client2")
    @ResponseBody
    public String helloClient2() {
        return "Hello " + this.clientComponent2;
    }
}
