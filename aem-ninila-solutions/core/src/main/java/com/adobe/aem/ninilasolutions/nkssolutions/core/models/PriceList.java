package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PriceList {
	@ValueMapValue
	private String type;
	
	@ValueMapValue
	private String storage;
	
	@ValueMapValue
	private String emails;
	
	@ValueMapValue
	private String support;
	
	@ValueMapValue
	private String price;
	
	@ValueMapValue
	private String buttontext;

	public String getType() {
		return type;
	}

	public String getStorage() {
		return storage;
	}

	public String getEmails() {
		return emails;
	}

	public String getSupport() {
		return support;
	}

	public String getPrice() {
		return price;
	}

	public String getButtontext() {
		return buttontext;
	}

}
