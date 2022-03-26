import java.util.*;

// 数字字符串转化成IP地址
public class Solution {
    public ArrayList<String> restoreIpAddresses (String s) {
        ArrayList<String> res = new ArrayList<String>();
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                for(int k=1; k<=3; k++){
                    for(int m=1; m<=3; m++){
                        if(i+j+k+m == s.length()){
                            String s1 = s.substring(0,i);
                            String s2 = s.substring(i,i+j);
                            String s3 = s.substring(i+j,i+j+k);
                            String s4 = s.substring(i+j+k,i+j+k+m);
                            if(check(s1)&&check(s2)&&check(s3)&&check(s4)){
                                String s5 = s1 + "." + s2 + "." + s3 + "." + s4;
                                res.add(s5);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    
    public boolean check(String s){
        if(s.length() != 1 && s.charAt(0) == '0' || Integer.parseInt(s) > 255)
            return false;
        return true;
    }
}