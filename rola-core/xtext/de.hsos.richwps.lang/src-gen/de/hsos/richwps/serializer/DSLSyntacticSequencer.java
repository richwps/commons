package de.hsos.richwps.serializer;

import com.google.inject.Inject;
import de.hsos.richwps.services.DSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DSLGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DSLGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIN_REFERENCE_HANDLERule())
			return getIN_REFERENCE_HANDLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOUT_REFERENCE_HANDLERule())
			return getOUT_REFERENCE_HANDLEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVAR_REFERENCE_HANDLERule())
			return getVAR_REFERENCE_HANDLEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal IN_REFERENCE_HANDLE:
	 * 	'in.' | 'IN.';
	 */
	protected String getIN_REFERENCE_HANDLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "in.";
	}
	
	/**
	 * terminal OUT_REFERENCE_HANDLE:
	 * 	'out.' | 'OUT.';
	 */
	protected String getOUT_REFERENCE_HANDLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "out.";
	}
	
	/**
	 * terminal VAR_REFERENCE_HANDLE:
	 * 	'var.' | 'VAR.';
	 */
	protected String getVAR_REFERENCE_HANDLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "var.";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
