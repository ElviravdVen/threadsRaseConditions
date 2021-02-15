/*******************************
 * Author: Elvira van der Ven  *
 * Date:   26/06/2020          *                                                                                             *
 *******************************/

package week5.ThreadsUitprobeerselen;

public class Counter extends Thread{
    SharedResource resource;
    int maxRounds;

    public Counter(SharedResource resource, int rounds) {
        this.resource = resource;
        this.maxRounds = rounds;
    }

    public void countUp(){
        resource.countUp();
    }

    public void countDown(){
        resource.countDown();
    }

    @Override
    public void run() {
        for(int i = 0; i < this.maxRounds; i++){
            this.countUp();
            this.countDown();
        }

    }
}