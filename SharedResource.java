/*******************************
 * Author: Elvira van der Ven  *                                                    
 * Date:   26/06/2020          *                                                                                             *
 *******************************/

package week5.ThreadsUitprobeerselen;

public class SharedResource {
    private int x;

    public SharedResource() {
        this.x = 0;
    }

    public void countUp(){
        this.x++;
    }

    public void countDown(){
        this.x--;
    }

    @Override
    public String toString() {
        return "SharedResource{" +
                "x=" + x +
                '}';
    }
}