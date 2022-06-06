package com.bob.demo2.vo;

import com.bob.bole.halo.framework.check.api.annotation.CheckV;
import lombok.Data;

/**
 * TestVO class
 * description: TODO
 *
 * @author majiangwei
 * @date 2022/5/6
 */
@Data
public class TestVO {
    @CheckV(desc = "客户号",notNull = true,length = "20")
    private String id;
    @CheckV(desc="客户名称",notNull = true,length = "20")
    private String chClientName;
    @CheckV(desc="创建时间",notNull = true,length = "20")
    private String createTime;
}