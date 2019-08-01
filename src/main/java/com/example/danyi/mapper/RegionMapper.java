package com.example.danyi.mapper;

import com.example.danyi.entity.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RegionMapper {
    /**查询所有的省级id
     * @return
     */
    public List<Region> getRegion();

    /**根据省级id查询市级id
     * @param proviceId
     * @return
     */
    public List<Region> getCity(Long proviceId);

    public List<Region> getCountry(Long countryId);
}
