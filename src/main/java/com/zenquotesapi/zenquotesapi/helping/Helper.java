package com.zenquotesapi.zenquotesapi.helping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


public class Helper {



    public static String browser_name(@RequestHeader(value = "User-Agent") String userAgent) {
        BrowserMap brows = new BrowserMap();
        String userAge = userAgent.trim();
        if (brows.getBrowserMap(userAge) != null)
            return brows.getBrowserMap(userAge);
        else
            return "hi";
    }

}
