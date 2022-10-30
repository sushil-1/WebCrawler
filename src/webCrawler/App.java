package webCrawler;

public class App {

    public static void main(String[] args) {
    	// new web crawler
        WebCrawler crawler = new WebCrawler();
        String rootURL = "https://www.facebook.com/login";
        crawler.crawl(rootURL, 100);
    }


}