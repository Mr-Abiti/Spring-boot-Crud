package me.mulukenbogale.streamsscheduler.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

public record LiveStream(
        String id,
        @NotEmpty String title,
        String url,
        String description,
        LocalDateTime startDate,
        LocalDateTime endDate){
}
