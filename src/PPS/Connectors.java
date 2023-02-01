package PPS;

public class Connectors {
    public static String stringConn(String[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i].charAt(arr[i].length() - 1) != arr[i+1].charAt(0)){
                return "NOPE";
            }
        }
        return "CORRECT";
    }

    public static void main(String[] args) {

        String[] arr = {"shaurya", "ahujan", "nabhinav", "victoria"};
        System.out.println(stringConn(arr));
    }
}
