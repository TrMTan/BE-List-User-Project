package com.mycompany.user;

import jakarta.persistence.*;

@Entity // anh xa den bang co so du lieu
@Table(name = "users") // chi dinh chi tiet bang co so du lieu
public class User {
    @Id // anh xa den cot chinh trong bang csdl
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id dc tao tu dong theo bang csdl
    private Integer id;
    @Column(nullable = false, unique = true, length = 45) // nullable = false: gt cua email la bat buoc, unique = true: email la co duy nhat
    private String email;
    @Column(length = 15, nullable = false) // do dai mat khau toi da la 15
    private String password;
    @Column(length = 45, nullable = false, name = "first_name")
    private String firstName;
    @Column(length = 15, nullable = false, name = "last_name")
    private String lastName;

    private boolean enabled;
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
