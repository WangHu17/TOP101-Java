import java.util.*;

//验证IP地址
public class Solution {
    public String solve (String IP) {
        String[] split1 = IP.split("\\.", -1);
        String[] split2 = IP.split(":", -1);
        if(split1.length == 4){
            return isIPv4(split1);
        }else if(split2.length == 8){
            return isIPv6(split2);
        }
        return "Neither";
    }
    
    public String isIPv4(String[] split){
        for(int i=0; i<4; i++){
            if(split[i].charAt(0) == '0')return "Neither";
            if(split[i].length() > 3)return "Neither";
            for(Character c:split[i].toCharArray()){
                if(Character.isLetter(c))return "Neither";
            }
            Integer n = Integer.parseInt(split[i]);
            if(n < 0 || n > 255)return "Neither";
        }
        return "IPv4";
    }
    
    public String isIPv6(String[] split){
        for(int i=0; i<8; i++){
            if(split[i].length() == 0 || split[i].length() > 4)return "Neither";
            for(Character c:split[i].toCharArray()){
                c = Character.toLowerCase(c);
                if(!Character.isDigit(c) && (c<'a' || c>'f'))return "Neither";
            }
        }
        return "IPv6";
    }
}