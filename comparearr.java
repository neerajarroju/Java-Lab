class comparearr
{
 public static void main(String[]args)
 {
  int[] arr={4,7,3,9,2};
  int arr2[]={3,2,12,9,40,32,4};
  for(int i=0;i<arr.length;i++)
  {
    for(int j=0;j<arr2.length;j++)
    {
      if(arr[i]==arr2[j])
      {
       System.out.println(arr[i]);
      }
    }   
  }
 }
}