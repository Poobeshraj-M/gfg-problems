//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int v=1;
        int a=arr[arr.length-1];
        for(int i=0;i<a-1;i++)
        {
            if(arr[i]==v) v++;
            else return v;
        }
        
        return v+1;
    }
}
