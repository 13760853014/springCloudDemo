package com.jianke.demo.service.impl;

import com.jianke.demo.execption.BaseException;
import com.jianke.demo.execption.NoSupportException;
import com.jianke.demo.service.BaseMgmtService;
import org.springframework.data.domain.Page;

/**
 * @program: mall-share
 * @description: ${description}
 * @author: chenguiquan
 * @create: 2019-08-12 22:01
 **/
public class BaseQueryServiceAdapter<T, P> implements BaseMgmtService<T, P> {
    public BaseQueryServiceAdapter() {
    }

    @Override
    public T findById(Long id) throws BaseException {
        throw new NoSupportException();
    }

    @Override
    public T save(T vo) throws BaseException {
        throw new NoSupportException();
    }

    @Override
    public void deleteById(Long id) throws BaseException {
        throw new NoSupportException();
    }

    @Override
    public T update(T vo) throws BaseException {
        throw new NoSupportException();
    }

    @Override
    public Page<T> findByPage(P param, int pageIndex, int pageSize) throws BaseException {
        throw new NoSupportException();
    }
}
