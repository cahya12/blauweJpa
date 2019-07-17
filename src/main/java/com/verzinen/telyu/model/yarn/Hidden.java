
package com.verzinen.telyu.model.yarn;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hidden {

    @SerializedName("hadoop.registry.dns.bind-port")
    @Expose
    private String hadoopRegistryDnsBindPort;

    public String getHadoopRegistryDnsBindPort() {
        return hadoopRegistryDnsBindPort;
    }

    public void setHadoopRegistryDnsBindPort(String hadoopRegistryDnsBindPort) {
        this.hadoopRegistryDnsBindPort = hadoopRegistryDnsBindPort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hidden.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hadoopRegistryDnsBindPort");
        sb.append('=');
        sb.append(((this.hadoopRegistryDnsBindPort == null)?"<null>":this.hadoopRegistryDnsBindPort));
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
        result = ((result* 31)+((this.hadoopRegistryDnsBindPort == null)? 0 :this.hadoopRegistryDnsBindPort.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hidden) == false) {
            return false;
        }
        Hidden rhs = ((Hidden) other);
        return ((this.hadoopRegistryDnsBindPort == rhs.hadoopRegistryDnsBindPort)||((this.hadoopRegistryDnsBindPort!= null)&&this.hadoopRegistryDnsBindPort.equals(rhs.hadoopRegistryDnsBindPort)));
    }

}
