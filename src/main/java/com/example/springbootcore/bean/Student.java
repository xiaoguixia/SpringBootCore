package com.example.springbootcore.bean;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.username
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.password
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.email
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.username
     *
     * @return the value of student.username
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.username
     *
     * @param username the value for student.username
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.password
     *
     * @return the value of student.password
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.password
     *
     * @param password the value for student.password
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.email
     *
     * @return the value of student.email
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.email
     *
     * @param email the value for student.email
     *
     * @mbg.generated Wed May 18 11:38:35 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}