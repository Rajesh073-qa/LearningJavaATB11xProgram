package ex28_ENUM;

public enum colors {
    Red("#1002"),
    Green("#99399");

    private String hexCode;

    colors(String colors) {
        this.hexCode = colors;
    }

    String getColors() {

        return hexCode;
    }

}
