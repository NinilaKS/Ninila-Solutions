package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutUs {
	@ValueMapValue
	private String ourwork;

	@ValueMapValue
	private String aboutus;

	@Inject
	@Named("work")
	private List<AboutUsList> work;

	public List<AboutUsList> getWork() {
		return work;
	}

	public String getOurwork() {
		return ourwork;
	}

	public String getAboutus() {
		return aboutus;
	}

}
