/**
 * Created by sunny on 10/17/18.
 */
public class RunnerStack {
    public static void main(String args[]){

        Stack nums = new Stack();
        System.out.println("Empty = " + nums.isEmpty());
        nums.push(15);
        nums.push(8);
        System.out.println(nums.peek());
        nums.push(10);
        nums.push(7);

        System.out.println(nums.pop());

        System.out.println("size is " + nums.size());

        System.out.println("Empty = " + nums.isEmpty());

        nums.show();

    }


}
