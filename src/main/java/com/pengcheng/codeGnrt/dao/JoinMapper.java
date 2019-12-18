package com.pengcheng.codeGnrt.dao;

import com.pengcheng.codeGnrt.domain.Join;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinMapper {

    Join selectOneById(@Param("id") Long id);

}
