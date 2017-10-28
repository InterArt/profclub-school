package am.profclub.school.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skills")
public class SkillController {

    @RequestMapping("/")
    public String viewSkills() {
        return "/skills/view";
    }
}
