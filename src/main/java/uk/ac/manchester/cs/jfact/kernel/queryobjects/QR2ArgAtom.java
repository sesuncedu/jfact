package uk.ac.manchester.cs.jfact.kernel.queryobjects;

/* This file is part of the JFact DL reasoner
 Copyright 2011-2013 by Ignazio Palmisano, Dmitry Tsarkov, University of Manchester
 This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation; either version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA*/
import conformance.PortedFrom;

/** interface for general 2-arg atom */
@PortedFrom(file = "QR.h", name = "QR2ArgAtom")
class QR2ArgAtom extends QRAtom {

    private static final long serialVersionUID = 11000L;
    /** argument 1 */
    @PortedFrom(file = "QR.h", name = "Arg1")
    private final QRiObject Arg1;
    /** argument 2 */
    @PortedFrom(file = "QR.h", name = "Arg2")
    private final QRiObject Arg2;

    public QR2ArgAtom(QRiObject A1, QRiObject A2) {
        Arg1 = A1;
        Arg2 = A2;
    }

    // access
    /** @return get first i-object */
    @PortedFrom(file = "QR.h", name = "getArg1")
    public QRiObject getArg1() {
        return Arg1;
    }

    /** @return get second i-object */
    @PortedFrom(file = "QR.h", name = "getArg2")
    public QRiObject getArg2() {
        return Arg2;
    }
}
