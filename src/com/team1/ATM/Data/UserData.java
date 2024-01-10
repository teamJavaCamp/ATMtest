package com.team1.ATM.Data;
import com.team1.ATM.DTO.UserDTO;
import java.util.ArrayList;

public class UserData {

    public ArrayList<UserDTO> user = new ArrayList<>();

    public void userName(UserDTO user) {

//        user.getName();
    }

    public void pass(UserDTO user) {
        user.getPass();
    }


}
//    UserDTO user = new UserDTO(user.getName(),user.getAge(),user.getPass(),user.getPhoneNo(),user.getBankAccNo());