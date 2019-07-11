package com.verzinen.jsf.model;

import java.util.List;
import java.util.Map;

import com.verdin.jsf.model.Param;

public class Configuration {

    private Config config;
    private String type;
    private String tag;
    private Integer version;
        
    private List<Param> _properties;
    private List<Param> _propertiesAttributes;
    
    public  List<Param>  get_Properties() {
        return _properties;
    }

    public void set_Properties( List<Param>  properties_as_map) {
        this._properties  = properties_as_map ;
    }
    
    
    public  List<Param>  get_PropertiesAttributes() {
        return _propertiesAttributes;
    }

    public void set_PropertiesAttributes( List<Param>   _propertiesAttributes) {
        this._propertiesAttributes  = _propertiesAttributes ;
    }
    
    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Configuration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this._properties == null)?"<null>":this._properties));
        sb.append(',');
        sb.append("propertiesAttributes");
        sb.append('=');
        sb.append(((this._propertiesAttributes == null)?"<null>":this._propertiesAttributes));
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_properties == null) ? 0 : _properties.hashCode());
		result = prime * result + ((_propertiesAttributes == null) ? 0 : _propertiesAttributes.hashCode());
		result = prime * result + ((config == null) ? 0 : config.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (_properties == null) {
			if (other._properties != null)
				return false;
		} else if (!_properties.equals(other._properties))
			return false;
		if (_propertiesAttributes == null) {
			if (other._propertiesAttributes != null)
				return false;
		} else if (!_propertiesAttributes.equals(other._propertiesAttributes))
			return false;
		if (config == null) {
			if (other.config != null)
				return false;
		} else if (!config.equals(other.config))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

}
