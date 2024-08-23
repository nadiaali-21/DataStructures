
package middleinsertion;

public class Middleinsertion {

      
    public static void main(String[] args) {
        // TODO code application logic here
         int arr[]=new int[6];
         arr[0]=100;
         arr[1]=200;
         arr[2]=300; 
         arr[3]=400;
         arr[4]=500;
         System.out.println("Array before insertion: ");
         for(int i=0;i<arr.length;i++){
             System.out.println("Element at index "+i +" "+arr[i]);
         }
         arr[2]=250;
         System.out.println("After insertion in middle:");
         for(int i=arr.length-1;i>0;i--){
             arr[i]=arr[i-1];
         }
          for(int i=0;i<arr.length;i++){
            System.out.println("Element at index "+i +" "+arr[i]);

         }
    }
    
}
