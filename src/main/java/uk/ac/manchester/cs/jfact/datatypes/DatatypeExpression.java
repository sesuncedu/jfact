package uk.ac.manchester.cs.jfact.datatypes;

import conformance.Original;

/* This file is part of the JFact DL reasoner
 Copyright 2011-2013 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
/**
 * Represents an extended datatype - intersection, union or further
 * restrictions. All implementations must be immutable
 * 
 * @param <R>
 *        type
 */
@Original
public interface DatatypeExpression<R extends Comparable<R>> extends
        Datatype<R> {

    /** @return the predefined datatype which is host for this expression */
    Datatype<R> getHostType();

    /**
     * add a new facet value for this datatype expression
     * 
     * @param f
     *        a valid facet for the host datatype
     * @param value
     *        the value for the facet
     * @return modified expression
     */
    DatatypeExpression<R> addNonNumericFacet(Facet f, Comparable<?> value);

    /**
     * @param f
     *        facet
     * @param value
     *        value
     * @return modified expression
     */
    DatatypeExpression<R> addNumericFacet(Facet f, Comparable<?> value);
}
