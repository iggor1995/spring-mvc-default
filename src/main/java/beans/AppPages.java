package beans;

public class AppPages {

    public static final String HOME_URL = "/home";
    public static final String LOGIN = "login";
    private static final String REDIRECT = "redirect:";

    public static String redirect(String page) {
        return REDIRECT + page;
    }
}
