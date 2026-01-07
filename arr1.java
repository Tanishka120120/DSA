/*public class arr1 {
    public static void main(String[] args) {
       int[] ar={1,5,8,7,4,3,6,9,2};
        int n=9;
        int start=0;
        int curr_sum=0;
        int max_len=0;
        int k=3;
        for(int end=0; end<n; end++){
            curr_sum+=ar[end];
            while (curr_sum>k) {
                curr_sum-=ar[start];
                start++;
            }
            max_len=Math.max(max_len, end-start+1);
        }
        System.out.println(max_len);
    }
}*/
import java.util.ArrayList;

class arr1 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(0);

        int n = arr.size();
        int K = 4;

        int start = 0, sum = 0, maxLen = 0;

        for (int end = 0; end < n; end++) {
            sum += arr.get(end);

            while (sum > K) {
                sum -= arr.get(start);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println(maxLen);
    }
}