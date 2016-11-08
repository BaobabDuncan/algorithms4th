package sorts;

import junit.framework.TestCase;
import utils.StdOut;

/**
 * Created by sanguk on 08/11/2016.
 */
public class TestQuick extends TestCase {
    public void testQuick(){
        String[] lists = new String[]{"m","U","h","X","D","N","t","s","v","I","N","L","N","m","F","d","R","n","V","D","N","n","H","M","N","s","T","x","q","w","m","o","V","f","e","b","D","k","a","E","Q","Q","a","r","p","g","z","U","n","s","n","t","G","U","N","b","G","Y","g","j","c","i","f","J","Y","d","m","D","E","y","N","e","t","o","U","v","p","k","q","q","T","K","W","C","C","z","E","r","y","s","S","G","g","S","o","e","y","h","a","O","I","I","Q","D","e","Q","W","a","r","O","Y","S","T","n","m","J","S","H","L","J","W","w","W","l","Q","A","b","f","L","V","m","y","T","N","O","P","o","I","O","h","U","S","n","L","O","W","b","E","e","g","y","l","Q","I","a","i","u","D","R","D","O","R","K","b","R","Q","X","D","W","r","M","w","a","N","x","S","G","X","k","W","g","l","Q","w","n","Z","B","W","K","S","N","R","S","f","h","W","x","u","b","C","k","v","B","Y","U","g","I","W","Z","l","J","w","z","g","R","W","S","F","g","m","m","j","L","R","P","x","T","D","o","N","R","k","P","S","S","T","N","n","w","T","c","Y","T","P","i","E","j","H","x","B","W","h","l","y","h","f","d","z","d","a","M","E","g","T","L","K","X","t","O","c","s","I","h","v","u","c","k","j","y","P","P","R","F","X","f","R","h","R","D","L","q","K","S","n","A","A","e","v","e","p","X","J","b","m","x","r","E","q","n","q","c","Q","r","p","P","B","O","g","d","g","Q","k","z","v","d","H","j","P","B","H","I","O","i","b","f","C","Z","Q","A","b","W","Y","L","z","F","h","H","h","S","s","Y","B","T","Z","C","b","H","h","o","v","P","M","T","P","D","c","q","x","m","Q","x","o","e","d","N","e","V","k","e","h","Z","K","q","b","S","G","G","x","F","e","H","i","C","X","E","x","b","B","s","O","x","m","H","V","G","r","E","T","K","V","p","d","v","x","v","s","r","m","Z","a","v","O","p","u","p","W","M","g","i","v","z","C","Y","S","g","i","I","e","Z","x","A","p","U","g","t","E","C","i","n","q","I","v","M","t","m","p","z","Q","Y","H","f","f","l","i","l","z","a","c","e","d","f","D","c","T","l","v","A","r","K","a","l","K","E","Z","r","l","v","s","m","k","a","q","P","X","w","X","j","o","T","K"};
        Quick.sort(lists);
        for(String a : lists) {
            StdOut.println(a);
        }
    }
}
