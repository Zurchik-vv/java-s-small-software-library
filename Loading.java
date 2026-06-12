public class Loading {
    public static void main (String[] args) {
        for (int i = 0; i <=100 ; i++) {
            System.out.println("Loading: " + i + "%");
            try{
                Thread.sleep(100);

            }catch (Exception e){
                System.out.println("Error " + e);
            }
        }
    }
}
