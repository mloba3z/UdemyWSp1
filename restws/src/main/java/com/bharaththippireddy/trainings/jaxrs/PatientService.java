package com.bharaththippireddy.trainings.jaxrs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Api(value = "/patient", description = "demo.jaxrs.swagger.server.Sample2 JAX-RS service with Swagger documentation")
@Path("/patient")
@Produces({ "application/xml", "application/json" })
public interface PatientService {

	@GET
	@Path("/patients/{id}/")
	//@ApiOperation(
	//        value = "Get operation with Response and @Default value",
	//        notes = "Get operation with Response and @Default value")
	public abstract Patient getPatient(@PathParam("id") String id);

	@PUT
	@Path("/patients/")
	//@ApiOperation("Updates a Patients")
	public abstract Response updatePatient(Patient patient);

	@POST
	@Path("/patients/")
	//@ApiOperation("Creates a Patients")
	public abstract Response addPatient(Patient patient);

	@DELETE
	@Path("/patients/{id}/")
	@ApiOperation("Deletes Patients")
	public abstract Response deletePatients(@PathParam("id") String id);

	@Path("/prescriptions/{id}/")
	//@ApiOperation("Gets Patients")
	public abstract Prescription getPrescription(
			@PathParam("id") String prescriptionId);

}