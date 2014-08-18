package de.hsos.richwps.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.hsos.richwps.dSL.Assignment;
import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.ExecInput;
import de.hsos.richwps.dSL.ExecOutput;
import de.hsos.richwps.dSL.ExecuteStatement;
import de.hsos.richwps.dSL.IN_REFERENCE;
import de.hsos.richwps.dSL.LocalBinding;
import de.hsos.richwps.dSL.OUT_REFERENCE;
import de.hsos.richwps.dSL.RemoteBinding;
import de.hsos.richwps.dSL.VAR_REFERENCE;
import de.hsos.richwps.dSL.Worksequence;
import de.hsos.richwps.services.DSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DSLPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.EXEC_INPUT:
				if(context == grammarAccess.getExecInputRule()) {
					sequence_ExecInput(context, (ExecInput) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.EXEC_OUTPUT:
				if(context == grammarAccess.getExecOutputRule()) {
					sequence_ExecOutput(context, (ExecOutput) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.EXECUTE_STATEMENT:
				if(context == grammarAccess.getExecuteStatementRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_ExecuteStatement(context, (ExecuteStatement) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.IN_REFERENCE:
				if(context == grammarAccess.getIN_REFERENCERule()) {
					sequence_IN_REFERENCE(context, (IN_REFERENCE) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.LOCAL_BINDING:
				if(context == grammarAccess.getLocalBindingRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_LocalBinding(context, (LocalBinding) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.OUT_REFERENCE:
				if(context == grammarAccess.getOUT_REFERENCERule()) {
					sequence_OUT_REFERENCE(context, (OUT_REFERENCE) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.REMOTE_BINDING:
				if(context == grammarAccess.getOperationRule() ||
				   context == grammarAccess.getRemoteBindingRule()) {
					sequence_RemoteBinding(context, (RemoteBinding) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.VAR_REFERENCE:
				if(context == grammarAccess.getVAR_REFERENCERule()) {
					sequence_VAR_REFERENCE(context, (VAR_REFERENCE) semanticObject); 
					return; 
				}
				else break;
			case DSLPackage.WORKSEQUENCE:
				if(context == grammarAccess.getWorksequenceRule()) {
					sequence_Worksequence(context, (Worksequence) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (lefthand=OUT_REFERENCE righthand=IN_REFERENCE) | 
	 *         (lefthand=OUT_REFERENCE righthand=VAR_REFERENCE) | 
	 *         (lefthand=VAR_REFERENCE val_s=STRING) | 
	 *         (lefthand=VAR_REFERENCE val_i=INT)
	 *     )
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((reference=IN_REFERENCE wpsid=ID) | (reference=VAR_REFERENCE wpsid=ID))
	 */
	protected void sequence_ExecInput(EObject context, ExecInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((wpsid=ID reference=OUT_REFERENCE) | (wpsid=ID reference=VAR_REFERENCE))
	 */
	protected void sequence_ExecOutput(EObject context, ExecOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (handle=QUALIFIEDID execinputs+=ExecInput* execoutputs+=ExecOutput*)
	 */
	protected void sequence_ExecuteStatement(EObject context, ExecuteStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     refname=ID
	 */
	protected void sequence_IN_REFERENCE(EObject context, IN_REFERENCE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.IN_REFERENCE__REFNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.IN_REFERENCE__REFNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIN_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0(), semanticObject.getRefname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (processid=QUALIFIEDNAME handle=QUALIFIEDID)
	 */
	protected void sequence_LocalBinding(EObject context, LocalBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.LOCAL_BINDING__PROCESSID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.LOCAL_BINDING__PROCESSID));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.LOCAL_BINDING__HANDLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.LOCAL_BINDING__HANDLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_2_0(), semanticObject.getProcessid());
		feeder.accept(grammarAccess.getLocalBindingAccess().getHandleQUALIFIEDIDParserRuleCall_4_0(), semanticObject.getHandle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refname=ID
	 */
	protected void sequence_OUT_REFERENCE(EObject context, OUT_REFERENCE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.OUT_REFERENCE__REFNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.OUT_REFERENCE__REFNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOUT_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0(), semanticObject.getRefname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         protocol=PROTOCOL 
	 *         host=QUALIFIEDNAME 
	 *         port=INT 
	 *         path=URI 
	 *         processid=QUALIFIEDNAME 
	 *         handle=QUALIFIEDID
	 *     )
	 */
	protected void sequence_RemoteBinding(EObject context, RemoteBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PROTOCOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PROTOCOL));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__HOST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__HOST));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PORT));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PATH));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PROCESSID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__PROCESSID));
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.REMOTE_BINDING__HANDLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.REMOTE_BINDING__HANDLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemoteBindingAccess().getProtocolPROTOCOLTerminalRuleCall_2_0(), semanticObject.getProtocol());
		feeder.accept(grammarAccess.getRemoteBindingAccess().getHostQUALIFIEDNAMEParserRuleCall_3_0(), semanticObject.getHost());
		feeder.accept(grammarAccess.getRemoteBindingAccess().getPortINTTerminalRuleCall_4_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getRemoteBindingAccess().getPathURIParserRuleCall_5_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getRemoteBindingAccess().getProcessidQUALIFIEDNAMEParserRuleCall_6_0(), semanticObject.getProcessid());
		feeder.accept(grammarAccess.getRemoteBindingAccess().getHandleQUALIFIEDIDParserRuleCall_8_0(), semanticObject.getHandle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     refname=ID
	 */
	protected void sequence_VAR_REFERENCE(EObject context, VAR_REFERENCE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DSLPackage.Literals.VAR_REFERENCE__REFNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLPackage.Literals.VAR_REFERENCE__REFNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVAR_REFERENCEAccess().getRefnameIDTerminalRuleCall_1_0(), semanticObject.getRefname());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operations+=Operation*
	 */
	protected void sequence_Worksequence(EObject context, Worksequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
