package src.얄팍한코딩사전.singleton.before;

public class SecondPage {

    private Settings settings = new Settings();

    public void printSettings() {
        System.out.println(settings.getDarkMode()
        + " " + settings.getFontSize());
    }

}
