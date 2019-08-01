package com.example.danyi.service;

import com.example.danyi.entity.Region;
import com.example.danyi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegionService {
    /**查询所有省级城市
     * @return
     */
    public List<Region> getRegion();

    /**根据省级城市查询市
     * @param proviceId
     * @return
     */
    public List<Region> getCity(Long proviceId);

    /**根据城市id查询县级城市
     * @param countryId
     * @return
     */
    public List<Region> getCountry(Long countryId);
}
