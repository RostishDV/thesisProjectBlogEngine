package skillbox.com.blogEngine.model;

public enum SettingsName {
    MULTIUSER("Многопользовательский режим"),
    POST("Премодерация постов"),
    STATISTICS("Показывать всем статистику блога");

    private final String name;

    SettingsName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    };
}
