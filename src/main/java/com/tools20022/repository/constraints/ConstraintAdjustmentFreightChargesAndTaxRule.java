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
import com.tools20022.repository.msg.LineItem13;
import com.tools20022.repository.msg.LineItem15;

/**
 * Adjustments, freight charges and taxes must be entered at this level, or
 * adjustments, freight charges and taxes must be entered at line item level.
 */
public class ConstraintAdjustmentFreightChargesAndTaxRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem13 LineItem13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem13> forLineItem13 = new MMConstraint<LineItem13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Adjustments, freight charges and taxes must be entered at this level, or adjustments, freight charges and taxes must be entered at line item level.";
			owner_lazy = () -> LineItem13.mmObject();
		}

		@Override
		public void executeValidator(LineItem13 obj) throws Exception {
			checkLineItem13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.LineItem15 LineItem15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentFreightChargesAndTaxRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<LineItem15> forLineItem15 = new MMConstraint<LineItem15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentFreightChargesAndTaxRule";
			definition = "Either all adjustments, freight charges and taxes must be entered at this level only, or all adjustments, freight charges and taxes must be entered at line item level only.";
			owner_lazy = () -> LineItem15.mmObject();
		}

		@Override
		public void executeValidator(LineItem15 obj) throws Exception {
			checkLineItem15(obj);
		}
	};

	/**
	 * Adjustments, freight charges and taxes must be entered at this level, or
	 * adjustments, freight charges and taxes must be entered at line item
	 * level.
	 */
	public static void checkLineItem13(LineItem13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either all adjustments, freight charges and taxes must be entered at this
	 * level only, or all adjustments, freight charges and taxes must be entered
	 * at line item level only.
	 */
	public static void checkLineItem15(LineItem15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}