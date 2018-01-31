package com.lcy.entities;

/**
 * 测试用User
 *
 * @author lcy
 * @create 2018-01-26 16:15
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer age;

    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public User(Integer age, String email, Integer id, String password, String username) {
        this.age = age;
        this.email = email;
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public User(){

    }
}
