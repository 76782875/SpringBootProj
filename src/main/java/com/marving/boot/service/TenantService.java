package com.marving.boot.service;

import com.marving.boot.domain.Tenant;

import java.util.List;

/**
 * Created by mercop on 2017/7/27.
 */

public interface TenantService {
    List<Tenant> getAllTenantOfThisDb();
}
