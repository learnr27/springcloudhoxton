package com.cbb.springcloudhoxton.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author chengbb
 * @date 2020.6.30
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
