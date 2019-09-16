package xr.entity;

import java.util.Date;

/**
 * @Author: kxr
 * @Date: 2019/9/11
 * @Description
 */
public class User {

    private Long id;
    private Date date = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User(Long id) {
        this.id = id;
    }

    public User() {
    }
}
