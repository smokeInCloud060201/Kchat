package vn.com.demo.kchat.message.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import vn.com.demo.kchat.message.dto.Greeting;
import vn.com.demo.kchat.message.dto.HelloMessage;
import vn.com.demo.kchat.message.dto.MessageDTO;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
