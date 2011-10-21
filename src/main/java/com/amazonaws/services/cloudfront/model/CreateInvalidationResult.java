/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class CreateInvalidationResult {

    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     */
    private String location;

    /**
     * The invalidation's information.
     */
    private Invalidation invalidation;

    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     *
     * @return The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     *
     * @param location The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The fully qualified URI of the distribution and invalidation batch
     * request, including the Invalidation ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The fully qualified URI of the distribution and invalidation batch
     *         request, including the Invalidation ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInvalidationResult withLocation(String location) {
        this.location = location;
        return this;
    }
    
    
    /**
     * The invalidation's information.
     *
     * @return The invalidation's information.
     */
    public Invalidation getInvalidation() {
        return invalidation;
    }
    
    /**
     * The invalidation's information.
     *
     * @param invalidation The invalidation's information.
     */
    public void setInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
    }
    
    /**
     * The invalidation's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidation The invalidation's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateInvalidationResult withInvalidation(Invalidation invalidation) {
        this.invalidation = invalidation;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Location: " + location + ", ");
        sb.append("Invalidation: " + invalidation + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    