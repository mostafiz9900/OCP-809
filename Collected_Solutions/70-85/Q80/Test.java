package com.coderbd.Q80;

import java.time.Instant;

public class Test {
    // Login time: 2015-01-12T21:50:10.817Z
    public static void main(String[] args) throws InterruptedException {
        Instant loginTime=Instant.now();
        Thread.sleep(36000);
        //Logout time:2015-01-12T21:58:19.880z
        Instant logoutTime=Instant.now();
        loginTime = loginTime.truncatedTo(ChoronoUnit.MINUTIES);      //line n1
        logoutTime = logoutTime.truncatedTo(ChoronoUnit.MINUTIES);
        
        if(loginTime.isBefore(logoutTime)){
            System.out.println("Logged out at:"+logoutTime);
        }else{
            System.out.println("Can't logout");
        }
        
        // Ans Confuse
    }
    
}
