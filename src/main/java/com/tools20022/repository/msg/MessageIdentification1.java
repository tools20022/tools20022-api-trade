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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01;
import com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01;
import com.tools20022.repository.area.tsmt.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a message by a unique identifier and the date and time when the
 * message was created by the sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmIdentification
 * MessageIdentification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageIdentification1#mmCreationDateTime
 * MessageIdentification1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmStatusIdentification
 * InvoiceFinancingRequestStatusV01.mmStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#mmCancellationRequestIdentification
 * InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmAcknowledgementIdentification
 * AcknowledgementV03.mmAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AcknowledgementV03#mmAcknowledgedMessageReference
 * AcknowledgementV03.mmAcknowledgedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportRequestV03#mmRequestIdentification
 * ActivityReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportSetUpRequestV02#mmRequestIdentification
 * ActivityReportSetUpRequestV02.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmAcceptanceIdentification
 * AmendmentAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceV02#mmDeltaReportReference
 * AmendmentAcceptanceV02.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmNotificationIdentification
 * AmendmentAcceptanceNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentAcceptanceNotificationV03#mmDeltaReportReference
 * AmendmentAcceptanceNotificationV03.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectionIdentification
 * AmendmentRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmDeltaReportReference
 * AmendmentRejectionV02.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmNotificationIdentification
 * AmendmentRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmDeltaReportReference
 * AmendmentRejectionNotificationV03.mmDeltaReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmReportIdentification
 * BaselineMatchReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetMatchReportV03#mmReportIdentification
 * DataSetMatchReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmReportIdentification
 * DeltaReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmReportIdentification
 * ErrorReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ErrorReportV03#mmRejectedMessageReference
 * ErrorReportV03.mmRejectedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmAcceptanceIdentification
 * MisMatchAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceV02#mmDataSetMatchReportReference
 * MisMatchAcceptanceV02.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmNotificationIdentification
 * MisMatchAcceptanceNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchAcceptanceNotificationV03#mmDataSetMatchReportReference
 * MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmRejectionIdentification
 * MisMatchRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmDataSetMatchReportReference
 * MisMatchRejectionV02.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmNotificationIdentification
 * MisMatchRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmDataSetMatchReportReference
 * MisMatchRejectionNotificationV03.mmDataSetMatchReportReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmReminderIdentification
 * ActionReminderV03.mmReminderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActionReminderV03#mmMessageRequiringAction
 * ActionReminderV03.mmMessageRequiringAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeNotificationV03#mmNotificationIdentification
 * StatusChangeNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestV02#mmRequestIdentification
 * StatusChangeRequestV02.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestAcceptanceV02#mmAcceptanceIdentification
 * StatusChangeRequestAcceptanceV02.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestNotificationV03#mmNotificationIdentification
 * StatusChangeRequestNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionV02#mmRejectionIdentification
 * StatusChangeRequestRejectionV02.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusChangeRequestRejectionNotificationV03#mmNotificationIdentification
 * StatusChangeRequestRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestAcceptanceV03#mmAcceptanceIdentification
 * StatusExtensionRequestAcceptanceV03.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionNotificationV03#mmNotificationIdentification
 * StatusExtensionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestRejectionV03#mmRejectionIdentification
 * StatusExtensionRequestRejectionV03.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRejectionNotificationV03#mmNotificationIdentification
 * StatusExtensionRejectionNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestV03#mmRequestIdentification
 * StatusExtensionRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusExtensionRequestNotificationV03#mmNotificationIdentification
 * StatusExtensionRequestNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmReportIdentification
 * StatusReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportV03#mmRelatedMessageReference
 * StatusReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.StatusReportRequestV03#mmRequestIdentification
 * StatusReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TimeOutNotificationV03#mmNotificationIdentification
 * TimeOutNotificationV03.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#mmReportIdentification
 * TransactionReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportV03#mmRelatedMessageReference
 * TransactionReportV03.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.TransactionReportRequestV03#mmRequestIdentification
 * TransactionReportRequestV03.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayReportV01#mmReportIdentification
 * IntentToPayReportV01.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialRequestV01#mmRequestIdentification
 * SpecialRequestV01.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.SpecialNotificationV01#mmNotificationIdentification
 * SpecialNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#mmAcceptanceIdentification
 * RoleAndBaselineAcceptanceV01.mmAcceptanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceV01#mmRelatedMessageReference
 * RoleAndBaselineAcceptanceV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRejectionIdentification
 * RoleAndBaselineRejectionV01.mmRejectionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionV01#mmRelatedMessageReference
 * RoleAndBaselineRejectionV01.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineAcceptanceNotificationV01#mmNotificationIdentification
 * RoleAndBaselineAcceptanceNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.RoleAndBaselineRejectionNotificationV01#mmNotificationIdentification
 * RoleAndBaselineRejectionNotificationV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmReportIdentification
 * ActivityReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ActivityReportV04#mmRelatedMessageReference
 * ActivityReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV02#mmNotificationIdentification
 * IntentToPayNotificationV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV02#mmNotificationIdentification
 * ForwardIntentToPayNotificationV02.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmReportIdentification
 * BaselineReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReportV04#mmRelatedMessageReference
 * BaselineReportV04.mmRelatedMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmissionIdentification
 * InitialBaselineSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineAmendmentRequestV05#mmRequestIdentification
 * BaselineAmendmentRequestV05.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmReportIdentification
 * FullPushThroughReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmReportIdentification
 * ForwardDataSetSubmissionReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV05#mmSubmissionIdentification
 * DataSetSubmissionV05.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV05#mmSubmissionIdentification
 * BaselineReSubmissionV05.mmSubmissionIdentification}</li>
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
 * "MessageIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a message by a unique identifier and the date and time when the message was created by the sender."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MessageIdentification1", propOrder = {"identification", "creationDateTime"})
