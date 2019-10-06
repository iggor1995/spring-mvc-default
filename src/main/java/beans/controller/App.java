package beans.controller;

import beans.AppPages;
import beans.entity.User;
import beans.exception.SomethingWrongException;
import beans.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView getHome() {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("users", appService.list());
        return new ModelAndView(AppPages.LOGIN,modelMap);
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") User user) throws SomethingWrongException {
        System.out.println(user);
        appService.save(user);
        return AppPages.redirect(AppPages.HOME_URL);
    }
}
