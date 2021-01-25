public class test {
    public static void main(String[] args){
        int n = 2;
        for (int i = n; i > 0; i/=2){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < 1000; k++){
                    System.out.println(1);
                }
            }
        }
    }
}
