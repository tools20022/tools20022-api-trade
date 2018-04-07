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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.Baseline5;

/**
 * If TransportDataSetRequired is present, then Goods/TransShipment is
 * mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is
 * optional.
 */
public class ConstraintTransShipmentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Baseline5 Baseline5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipmentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Baseline5> forBaseline5 = new MMConstraint<Baseline5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipmentRule";
			definition = "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional.";
			owner_lazy = () -> Baseline5.mmObject();
		}

		@Override
		public void executeValidator(Baseline5 obj) throws Exception {
			checkBaseline5(obj);
		}
	};

	/**
	 * If TransportDataSetRequired is present, then Goods/TransShipment is
	 * mandatory. If TransportDataSetRequired is absent, then
	 * Goods/TransShipment is optional.
	 */
	public static void checkBaseline5(Baseline5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}