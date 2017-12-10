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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the report contains a new, a resubmitted or an amended
 * baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportType1Code#ForwardInitialSubmission
 * ReportType1Code.mmForwardInitialSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportType1Code#ForwardReSubmission
 * ReportType1Code.mmForwardReSubmission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportType1Code#ForwardAmend
 * ReportType1Code.mmForwardAmend}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReportTypeCode ReportTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FWIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the report contains a new, a resubmitted or an amended baseline."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportType1Code
	 * ReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardInitialSubmission"</li>
	 * </ul>
	 */
	public static final ReportType1Code ForwardInitialSubmission = new ReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardInitialSubmission";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportType1Code.mmObject();
			codeName = ReportTypeCode.ForwardInitialSubmission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportType1Code
	 * ReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardReSubmission"</li>
	 * </ul>
	 */
	public static final ReportType1Code ForwardReSubmission = new ReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardReSubmission";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportType1Code.mmObject();
			codeName = ReportTypeCode.ForwardReSubmission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportType1Code
	 * ReportType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAmend"</li>
	 * </ul>
	 */
	public static final ReportType1Code ForwardAmend = new ReportType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardAmend";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportType1Code.mmObject();
			codeName = ReportTypeCode.ForwardAmend.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportType1Code> codesByName = new LinkedHashMap<>();

	protected ReportType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FWIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportType1Code";
				definition = "Specifies whether the report contains a new, a resubmitted or an amended baseline.";
				trace_lazy = () -> ReportTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportType1Code.ForwardInitialSubmission, com.tools20022.repository.codeset.ReportType1Code.ForwardReSubmission,
						com.tools20022.repository.codeset.ReportType1Code.ForwardAmend);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForwardInitialSubmission.getCodeName().get(), ForwardInitialSubmission);
		codesByName.put(ForwardReSubmission.getCodeName().get(), ForwardReSubmission);
		codesByName.put(ForwardAmend.getCodeName().get(), ForwardAmend);
	}

	public static ReportType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportType1Code[] values() {
		ReportType1Code[] values = new ReportType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportType1Code> {
		@Override
		public ReportType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}