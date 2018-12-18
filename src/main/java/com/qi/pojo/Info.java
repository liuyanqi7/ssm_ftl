package com.qi.pojo;

/**
 * @BelongsProject: ssm_springmvc
 * @BelongsPackage: com.qi.pojo
 * @Author: 7
 * @CreateTime: 2018-12-18 15:30
 * @Description: 资讯信息
 * @Version: 1.0
 */
public class Info {
    private int id;
    private String  title;
    private String  classes;
    private String  source;
    private String  uptime;
    private String  counts;
    private String  status;

    public Info() {
    }

    public Info(int id, String title, String classes, String source, String uptime, String counts, String status) {
        this.id = id;
        this.title = title;
        this.classes = classes;
        this.source = source;
        this.uptime = uptime;
        this.counts = counts;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getCount() {
        return counts;
    }

    public void setCount(String count) {
        this.counts = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
