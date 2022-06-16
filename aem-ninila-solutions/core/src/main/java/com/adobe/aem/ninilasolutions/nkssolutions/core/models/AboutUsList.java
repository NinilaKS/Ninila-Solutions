package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutUsList {
	@ValueMapValue
	private String image;
	
	@ValueMapValue
	private String description1;
	
	@ValueMapValue
	private String description2;
	
	@ValueMapValue
	private String description3;

	public String getImage() {
		return image;
	}

	public String getDescription1() {
		return description1;
	}

	public String getDescription2() {
		return description2;
	}

	public String getDescription3() {
		return description3;
	}

}
