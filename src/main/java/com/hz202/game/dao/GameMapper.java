package com.hz202.game.dao;

import com.hz202.game.entity.Game;

public interface GameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int insert(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int insertSelective(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    Game selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Game record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Game record);
}