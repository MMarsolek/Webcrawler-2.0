package updatedwebcrawler;
public class Driver {

    //TODO update to call constructor instead
    public static void main(String[] args) {
        try{
            Webcrawler instance = new Webcrawler(5, 5, "https://www.reddit.com/?rdt=40010", true);
            instance.StartWebcrawler();
        }catch(Exception e){
            System.out.println("Error getting url");
        }
    }
}
