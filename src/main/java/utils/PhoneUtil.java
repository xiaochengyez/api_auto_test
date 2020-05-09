package utils;

public class PhoneUtil {
    private static String[] telFirst="130,131,132,133,134,135,136,137,138,139,150,151,152,153,155,156,157,158,159,171,181,183,185,186,187,189,191,199".split(",");

    public static int getNum(int start,int end) {
        return (int)(Math.random()*(end-start+1)+start);
    }

    /**
     * 返回手机号码
     */
    public static String getPhone() {
        int index=getNum(0,telFirst.length-1);
        String first=telFirst[index];
        String second=String.valueOf(getNum(1,888)+10000).substring(1);
        String third=String.valueOf(getNum(1,9100)+10000).substring(1);
        return first+second+third;
    }
}
