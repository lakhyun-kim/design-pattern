package src.얄팍한코딩사전.singleton.before;

public class Settings {

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode() {
        return darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setDarkMode(boolean _darkMode) {
        darkMode = _darkMode;
    }

    public void setFontSize(int _fontSize) {
        fontSize = _fontSize;
    }

}
