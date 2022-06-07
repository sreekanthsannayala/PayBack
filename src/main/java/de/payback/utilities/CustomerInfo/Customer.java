package de.payback.utilities.CustomerInfo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Customer {
    private String firstName;
    private String lastName;
    private String birthdayDate;
    private String birthMonth;
    private String birthYear;
    private String pincode;
    private String address;
    private String place;


}
