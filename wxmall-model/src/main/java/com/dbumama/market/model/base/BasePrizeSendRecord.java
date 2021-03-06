package com.dbumama.market.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePrizeSendRecord<M extends BasePrizeSendRecord<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public M setPrizeId(java.lang.Long prizeId) {
		set("prize_id", prizeId);
		return (M)this;
	}

	public java.lang.Long getPrizeId() {
		return get("prize_id");
	}

	public M setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
		return (M)this;
	}

	public java.lang.Long getBuyerId() {
		return get("buyer_id");
	}

	public M setActivityId(java.lang.Long activityId) {
		set("activity_id", activityId);
		return (M)this;
	}

	public java.lang.Long getActivityId() {
		return get("activity_id");
	}

	public M setActivityType(java.lang.Integer activityType) {
		set("activity_type", activityType);
		return (M)this;
	}

	public java.lang.Integer getActivityType() {
		return get("activity_type");
	}

	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public M setActive(java.lang.Integer active) {
		set("active", active);
		return (M)this;
	}

	public java.lang.Integer getActive() {
		return get("active");
	}

	public M setCreated(java.util.Date created) {
		set("created", created);
		return (M)this;
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public M setUpdated(java.util.Date updated) {
		set("updated", updated);
		return (M)this;
	}

	public java.util.Date getUpdated() {
		return get("updated");
	}

}
