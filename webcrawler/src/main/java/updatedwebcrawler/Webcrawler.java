package updatedwebcrawler;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;


//TODO Producer / consumer thread relationship
//TODO Add queues for threads to add and pull from
public class Webcrawler {

        //TODO Move to constructor
        int numberOfDesiredThreads = 5;
        //Set number of pages
        int numberOfDesiredSites = 5;
        //Set starting point
        String startingURL = "https://google.com";
        //Save or delete data?
        boolean saveFoundData = false;

        public Webcrawler(int numOfThreads, int numOfSites, String url, boolean saveData) {
                numberOfDesiredThreads = numOfThreads;
                numberOfDesiredSites = numOfSites;
                startingURL = url;
                saveFoundData = saveData;
        }

        public void StartWebcrawler() {
                try{
                }catch(Exception e){
                        System.out.println(e);;
                }
        }


        //TODO handle exceptions      

}




//TODO Multi threads
//TODO Scan the page for data and links
//TODO Data to search for? - lInks -Key words / phrases?
//TODO Store data in CSV or Json blob?
//TODO Get links - keep backups incase there are dead links
//TODO Click on first link
//TODO Once reached limit of the desired pages, return data

//GUI ideas
//Set desired key word or phrases?
