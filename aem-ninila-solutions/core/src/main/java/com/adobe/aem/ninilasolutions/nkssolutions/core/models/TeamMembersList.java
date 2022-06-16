package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TeamMembersList {
	@ValueMapValue
	private String image;
	
	@ValueMapValue
	private String name;
	
	@ValueMapValue
	private String designation;

	public String getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

}
