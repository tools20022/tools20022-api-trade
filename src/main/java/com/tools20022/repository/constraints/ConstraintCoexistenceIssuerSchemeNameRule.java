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
import com.tools20022.repository.msg.GenericIdentification20;

/**
 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters and
 * SchemeName length must be 4 characters or less. Issuer and Scheme Name must
 * be an ISO registered Issuer and SchemeName.
 */
public class ConstraintCoexistenceIssuerSchemeNameRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoexistenceIssuerSchemeNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<GenericIdentification20> forGenericIdentification20 = new MMConstraint<GenericIdentification20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoexistenceIssuerSchemeNameRule";
			definition = "During ISO 15022-20022 coexistence, Issuer length must be 4 characters and SchemeName length must be 4 characters or less. Issuer and Scheme Name must be an ISO registered Issuer and SchemeName.";
			owner_lazy = () -> GenericIdentification20.mmObject();
		}

		@Override
		public void executeValidator(GenericIdentification20 obj) throws Exception {
			checkGenericIdentification20(obj);
		}
	};

	/**
	 * During ISO 15022-20022 coexistence, Issuer length must be 4 characters
	 * and SchemeName length must be 4 characters or less. Issuer and Scheme
	 * Name must be an ISO registered Issuer and SchemeName.
	 */
	public static void checkGenericIdentification20(GenericIdentification20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}