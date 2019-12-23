package com.ruozedata.erp.datasource.mappers;

import com.ruozedata.erp.datasource.entities.MaterialCategory;
import com.ruozedata.erp.datasource.entities.MaterialCategoryExample;
import java.util.List;

import com.ruozedata.erp.datasource.entities.MaterialCategory;
import com.ruozedata.erp.datasource.entities.MaterialCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface MaterialCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int countByExample(MaterialCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int deleteByExample(MaterialCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int insert(MaterialCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int insertSelective(MaterialCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    List<MaterialCategory> selectByExample(MaterialCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    MaterialCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MaterialCategory record, @Param("example") MaterialCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MaterialCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_materialcategory
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MaterialCategory record);
}