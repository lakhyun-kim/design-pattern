package src.얄팍한코딩사전.singleton.after;

public class FirstPage {

    private Settings settings = Settings.getSettings();

    public void setAndPrintSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode()
        + " " + settings.getFontSize());
    }

}
