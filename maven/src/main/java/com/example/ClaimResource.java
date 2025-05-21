package com.example;

import com.example.model.Claim;
import com.example.service.ClaimService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/claims")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClaimResource {

    @Inject
    ClaimService claimService;

    @POST
    public Response submitClaim(Claim claim) {
        if (claim.getId() == null || claim.getId().isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Claim ID is required").build();
        }
        
        Claim processedClaim = claimService.validateClaim(claim);
        
        return Response.ok(processedClaim).build();
    }
    
    @GET
    @Path("/{id}")
    public Response getClaim(@PathParam("id") String id) {
        // In a real app, you would look up the claim in a database
        // This is just a placeholder implementation
        return Response.status(Response.Status.NOT_FOUND)
                .entity("Claim with ID " + id + " not found").build();
    }
} 