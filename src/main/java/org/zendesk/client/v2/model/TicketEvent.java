package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * @author stephenc
 * @since 04/04/2013 14:25
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketEvent implements SearchResultEntity {

    private static final long serialVersionUID = 1L;

    private List<ChildEvent> childEvents;
    private Long id;
    private Long ticketId;
    private Date timestamp;
    private Date createdAt;
    private Long updaterId;
    private String via;
    private String eventType;
    private System system;
    private Metadata metadata;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updater_id")
    public Long getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Long updaterId) {
        this.updaterId = updaterId;
    }

    @JsonProperty("ticket_id")
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    @JsonProperty("child_events")
    public List<ChildEvent> getChildEvents() {
        return childEvents;
    }

    public void setChildEvents(List<ChildEvent> childEvents) {
        this.childEvents = childEvents;
    }

    @Override
    public String toString() {
        return "TicketEvent{" +
                "childEvents=" + childEvents +
                ", id=" + id +
                ", ticketId=" + ticketId +
                ", timestamp=" + timestamp +
                ", createdAt=" + createdAt +
                ", updaterId=" + updaterId +
                ", via='" + via + '\'' +
                ", eventType='" + eventType + '\'' +
                ", system=" + system +
                ", metadata=" + metadata +
                '}';
    }
}
