package com.ruozedata.erp.datasource.mappers;

import com.ruozedata.erp.datasource.entities.Account;
import com.ruozedata.erp.datasource.entities.AccountExample;
import java.util.List;

import com.ruozedata.erp.datasource.entities.Account;
import com.ruozedata.erp.datasource.entities.AccountExample;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    Account selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ruozedata_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Account record);
}