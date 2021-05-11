package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// 要使用@JsonSubTypes实现多态解析
public class ChildEvent {
    private Long id;
//    private Via via;
//    private String viaReferenceId;
//    private String type;
//    private Long authorId;
    private String eventType;
//    private boolean commentPublic;
//    private boolean commentPresent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "ChildEvent{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
