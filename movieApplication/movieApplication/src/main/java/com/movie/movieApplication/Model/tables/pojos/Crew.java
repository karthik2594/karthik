/*
 * This file is generated by jOOQ.
 */
package com.movie.movieApplication.Model.tables.pojos;


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
public class Crew implements Serializable {

    private static final long serialVersionUID = 836502878;

    private Integer crewId;
    private String  leadRole;
    private String  others;

    public Crew() {}

    public Crew(Crew value) {
        this.crewId = value.crewId;
        this.leadRole = value.leadRole;
        this.others = value.others;
    }

    public Crew(
        Integer crewId,
        String  leadRole,
        String  others
    ) {
        this.crewId = crewId;
        this.leadRole = leadRole;
        this.others = others;
    }

    public Integer getCrewId() {
        return this.crewId;
    }

    public void setCrewId(Integer crewId) {
        this.crewId = crewId;
    }

    public String getLeadRole() {
        return this.leadRole;
    }

    public void setLeadRole(String leadRole) {
        this.leadRole = leadRole;
    }

    public String getOthers() {
        return this.others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Crew (");

        sb.append(crewId);
        sb.append(", ").append(leadRole);
        sb.append(", ").append(others);

        sb.append(")");
        return sb.toString();
    }
}
