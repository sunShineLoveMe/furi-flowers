package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setPrice(java.lang.Double price) {
		set("price", price);
		return (M)this;
	}
	
	public java.lang.Double getPrice() {
		return getDouble("price");
	}

	public M setPicUrl(java.lang.String picUrl) {
		set("pic_url", picUrl);
		return (M)this;
	}
	
	public java.lang.String getPicUrl() {
		return getStr("pic_url");
	}

	public M setDiscount(java.lang.String discount) {
		set("discount", discount);
		return (M)this;
	}
	
	public java.lang.String getDiscount() {
		return getStr("discount");
	}

	public M setOriginPrice(java.lang.Double originPrice) {
		set("origin_price", originPrice);
		return (M)this;
	}
	
	public java.lang.Double getOriginPrice() {
		return getDouble("origin_price");
	}

	public M setNowPrice(java.lang.Double nowPrice) {
		set("now_price", nowPrice);
		return (M)this;
	}
	
	public java.lang.Double getNowPrice() {
		return getDouble("now_price");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public M setExt1(java.lang.String ext1) {
		set("ext1", ext1);
		return (M)this;
	}
	
	public java.lang.String getExt1() {
		return getStr("ext1");
	}

	public M setExt2(java.lang.String ext2) {
		set("ext2", ext2);
		return (M)this;
	}
	
	public java.lang.String getExt2() {
		return getStr("ext2");
	}

	public M setExt3(java.lang.String ext3) {
		set("ext3", ext3);
		return (M)this;
	}
	
	public java.lang.String getExt3() {
		return getStr("ext3");
	}

	public M setCategoryId(java.lang.Integer categoryId) {
		set("category_id", categoryId);
		return (M)this;
	}
	
	public java.lang.Integer getCategoryId() {
		return getInt("category_id");
	}

}
