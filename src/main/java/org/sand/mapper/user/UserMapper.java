package org.sand.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sand.model.po.user.UserPO;

@Mapper
public interface UserMapper extends BaseMapper<UserPO> {
}
