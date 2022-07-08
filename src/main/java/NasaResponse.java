import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaResponse {
    private String copyright;
    private String date;
    private String explanation;
    private String hdurl;
    private String mediaType;
    private String serviceVersion;
    private String title;
    private String url;

    public NasaResponse() {
    }

    public String getCopyright() {
        return this.copyright;
    }

    public String getDate() {
        return this.date;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public String getHdurl() {
        return this.hdurl;
    }

    @JsonProperty ("media_type")
    public String getMediaType() {
        return this.mediaType;
    }

    @JsonProperty ("service_version")
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }


    public void setMediaType(@JsonProperty ("media_type") String mediaType) {
        this.mediaType = mediaType;
    }

    public void setServiceVersion(@JsonProperty ("service_version") String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

