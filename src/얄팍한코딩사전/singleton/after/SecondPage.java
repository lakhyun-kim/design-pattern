package src.얄팍한코딩사전.singleton.after;

public class SecondPage {

    private Settings settings = Settings.getSettings();

    public void printSettings() {
        System.out.println(settings.getDarkMode()
        + " " + settings.getFontSize());
    }

}
