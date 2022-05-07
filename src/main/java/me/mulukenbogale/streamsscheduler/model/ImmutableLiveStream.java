package me.mulukenbogale.streamsscheduler.model;

import java.time.LocalDateTime;

public class ImmutableLiveStream {

    private final String id;
    private final String title;
    private final String description;
    private final String url;
    private final LocalDateTime starrDate;
    private final LocalDateTime endDate;


    public ImmutableLiveStream(String id, String title, String description, String url, LocalDateTime starrDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.starrDate = starrDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getStarrDate() {
        return starrDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }
}
