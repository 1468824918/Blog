package com.lanou.blog.domain;

/**
 * Created by dllo on 17/12/4.
 */
public class Blog {
    private int blogId;
    private String title;
    private String des;
    private String content;
    private int userId;

    public Blog() {
    }

    public Blog(String title, String des, String content, int userId) {
        this.title = title;
        this.des = des;
        this.content = content;
        this.userId = userId;
    }


    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
