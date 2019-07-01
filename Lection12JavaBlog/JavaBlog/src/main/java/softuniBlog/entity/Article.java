package softuniBlog.entity;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {
    private Integer id;
    private String title;
    private String content;
    private User author;
    private String imageUrl;

    public Article(String title, String content, String imageUrl, User author ) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.imageUrl = imageUrl;
    }

    public Article() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(nullable = false, columnDefinition = "text")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    @JoinColumn(nullable = false, name = "authorId")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Transient
    public String getSummary() {
        return this.getContent().substring(0, this.getContent().length() / 2) + "...";
    }

    @Column(name = "imageUrl", nullable = false, columnDefinition = "text")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
