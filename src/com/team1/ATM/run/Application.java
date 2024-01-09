package com.team1.ATM.run;

import com.team1.ATM.View.LogInMenu;
import com.team1.ATM.View.MainMenu;

public class Application {

    public static void main(String[] args) {

        LogInMenu logIn = new LogInMenu();
        logIn.mainMenu();

        MainMenu main = new MainMenu();
        main.mainSite();
    }
}
