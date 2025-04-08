package ex28_ENUM;

public enum locators {
    page_button("#tagname"),
    page_input("##92883");

    private String loctors;

    locators(String loctors) {
        this.loctors = loctors;

    }

    String getLoctors() {
        return getLoctors();
    }
}
