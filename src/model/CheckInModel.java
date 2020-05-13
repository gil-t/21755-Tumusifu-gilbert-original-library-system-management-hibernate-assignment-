/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author T gil
 */
@Entity
@Table(name = "operation_tb")
public class CheckInModel implements Serializable {
    @Id
    @Column(name = "Client_Full_Name",length = 40)
    private String name;
    @Column(name = "Book_Title",length = 40)
    private String title;
    @Temporal(TemporalType.DATE)
    @Column(name = "Date")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CheckInModel() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CheckInModel{" + "name=" + name + ", title=" + title + ", date=" + date + '}';
    }

    
}
