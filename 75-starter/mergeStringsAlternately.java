// SOLUTION 2
class mergeStringsAlternately_1 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length() ) {
            if(i < word1.length()){
                res.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();        
    }
}

// SOLUTION 1
class mergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        char[] res = new char[l1+l2];
        int i = 0, j = 0, k = 0;
         while (l1 > j && l2 > k) {
            if(i %2 == 0) {
                res[i] = word1.charAt(j);
                j++;
            }
            else{
                res[i] = word2.charAt(k);
                k++;
            }
            i++;
            System.out.println(res.length);
         }
         while(l1 > j){
            res[i++] = word1.charAt(j++);
         }
         while(l2 > k){
            res[i++] = word2.charAt(k++);
         }
        return res.toString();
    }
}