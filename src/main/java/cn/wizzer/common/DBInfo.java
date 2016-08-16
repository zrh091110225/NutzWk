package cn.wizzer.common;

/**
 * Created by ronghaizheng on 16/8/16.
 */
public enum DBInfo {
    SYS_DICT("sys_dict");

    String realDbName;

    DBInfo(String realDbName) {
        this.realDbName = realDbName;
    }

    public String getRealDbName() {
        return realDbName;
    }

    public void setRealDbName(String realDbName) {
        this.realDbName = realDbName;
    }
}
