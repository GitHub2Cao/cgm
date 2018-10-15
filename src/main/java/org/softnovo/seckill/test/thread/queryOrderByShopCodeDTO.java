package org.softnovo.seckill.test.thread;

import java.util.Date;

public class queryOrderByShopCodeDTO implements Cloneable {

	@Override
	public queryOrderByShopCodeDTO clone() {
		queryOrderByShopCodeDTO o = null;
		try {
			o = (queryOrderByShopCodeDTO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

	private String shopCode;

	private Integer page;

	private Integer limit;

	private String orderNo;

	/**
	 * 订单状态
	 */
	private Integer status;

	/**
	 * 核销状态
	 */
	private Integer serviceStatus;

	/**
	 * 车主手机
	 */
	private String customerPhone;

	/**
	 * 下单时间段
	 */
	private Date orderTimeStart;

	private Date orderTimeEnd;

	/**
	 * 核销时间段
	 */
	private Date serviceTimeStart;

	private Date serviceTimeEnd;

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Date getOrderTimeStart() {
		return orderTimeStart;
	}

	public void setOrderTimeStart(Date orderTimeStart) {
		this.orderTimeStart = orderTimeStart;
	}

	public Date getOrderTimeEnd() {
		return orderTimeEnd;
	}

	public void setOrderTimeEnd(Date orderTimeEnd) {
		this.orderTimeEnd = orderTimeEnd;
	}

	public Date getServiceTimeStart() {
		return serviceTimeStart;
	}

	public void setServiceTimeStart(Date serviceTimeStart) {
		this.serviceTimeStart = serviceTimeStart;
	}

	public Date getServiceTimeEnd() {
		return serviceTimeEnd;
	}

	public void setServiceTimeEnd(Date serviceTimeEnd) {
		this.serviceTimeEnd = serviceTimeEnd;
	}

	public Integer getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(Integer serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	@Override
	public String toString() {
		return "queryOrderByShopCodeDTO [shopCode=" + shopCode + ", page=" + page + ", limit=" + limit + ", orderNo="
				+ orderNo + ", status=" + status + ", serviceStatus=" + serviceStatus + ", customerPhone="
				+ customerPhone + ", orderTimeStart=" + orderTimeStart + ", orderTimeEnd=" + orderTimeEnd
				+ ", serviceTimeStart=" + serviceTimeStart + ", serviceTimeEnd=" + serviceTimeEnd + "]";
	}
}
