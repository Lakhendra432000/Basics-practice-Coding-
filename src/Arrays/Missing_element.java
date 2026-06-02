package Arrays;

// missing element find karna hi linear search or search in array kahte h
public class Missing_element {
    public static void main(String []args) {
//        int []arr={10,11,13,13,15};
//        boolean flag=false;
//        int target=14;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==target){
//                flag=true;
//                break;
//            }
//        }
//        if(flag==true){
//            System.out.println("target exist in aray:");
//        }
//        else {
//            System.out.println(" target not exist in array:");
//        }

        // here also find bindex

        int []arr={10,18,17,98, 89,99,90};
        int target=98;
        int found=-1;   // koi v negative number le sakte  Qki negative me array index nhi hota
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                found = i;
                break;
            }
        }
        if(found != -1){
            System.out.println(" target exist in array at index:" + found);
        }
        else {
            System.out.println("target not found :");
        }


    }
}
