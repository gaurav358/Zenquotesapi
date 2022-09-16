package com.zenquotesapi.zenquotesapi.helping;
import java.util.HashMap;
public class BrowserMap {
    public BrowserMap() {
        putBrowserMap("PostmanRuntime/7.29.2","postman");
        putBrowserMap("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36","chrome");
    }
    HashMap <String,String> browserMap= new HashMap<>();

public String getBrowserMap(String userAgent)
{
return browserMap.get(userAgent);
}

void putBrowserMap(String userAgent, String browser){
    browserMap.put(userAgent, browser);

}

}

