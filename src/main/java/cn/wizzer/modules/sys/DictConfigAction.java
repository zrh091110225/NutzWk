package cn.wizzer.modules.sys;

import cn.wizzer.common.mvc.filter.PrivateFilter;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Filters;

/**
 * Created by ronghaizheng on 16/8/16.
 */
@IocBean
@At("/private/dictConfig")
@Filters({ @By(type = PrivateFilter.class) })
public class DictConfigAction {
}
