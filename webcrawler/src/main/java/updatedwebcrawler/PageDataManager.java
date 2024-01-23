package updatedwebcrawler;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;

public class PageDataManager {
    
    public void findLinksOnCurrentUrl(Document doc) throws IOException {
        List<String> foundLinksOnDoc = doc.select("a").eachAttr("abs:href");
        for (String link : foundLinksOnDoc) {
            link = sanitizeUrls(link);
            System.out.println(link);
        }
    }
    public String sanitizeUrls(String dirtyUrl) {
        String cleanUrl = Jsoup.clean(dirtyUrl, Safelist.none());
        return cleanUrl;
    }
}
