package com.example.service;

import com.example.model.Claim;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ClaimService {
    
    private static final Logger LOG = Logger.getLogger(ClaimService.class);
    
    public Claim validateClaim(Claim claim) {
        LOG.info("Validating claim: " + claim.getId());
        
        // Simple validation logic - could be replaced with rule invocation
        if (claim.getAmount() == null || claim.getAmount().doubleValue() < 10.0) {
            claim.setApproved(false);
            claim.setRejectionReason("Claim amount too small");
        } else if (claim.getTransactionsLastMonth() > 5) {
            claim.setApproved(false);
            claim.setRejectionReason("Suspicious claim frequency");
        } else {
            claim.setApproved(true);
        }
        
        LOG.info("Claim " + claim.getId() + " validation result: approved=" + claim.getApproved());
        
        return claim;
    }
} 