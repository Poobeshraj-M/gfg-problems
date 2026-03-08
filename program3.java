//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int max1=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(max1>arr[i]) return arr[i];
        }
        return -1;
    }
}
