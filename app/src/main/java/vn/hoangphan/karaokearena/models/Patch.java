package vn.hoangphan.karaokearena.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Hoang Phan on 2/27/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patch extends RealmObject {
    private String link;

    @PrimaryKey
    private String version;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}