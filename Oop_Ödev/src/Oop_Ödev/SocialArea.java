public class SocialArea {

 boolean ispinballfull; // langırtta oynayan kişi sayısı



    private int pinballgamer; // langırtta bulunan kişi sayısı


    void gamepinpall(){

        if(ispinballfull){
            System.out.println("This area is full pleace wait..");
            return;
        }
        pinballgamer++;  // langırta oyuncu gelince oyuncu sayısını artırıyor

        if(pinballgamer==4){ ispinballfull=true;  }  // 4 kişiye ulaşınca dolu olacak
    }


    public int getPinballgamer() { // oyuncu sayısı için getter
        return pinballgamer;
    }




}
