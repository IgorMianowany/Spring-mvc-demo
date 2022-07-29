package com.example.springdemo.mvc;

import org.intellij.lang.annotations.RegExp;
import validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @Size(min =1,message="is required")
    @NotNull(message="is required")
    private String lastName;

    @Min(value = 0, message = "value must be between 0 and 10")
    @Max(value = 10, message = "value must be between 0 and 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/digits")
    private String postalCode;

    @CourseCode(value="LUV", message="must start with LUV")
    private Integer courseCode;

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


    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }
}
