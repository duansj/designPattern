package designPattern.strategy;

/**
 * Created with IntelliJ IDEA
 * Created By duansongjiang
 * Date: 2017/12/12
 * Time: 18:42
 */
public abstract class AbstractCauculator {
    public int[] split(String exp, String opt) {
        String[] array = exp.split(opt);

        int[] arrayInt = new int[2];

        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
