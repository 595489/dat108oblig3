package no.hvl.dat108.oblig3.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
    private final static int MAX_INTERACTIVE_INTERVAL = 100;
    private static boolean isLoggedIn = false;

    public static void logoutUser(HttpSession session){
        session.invalidate();
        isLoggedIn = false;
    }

    public static void loginUser(HttpServletRequest request){
        logoutUser(request.getSession());

        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);

        isLoggedIn = true;
    }

    public static boolean isUserLoggedIn(HttpSession session){
        if (session != null)
            return isLoggedIn;
        else return false;
    }
}