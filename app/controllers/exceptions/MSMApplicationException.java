/*
 *  Copyright (C) 2010-2011  INdT - Instituto Nokia de Tecnologia
 *
 *  NDG is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  NDG is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with NDG.  If not, see <http://www.gnu.org/licenses/
 */
package controllers.exceptions;

public abstract class MSMApplicationException extends Exception {

    private static final long serialVersionUID = 1L;
    private String ERROR_CODE;

    public MSMApplicationException() {
        super();
    }

    public MSMApplicationException( Exception e ) {
        super( e );
    }

    public String getErrorCode() {
        return ERROR_CODE;
    }

    public void setErrorCode( String errorCode ) {
        ERROR_CODE = errorCode;
    }
}