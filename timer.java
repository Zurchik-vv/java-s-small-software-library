public class timer {
    static void main(String[] args) {
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 60; i >= 0; i--) {
                    System.out.println(i + " ");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        System.out.println("Error:" + e);
                    }
                }
                System.out.println("\nFinished!!!");
            }
        });
        c.start();
    }
}
