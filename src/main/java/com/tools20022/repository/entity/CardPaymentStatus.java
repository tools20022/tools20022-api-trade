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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FailureReasonCode;
import com.tools20022.repository.codeset.RejectReasonCode;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Status of a payment by card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardPaymentStatus" src="doc-files/CardPaymentStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmRejectionReason
 * CardPaymentStatus.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmFailureReason
 * CardPaymentStatus.mmFailureReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmCardPayment
 * CardPaymentStatus.mmCardPayment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
 * CardPayment.mmCardPaymentStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a payment by card."</li>
 * </ul>
 */
public class CardPaymentStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected RejectReasonCode rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
	 * RejectReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the rejection of a request or an advice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentStatus, RejectReasonCode> mmRejectionReason = new MMBusinessAttribute<CardPaymentStatus, RejectReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectionReason";
			definition = "Reason of the rejection of a request or an advice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReasonCode.mmObject();
		}

		@Override
		public RejectReasonCode getValue(CardPaymentStatus obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(CardPaymentStatus obj, RejectReasonCode value) {
			obj.setRejectionReason(value);
		}
	};
	protected FailureReasonCode failureReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
	 * FailureReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailureReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of incidents during the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CardPaymentStatus, FailureReasonCode> mmFailureReason = new MMBusinessAttribute<CardPaymentStatus, FailureReasonCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FailureReason";
			definition = "List of incidents during the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FailureReasonCode.mmObject();
		}

		@Override
		public FailureReasonCode getValue(CardPaymentStatus obj) {
			return obj.getFailureReason();
		}

		@Override
		public void setValue(CardPaymentStatus obj, FailureReasonCode value) {
			obj.setFailureReason(value);
		}
	};
	protected List<com.tools20022.repository.entity.CardPayment> cardPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentStatus
	 * CardPayment.mmCardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardPayment
	 * CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus
	 * CardPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card payment for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CardPaymentStatus, List<CardPayment>> mmCardPayment = new MMBusinessAssociationEnd<CardPaymentStatus, List<CardPayment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardPaymentStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardPayment";
			definition = "Card payment for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CardPayment.mmObject();
		}

		@Override
		public List<CardPayment> getValue(CardPaymentStatus obj) {
			return obj.getCardPayment();
		}

		@Override
		public void setValue(CardPaymentStatus obj, List<CardPayment> value) {
			obj.setCardPayment(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentStatus";
				definition = "Status of a payment by card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPayment.mmCardPaymentStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardPaymentStatus.mmRejectionReason, com.tools20022.repository.entity.CardPaymentStatus.mmFailureReason,
						com.tools20022.repository.entity.CardPaymentStatus.mmCardPayment);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardPaymentStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public RejectReasonCode getRejectionReason() {
		return rejectionReason;
	}

	public CardPaymentStatus setRejectionReason(RejectReasonCode rejectionReason) {
		this.rejectionReason = Objects.requireNonNull(rejectionReason);
		return this;
	}

	public FailureReasonCode getFailureReason() {
		return failureReason;
	}

	public CardPaymentStatus setFailureReason(FailureReasonCode failureReason) {
		this.failureReason = Objects.requireNonNull(failureReason);
		return this;
	}

	public List<CardPayment> getCardPayment() {
		return cardPayment == null ? cardPayment = new ArrayList<>() : cardPayment;
	}

	public CardPaymentStatus setCardPayment(List<com.tools20022.repository.entity.CardPayment> cardPayment) {
		this.cardPayment = Objects.requireNonNull(cardPayment);
		return this;
	}
}