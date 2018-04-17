package com.sda.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserWithLombok {

    private String firstName;
    private String secondName;
    private String birthDay;
    private String phoneNumber;

}
