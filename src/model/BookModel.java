package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Book_tb")
public class BookModel implements Serializable {

    @Id
    @Column(name = "Book_Id", length = 5, nullable = false)
    private String id;
    @Column(name = "Book_Title", length = 50, nullable = false)
    private String title;
    @Column(name = "Publication_house", length = 40, nullable = false)
    private String House;
    @Temporal(TemporalType.DATE)
    @Column(name = "Publication_Date", length = 10, nullable = true)
    private Date date;
    @Column(name = "Book_Author", length = 50, nullable = false)
    private String author;
    @Column(name = "Book_Page", length = 10000, nullable = false)
    private String page;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "BookModel{" + "id=" + id + ", title=" + title + ", House=" + House + ", date=" + date + ", author=" + author + ", page=" + page + '}';
    }

   
}
