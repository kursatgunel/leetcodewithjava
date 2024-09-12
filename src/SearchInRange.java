/* Verilen bir dizi içinde aranan sayının ilk ve son konumlarını
buluruz.İlk döngü, aranan sayının ilk geçtiği yeri bulur ve başlangıç indeksini belirler.
İkinci döngü ise diziyi sondan başa doğru tarayarak hedef sayının son geçtiği yeri
bulur ve bitiş indeksini belirler. */
public class SearchInRange {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1, -1};
            int start = -1;
            int end = -1;


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    start = i;
                    break;
                }
            }


            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    end = i;
                    break;
                }
            }

            if (start != -1 && end != -1) {
                ans[0] = start;
                ans[1] = end;
            }

            return ans;
        }
    }

}
