package com.mycompany.sg.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类 - 基类
 */

@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -6718838800112233445L;

	private String id;// ID
	private Date createDate;// 创建日期
	private Date modifyDate;// 修改日期

	@Id
	@Column(length = 36, nullable = true)
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")  //生成器名称，uuid生成类
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

    @Temporal(TemporalType.TIMESTAMP)
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}