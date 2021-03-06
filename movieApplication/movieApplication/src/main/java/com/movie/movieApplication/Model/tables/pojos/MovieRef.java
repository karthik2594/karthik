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
public class MovieRef implements Serializable {

    private static final long serialVersionUID = -115168838;

    private Integer id;
    private Integer crId;
    private Integer fiId;
    private Integer laId;
    private Integer raId;

    public MovieRef() {}

    public MovieRef(MovieRef value) {
        this.id = value.id;
        this.crId = value.crId;
        this.fiId = value.fiId;
        this.laId = value.laId;
        this.raId = value.raId;
    }

    public MovieRef(
        Integer id,
        Integer crId,
        Integer fiId,
        Integer laId,
        Integer raId
    ) {
        this.id = id;
        this.crId = crId;
        this.fiId = fiId;
        this.laId = laId;
        this.raId = raId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCrId() {
        return this.crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public Integer getFiId() {
        return this.fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public Integer getLaId() {
        return this.laId;
    }

    public void setLaId(Integer laId) {
        this.laId = laId;
    }

    public Integer getRaId() {
        return this.raId;
    }

    public void setRaId(Integer raId) {
        this.raId = raId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MovieRef (");

        sb.append(id);
        sb.append(", ").append(crId);
        sb.append(", ").append(fiId);
        sb.append(", ").append(laId);
        sb.append(", ").append(raId);

        sb.append(")");
        return sb.toString();
    }
}
