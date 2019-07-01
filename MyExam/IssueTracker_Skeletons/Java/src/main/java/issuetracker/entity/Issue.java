package issuetracker.entity;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Entity
@Table(name = "issues")
public class Issue {


    private Integer id;

    private String title;

    private String content;

    private Integer priority;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    @Required
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column
    @Required
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column
    @Required
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
