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
@Table(name = "Client_tb")
public class ClientModel implements Serializable {

    @Id
    @Column(name = "client_no", length = 5, nullable = false)
    private String id;
    @Column(name = "First_name", length = 50, nullable = false)
    private String fname;
    @Column(name = "Last_name", length = 50, nullable = false)
    private String lname;
    @Column(name = "phone_number", length = 15, nullable = true)
    private String phone;
    @Column(name = "client_email_address", length = 100, nullable = true)
    private String email;
    @Column(name = "Image", nullable = true)
    private String photo;
    @Column(name = "Client_Category", length = 30, nullable = false)
    private String category;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Of_return ")
    private Date date;
    @Column(name = "Book_Category", length = 60, nullable = true)
    private String bookcategory;
    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }

    public ClientModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClientModel{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email + ", photo=" + photo + ", category=" + category + ", date=" + date + ", bookcategory=" + bookcategory + '}';
    }

   
}
