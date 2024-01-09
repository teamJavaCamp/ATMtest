package com.team1.ATM.Data;
import com.team1.ATM.DTO.UserDTO;

import java.util.ArrayList;
public class UserData {
    private UserDTO user;
    public UserData() {
        this.user = new UserDTO();
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
//    UserDTO user = new UserDTO(user.getName(),user.getAge(),user.getPass(),user.getPhoneNo(),user.getBankAccNo());