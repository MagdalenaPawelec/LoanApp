package pl.study;

import java.time.LocalDateTime;

public class Metadata {
    private String ipAddress;
    private LocalDateTime applicationTime;

    public Metadata(String ipAddress) {
        this.ipAddress = ipAddress;
        this.applicationTime = LocalDateTime.now();
    }
}
