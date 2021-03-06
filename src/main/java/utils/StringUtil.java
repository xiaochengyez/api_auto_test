package utils;

public class StringUtil {
    /**
     *
     * @param sourceStr 待替换字符串（原字符串）
     * @param matchStr  匹配字符串
     * @param replaceStr  目标替换字符串
     * @return sourceStr  替换后的字符串
     */

    public static String replaceFirst(String sourceStr,String matchStr,String replaceStr){
        int index = sourceStr.indexOf(matchStr);
        int matLength = matchStr.length();
        int sourLength = sourceStr.length();
        String beginStr = sourceStr.substring(0,index);
        String endStr = sourceStr.substring(index+matLength,sourLength);
        sourceStr = beginStr+replaceStr+endStr;
        return sourceStr;
    }
}
