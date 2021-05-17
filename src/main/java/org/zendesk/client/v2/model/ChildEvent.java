package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// 每次JSON都是Key为字段名，Value为字段值（如下例），无法解析。。。可能需要将这些汇总成一个Map来解析
// {
//			"id": 1561823056871,
//			"via": "Web form",
//			"via_reference_id": null,
//			"status": "solved",
//			"event_type": "Change",
//			"previous_value": "open"
//		}
// {
//			"id": 1561823056931,
//			"via": "Web form",
//			"via_reference_id": null,
//			"custom_ticket_fields": {
//				"360041597112": "set_up_app"
//			},
//			"event_type": "Change",
//			"previous_value": null
//		}
// 使用@JsonSubTypes实现多态解析
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "event_type",
//        visible = true, defaultImpl = UnknownEvent.class)
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = CommentEvent.class, name = "Comment"),
//        @JsonSubTypes.Type(value = CreateEvent.class, name = "Create"),
//        @JsonSubTypes.Type(value = ChangeEvent.class, name = "Change"),
//})
public class ChildEvent {
    private Long id;
    private String eventType;

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
