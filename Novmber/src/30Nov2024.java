class AddBinaryStrings{

    // GFG Problem Of The Day : Add Binary Strings
    // Problem link : https://www.geeksforgeeks.org/problems/add-binary-strings3805/1
    static public String addBinary(String s1, String s2) {
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);

        str1.reverse();
        str2.reverse();

        // find the length
        int n1 = str1.length();
        int n2 = str2.length();

        int n = Math.max(n1, n2);

        int carry = 0;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++){
            int bit1 = i < n1 ? str1.charAt(i) - '0': 0;
            int bit2 = i < n2 ? str2.charAt(i) - '0': 0;

            int sum = bit1 + bit2 + carry;  // cal sum
            result.append(sum % 2);         //append bit(0 or 1) into result
            carry = sum / 2;        // update the carray
        }

        // handle carray 1
        if(carry != 0){
            result.append(carry);
        }

        // Reverse the result and remove leading zeros
        while(result.length() > 1 && result.charAt(result.length() - 1) == '0'){
            result.setLength(result.length()-1);
        }

        return result.reverse().toString();
    }

    static public String addBinary1(String s1, String s2){
         int i = s1.length()-1;
         int j = s2.length()-1;
         int carry = 0;
         StringBuilder result = new StringBuilder();

         while(i >=0 || j >= 0 || carry > 0){
              int bit1 = (i >= 0) ? s1.charAt(i)-'0' : 0;
              int bit2 = (j >= 0) ? s2.charAt(j)-'0' : 0;

              int sum = bit1 + bit2 + carry;
              result.append(sum % 2);
              carry = sum / 2;
              i--;
              j--;

         }

         return result.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        String result = addBinary(s1,s2);
        System.out.println(result);

    }
}