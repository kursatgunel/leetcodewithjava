/* bir dizi üzerinde verilen aralık güncellemelerini hızlıca uygulamak
için fark dizisi kullandık. Ardından kümülatif toplamı hesaplayarak her elemanın
değerini bulduk.
*/

public class AdditionRange {
    class Solution {
        public int[] getModifiedArray(int length, int[][] updates) {
            int[] result = new int[length];

            // Güncellemeleri işle
            for (int[] update : updates) {
                int start = update[0];
                int end = update[1];
                int increment = update[2];

                result[start] += increment;
                if (end < length - 1) {
                    result[end + 1] -= increment;
                }
            }
            for (int i = 1; i < length; i++) {
                result[i] += result[i - 1];
            }

            return result;
        }
    }

}
