package org.zendesk.client.v2.model.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.zendesk.client.v2.model.Attachment;
import org.zendesk.client.v2.model.ChildEvent;

import java.util.List;

/**
 * @author stephenc
 * @since 05/04/2013 11:54
 */
public class CommentEvent extends ChildEvent {

    private static final long serialVersionUID = 1L;

    private String body;
    private String htmlBody;
    private Boolean trusted;
    private Long authorId;
    private List<Attachment> attachments;

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("author_id")
    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("html_body")
    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public Boolean getTrusted() {
        return trusted;
    }

    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    @Override
    public String toString() {
        return "CommentEvent" +
                "{attachments=" + attachments +
                ", body='" + body + '\'' +
                ", htmlBody='" + htmlBody + '\'' +
                ", trusted=" + trusted +
                ", authorId=" + authorId +
                '}';
    }
}
