import org.junit.Test;

public class L2022211819_1_Test {

//    public static void main(String[] args) {
//        Solution1 solution = new Solution1();
//
//        // 测试用例1：普通非循环小数
//        System.out.println("测试用例1: " + solution.fractionToDecimal(1, 2));  // 输出: "0.5"
//
//        // 测试用例2：整数
//        System.out.println("测试用例2: " + solution.fractionToDecimal(2, 1));  // 输出: "2"
//
//        // 测试用例3：带有循环节的小数
//        System.out.println("测试用例3: " + solution.fractionToDecimal(4, 333));  // 输出: "0.(012)"
//
//        // 测试用例4：负数情况
//        System.out.println("测试用例4: " + solution.fractionToDecimal(-50, 8));  // 输出: "-6.25"
//
//        // 测试用例5：带有循环节的小数
//        System.out.println("测试用例5: " + solution.fractionToDecimal(1, 6));  // 输出: "0.1(6)"
//
//        // 测试用例6：两个负数相除，结果为正数
//        System.out.println("测试用例6: " + solution.fractionToDecimal(-1, -2));  // 输出: "0.5"
//
//        // 测试用例7：分子为0
//        System.out.println("测试用例7: " + solution.fractionToDecimal(0, 3));  // 输出: "0"
//
//        // 测试用例8：大数测试
//        System.out.println("测试用例8: " + solution.fractionToDecimal(2147483647, 37));  // 输出: "58040098.(567)"
//    }

    @Test
    public void solution1Test() {
        Solution1 solution = new Solution1();

        // 测试用例1：普通非循环小数
        System.out.println("测试用例1: " + solution.fractionToDecimal(1, 2));  // 输出: "0.5"

        // 测试用例2：整数
        System.out.println("测试用例2: " + solution.fractionToDecimal(2, 1));  // 输出: "2"

        // 测试用例3：带有循环节的小数
        System.out.println("测试用例3: " + solution.fractionToDecimal(4, 333));  // 输出: "0.(012)"

        // 测试用例4：负数情况
        System.out.println("测试用例4: " + solution.fractionToDecimal(-50, 8));  // 输出: "-6.25"

        // 测试用例5：带有循环节的小数
        System.out.println("测试用例5: " + solution.fractionToDecimal(1, 6));  // 输出: "0.1(6)"

        // 测试用例6：两个负数相除，结果为正数
        System.out.println("测试用例6: " + solution.fractionToDecimal(-1, -2));  // 输出: "0.5"

        // 测试用例7：分子为0
        System.out.println("测试用例7: " + solution.fractionToDecimal(0, 3));  // 输出: "0"

        // 测试用例8：大数测试
        System.out.println("测试用例8: " + solution.fractionToDecimal(2147483647, 37));  // 输出: "58040098.(567)"

    }

}
