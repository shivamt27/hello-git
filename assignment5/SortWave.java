class SortWave
{
    void sortInWave(int arr[], int n)
    {
         int i;
        for (i=0; i<n-1; i += 2){
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;

     }
	for(i=0;i<arr.length;i++)
            {System.out.print(arr[i]+" ");}   
 }
    public static void main(String[] arg)
    {
        SortWave ob = new SortWave();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        
	ob.sortInWave(arr, n);
        for(int i=0;i<10;i++)
            {System.out.print(arr[i]+" ");}
    }
}