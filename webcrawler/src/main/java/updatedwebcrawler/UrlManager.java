package updatedwebcrawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;

public class UrlManager {
    public Document visitCurrentUrl(String currentUrl) throws IOException {
        String sanitizedUrl = sanitizeUrls(currentUrl);
        Document doc = Jsoup.connect(sanitizedUrl).get();
        return doc;
    }
    public String sanitizeUrls(String dirtyUrl) {
        String cleanUrl = Jsoup.clean(dirtyUrl, Safelist.none());
        return cleanUrl;
    }
}
