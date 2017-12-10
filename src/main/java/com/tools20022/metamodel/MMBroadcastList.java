/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.Opposite;
import com.tools20022.core.metamodel.OrphanMetamodelType;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMAddress;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.StandardMetamodel2013;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.List;
import java.util.Optional;

/**
 * set of references to MessagingEndpoints (identified by their Address), that
 * is used for message broadcasting
 */
public class MMBroadcastList implements OrphanMetamodelType, MMModelEntity {

	/**
	 * a BroadCastList entry using an Address
	 */
	public final static MetamodelAttribute<MMBroadcastList, List<MMAddress>> addressAttribute = newAttribute();
	protected Supplier<List<MMAddress>> address_lazy;
	protected Supplier<List<MMModelEntity>> nextVersions_lazy;
	protected Supplier<MMModelEntity> previousVersion_lazy;
	protected String objectIdentifier;

	@Override
	public GeneratedMetamodelBean getContainer() {
		return null;
	}

	@Override
	public MetamodelType<? extends MMBroadcastList> getMetamodel() {
		return StandardMetamodel2013.metamodel().getTypeByClass(getClass());
	}

	public static MetamodelType<? extends MMBroadcastList> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMBroadcastList.class);
	}

	/**
	 * a BroadCastList entry using an Address
	 * 
	 * @see MMAddress#getBroadCastList()
	 */
	@Opposite(bean = MMAddress.class, attribute = "broadCastList")
	public List<MMAddress> getAddress() {
		return address_lazy == null ? Collections.emptyList() : address_lazy.get();
	}

	@Override
	public List<MMModelEntity> getNextVersions() {
		return nextVersions_lazy == null ? Collections.emptyList() : nextVersions_lazy.get();
	}

	@Override
	public Optional<MMModelEntity> getPreviousVersion() {
		return previousVersion_lazy == null ? Optional.empty() : Optional.of(previousVersion_lazy.get());
	}

	@Override
	public Optional<String> getObjectIdentifier() {
		return objectIdentifier == null ? Optional.empty() : Optional.of(objectIdentifier);
	}
}