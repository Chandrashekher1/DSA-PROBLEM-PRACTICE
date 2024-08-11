package com.CP03;

public class ipAddress {
    public String defangIPaddr(String address) {
        for (int i=0; i< address.length()-1;i++){
            if (address.charAt(i) == '.'){
                address.charAt(i) = ',';
            }
        }
    }
}
