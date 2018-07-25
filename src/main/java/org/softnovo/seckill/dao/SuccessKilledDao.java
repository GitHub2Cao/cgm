package org.softnovo.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.softnovo.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * 插入购买明细，可过滤重复.
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
