/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author T gil
 */
@Entity
@Table(name="Book_Category_Tb")
public class BookCategoryModel {
    @Id
    @Column(name = "BOOK_No",length = 6,unique = true)
    private String Id;
    @Column(name = "BOOK_CATEGORY_NAME",length = 70,nullable = false)
    private String Name;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "BookCategory{" + "Id=" + Id + ", Name=" + Name + '}';
    }
    
    
}
