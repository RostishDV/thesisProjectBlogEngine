package skillbox.com.blogEngine.model;

import javax.persistence.*;

@Entity
@Table(name = "global_settings")
public class GlobalSettings extends AbstractEntity{
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SettingsCode code;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SettingsName name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SettingsValue value;

    public SettingsCode getCode() {
        return code;
    }

    public void setCode(SettingsCode code) {
        this.code = code;
    }

    public SettingsName getName() {
        return name;
    }

    public void setName(SettingsName name) {
        this.name = name;
    }

    public SettingsValue getValue() {
        return value;
    }

    public void setValue(SettingsValue value) {
        this.value = value;
    }
}
