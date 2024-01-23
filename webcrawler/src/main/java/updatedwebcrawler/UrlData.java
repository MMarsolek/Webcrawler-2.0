package updatedwebcrawler;

import java.util.concurrent.LinkedBlockingQueue;

public class UrlData {
    String parentUrl;
    LinkedBlockingQueue<String> childrenLinks;
    
    public UrlData(String url) {
        parentUrl = url;
        childrenLinks = new LinkedBlockingQueue<String>();
    }

    public String getParentUrl() {
        return parentUrl;
    }

    public void addChildLink(String url){
        childrenLinks.add(url);
    }

    public String getChildLink(){
        return childrenLinks.poll();
    }

}
