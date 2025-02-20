package com.example.yc2.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "stories")
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private int views;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    public Story() {}

    public Story(String title, Category category, int views) {
        this.title = title;
        this.category = category;
        this.views = views;
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public int getViews() {
        return views;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
