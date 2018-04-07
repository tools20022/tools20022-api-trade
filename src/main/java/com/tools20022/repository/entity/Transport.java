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
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Moving of goods or people from one place to another by vehicle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Transport" src="doc-files/Transport.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
 * Transport.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIdentification
 * Transport.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPackaging
 * Transport.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmArrivalDateTime
 * Transport.mmArrivalDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
 * Transport.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
 * Transport.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
 * Transport.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
 * Transport.mmPlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
 * Transport.mmPlaceOfDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
 * Transport.mmTransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmFreightChargesPrepaidOrCollect
 * Transport.mmFreightChargesPrepaidOrCollect}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
 * Transport.mmShipmentDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
 * Transport.mmTransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartyRole
 * Transport.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransitLocation
 * Transport.mmTransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
 * Location.mmDepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
 * Location.mmDestinationTransportParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
 * Location.mmRelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmTransport
 * Charges.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
 * Incoterms.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmTransport
 * Goods.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
 * ProductDelivery.mmRouting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTransport
 * Packaging.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
 * TransportPartyRole.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
 * ShipmentDateRange.mmRelatedTransport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmIndividualTransport
 * TransportMeans5.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmMultimodalTransport
 * TransportMeans5.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#mmTransportInformation
 * TransportDataSet5.mmTransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmIndividualTransport
 * TransportMeans6.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmMultimodalTransport
 * TransportMeans6.mmMultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmRoutingSummary
 * TransportDetails4.mmRoutingSummary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea
 * TransportBySea}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRoad
 * TransportByRoad}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRail
 * TransportByRail}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport3
 * MultimodalTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport3
 * SingleTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport7
 * SingleTransport7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans5
 * TransportMeans5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5
 * TransportDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans6
 * TransportMeans6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport8
 * SingleTransport8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails4
 * TransportDetails4}</li>
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
 * "Transport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Moving of goods or people from one place to another by vehicle."</li>
 * </ul>
 */
