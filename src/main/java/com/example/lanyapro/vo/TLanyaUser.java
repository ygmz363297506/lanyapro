package com.example.lanyapro.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_lanya_user
 */
@Data
public class TLanyaUser implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 名字
     */
    private String userName;

    /**
     * 工号
     */
    private String userNo;

    /**
     * 状态(0-失效，1-生效)
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 创建人
     */
    private String creationUser;

    /**
     * 修改时间
     */
    private Date modificationDate;

    /**
     * 修改人
     */
    private String modificationUser;

    private static final long serialVersionUID = 1L;

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
        TLanyaUser other = (TLanyaUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserNo() == null ? other.getUserNo() == null : this.getUserNo().equals(other.getUserNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCreationUser() == null ? other.getCreationUser() == null : this.getCreationUser().equals(other.getCreationUser()))
            && (this.getModificationDate() == null ? other.getModificationDate() == null : this.getModificationDate().equals(other.getModificationDate()))
            && (this.getModificationUser() == null ? other.getModificationUser() == null : this.getModificationUser().equals(other.getModificationUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserNo() == null) ? 0 : getUserNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCreationUser() == null) ? 0 : getCreationUser().hashCode());
        result = prime * result + ((getModificationDate() == null) ? 0 : getModificationDate().hashCode());
        result = prime * result + ((getModificationUser() == null) ? 0 : getModificationUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", userNo=").append(userNo);
        sb.append(", status=").append(status);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", creationUser=").append(creationUser);
        sb.append(", modificationDate=").append(modificationDate);
        sb.append(", modificationUser=").append(modificationUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}