package com.zenquotesapi.zenquotesapi.helping;

//import com.zenquotesapi.zenquotesapi.spring.MethodBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class BrowserMap  {

    private final Browser browser;
    public BrowserMap(@Qualifier("browserConfig") Browser browser)
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
        String abc = "postman";
        for (HashMap.Entry<String,String> set: brows.entrySet()){
            if(set.getValue().equals(agent))

                return set.getKey();
        }
        return abc;
    }
}

