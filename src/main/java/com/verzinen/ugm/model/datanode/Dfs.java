
package com.verzinen.ugm.model.datanode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dfs {

    @SerializedName("datanode")
    @Expose
    private Datanode__2 datanode;

    public Datanode__2 getDatanode() {
        return datanode;
    }

    public void setDatanode(Datanode__2 datanode) {
        this.datanode = datanode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dfs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("datanode");
        sb.append('=');
        sb.append(((this.datanode == null)?"<null>":this.datanode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.datanode == null)? 0 :this.datanode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dfs) == false) {
            return false;
        }
        Dfs rhs = ((Dfs) other);
        return ((this.datanode == rhs.datanode)||((this.datanode!= null)&&this.datanode.equals(rhs.datanode)));
    }

}
