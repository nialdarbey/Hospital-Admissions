package com.mulesoft.summit.service;

import java.math.BigInteger;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mulesoft.summit.adm.EhrRequest;
import com.mulesoft.summit.adm.Episode;

@Path("/api")
public class EpisodeResource {

	@POST
	@Path("/Cardiology/episodes")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createEpisode(EhrRequest request) {
		System.out.println(request.toString());
		Episode episode = new Episode();
		episode.setEpisodeId("EP123412341");
		episode.setMinDurationDays(BigInteger.valueOf(6));
		episode.setPatientId(request.getPatientId());
		episode.setStartDate(new Date());
		return Response.status(Status.OK).entity(episode).build();
	}

}
