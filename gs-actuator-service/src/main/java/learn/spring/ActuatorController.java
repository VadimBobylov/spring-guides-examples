package learn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActuatorController {
    @GetMapping("/")
    @ResponseBody
    public String getHello(){
        return "Hello, developer, move to <a href=\"./actuator/health\">Actuator health</a>";
    }
}
