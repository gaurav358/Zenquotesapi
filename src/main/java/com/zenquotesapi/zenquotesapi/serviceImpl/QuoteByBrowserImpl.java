package com.zenquotesapi.zenquotesapi.serviceImpl;
import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.models.BrowserMapping;
import com.zenquotesapi.zenquotesapi.repo.Browserrepo;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByBrowser;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class QuoteByBrowserImpl implements QuoteByBrowser {
    @Autowired
    private QuoteService quoteService;

    @Autowired
    private Browserrepo browserrepo;

    public AllQuotes giveQuoteByBrowser(String browser) {
        List<String> authorList = new ArrayList<>();
        List<BrowserMapping> browserdata = browserrepo.getByBrowser(browser);
        for (BrowserMapping triii : browserdata) {
            authorList = triii.getAuthor();
        }
        String author = authorList.get(new Random().nextInt(authorList.size()));
        return quoteService.getQuoteWithAuthor(author);

    }
}
