
package com.verzinen.telyu.model.yarn;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropertiesAttributes {

    @SerializedName("hidden")
    @Expose
    private Hidden hidden;

    public Hidden getHidden() {
        return hidden;
    }

    public void setHidden(Hidden hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PropertiesAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hidden");
        sb.append('=');
        sb.append(((this.hidden == null)?"<null>":this.hidden));
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
        result = ((result* 31)+((this.hidden == null)? 0 :this.hidden.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertiesAttributes) == false) {
            return false;
        }
        PropertiesAttributes rhs = ((PropertiesAttributes) other);
        return ((this.hidden == rhs.hidden)||((this.hidden!= null)&&this.hidden.equals(rhs.hidden)));
    }

}
