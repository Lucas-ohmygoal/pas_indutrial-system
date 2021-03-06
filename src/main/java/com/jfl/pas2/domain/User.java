package com.jfl.pas2.domain;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_phone
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_priority
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private Integer userPriority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_memorized
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String isMemorized;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_auto_login
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private String isAutoLogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_phone
     *
     * @return the value of user.user_phone
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_phone
     *
     * @param userPhone the value for user.user_phone
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_priority
     *
     * @return the value of user.user_priority
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public Integer getUserPriority() {
        return userPriority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_priority
     *
     * @param userPriority the value for user.user_priority
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setUserPriority(Integer userPriority) {
        this.userPriority = userPriority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_memorized
     *
     * @return the value of user.is_memorized
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getIsMemorized() {
        return isMemorized;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_memorized
     *
     * @param isMemorized the value for user.is_memorized
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setIsMemorized(String isMemorized) {
        this.isMemorized = isMemorized == null ? null : isMemorized.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_auto_login
     *
     * @return the value of user.is_auto_login
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public String getIsAutoLogin() {
        return isAutoLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_auto_login
     *
     * @param isAutoLogin the value for user.is_auto_login
     *
     * @mbggenerated Mon Jul 12 08:13:19 CST 2021
     */
    public void setIsAutoLogin(String isAutoLogin) {
        this.isAutoLogin = isAutoLogin == null ? null : isAutoLogin.trim();
    }
}