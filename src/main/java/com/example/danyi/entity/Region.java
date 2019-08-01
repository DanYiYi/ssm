package com.example.danyi.entity;

import java.util.Date;

/**
 * 省市区表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-07-30 18:47:51
 */

public class Region {


	/**
	 * 地区表id
	 */

	private Integer regionId;
	/**
	 * 地区编码
	 */
	private String regionCode;
	/**
	 * 地区名称
	 */
	private String regionName;
	/**
	 * 父级id
	 */
	private Long parentId;
	/**
	 * 地区层级
	 */
	private Integer regionLevel;
	/**
	 * 地区排序
	 */
	private Integer regionOrder;
	/**
	 * 地区英文名称
	 */
	private String regionNameEn;
	/**
	 * 地区名称简写
	 */
	private String regionShortnameEn;
	/**
	 * 创建人
	 */
	private Long creator;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改人
	 */
	private Long modifier;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 删除标识
	 */
	private Integer deleted;

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getRegionLevel() {
		return regionLevel;
	}

	public void setRegionLevel(Integer regionLevel) {
		this.regionLevel = regionLevel;
	}

	public Integer getRegionOrder() {
		return regionOrder;
	}

	public void setRegionOrder(Integer regionOrder) {
		this.regionOrder = regionOrder;
	}

	public String getRegionNameEn() {
		return regionNameEn;
	}

	public void setRegionNameEn(String regionNameEn) {
		this.regionNameEn = regionNameEn;
	}

	public String getRegionShortnameEn() {
		return regionShortnameEn;
	}

	public void setRegionShortnameEn(String regionShortnameEn) {
		this.regionShortnameEn = regionShortnameEn;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifier() {
		return modifier;
	}

	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
}
