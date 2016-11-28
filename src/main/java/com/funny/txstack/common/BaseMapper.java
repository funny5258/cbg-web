package com.funny.txstack.common;

/**
 * Created by funny on 2016/11/28.
 */
public interface BaseMapper <T extends BaseEntity>{
    /**
     * 有选择性的新增对象.
     *
     * @param entity 对象实例.
     * @return 受影响行数.
     */
    int insert(T entity);

    /**
     * 更新对象.无值的属性会被设置为空
     * @param entity 对象实例.
     * @return 受影响行数.
     */
    int updateById(T entity);

    /**
     * 有选择性的更新对象.
     * @param entity 对象实例.
     * @return 受影响行数.
     */
    int updateByIdSelected(T entity);

    /**
     * 根据ID获取对象.
     *
     * @param id 对象ID.
     * @return 对象实例.
     */
    T findById(Long id);
}
