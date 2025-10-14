public class MediumOfTwoSorted arrays{
    public static double findMedianSortedarrays(int[]nums1,int[]nums2) {
        if(nums1.length>nums2.length){
        findMedianSortedarrays(num1,num2)
        }
        int m = nums1.length;
        int n = nums2.length;
        int half=total/2;
        int left=0,right=m-1;
        while(true){
            int i=(left+right)/2;
            int j=half-i-2;
            double Aleft=(i>=0)
            double Aright=(i>=1<m)
            double Bleft=(j>=0)
            double Bright=(j>=1<n)
            if(Aleft<= Bright && Bleft <=Aright){
                if(total %2==1){
                    return math.min(Aright,Bright);
                }
                return(math.max(Alright,Bleft)math.min(Aright,Bright))/2;
            }
            else if(Aleft.Bright){
              right=i-j;
            }
            else{
                left=i+j;
            }
        }
    }
public static void main[String[]args]{
int nums1=(1,3);
int nums2=(2);
System.out.println(findMedianSortedarrays(nums1,nums2));
}


            

             
        

