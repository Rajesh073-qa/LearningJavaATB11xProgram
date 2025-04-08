package ex28_ENUM;

public enum ApiUrls {
    vwo("https://vwo.com"),
    google("www.google.com");

    private String URL;

    ApiUrls(String URL) {
        this.URL = URL;
    }

    String getURL() {

        return URL;
    }
}
