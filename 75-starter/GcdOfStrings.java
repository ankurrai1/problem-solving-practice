
//Euclidean algorithm

public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        if(str1.equals(str2)){
            return str1;
        }
        if (str1.startsWith(str2)) {
            String str = str1.substring(str2.length());
            return gcdOfStrings(str, str2);
        }
        return "";       
    }
}


// Fast solution 

// if merging forward and backward are same then
// take hcf of size of both and take substring of any is your result

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdVal = gcd(str1.length(),str2.length());
        return str2.substring(0,gcdVal);
    }

    int gcd(int x,int y){
      if(y==0) return x;
      else return gcd(y,x%y);
    }
}