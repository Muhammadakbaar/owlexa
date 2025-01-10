/**
 * Created by IntelliJ IDEA.
 * Project : Just
 * User: Muhammad Akbar
 * GitHub: muhammadakbaar
 * Date: 1/10/25
 * Time: 10:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindLastPosisi {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 3, 8, 5, 2, 5, 9};
        System.out.println(findIndexTerakhir(numbers, 5));
        System.out.println(findIndexTerakhir(numbers, 2));
        System.out.println(findIndexTerakhir(numbers, 10));
    }
    public static int findIndexTerakhir(int[] numbers, int target) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
