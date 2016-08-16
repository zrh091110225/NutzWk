package cn.wizzer.modules.sys;

import cn.wizzer.common.DBInfo;
import cn.wizzer.common.Message;
import cn.wizzer.common.annotation.SLog;
import cn.wizzer.common.mvc.filter.PrivateFilter;
import cn.wizzer.common.page.Pagination;
import cn.wizzer.common.util.DateUtils;
import cn.wizzer.modules.sys.service.DictService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.nutz.dao.Cnd;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ronghaizheng on 16/8/16.
 */

@IocBean
@At("/private/sys/dict")
@Filters({ @By(type = PrivateFilter.class) })
@SLog(tag = "配置管理", msg = "")
public class DictAction {
    @Inject
    DictService dictService;

    @At("")
    @Ok("vm:template.private.sys.dict.index")
    @RequiresPermissions("sys:dict")
    @SLog(tag = "字典列表", msg = "访问字典列表")
    public Object index() {
        return "";
    }

    @At
    @Ok("vm:template.private.sys.dict.list")
    @RequiresPermissions("sys:dict")
    @SLog(tag = "字典列表", msg = "访问字典列表，第${args[0]}页.")
        public Pagination list(@Param("curPage") int curPage, @Param("pageSize") int pageSize, HttpServletRequest req) {
        return dictService.listPage(curPage, pageSize, DBInfo.SYS_DICT.getRealDbName(), Cnd.orderBy().desc("create_time"));
    }
}
