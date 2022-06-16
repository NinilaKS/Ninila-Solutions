package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PricingDetails {
	@ValueMapValue
	private String headline;

	@ValueMapValue
	private String description;

	@Inject
	@Named("pricing")
	private List<PriceList> pricecomp;

	public String getHeadline() {
		return headline;
	}

	public String getDescription() {
		return description;
	}

	public List<PriceList> getPricecomp() {
		return pricecomp;
	}

}
