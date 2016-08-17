package cn.wizzer.modules.sys.bean;

import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

/**
 * Created by ronghaizheng on 16/8/16.
 */
@Table("dict_config")
public class Dict_config implements Serializable {
    @Column
    @Id
    private int id;
    @Column("`code`")
    @ColDefine(type = ColType.VARCHAR, width = 100, notNull = true)
    private String code;// 配置代码
    @Column("`name`")
    @ColDefine(type = ColType.VARCHAR, width = 100, notNull = true)
    private String name;// 配置名称
    @Column("`key`")
    @ColDefine(type = ColType.VARCHAR, width = 100, notNull = true)
    private String key;// 配置项key
    @Column("`value`")
    @ColDefine(type = ColType.TEXT, notNull = true)
    private String value;// 配置项value
    @Column("`note`")
    @ColDefine(type = ColType.VARCHAR, width = 200, notNull = true)
    private String note;// 配置项说明

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
