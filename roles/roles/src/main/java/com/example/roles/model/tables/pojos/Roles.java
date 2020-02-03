/*
 * This file is generated by jOOQ.
 */
package com.example.roles.model.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Roles implements Serializable {

    private static final long serialVersionUID = -1349043097;

    private String  role;
    private Integer roleId;

    public Roles() {}

    public Roles(Roles value) {
        this.role = value.role;
        this.roleId = value.roleId;
    }

    public Roles(
        String  role,
        Integer roleId
    ) {
        this.role = role;
        this.roleId = roleId;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Roles (");

        sb.append(role);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}