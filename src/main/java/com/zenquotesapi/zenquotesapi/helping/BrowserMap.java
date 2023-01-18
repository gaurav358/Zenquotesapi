package com.zenquotesapi.zenquotesapi.helping;

//import com.zenquotesapi.zenquotesapi.spring.MethodBean;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BrowserMap  {

    private final Browser browser;
    public BrowserMap(Browser browser)
    {
        this.browser = browser;
        fill();
    }
    HashMap<String, String> brows = new HashMap<>();
    public void  fill () {
        brows.put("postman", browser.getPostman());
        brows.put("mozilla", browser.getMozilla());
    }

    public String getAgent(String agent) {
        String abc = "default";
        for (HashMap.Entry<String,String> set: brows.entrySet()){
            System.out.println(set.getValue());
            if(set.getValue().equals(agent))

                return set.getKey();
        }
        return abc;
    }
}

