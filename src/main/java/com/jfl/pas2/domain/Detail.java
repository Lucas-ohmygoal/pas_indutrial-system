package com.jfl.pas2.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Detail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.serial_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String serialNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.product_id
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.product_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private BigDecimal productNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.with_cups
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String withCups;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.with_circles
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String withCircles;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.with_switches
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String withSwitches;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.operator_name
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String operatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.operation_date
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String operationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column detail.operation_time
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private String operationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table detail
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.serial_number
     *
     * @return the value of detail.serial_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.serial_number
     *
     * @param serialNumber the value for detail.serial_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.product_id
     *
     * @return the value of detail.product_id
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.product_id
     *
     * @param productId the value for detail.product_id
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.product_number
     *
     * @return the value of detail.product_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public BigDecimal getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.product_number
     *
     * @param productNumber the value for detail.product_number
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setProductNumber(BigDecimal productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.with_cups
     *
     * @return the value of detail.with_cups
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getWithCups() {
        return withCups;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.with_cups
     *
     * @param withCups the value for detail.with_cups
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setWithCups(String withCups) {
        this.withCups = withCups == null ? null : withCups.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.with_circles
     *
     * @return the value of detail.with_circles
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getWithCircles() {
        return withCircles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.with_circles
     *
     * @param withCircles the value for detail.with_circles
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setWithCircles(String withCircles) {
        this.withCircles = withCircles == null ? null : withCircles.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.with_switches
     *
     * @return the value of detail.with_switches
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getWithSwitches() {
        return withSwitches;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.with_switches
     *
     * @param withSwitches the value for detail.with_switches
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setWithSwitches(String withSwitches) {
        this.withSwitches = withSwitches == null ? null : withSwitches.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.operator_name
     *
     * @return the value of detail.operator_name
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.operator_name
     *
     * @param operatorName the value for detail.operator_name
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.operation_date
     *
     * @return the value of detail.operation_date
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getOperationDate() {
        return operationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.operation_date
     *
     * @param operationDate the value for detail.operation_date
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column detail.operation_time
     *
     * @return the value of detail.operation_time
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public String getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column detail.operation_time
     *
     * @param operationTime the value for detail.operation_time
     *
     * @mbggenerated Wed Aug 11 21:50:55 CST 2021
     */
    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime == null ? null : operationTime.trim();
    }
}