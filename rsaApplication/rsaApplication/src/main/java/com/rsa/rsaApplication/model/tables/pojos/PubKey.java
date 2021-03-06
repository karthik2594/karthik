/*
 * This file is generated by jOOQ.
 */
package com.rsa.rsaApplication.model.tables.pojos;


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
public class PubKey implements Serializable {

    private static final long serialVersionUID = 406667017;

    private Integer id;
    private String  pubKey;
    private Integer usrId;

    public PubKey() {}

    public PubKey(PubKey value) {
        this.id = value.id;
        this.pubKey = value.pubKey;
        this.usrId = value.usrId;
    }

    public PubKey(
        Integer id,
        String  pubKey,
        Integer usrId
    ) {
        this.id = id;
        this.pubKey = pubKey;
        this.usrId = usrId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPubKey() {
        return this.pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public Integer getUsrId() {
        return this.usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PubKey (");

        sb.append(id);
        sb.append(", ").append(pubKey);
        sb.append(", ").append(usrId);

        sb.append(")");
        return sb.toString();
    }
}
