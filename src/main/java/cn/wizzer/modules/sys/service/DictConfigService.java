package cn.wizzer.modules.sys.service;

import cn.wizzer.common.service.core.BaseService;
import cn.wizzer.modules.sys.bean.Sys_dict;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * Created by ronghaizheng on 16/8/16.
 */
@IocBean(args = { "refer:dao" })
public class DictConfigService extends BaseService<Sys_dict> {
    public DictConfigService(Dao dao) {
        super(dao);
    }

    public void getValue() {
        // select value from mppb_resource where `key` = #key# and `code` = #groupCode#
    }

    public void getResourcesByCode() {
        // select * from mppb_resource where code = #value#
    }

    public void getResourcesById() {
        // select * from mppb_resource where id = #value#
    }

    public void getResourceGroups() {
        // select `code`,`name` from `mppb_resource` group by code
    }
}
