import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<WebCrawler> bots =new ArrayList<>();
        bots.add(new WebCrawler("https://www.leparisien.fr/",1));
        bots.add(new WebCrawler("https://www.lefigaro.fr/",2));
        bots.add(new WebCrawler("https://www.lecanardenchaine.fr/",3));

        for(WebCrawler w :bots){
            try {
                w.getThread().join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
