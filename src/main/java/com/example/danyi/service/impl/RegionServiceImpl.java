package com.example.danyi.service.impl;

import com.example.danyi.entity.Region;
import com.example.danyi.entity.User;
import com.example.danyi.mapper.RegionMapper;
import com.example.danyi.mapper.TestMapper;
import com.example.danyi.service.RegionService;
import com.example.danyi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;
    /**
     * 查询所有省级城市
     *
     * @return
     */
    @Override
    public List<Region> getRegion() {
        return regionMapper.getRegion();
    }

    /**
     * 根据省级城市查询市
     *
     * @param proviceId
     * @return
     */
    @Override
    public List<Region> getCity(Long proviceId) {
        return regionMapper.getCity(proviceId);
    }

    /**
     * 根据城市id查询县级城市
     *
     * @param countryId
     * @return
     */
    @Override
    public List<Region> getCountry(Long countryId) {
        return regionMapper.getCountry(countryId);
    }
}
