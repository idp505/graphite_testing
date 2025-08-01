/*
 * generated by Xtext 2.36.0
 */
package org.netapp.pcs.grammarVolumes.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.netapp.pcs.grammarVolumes.ide.contentassist.antlr.internal.InternalVolumesParser;
import org.netapp.pcs.grammarVolumes.services.VolumesGrammarAccess;

public class VolumesParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VolumesGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VolumesGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_2_2_0(), "rule__EDouble__Alternatives_2_2_0");
			builder.put(grammarAccess.getCVOAccess().getGroup(), "rule__CVO__Group__0");
			builder.put(grammarAccess.getCVOAccess().getGroup_2(), "rule__CVO__Group_2__0");
			builder.put(grammarAccess.getCVOAccess().getGroup_2_1(), "rule__CVO__Group_2_1__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup(), "rule__Volume__Group__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_2(), "rule__Volume__Group_2__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_3(), "rule__Volume__Group_3__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_4(), "rule__Volume__Group_4__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_5(), "rule__Volume__Group_5__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_6(), "rule__Volume__Group_6__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_7(), "rule__Volume__Group_7__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_8(), "rule__Volume__Group_8__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_9(), "rule__Volume__Group_9__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_9_4(), "rule__Volume__Group_9_4__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_10(), "rule__Volume__Group_10__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_10_4(), "rule__Volume__Group_10_4__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_11(), "rule__Volume__Group_11__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_12(), "rule__Volume__Group_12__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_2(), "rule__EDouble__Group_2__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_2_2(), "rule__EDouble__Group_2_2__0");
			builder.put(grammarAccess.getCVOAccess().getVolumesAssignment_2_0(), "rule__CVO__VolumesAssignment_2_0");
			builder.put(grammarAccess.getCVOAccess().getVolumesAssignment_2_1_1(), "rule__CVO__VolumesAssignment_2_1_1");
			builder.put(grammarAccess.getVolumeAccess().getNameAssignment_2_2(), "rule__Volume__NameAssignment_2_2");
			builder.put(grammarAccess.getVolumeAccess().getIdentifierAssignment_3_2(), "rule__Volume__IdentifierAssignment_3_2");
			builder.put(grammarAccess.getVolumeAccess().getStateAssignment_4_2(), "rule__Volume__StateAssignment_4_2");
			builder.put(grammarAccess.getVolumeAccess().getSizeAssignment_5_2(), "rule__Volume__SizeAssignment_5_2");
			builder.put(grammarAccess.getVolumeAccess().getSize_unitAssignment_6_2(), "rule__Volume__Size_unitAssignment_6_2");
			builder.put(grammarAccess.getVolumeAccess().getSvm_nameAssignment_7_2(), "rule__Volume__Svm_nameAssignment_7_2");
			builder.put(grammarAccess.getVolumeAccess().getExport_policy_typeAssignment_8_2(), "rule__Volume__Export_policy_typeAssignment_8_2");
			builder.put(grammarAccess.getVolumeAccess().getExport_policy_ipAssignment_9_3(), "rule__Volume__Export_policy_ipAssignment_9_3");
			builder.put(grammarAccess.getVolumeAccess().getExport_policy_ipAssignment_9_4_1(), "rule__Volume__Export_policy_ipAssignment_9_4_1");
			builder.put(grammarAccess.getVolumeAccess().getExport_policy_nfs_versionAssignment_10_3(), "rule__Volume__Export_policy_nfs_versionAssignment_10_3");
			builder.put(grammarAccess.getVolumeAccess().getExport_policy_nfs_versionAssignment_10_4_1(), "rule__Volume__Export_policy_nfs_versionAssignment_10_4_1");
			builder.put(grammarAccess.getVolumeAccess().getSnapshot_policyAssignment_11_2(), "rule__Volume__Snapshot_policyAssignment_11_2");
			builder.put(grammarAccess.getVolumeAccess().getEnvironmentAssignment_12_2(), "rule__Volume__EnvironmentAssignment_12_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VolumesGrammarAccess grammarAccess;

	@Override
	protected InternalVolumesParser createParser() {
		InternalVolumesParser result = new InternalVolumesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VolumesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VolumesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