public class Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Incoterms incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
	 * Incoterms.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmIncoterms
	 * LineItemDetails13.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmIncoterms
	 * LineItem13.mmIncoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmIncoterms
	 * LineItem15.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmIncoterms
	 * TransportDetails4.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Incoterms> mmIncoterms = new MMBusinessAssociationEnd<Transport, Incoterms>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails13.mmIncoterms, LineItem13.mmIncoterms, LineItem15.mmIncoterms, TransportDetails4.mmIncoterms);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Incoterms.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Incoterms.mmObject();
		}

		@Override
		public Incoterms getValue(Transport obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(Transport obj, Incoterms value) {
			obj.setIncoterms(value);
		}
	};
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Transport, Max35Text> mmIdentification = new MMBusinessAttribute<Transport, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Transport obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Transport obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	protected Packaging packaging;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTransport
	 * Packaging.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmConsignment
	 * TransportDetails4.mmConsignment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of goods for transport."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Packaging> mmPackaging = new MMBusinessAssociationEnd<Transport, Packaging>() {
		{
			derivation_lazy = () -> Arrays.asList(TransportDetails4.mmConsignment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Packaging.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Packaging.mmObject();
		}

		@Override
		public Packaging getValue(Transport obj) {
			return obj.getPackaging();
		}

		@Override
		public void setValue(Transport obj, Packaging value) {
			obj.setPackaging(value);
		}
	};
	protected ISODateTime arrivalDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrivalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the goods reach their destination.."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Transport, ISODateTime> mmArrivalDateTime = new MMBusinessAttribute<Transport, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Transport obj) {
			return obj.getArrivalDateTime();
		}

		@Override
		public void setValue(Transport obj, ISODateTime value) {
			obj.setArrivalDateTime(value);
		}
	};
	protected YesNoIndicator partialShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmPartialShipment
	 * LineItem13.mmPartialShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Transport, YesNoIndicator> mmPartialShipment = new MMBusinessAttribute<Transport, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem13.mmPartialShipment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Transport obj) {
			return obj.getPartialShipment();
		}

		@Override
		public void setValue(Transport obj, YesNoIndicator value) {
			obj.setPartialShipment(value);
		}
	};
	protected YesNoIndicator transShipment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmTransShipment
	 * LineItem13.mmTransShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Transport, YesNoIndicator> mmTransShipment = new MMBusinessAttribute<Transport, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem13.mmTransShipment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Transport obj) {
			return obj.getTransShipment();
		}

		@Override
		public void setValue(Transport obj, YesNoIndicator value) {
			obj.setTransShipment(value);
		}
	};
	protected ProductDelivery productDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery parameters of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Optional<ProductDelivery>> mmProductDelivery = new MMBusinessAssociationEnd<Transport, Optional<ProductDelivery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> ProductDelivery.mmRouting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ProductDelivery.mmObject();
		}

		@Override
		public Optional<ProductDelivery> getValue(Transport obj) {
			return obj.getProductDelivery();
		}

		@Override
		public void setValue(Transport obj, Optional<ProductDelivery> value) {
			obj.setProductDelivery(value.orElse(null));
		}
	};
	protected Location placeOfDeparture;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
	 * Location.mmDepartureTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#mmTakingInCharge
	 * MultimodalTransport3.mmTakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDepartureAirport
	 * TransportByAir2.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmPlaceOfReceipt
	 * TransportByRoad2.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmPlaceOfReceipt
	 * TransportByRail2.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfLoading
	 * TransportBySea4.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfReceipt
	 * TransportByRail4.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDepartureAirport
	 * TransportByAir4.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmPlaceOfReceipt
	 * TransportByRoad4.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfLoading
	 * TransportBySea5.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDepartureAirport
	 * TransportByAir5.mmDepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfLoading
	 * TransportBySea6.mmPortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfReceipt
	 * TransportByRail5.mmPlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmPlaceOfReceipt
	 * TransportByRoad5.mmPlaceOfReceipt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDeparture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Location> mmPlaceOfDeparture = new MMBusinessAssociationEnd<Transport, Location>() {
		{
			derivation_lazy = () -> Arrays.asList(MultimodalTransport3.mmTakingInCharge, TransportByAir2.mmDepartureAirport, TransportByRoad2.mmPlaceOfReceipt, TransportByRail2.mmPlaceOfReceipt, TransportBySea4.mmPortOfLoading,
					TransportByRail4.mmPlaceOfReceipt, TransportByAir4.mmDepartureAirport, TransportByRoad4.mmPlaceOfReceipt, TransportBySea5.mmPortOfLoading, TransportByAir5.mmDepartureAirport, TransportBySea6.mmPortOfLoading,
					TransportByRail5.mmPlaceOfReceipt, TransportByRoad5.mmPlaceOfReceipt);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmDepartureTransportParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(Transport obj) {
			return obj.getPlaceOfDeparture();
		}

		@Override
		public void setValue(Transport obj, Location value) {
			obj.setPlaceOfDeparture(value);
		}
	};
	protected Location placeOfDestination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
	 * Location.mmDestinationTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#mmPlaceOfFinalDestination
	 * MultimodalTransport3.mmPlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#mmDestinationAirport
	 * TransportByAir2.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#mmPlaceOfDelivery
	 * TransportByRoad2.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#mmPlaceOfDelivery
	 * TransportByRail2.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfDischarge
	 * TransportBySea4.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#mmPlaceOfDelivery
	 * TransportByRail4.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDestinationAirport
	 * TransportByAir4.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#mmPlaceOfDelivery
	 * TransportByRoad4.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfDischarge
	 * TransportBySea5.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDestinationAirport
	 * TransportByAir5.mmDestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfDischarge
	 * TransportBySea6.mmPortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#mmPlaceOfDelivery
	 * TransportByRail5.mmPlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#mmPlaceOfDelivery
	 * TransportByRoad5.mmPlaceOfDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Location> mmPlaceOfDestination = new MMBusinessAssociationEnd<Transport, Location>() {
		{
			derivation_lazy = () -> Arrays.asList(MultimodalTransport3.mmPlaceOfFinalDestination, TransportByAir2.mmDestinationAirport, TransportByRoad2.mmPlaceOfDelivery, TransportByRail2.mmPlaceOfDelivery,
					TransportBySea4.mmPortOfDischarge, TransportByRail4.mmPlaceOfDelivery, TransportByAir4.mmDestinationAirport, TransportByRoad4.mmPlaceOfDelivery, TransportBySea5.mmPortOfDischarge, TransportByAir5.mmDestinationAirport,
					TransportBySea6.mmPortOfDischarge, TransportByRail5.mmPlaceOfDelivery, TransportByRoad5.mmPlaceOfDelivery);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmDestinationTransportParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(Transport obj) {
			return obj.getPlaceOfDestination();
		}

		@Override
		public void setValue(Transport obj, Location value) {
			obj.setPlaceOfDestination(value);
		}
	};
	protected List<Charges> transportCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmTransport
	 * Charges.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmFreightCharges
	 * LineItemDetails13.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmFreightCharges
	 * LineItem13.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmFreightCharges
	 * LineItem15.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmFreightCharges
	 * LineItemDetails14.mmFreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmFreightCharges
	 * TransportDetails4.mmFreightCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, List<Charges>> mmTransportCharges = new MMBusinessAssociationEnd<Transport, List<Charges>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails13.mmFreightCharges, LineItem13.mmFreightCharges, LineItem15.mmFreightCharges, LineItemDetails14.mmFreightCharges, TransportDetails4.mmFreightCharges);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> Charges.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Charges.mmObject();
		}

		@Override
		public List<Charges> getValue(Transport obj) {
			return obj.getTransportCharges();
		}

		@Override
		public void setValue(Transport obj, List<Charges> value) {
			obj.setTransportCharges(value);
		}
	};
	protected FreightChargesCode freightChargesPrepaidOrCollect;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge24#mmType
	 * Charge24.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge25#mmType
	 * Charge25.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightChargesPrepaidOrCollect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Transport, FreightChargesCode> mmFreightChargesPrepaidOrCollect = new MMBusinessAttribute<Transport, FreightChargesCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Charge24.mmType, Charge25.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}

		@Override
		public FreightChargesCode getValue(Transport obj) {
			return obj.getFreightChargesPrepaidOrCollect();
		}

		@Override
		public void setValue(Transport obj, FreightChargesCode value) {
			obj.setFreightChargesPrepaidOrCollect(value);
		}
	};
	protected ShipmentDateRange shipmentDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
	 * ShipmentDateRange.mmRelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmShipmentSchedule
	 * LineItemDetails13.mmShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmShipmentDateRange
	 * LineItem13.mmShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmShipmentDate
	 * TransportDetails4.mmShipmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the shipment date, the earliest shipment date and the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, ShipmentDateRange> mmShipmentDates = new MMBusinessAssociationEnd<Transport, ShipmentDateRange>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails13.mmShipmentSchedule, LineItem13.mmShipmentDateRange, TransportDetails4.mmShipmentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ShipmentDateRange.mmRelatedTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ShipmentDateRange.mmObject();
		}

		@Override
		public ShipmentDateRange getValue(Transport obj) {
			return obj.getShipmentDates();
		}

		@Override
		public void setValue(Transport obj, ShipmentDateRange value) {
			obj.setShipmentDates(value);
		}
	};
	protected List<Goods> transportedGoods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmTransport
	 * Goods.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportedGoods
	 * TransportDetails4.mmTransportedGoods}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, List<Goods>> mmTransportedGoods = new MMBusinessAssociationEnd<Transport, List<Goods>>() {
		{
			derivation_lazy = () -> Arrays.asList(TransportDetails4.mmTransportedGoods);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			opposite_lazy = () -> Goods.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Goods.mmObject();
		}

		@Override
		public List<Goods> getValue(Transport obj) {
			return obj.getTransportedGoods();
		}

		@Override
		public void setValue(Transport obj, List<Goods> value) {
			obj.setTransportedGoods(value);
		}
	};
	protected TransportPartyRole partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
	 * TransportPartyRole.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransportPartyRole
	 * TransportPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to the transport of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Optional<TransportPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<Transport, Optional<TransportPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TransportPartyRole.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TransportPartyRole.mmObject();
		}

		@Override
		public Optional<TransportPartyRole> getValue(Transport obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(Transport obj, Optional<TransportPartyRole> value) {
			obj.setPartyRole(value.orElse(null));
		}
	};
	protected List<Location> transitLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
	 * Location.mmRelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransitLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place through which the goods are transiting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, List<Location>> mmTransitLocation = new MMBusinessAssociationEnd<Transport, List<Location>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			opposite_lazy = () -> Location.mmRelatedTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public List<Location> getValue(Transport obj) {
			return obj.getTransitLocation();
		}

		@Override
		public void setValue(Transport obj, List<Location> value) {
			obj.setTransitLocation(value);
		}
	};
	protected Document transportDocuments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents which may be required in relation with the transportation of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Transport, Document> mmTransportDocuments = new MMBusinessAssociationEnd<Transport, Document>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Document.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Document.mmObject();
		}

		@Override
		public Document getValue(Transport obj) {
			return obj.getTransportDocuments();
		}

		@Override
		public void setValue(Transport obj, Document value) {
			obj.setTransportDocuments(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(Location.mmDepartureTransportParameters, Location.mmDestinationTransportParameters, Location.mmRelatedTransport, Document.mmTransport, Charges.mmTransport, Incoterms.mmTransport,
						Goods.mmTransport, ProductDelivery.mmRouting, Packaging.mmTransport, TransportPartyRole.mmTransport, ShipmentDateRange.mmRelatedTransport);
				derivationElement_lazy = () -> Arrays.asList(TransportMeans5.mmIndividualTransport, TransportMeans5.mmMultimodalTransport, TransportDataSet5.mmTransportInformation, TransportMeans6.mmIndividualTransport,
						TransportMeans6.mmMultimodalTransport, TransportDetails4.mmRoutingSummary);
				subType_lazy = () -> Arrays.asList(TransportByAir.mmObject(), TransportBySea.mmObject(), TransportByRoad.mmObject(), TransportByRail.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmIncoterms, com.tools20022.repository.entity.Transport.mmIdentification, com.tools20022.repository.entity.Transport.mmPackaging,
						com.tools20022.repository.entity.Transport.mmArrivalDateTime, com.tools20022.repository.entity.Transport.mmPartialShipment, com.tools20022.repository.entity.Transport.mmTransShipment,
						com.tools20022.repository.entity.Transport.mmProductDelivery, com.tools20022.repository.entity.Transport.mmPlaceOfDeparture, com.tools20022.repository.entity.Transport.mmPlaceOfDestination,
						com.tools20022.repository.entity.Transport.mmTransportCharges, com.tools20022.repository.entity.Transport.mmFreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.mmShipmentDates,
						com.tools20022.repository.entity.Transport.mmTransportedGoods, com.tools20022.repository.entity.Transport.mmPartyRole, com.tools20022.repository.entity.Transport.mmTransitLocation,
						com.tools20022.repository.entity.Transport.mmTransportDocuments);
				derivationComponent_lazy = () -> Arrays.asList(MultimodalTransport3.mmObject(), SingleTransport3.mmObject(), SingleTransport7.mmObject(), TransportMeans5.mmObject(), TransportDataSet5.mmObject(), TransportMeans6.mmObject(),
						SingleTransport8.mmObject(), TransportDetails4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Transport.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Incoterms getIncoterms() {
		return incoterms;
	}

	public Transport setIncoterms(Incoterms incoterms) {
		this.incoterms = Objects.requireNonNull(incoterms);
		return this;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public Transport setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public Transport setPackaging(Packaging packaging) {
		this.packaging = Objects.requireNonNull(packaging);
		return this;
	}

	public ISODateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public Transport setArrivalDateTime(ISODateTime arrivalDateTime) {
		this.arrivalDateTime = Objects.requireNonNull(arrivalDateTime);
		return this;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public Transport setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = Objects.requireNonNull(partialShipment);
		return this;
	}

	public YesNoIndicator getTransShipment() {
		return transShipment;
	}

	public Transport setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = Objects.requireNonNull(transShipment);
		return this;
	}

	public Optional<ProductDelivery> getProductDelivery() {
		return productDelivery == null ? Optional.empty() : Optional.of(productDelivery);
	}

	public Transport setProductDelivery(ProductDelivery productDelivery) {
		this.productDelivery = productDelivery;
		return this;
	}

	public Location getPlaceOfDeparture() {
		return placeOfDeparture;
	}

	public Transport setPlaceOfDeparture(Location placeOfDeparture) {
		this.placeOfDeparture = Objects.requireNonNull(placeOfDeparture);
		return this;
	}

	public Location getPlaceOfDestination() {
		return placeOfDestination;
	}

	public Transport setPlaceOfDestination(Location placeOfDestination) {
		this.placeOfDestination = Objects.requireNonNull(placeOfDestination);
		return this;
	}

	public List<Charges> getTransportCharges() {
		return transportCharges == null ? transportCharges = new ArrayList<>() : transportCharges;
	}

	public Transport setTransportCharges(List<Charges> transportCharges) {
		this.transportCharges = Objects.requireNonNull(transportCharges);
		return this;
	}

	public FreightChargesCode getFreightChargesPrepaidOrCollect() {
		return freightChargesPrepaidOrCollect;
	}

	public Transport setFreightChargesPrepaidOrCollect(FreightChargesCode freightChargesPrepaidOrCollect) {
		this.freightChargesPrepaidOrCollect = Objects.requireNonNull(freightChargesPrepaidOrCollect);
		return this;
	}

	public ShipmentDateRange getShipmentDates() {
		return shipmentDates;
	}

	public Transport setShipmentDates(ShipmentDateRange shipmentDates) {
		this.shipmentDates = Objects.requireNonNull(shipmentDates);
		return this;
	}

	public List<Goods> getTransportedGoods() {
		return transportedGoods == null ? transportedGoods = new ArrayList<>() : transportedGoods;
	}

	public Transport setTransportedGoods(List<Goods> transportedGoods) {
		this.transportedGoods = Objects.requireNonNull(transportedGoods);
		return this;
	}

	public Optional<TransportPartyRole> getPartyRole() {
		return partyRole == null ? Optional.empty() : Optional.of(partyRole);
	}

	public Transport setPartyRole(TransportPartyRole partyRole) {
		this.partyRole = partyRole;
		return this;
	}

	public List<Location> getTransitLocation() {
		return transitLocation == null ? transitLocation = new ArrayList<>() : transitLocation;
	}

	public Transport setTransitLocation(List<Location> transitLocation) {
		this.transitLocation = Objects.requireNonNull(transitLocation);
		return this;
	}

	public Document getTransportDocuments() {
		return transportDocuments;
	}

	public Transport setTransportDocuments(Document transportDocuments) {
		this.transportDocuments = Objects.requireNonNull(transportDocuments);
		return this;
	}
}