package aze.company.springdatajpa.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname",nullable = false)
    private String surname;

    @Column(name = "birth_date", nullable = false)
    private Integer birthOfDate;

    @Column(name = "card_number",nullable = false,unique = true)
    private String cardNumber;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and Setter for birthOfDate
    public Integer getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Integer birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    // Getter and Setter for cardNumber
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
