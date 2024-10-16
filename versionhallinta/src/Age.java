import java.util.Random;
public class Age {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
            int ika = randomNumber;
            System.out.println("Olen ainakin " + randomNumber + " vuotta vanha!");

            // Tulostusehdot
            if (ika >= 0 && ika < 18)
                {System.out.println("Olet alaikäinen");
                    if (ika >= 15) {
                    System.out.print("Saat ajaa mopoa");
                 }
                if (ika >= 16 && ika <= 17) {
                System.out.println(" & kevytmoottoripyörää");
                }
            }

            else if (ika == 18) {
                System.out.println("Onneksi olkoon täysi-ikäisyydestä! Voit nyt hankkia ajokortin!");
            }

            else if (ika == 100) {
                System.out.println("***~~~~~***\nDude you old man\n***~~~~~***");
            }


            
            else if (ika >= 58 && ika < 65) {
                System.out.println("Eikö työnteko maita? Have you tried *varhaiseläke*?");
            }

            else if (ika >= 65) {
               if (ika == 65) {
                    System.out.println("Hyvejä eläkettä");
                }
                else {
                    System.out.println("Olet eläkeläinen");
                }
            }
 
            else {
                System.out.println("Olet aikuinen");
            if (ika >= 20 && ika <= 60 && ika % 10 == 0){
                    System.out.println("Onneksi olkoon tasaluvusta!");
                }
            if (ika >= 40 && ika <= 50){
                System.out.println("Onnea keski-iän kriisistä");
            }

           }

       
    }
}
