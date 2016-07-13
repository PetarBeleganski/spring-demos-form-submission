package user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by petar.beleganski on 13.7.2016 г..
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user", method=RequestMethod.GET)
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

    @RequestMapping(value = "/user", method=RequestMethod.POST)
    public String formSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "result-user";
    }
}
