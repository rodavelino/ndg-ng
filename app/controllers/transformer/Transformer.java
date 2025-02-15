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
package controllers.transformer;

import java.util.Collection;
import models.NdgResult;
import models.Survey;

public abstract class Transformer {

    protected Survey survey;
    protected Collection<NdgResult> results;

    public Transformer( Survey survey ) {
        this.survey = survey;
    }

    public Transformer( Survey survey, Collection<NdgResult> results) {
        this.survey = survey;
        this.results = results;
    }

    public abstract byte[] getBytes();
}
