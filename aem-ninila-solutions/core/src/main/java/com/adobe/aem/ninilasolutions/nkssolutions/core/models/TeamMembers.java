package com.adobe.aem.ninilasolutions.nkssolutions.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.ninilasolutions.nkssolutions.core.models.TeamMembers;

@Model(adaptables = Resource.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TeamMembers {
	@ValueMapValue
	private String ourteam;

	@ValueMapValue
	private String aboutteam;
	
	@Inject
	@Named("members")
	private List<TeamMembersList> members;

	public List<TeamMembersList> getMembers() {
		return members;
	}
	
	public String getOurteam() {
		return ourteam;
	}

	public String getAboutteam() {
		return aboutteam;
	}

}
