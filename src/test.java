/**
 * Project name(项目名称)：计算算法和程序的运行时间
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/2
 * Time(创建时间)： 12:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();    //获取开始时间
        //------------------------------------------------------
        for (long i = 0; i < 1000000000L; i++)
        {
            i = i * 2 / 2 * 2 / 2;
        }
        //------------------------------------------------------
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

    }
}
