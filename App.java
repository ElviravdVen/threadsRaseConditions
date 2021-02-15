/*******************************
 * Author: Elvira van der Ven  *                                                    
 * Date:   26/06/2020          *                                                                                             *
 *******************************/

package week5.ThreadsUitprobeerselen;

public class App {
    public static void main(String[] args) {
//        Kast kast = new Kast();
//
//        Verhoger counterUp = new Verhoger(kast);
//        Verlager counterDown = new Verlager(kast);
//
//        for(int i = 0; i < 10000; i++){
//            counterUp.run();
//            counterDown.run();
//        }
//
//        kast.print();

        SharedResource resource = new SharedResource();
        Counter counter1 = new Counter(resource,1000000);
        Counter counter2 = new Counter(resource,1000000);
        Counter counter3 = new Counter(resource,1000000);
        Counter counter4 = new Counter(resource,1000000);

        counter1.run();
        counter2.run();
        counter3.run();
        counter4.run();

        System.out.println(resource.toString());
    }
}