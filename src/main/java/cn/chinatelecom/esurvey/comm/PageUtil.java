package cn.chinatelecom.esurvey.comm;

public class PageUtil {

    /**
     * 计算page
     *
     * @param count
     * @param pageSize
     * @return
     */
    public static int pageCount(int count, int pageSize) {
        int testCond = count % pageSize;
        int totalPage = testCond == 0 ? count / pageSize : count / pageSize + 1;

        return totalPage;
    }
}
