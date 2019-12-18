package com.pengcheng.codeGnrt.service.impl;

import com.pengcheng.codeGnrt.dao.JoinMapper;
import com.pengcheng.codeGnrt.domain.Join;
import com.pengcheng.codeGnrt.service.IJoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService implements IJoinService {

    @Autowired
    private JoinMapper joinMapper;

    @Override
    public Join byId(Long id) {
        return joinMapper.selectOneById(id);
    }

}
