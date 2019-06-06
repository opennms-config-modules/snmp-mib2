/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2019 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2019 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.plugins.config.snmpmib2;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ConfigTest {

    @Test
    public void canLoadSnmpCollectionExtension() {
        SnmpCollectionExtensionImpl snmpCollectionExtension = new SnmpCollectionExtensionImpl();
        assertThat(snmpCollectionExtension.getSnmpDataCollectionGroups(), hasSize(greaterThanOrEqualTo(1)));
    }

    @Test
    public void canLoadGraphPropertiesExtension() {
        GraphPropertiesExtension gaphPropertiesExtension = new GraphPropertiesExtension();
        assertThat(gaphPropertiesExtension.getPrefabGraphs(), hasSize(greaterThanOrEqualTo(1)));
    }

    @Test
    public void canLoadResourceTypesExtension() {
        ResourceTypesExtension resourceTypesExtension = new ResourceTypesExtension();
        assertThat(resourceTypesExtension.getResourceTypes(), hasSize(greaterThanOrEqualTo(0)));
    }
}
