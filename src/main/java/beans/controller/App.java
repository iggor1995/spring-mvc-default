package beans.controller;

import beans.AppPages;
import beans.entity.User;
import beans.exception.SomethingWrongException;
import beans.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequiredArgsConstructor
public class App {

    private final AppService appService;

    @GetMapping
    public String home() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String getHome(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("users", appService.list());
        return AppPages.LOGIN;
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") User user) throws SomethingWrongException {
        System.out.println(user);
        appService.save(user);
        return AppPages.redirect(AppPages.HOME_URL);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getUsers(@ModelAttribute("model") ModelMap model){
        Collection<User> users = appService.list();
        model.addAttribute("users", users);
        return AppPages.LOGIN;
    }
}