public class MessageIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageIdentification1, Max35Text> mmIdentification = new MMMessageAttribute<MessageIdentification1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(MessageIdentification1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MessageIdentification1 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of creation of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MessageIdentification1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<MessageIdentification1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MessageIdentification1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date of creation of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(MessageIdentification1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(MessageIdentification1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MessageIdentification1.mmIdentification, com.tools20022.repository.msg.MessageIdentification1.mmCreationDateTime);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingRequestStatusV01.mmStatusIdentification, InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification,
						AcknowledgementV03.mmAcknowledgementIdentification, AcknowledgementV03.mmAcknowledgedMessageReference, ActivityReportRequestV03.mmRequestIdentification, ActivityReportSetUpRequestV02.mmRequestIdentification,
						AmendmentAcceptanceV02.mmAcceptanceIdentification, AmendmentAcceptanceV02.mmDeltaReportReference, AmendmentAcceptanceNotificationV03.mmNotificationIdentification,
						AmendmentAcceptanceNotificationV03.mmDeltaReportReference, AmendmentRejectionV02.mmRejectionIdentification, AmendmentRejectionV02.mmDeltaReportReference,
						AmendmentRejectionNotificationV03.mmNotificationIdentification, AmendmentRejectionNotificationV03.mmDeltaReportReference, BaselineMatchReportV03.mmReportIdentification, DataSetMatchReportV03.mmReportIdentification,
						DeltaReportV03.mmReportIdentification, ErrorReportV03.mmReportIdentification, ErrorReportV03.mmRejectedMessageReference, MisMatchAcceptanceV02.mmAcceptanceIdentification,
						MisMatchAcceptanceV02.mmDataSetMatchReportReference, MisMatchAcceptanceNotificationV03.mmNotificationIdentification, MisMatchAcceptanceNotificationV03.mmDataSetMatchReportReference,
						MisMatchRejectionV02.mmRejectionIdentification, MisMatchRejectionV02.mmDataSetMatchReportReference, MisMatchRejectionNotificationV03.mmNotificationIdentification,
						MisMatchRejectionNotificationV03.mmDataSetMatchReportReference, ActionReminderV03.mmReminderIdentification, ActionReminderV03.mmMessageRequiringAction, StatusChangeNotificationV03.mmNotificationIdentification,
						StatusChangeRequestV02.mmRequestIdentification, StatusChangeRequestAcceptanceV02.mmAcceptanceIdentification, StatusChangeRequestNotificationV03.mmNotificationIdentification,
						StatusChangeRequestRejectionV02.mmRejectionIdentification, StatusChangeRequestRejectionNotificationV03.mmNotificationIdentification, StatusExtensionRequestAcceptanceV03.mmAcceptanceIdentification,
						StatusExtensionNotificationV03.mmNotificationIdentification, StatusExtensionRequestRejectionV03.mmRejectionIdentification, StatusExtensionRejectionNotificationV03.mmNotificationIdentification,
						StatusExtensionRequestV03.mmRequestIdentification, StatusExtensionRequestNotificationV03.mmNotificationIdentification, StatusReportV03.mmReportIdentification, StatusReportV03.mmRelatedMessageReference,
						StatusReportRequestV03.mmRequestIdentification, TimeOutNotificationV03.mmNotificationIdentification, TransactionReportV03.mmReportIdentification, TransactionReportV03.mmRelatedMessageReference,
						TransactionReportRequestV03.mmRequestIdentification, IntentToPayReportV01.mmReportIdentification, SpecialRequestV01.mmRequestIdentification, SpecialNotificationV01.mmNotificationIdentification,
						RoleAndBaselineAcceptanceV01.mmAcceptanceIdentification, RoleAndBaselineAcceptanceV01.mmRelatedMessageReference, RoleAndBaselineRejectionV01.mmRejectionIdentification,
						RoleAndBaselineRejectionV01.mmRelatedMessageReference, RoleAndBaselineAcceptanceNotificationV01.mmNotificationIdentification, RoleAndBaselineRejectionNotificationV01.mmNotificationIdentification,
						ActivityReportV04.mmReportIdentification, ActivityReportV04.mmRelatedMessageReference, IntentToPayNotificationV02.mmNotificationIdentification, ForwardIntentToPayNotificationV02.mmNotificationIdentification,
						BaselineReportV04.mmReportIdentification, BaselineReportV04.mmRelatedMessageReference, InitialBaselineSubmissionV05.mmSubmissionIdentification, BaselineAmendmentRequestV05.mmRequestIdentification,
						FullPushThroughReportV05.mmReportIdentification, ForwardDataSetSubmissionReportV05.mmReportIdentification, DataSetSubmissionV05.mmSubmissionIdentification, BaselineReSubmissionV05.mmSubmissionIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageIdentification1";
				definition = "Identifies a message by a unique identifier and the date and time when the message was created by the sender.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public MessageIdentification1 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public MessageIdentification1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}
}