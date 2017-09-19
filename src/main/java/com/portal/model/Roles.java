package com.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.portal.RolesEnum;

@Entity
@Table(name = "Roles")
public class Roles {

	@Column(name = "role_name", nullable = false)
	private RolesEnum role_name;

	@Column(name = "admin")
	private Boolean isAdmin;

	@Column(name = "can_edit", nullable = false)
	private Boolean canEdit;

	@Column(name = "can_create", nullable = false)
	private Boolean canCreate;

	@Column(name = "can_view", nullable = false)
	private Boolean canView;

	public RolesEnum getRole_name() {
		return role_name;
	}

	public void setRole_name(RolesEnum role_name) {
		this.role_name = role_name;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}

	public Boolean getCanCreate() {
		return canCreate;
	}

	public void setCanCreate(Boolean canCreate) {
		this.canCreate = canCreate;
	}

	public Boolean getCanView() {
		return canView;
	}

	public void setCanView(Boolean canView) {
		this.canView = canView;
	}
}
