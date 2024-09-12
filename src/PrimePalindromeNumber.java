
/* Bir sayıdan büyük ya da eşit olma koşulunu sağlayan ilk asal palindrome sayıyı bulur.
 Asal ve palindrom olan sayılar üretmek için farklı basamaklarda sayılar oluştururuz
ve bunların asal olup olmadığını kontrol ederek sonuç döndürürüz   */

public class PrimePalindromeNumber {
    class Solution {
        public int primePalindrome(int N) {
            for (int i = 1; i <= 5; i++) {
                int start = (int) Math.pow(10, i - 1);
                int end = (int) Math.pow(10, i);

                for (int root = start; root < end; root++) {
                    String rootStr = Integer.toString(root);
                    String palStr = rootStr + new StringBuilder(rootStr.substring(0, i - 1)).reverse().toString();
                    int num = Integer.parseInt(palStr);

                    if (num >= N && isPrime(num)) {
                        return num;
                    }
                }

                for (int root = start; root < end; root++) {
                    String rootStr = Integer.toString(root);
                    String palStr = rootStr + new StringBuilder(rootStr).reverse().toString();
                    int num = Integer.parseInt(palStr);

                    if (num >= N && isPrime(num)) {
                        return num;
                    }
                }
            }
            return -1;
        }

        private boolean isPrime(int n) {
            if (n < 2) {
                return false;
            }
            for (int j = 2; j <= (int) Math.sqrt(n); j++) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }


}
