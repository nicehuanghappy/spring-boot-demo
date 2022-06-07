package com.bob.bat.mybatis.entity;

/**
 * testdemo
 * @TableName test
 */
public class TestEntity {
    /**
     * id
     */
    private String id;

    /**
     * client_name
     */
    private String clientName;

    /**
     * creat_time
     */
    private String creatTime;

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * client_name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * client_name
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * creat_time
     */
    public String getCreatTime() {
        return creatTime;
    }

    /**
     * creat_time
     */
    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TestEntity other = (TestEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clientName=").append(clientName);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}