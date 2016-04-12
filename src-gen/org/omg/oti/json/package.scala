/*
 *
 *  License Terms
 *
 *  Copyright (c) 2015, California Institute of Technology ("Caltech").
 *  U.S. Government sponsorship acknowledged.
 *
 *  Copyright (c) 2015, Airbus Operations S.A.S.
 *
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 *
 *
 *   *   Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *   *   Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the
 *       distribution.
 *
 *   *   Neither the name of Caltech nor its operating division, the Jet
 *       Propulsion Laboratory, nor the names of its contributors may be
 *       used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 *  IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 *  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 *  OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.omg.oti.json
/**
 * The UML 2.5 metamodel
 *
 * <!-- Start of user code documentation -->
 * <!-- End of user code documentation -->
 */ 

import org.omg.oti.json.common.OTIPrimitiveTypes._
import org.omg.oti.json.uml.enums._

import play.json.extra._
import play.api.libs.json._

import scala.collection.immutable._
import scala.{Boolean,Double,Int,Option,StringContext}
import scala.Predef.String

import scalaz._

package object uml {

  // traits for all OMG UML 2.5 metaclasses
  // trait U1 extends U2 if UML 2.5 metaclass U1 has a direct generalization relationship to UML 2.5 metaclass U2

  /**
    * An Abstraction is a Relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints.
    */
  trait UMLAbstraction
	extends UMLDependency
  {}

  /**
    * An AcceptCallAction is an AcceptEventAction that handles the receipt of a synchronous call request. In addition to the values from the Operation input parameters, the Action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller. An AcceptCallAction is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent ReplyAction will complete immediately with no effect.
    */
  trait UMLAcceptCallAction
	extends UMLAcceptEventAction
  {}

  /**
    * An AcceptEventAction is an Action that waits for the occurrence of one or more specific Events.
    */
  trait UMLAcceptEventAction
	extends UMLAction
  {}

  /**
    * An Action is the fundamental unit of executable functionality. The execution of an Action represents some transformation or processing in the modeled system. Actions provide the ExecutableNodes within Activities and may also be used within Interactions.
    */
  trait UMLAction
	extends UMLExecutableNode
  {}

  /**
    * An ActionExecutionSpecification is a kind of ExecutionSpecification representing the execution of an Action.
    */
  trait UMLActionExecutionSpecification
	extends UMLExecutionSpecification
  {}

  /**
    * An ActionInputPin is a kind of InputPin that executes an Action to determine the values to input to another Action.
    */
  trait UMLActionInputPin
	extends UMLInputPin
  {}

  /**
    * An Activity is the specification of parameterized Behavior as the coordinated sequencing of subordinate units.
    */
  trait UMLActivity
	extends UMLBehavior
  {}

  /**
    * An ActivityEdge is an abstract class for directed connections between two ActivityNodes.
    */
  trait UMLActivityEdge
	extends UMLRedefinableElement
  {}

  /**
    * An ActivityFinalNode is a FinalNode that terminates the execution of its owning Activity or StructuredActivityNode.
    */
  trait UMLActivityFinalNode
	extends UMLFinalNode
  {}

  /**
    * ActivityGroup is an abstract class for defining sets of ActivityNodes and ActivityEdges in an Activity.
    */
  trait UMLActivityGroup
	extends UMLNamedElement
  {}

  /**
    * ActivityNode is an abstract class for points in the flow of an Activity connected by ActivityEdges.
    */
  trait UMLActivityNode
	extends UMLRedefinableElement
  {}

  /**
    * An ActivityParameterNode is an ObjectNode for accepting values from the input Parameters or providing values to the output Parameters of an Activity.
    */
  trait UMLActivityParameterNode
	extends UMLObjectNode
  {}

  /**
    * An ActivityPartition is a kind of ActivityGroup for identifying ActivityNodes that have some characteristic in common.
    */
  trait UMLActivityPartition
	extends UMLActivityGroup
  {}

  /**
    * An Actor specifies a role played by a user or any other system that interacts with the subject.
    */
  trait UMLActor
	extends UMLBehavioredClassifier
  {}

  /**
    * An AddStructuralFeatureValueAction is a WriteStructuralFeatureAction for adding values to a StructuralFeature.
    */
  trait UMLAddStructuralFeatureValueAction
	extends UMLWriteStructuralFeatureAction
  {}

  /**
    * An AddVariableValueAction is a WriteVariableAction for adding values to a Variable.
    */
  trait UMLAddVariableValueAction
	extends UMLWriteVariableAction
  {}

  /**
    * A trigger for an AnyReceiveEvent is triggered by the receipt of any message that is not explicitly handled by any related trigger.
    */
  trait UMLAnyReceiveEvent
	extends UMLMessageEvent
  {}

  /**
    * An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.An artifact is the source of a deployment to a node.
    */
  trait UMLArtifact
	extends UMLClassifier
	with UMLDeployedArtifact
  {}

  /**
    * A link is a tuple of values that refer to typed objects.  An Association classifies a set of links, each of which is an instance of the Association.  Each value in the link refers to an instance of the type of the corresponding end of the Association.
    */
  trait UMLAssociation
	extends UMLClassifier
	with UMLRelationship
  {}

  /**
    * A model element that has both Association and Class properties. An AssociationClass can be seen as an Association that also has Class properties, or as a Class that also has Association properties. It not only connects a set of Classifiers but also defines a set of Features that belong to the Association itself and not to any of the associated Classifiers.
    */
  trait UMLAssociationClass
	extends UMLAssociation
	with UMLClass
  {}

  /**
    * Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution.
    */
  trait UMLBehavior
	extends UMLClass
  {}

  /**
    * A BehaviorExecutionSpecification is a kind of ExecutionSpecification representing the execution of a Behavior.
    */
  trait UMLBehaviorExecutionSpecification
	extends UMLExecutionSpecification
  {}

  /**
    * A BehavioralFeature is a feature of a Classifier that specifies an aspect of the behavior of its instances.  A BehavioralFeature is implemented (realized) by a Behavior. A BehavioralFeature specifies that a Classifier will respond to a designated request by invoking its implementing method.
    */
  trait UMLBehavioralFeature
	extends UMLFeature
	with UMLNamespace
  {}

  /**
    * A BehavioredClassifier may have InterfaceRealizations, and owns a set of Behaviors one of which may specify the behavior of the BehavioredClassifier itself.
    */
  trait UMLBehavioredClassifier
	extends UMLClassifier
  {}

  /**
    * A BroadcastSignalAction is an InvocationAction that transmits a Signal instance to all the potential target objects in the system. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instances are sent out and cannot receive reply values.
    */
  trait UMLBroadcastSignalAction
	extends UMLInvocationAction
  {}

  /**
    * CallAction is an abstract class for Actions that invoke a Behavior with given argument values and (if the invocation is synchronous) receive reply values.
    */
  trait UMLCallAction
	extends UMLInvocationAction
  {}

  /**
    * A CallBehaviorAction is a CallAction that invokes a Behavior directly. The argument values of the CallBehaviorAction are passed on the input Parameters of the invoked Behavior. If the call is synchronous, the execution of the CallBehaviorAction waits until the execution of the invoked Behavior completes and the values of output Parameters of the Behavior are placed on the result OutputPins. If the call is asynchronous, the CallBehaviorAction completes immediately and no results values can be provided.
    */
  trait UMLCallBehaviorAction
	extends UMLCallAction
  {}

  /**
    * A CallEvent models the receipt by an object of a message invoking a call of an Operation.
    */
  trait UMLCallEvent
	extends UMLMessageEvent
  {}

  /**
    * A CallOperationAction is a CallAction that transmits an Operation call request to the target object, where it may cause the invocation of associated Behavior. The argument values of the CallOperationAction are passed on the input Parameters of the Operation. If call is synchronous, the execution of the CallOperationAction waits until the execution of the invoked Operation completes and the values of output Parameters of the Operation are placed on the result OutputPins. If the call is asynchronous, the CallOperationAction completes immediately and no results values can be provided.
    */
  trait UMLCallOperationAction
	extends UMLCallAction
  {}

  /**
    * A CentralBufferNode is an ObjectNode for managing flows from multiple sources and targets.
    */
  trait UMLCentralBufferNode
	extends UMLObjectNode
  {}

  /**
    * A ChangeEvent models a change in the system configuration that makes a condition true.
    */
  trait UMLChangeEvent
	extends UMLEvent
  {}

  /**
    * A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.
    */
  trait UMLClass
	extends UMLBehavioredClassifier
	with UMLEncapsulatedClassifier
  {}

  /**
    * A Classifier represents a classification of instances according to their Features.
    */
  trait UMLClassifier
	extends UMLNamespace
	with UMLRedefinableElement
	with UMLTemplateableElement
	with UMLType
  {}

  /**
    * A ClassifierTemplateParameter exposes a Classifier as a formal template parameter.
    */
  trait UMLClassifierTemplateParameter
	extends UMLTemplateParameter
  {}

  /**
    * A Clause is an Element that represents a single branch of a ConditionalNode, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates to true.
    */
  trait UMLClause
	extends UMLElement
  {}

  /**
    * A ClearAssociationAction is an Action that destroys all links of an Association in which a particular object participates.
    */
  trait UMLClearAssociationAction
	extends UMLAction
  {}

  /**
    * A ClearStructuralFeatureAction is a StructuralFeatureAction that removes all values of a StructuralFeature.
    */
  trait UMLClearStructuralFeatureAction
	extends UMLStructuralFeatureAction
  {}

  /**
    * A ClearVariableAction is a VariableAction that removes all values of a Variable.
    */
  trait UMLClearVariableAction
	extends UMLVariableAction
  {}

  /**
    * A Collaboration describes a structure of collaborating elements (roles), each performing a specialized function, which collectively accomplish some desired functionality. 
    */
  trait UMLCollaboration
	extends UMLBehavioredClassifier
	with UMLStructuredClassifier
  {}

  /**
    * A CollaborationUse is used to specify the application of a pattern specified by a Collaboration to a specific situation.
    */
  trait UMLCollaborationUse
	extends UMLNamedElement
  {}

  /**
    * A CombinedFragment defines an expression of InteractionFragments. A CombinedFragment is defined by an interaction operator and corresponding InteractionOperands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner.
    */
  trait UMLCombinedFragment
	extends UMLInteractionFragment
  {}

  /**
    * A Comment is a textual annotation that can be attached to a set of Elements.
    */
  trait UMLComment
	extends UMLElement
  {}

  /**
    * A communication path is an association between two deployment targets, through which they are able to exchange signals and messages.
    */
  trait UMLCommunicationPath
	extends UMLAssociation
  {}

  /**
    * A Component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.  
    */
  trait UMLComponent
	extends UMLClass
  {}

  /**
    * Realization is specialized to (optionally) define the Classifiers that realize the contract offered by a Component in terms of its provided and required Interfaces. The Component forms an abstraction from these various Classifiers.
    */
  trait UMLComponentRealization
	extends UMLRealization
  {}

  /**
    * A ConditionalNode is a StructuredActivityNode that chooses one among some number of alternative collections of ExecutableNodes to execute.
    */
  trait UMLConditionalNode
	extends UMLStructuredActivityNode
  {}

  /**
    * ConnectableElement is an abstract metaclass representing a set of instances that play roles of a StructuredClassifier. ConnectableElements may be joined by attached Connectors and specify configurations of linked instances to be created within an instance of the containing StructuredClassifier.
    */
  trait UMLConnectableElement
	extends UMLParameterableElement
	with UMLTypedElement
  {}

  /**
    * A ConnectableElementTemplateParameter exposes a ConnectableElement as a formal parameter for a template.
    */
  trait UMLConnectableElementTemplateParameter
	extends UMLTemplateParameter
  {}

  /**
    * A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State.
    */
  trait UMLConnectionPointReference
	extends UMLVertex
  {}

  /**
    * A Connector specifies links that enables communication between two or more instances. In contrast to Associations, which specify links between any instance of the associated Classifiers, Connectors specify links between instances playing the connected parts only.
    */
  trait UMLConnector
	extends UMLFeature
  {}

  /**
    * A ConnectorEnd is an endpoint of a Connector, which attaches the Connector to a ConnectableElement.
    */
  trait UMLConnectorEnd
	extends UMLMultiplicityElement
  {}

  /**
    * A ConsiderIgnoreFragment is a kind of CombinedFragment that is used for the consider and ignore cases, which require lists of pertinent Messages to be specified.
    */
  trait UMLConsiderIgnoreFragment
	extends UMLCombinedFragment
  {}

  /**
    * A Constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an Element or set of Elements.
    */
  trait UMLConstraint
	extends UMLPackageableElement
  {}

  /**
    * A Continuation is a syntactic way to define continuations of different branches of an alternative CombinedFragment. Continuations are intuitively similar to labels representing intermediate points in a flow of control.
    */
  trait UMLContinuation
	extends UMLInteractionFragment
  {}

  /**
    * A ControlFlow is an ActivityEdge traversed by control tokens or object tokens of control type, which are use to control the execution of ExecutableNodes.
    */
  trait UMLControlFlow
	extends UMLActivityEdge
  {}

  /**
    * A ControlNode is an abstract ActivityNode that coordinates flows in an Activity.
    */
  trait UMLControlNode
	extends UMLActivityNode
  {}

  /**
    * A CreateLinkAction is a WriteLinkAction for creating links.
    */
  trait UMLCreateLinkAction
	extends UMLWriteLinkAction
  {}

  /**
    * A CreateLinkObjectAction is a CreateLinkAction for creating link objects (AssociationClasse instances).
    */
  trait UMLCreateLinkObjectAction
	extends UMLCreateLinkAction
  {}

  /**
    * A CreateObjectAction is an Action that creates an instance of the specified Classifier.
    */
  trait UMLCreateObjectAction
	extends UMLAction
  {}

  /**
    * A DataStoreNode is a CentralBufferNode for persistent data.
    */
  trait UMLDataStoreNode
	extends UMLCentralBufferNode
  {}

  /**
    * A DataType is a type whose instances are identified only by their value.
    */
  trait UMLDataType
	extends UMLClassifier
  {}

  /**
    * A DecisionNode is a ControlNode that chooses between outgoing ActivityEdges for the routing of tokens.
    */
  trait UMLDecisionNode
	extends UMLControlNode
  {}

  /**
    * A Dependency is a Relationship that signifies that a single model Element or a set of model Elements requires other model Elements for their specification or implementation. This means that the complete semantics of the client Element(s) are either semantically or structurally dependent on the definition of the supplier Element(s).
    */
  trait UMLDependency
	extends UMLDirectedRelationship
	with UMLPackageableElement
  {}

  /**
    * A deployed artifact is an artifact or artifact instance that has been deployed to a deployment target.
    */
  trait UMLDeployedArtifact
	extends UMLNamedElement
  {}

  /**
    * A deployment is the allocation of an artifact or artifact instance to a deployment target.A component deployment is the deployment of one or more artifacts or artifact instances to a deployment target, optionally parameterized by a deployment specification. Examples are executables and configuration files.
    */
  trait UMLDeployment
	extends UMLDependency
  {}

  /**
    * A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor.
    */
  trait UMLDeploymentSpecification
	extends UMLArtifact
  {}

  /**
    * A deployment target is the location for a deployed artifact.
    */
  trait UMLDeploymentTarget
	extends UMLNamedElement
  {}

  /**
    * A DestroyLinkAction is a WriteLinkAction that destroys links (including link objects).
    */
  trait UMLDestroyLinkAction
	extends UMLWriteLinkAction
  {}

  /**
    * A DestroyObjectAction is an Action that destroys objects.
    */
  trait UMLDestroyObjectAction
	extends UMLAction
  {}

  /**
    * A DestructionOccurenceSpecification models the destruction of an object.
    */
  trait UMLDestructionOccurrenceSpecification
	extends UMLMessageOccurrenceSpecification
  {}

  /**
    * A device is a physical computational resource with processing capability upon which artifacts may be deployed for execution. Devices may be complex (i.e., they may consist of other devices).
    */
  trait UMLDevice
	extends UMLNode
  {}

  /**
    * A DirectedRelationship represents a relationship between a collection of source model Elements and a collection of target model Elements.
    */
  trait UMLDirectedRelationship
	extends UMLRelationship
  {}

  /**
    * A Duration is a ValueSpecification that specifies the temporal distance between two time instants.
    */
  trait UMLDuration
	extends UMLValueSpecification
  {}

  /**
    * A DurationConstraint is a Constraint that refers to a DurationInterval.
    */
  trait UMLDurationConstraint
	extends UMLIntervalConstraint
  {}

  /**
    * A DurationInterval defines the range between two Durations.
    */
  trait UMLDurationInterval
	extends UMLInterval
  {}

  /**
    * A DurationObservation is a reference to a duration during an execution. It points out the NamedElement(s) in the model to observe and whether the observations are when this NamedElement is entered or when it is exited.
    */
  trait UMLDurationObservation
	extends UMLObservation
  {}

  /**
    * An Element is a constituent of a model. As such, it has the capability of owning other Elements.
    */
  trait UMLElement
  {}

  /**
    * An ElementImport identifies a NamedElement in a Namespace other than the one that owns that NamedElement and allows the NamedElement to be referenced using an unqualified name in the Namespace owning the ElementImport.
    */
  trait UMLElementImport
	extends UMLDirectedRelationship
  {}

  /**
    * An EncapsulatedClassifier may own Ports to specify typed interaction points.
    */
  trait UMLEncapsulatedClassifier
	extends UMLStructuredClassifier
  {}

  /**
    * An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals.
    */
  trait UMLEnumeration
	extends UMLDataType
  {}

  /**
    * An EnumerationLiteral is a user-defined data value for an Enumeration.
    */
  trait UMLEnumerationLiteral
	extends UMLInstanceSpecification
  {}

  /**
    * An Event is the specification of some occurrence that may potentially trigger effects by an object.
    */
  trait UMLEvent
	extends UMLPackageableElement
  {}

  /**
    * An ExceptionHandler is an Element that specifies a handlerBody ExecutableNode to execute in case the specified exception occurs during the execution of the protected ExecutableNode.
    */
  trait UMLExceptionHandler
	extends UMLElement
  {}

  /**
    * An ExecutableNode is an abstract class for ActivityNodes whose execution may be controlled using ControlFlows and to which ExceptionHandlers may be attached.
    */
  trait UMLExecutableNode
	extends UMLActivityNode
  {}

  /**
    * An execution environment is a node that offers an execution environment for specific types of components that are deployed on it in the form of executable artifacts.
    */
  trait UMLExecutionEnvironment
	extends UMLNode
  {}

  /**
    * An ExecutionOccurrenceSpecification represents moments in time at which Actions or Behaviors start or finish.
    */
  trait UMLExecutionOccurrenceSpecification
	extends UMLOccurrenceSpecification
  {}

  /**
    * An ExecutionSpecification is a specification of the execution of a unit of Behavior or Action within the Lifeline. The duration of an ExecutionSpecification is represented by two OccurrenceSpecifications, the start OccurrenceSpecification and the finish OccurrenceSpecification.
    */
  trait UMLExecutionSpecification
	extends UMLInteractionFragment
  {}

  /**
    * An ExpansionNode is an ObjectNode used to indicate a collection input or output for an ExpansionRegion. A collection input of an ExpansionRegion contains a collection that is broken into its individual elements inside the region, whose content is executed once per element. A collection output of an ExpansionRegion combines individual elements produced by the execution of the region into a collection for use outside the region.
    */
  trait UMLExpansionNode
	extends UMLObjectNode
  {}

  /**
    * An ExpansionRegion is a StructuredActivityNode that executes its content multiple times corresponding to elements of input collection(s).
    */
  trait UMLExpansionRegion
	extends UMLStructuredActivityNode
  {}

  /**
    * An Expression represents a node in an expression tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly empty sequence of operands that are ValueSpecifications. It denotes a (possibly empty) set of values when evaluated in a context.
    */
  trait UMLExpression
	extends UMLValueSpecification
  {}

  /**
    * A relationship from an extending UseCase to an extended UseCase that specifies how and when the behavior defined in the extending UseCase can be inserted into the behavior defined in the extended UseCase.
    */
  trait UMLExtend
	extends UMLDirectedRelationship
	with UMLNamedElement
  {}

  /**
    * An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes.
    */
  trait UMLExtension
	extends UMLAssociation
  {}

  /**
    * An extension end is used to tie an extension to a stereotype when extending a metaclass.The default multiplicity of an extension end is 0..1.
    */
  trait UMLExtensionEnd
	extends UMLProperty
  {}

  /**
    * An ExtensionPoint identifies a point in the behavior of a UseCase where that behavior can be extended by the behavior of some other (extending) UseCase, as specified by an Extend relationship.
    */
  trait UMLExtensionPoint
	extends UMLRedefinableElement
  {}

  /**
    * A Feature declares a behavioral or structural characteristic of Classifiers.
    */
  trait UMLFeature
	extends UMLRedefinableElement
  {}

  /**
    * A FinalNode is an abstract ControlNode at which a flow in an Activity stops.
    */
  trait UMLFinalNode
	extends UMLControlNode
  {}

  /**
    * A special kind of State, which, when entered, signifies that the enclosing Region has completed. If the enclosing Region is directly contained in a StateMachine and all other Regions in that StateMachine also are completed, then it means that the entire StateMachine behavior is completed.
    */
  trait UMLFinalState
	extends UMLState
  {}

  /**
    * A FlowFinalNode is a FinalNode that terminates a flow by consuming the tokens offered to it.
    */
  trait UMLFlowFinalNode
	extends UMLFinalNode
  {}

  /**
    * A ForkNode is a ControlNode that splits a flow into multiple concurrent flows.
    */
  trait UMLForkNode
	extends UMLControlNode
  {}

  /**
    * A FunctionBehavior is an OpaqueBehavior that does not access or modify any objects or other external data.
    */
  trait UMLFunctionBehavior
	extends UMLOpaqueBehavior
  {}

  /**
    * A Gate is a MessageEnd which serves as a connection point for relating a Message which has a MessageEnd (sendEvent / receiveEvent) outside an InteractionFragment with another Message which has a MessageEnd (receiveEvent / sendEvent)  inside that InteractionFragment.
    */
  trait UMLGate
	extends UMLMessageEnd
  {}

  /**
    * A GeneralOrdering represents a binary relation between two OccurrenceSpecifications, to describe that one OccurrenceSpecification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order.
    */
  trait UMLGeneralOrdering
	extends UMLNamedElement
  {}

  /**
    * A Generalization is a taxonomic relationship between a more general Classifier and a more specific Classifier. Each instance of the specific Classifier is also an instance of the general Classifier. The specific Classifier inherits the features of the more general Classifier. A Generalization is owned by the specific Classifier.
    */
  trait UMLGeneralization
	extends UMLDirectedRelationship
  {}

  /**
    * A GeneralizationSet is a PackageableElement whose instances represent sets of Generalization relationships.
    */
  trait UMLGeneralizationSet
	extends UMLPackageableElement
  {}

  /**
    * Physical definition of a graphical image.
    */
  trait UMLImage
	extends UMLElement
  {}

  /**
    * An Include relationship specifies that a UseCase contains the behavior defined in another UseCase.
    */
  trait UMLInclude
	extends UMLDirectedRelationship
	with UMLNamedElement
  {}

  /**
    * InformationFlows describe circulation of information through a system in a general manner. They do not specify the nature of the information, mechanisms by which it is conveyed, sequences of exchange or any control conditions. During more detailed modeling, representation and realization links may be added to specify which model elements implement an InformationFlow and to show how information is conveyed.  InformationFlows require some kind of ?information channel? for unidirectional transmission of information items from sources to targets.? They specify the information channel?s realizations, if any, and identify the information that flows along them.? Information moving along the information channel may be represented by abstract InformationItems and by concrete Classifiers.
    */
  trait UMLInformationFlow
	extends UMLDirectedRelationship
	with UMLPackageableElement
  {}

  /**
    * InformationItems represent many kinds of information that can flow from sources to targets in very abstract ways.? They represent the kinds of information that may move within a system, but do not elaborate details of the transferred information.? Details of transferred information are the province of other Classifiers that may ultimately define InformationItems.? Consequently, InformationItems cannot be instantiated and do not themselves have features, generalizations, or associations.?An important use of InformationItems is to represent information during early design stages, possibly before the detailed modeling decisions that will ultimately define them have been made. Another purpose of InformationItems is to abstract portions of complex models in less precise, but perhaps more general and communicable, ways. 
    */
  trait UMLInformationItem
	extends UMLClassifier
  {}

  /**
    * An InitialNode is a ControlNode that offers a single control token when initially enabled.
    */
  trait UMLInitialNode
	extends UMLControlNode
  {}

  /**
    * An InputPin is a Pin that holds input values to be consumed by an Action.
    */
  trait UMLInputPin
	extends UMLPin
  {}

  /**
    * An InstanceSpecification is a model element that represents an instance in a modeled system. An InstanceSpecification can act as a DeploymentTarget in a Deployment relationship, in the case that it represents an instance of a Node. It can also act as a DeployedArtifact, if it represents an instance of an Artifact.
    */
  trait UMLInstanceSpecification
	extends UMLDeployedArtifact
	with UMLDeploymentTarget
	with UMLPackageableElement
  {}

  /**
    * An InstanceValue is a ValueSpecification that identifies an instance.
    */
  trait UMLInstanceValue
	extends UMLValueSpecification
  {}

  /**
    * An Interaction is a unit of Behavior that focuses on the observable exchange of information between connectable elements.
    */
  trait UMLInteraction
	extends UMLBehavior
	with UMLInteractionFragment
  {}

  /**
    * An InteractionConstraint is a Boolean expression that guards an operand in a CombinedFragment.
    */
  trait UMLInteractionConstraint
	extends UMLConstraint
  {}

  /**
    * InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself.
    */
  trait UMLInteractionFragment
	extends UMLNamedElement
  {}

  /**
    * An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represents one operand of the expression given by the enclosing CombinedFragment.
    */
  trait UMLInteractionOperand
	extends UMLInteractionFragment
	with UMLNamespace
  {}

  /**
    * An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referenced Interaction where the InteractionUse is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal Gates with the actual ones.
    */
  trait UMLInteractionUse
	extends UMLInteractionFragment
  {}

  /**
    * Interfaces declare coherent services that are implemented by BehavioredClassifiers that implement the Interfaces via InterfaceRealizations.
    */
  trait UMLInterface
	extends UMLClassifier
  {}

  /**
    * An InterfaceRealization is a specialized realization relationship between a BehavioredClassifier and an Interface. This relationship signifies that the realizing BehavioredClassifier conforms to the contract specified by the Interface.
    */
  trait UMLInterfaceRealization
	extends UMLRealization
  {}

  /**
    * An InterruptibleActivityRegion is an ActivityGroup that supports the termination of tokens flowing in the portions of an activity within it.
    */
  trait UMLInterruptibleActivityRegion
	extends UMLActivityGroup
  {}

  /**
    * An Interval defines the range between two ValueSpecifications.
    */
  trait UMLInterval
	extends UMLValueSpecification
  {}

  /**
    * An IntervalConstraint is a Constraint that is specified by an Interval.
    */
  trait UMLIntervalConstraint
	extends UMLConstraint
  {}

  /**
    * InvocationAction is an abstract class for the various actions that request Behavior invocation.
    */
  trait UMLInvocationAction
	extends UMLAction
  {}

  /**
    * A JoinNode is a ControlNode that synchronizes multiple flows.
    */
  trait UMLJoinNode
	extends UMLControlNode
  {}

  /**
    * A Lifeline represents an individual participant in the Interaction. While parts and structural features may have multiplicity greater than 1, Lifelines represent only one interacting entity.
    */
  trait UMLLifeline
	extends UMLNamedElement
  {}

  /**
    * LinkAction is an abstract class for all Actions that identify the links to be acted on using LinkEndData.
    */
  trait UMLLinkAction
	extends UMLAction
  {}

  /**
    * LinkEndCreationData is LinkEndData used to provide values for one end of a link to be created by a CreateLinkAction.
    */
  trait UMLLinkEndCreationData
	extends UMLLinkEndData
  {}

  /**
    * LinkEndData is an Element that identifies on end of a link to be read or written by a LinkAction. As a link (that is not a link object) cannot be passed as a runtime value to or from an Action, it is instead identified by its end objects and qualifier values, if any. A LinkEndData instance provides these values for a single Association end.
    */
  trait UMLLinkEndData
	extends UMLElement
  {}

  /**
    * LinkEndDestructionData is LinkEndData used to provide values for one end of a link to be destroyed by a DestroyLinkAction.
    */
  trait UMLLinkEndDestructionData
	extends UMLLinkEndData
  {}

  /**
    * A LiteralBoolean is a specification of a Boolean value.
    */
  trait UMLLiteralBoolean
	extends UMLLiteralSpecification
  {}

  /**
    * A LiteralInteger is a specification of an Integer value.
    */
  trait UMLLiteralInteger
	extends UMLLiteralSpecification
  {}

  /**
    * A LiteralNull specifies the lack of a value.
    */
  trait UMLLiteralNull
	extends UMLLiteralSpecification
  {}

  /**
    * A LiteralReal is a specification of a Real value.
    */
  trait UMLLiteralReal
	extends UMLLiteralSpecification
  {}

  /**
    * A LiteralSpecification identifies a literal constant being modeled.
    */
  trait UMLLiteralSpecification
	extends UMLValueSpecification
  {}

  /**
    * A LiteralString is a specification of a String value.
    */
  trait UMLLiteralString
	extends UMLLiteralSpecification
  {}

  /**
    * A LiteralUnlimitedNatural is a specification of an UnlimitedNatural number.
    */
  trait UMLLiteralUnlimitedNatural
	extends UMLLiteralSpecification
  {}

  /**
    * A LoopNode is a StructuredActivityNode that represents an iterative loop with setup, test, and body sections.
    */
  trait UMLLoopNode
	extends UMLStructuredActivityNode
  {}

  /**
    * A manifestation is the concrete physical rendering of one or more model elements by an artifact.
    */
  trait UMLManifestation
	extends UMLAbstraction
  {}

  /**
    * A merge node is a control node that brings together multiple alternate flows. It is not used to synchronize concurrent flows but to accept one among several alternate flows.
    */
  trait UMLMergeNode
	extends UMLControlNode
  {}

  /**
    * A Message defines a particular communication between Lifelines of an Interaction.
    */
  trait UMLMessage
	extends UMLNamedElement
  {}

  /**
    * MessageEnd is an abstract specialization of NamedElement that represents what can occur at the end of a Message.
    */
  trait UMLMessageEnd
	extends UMLNamedElement
  {}

  /**
    * A MessageEvent specifies the receipt by an object of either an Operation call or a Signal instance.
    */
  trait UMLMessageEvent
	extends UMLEvent
  {}

  /**
    * A MessageOccurrenceSpecification specifies the occurrence of Message events, such as sending and receiving of Signals or invoking or receiving of Operation calls. A MessageOccurrenceSpecification is a kind of MessageEnd. Messages are generated either by synchronous Operation calls or asynchronous Signal sends. They are received by the execution of corresponding AcceptEventActions.
    */
  trait UMLMessageOccurrenceSpecification
	extends UMLMessageEnd
	with UMLOccurrenceSpecification
  {}

  /**
    * A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail.
    */
  trait UMLModel
	extends UMLPackage
  {}

  /**
    * A multiplicity is a definition of an inclusive interval of non-negative integers beginning with a lower bound and ending with a (possibly infinite) upper bound. A MultiplicityElement embeds this information to specify the allowable cardinalities for an instantiation of the Element.
    */
  trait UMLMultiplicityElement
	extends UMLElement
  {}

  /**
    * A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression.
    */
  trait UMLNamedElement
	extends UMLElement
  {}

  /**
    * A Namespace is an Element in a model that owns and/or imports a set of NamedElements that can be identified by name.
    */
  trait UMLNamespace
	extends UMLNamedElement
  {}

  /**
    * A Node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures.
    */
  trait UMLNode
	extends UMLClass
	with UMLDeploymentTarget
  {}

  /**
    * An ObjectFlow is an ActivityEdge that is traversed by object tokens that may hold values. Object flows also support multicast/receive, token selection from object nodes, and transformation of tokens.
    */
  trait UMLObjectFlow
	extends UMLActivityEdge
  {}

  /**
    * An ObjectNode is an abstract ActivityNode that may hold tokens within the object flow in an Activity. ObjectNodes also support token selection, limitation on the number of tokens held, specification of the state required for tokens being held, and carrying control values.
    */
  trait UMLObjectNode
	extends UMLActivityNode
	with UMLTypedElement
  {}

  /**
    * Observation specifies a value determined by observing an event or events that occur relative to other model Elements.
    */
  trait UMLObservation
	extends UMLPackageableElement
  {}

  /**
    * An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions.
    */
  trait UMLOccurrenceSpecification
	extends UMLInteractionFragment
  {}

  /**
    * An OpaqueAction is an Action whose functionality is not specified within UML.
    */
  trait UMLOpaqueAction
	extends UMLAction
  {}

  /**
    * An OpaqueBehavior is a Behavior whose specification is given in a textual language other than UML.
    */
  trait UMLOpaqueBehavior
	extends UMLBehavior
  {}

  /**
    * An OpaqueExpression is a ValueSpecification that specifies the computation of a collection of values either in terms of a UML Behavior or based on a textual statement in a language other than UML
    */
  trait UMLOpaqueExpression
	extends UMLValueSpecification
  {}

  /**
    * An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
    */
  trait UMLOperation
	extends UMLBehavioralFeature
	with UMLParameterableElement
	with UMLTemplateableElement
  {}

  /**
    * An OperationTemplateParameter exposes an Operation as a formal parameter for a template.
    */
  trait UMLOperationTemplateParameter
	extends UMLTemplateParameter
  {}

  /**
    * An OutputPin is a Pin that holds output values produced by an Action.
    */
  trait UMLOutputPin
	extends UMLPin
  {}

  /**
    * A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.A package is used to group elements, and provides a namespace for the grouped elements.
    */
  trait UMLPackage
	extends UMLNamespace
	with UMLPackageableElement
	with UMLTemplateableElement
  {}

  /**
    * A PackageImport is a Relationship that imports all the non-private members of a Package into the Namespace owning the PackageImport, so that those Elements may be referred to by their unqualified names in the importingNamespace.
    */
  trait UMLPackageImport
	extends UMLDirectedRelationship
  {}

  /**
    * A package merge defines how the contents of one package are extended by the contents of another package.
    */
  trait UMLPackageMerge
	extends UMLDirectedRelationship
  {}

  /**
    * A PackageableElement is a NamedElement that may be owned directly by a Package. A PackageableElement is also able to serve as the parameteredElement of a TemplateParameter.
    */
  trait UMLPackageableElement
	extends UMLNamedElement
	with UMLParameterableElement
  {}

  /**
    * A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations.
    */
  trait UMLParameter
	extends UMLConnectableElement
	with UMLMultiplicityElement
  {}

  /**
    * A ParameterSet designates alternative sets of inputs or outputs that a Behavior may use.
    */
  trait UMLParameterSet
	extends UMLNamedElement
  {}

  /**
    * A ParameterableElement is an Element that can be exposed as a formal TemplateParameter for a template, or specified as an actual parameter in a binding of a template.
    */
  trait UMLParameterableElement
	extends UMLElement
  {}

  /**
    * A PartDecomposition is a description of the internal Interactions of one Lifeline relative to an Interaction.
    */
  trait UMLPartDecomposition
	extends UMLInteractionUse
  {}

  /**
    * A Pin is an ObjectNode and MultiplicityElement that provides input values to an Action or accepts output values from an Action.
    */
  trait UMLPin
	extends UMLMultiplicityElement
	with UMLObjectNode
  {}

  /**
    * A Port is a property of an EncapsulatedClassifier that specifies a distinct interaction point between that EncapsulatedClassifier and its environment or between the (behavior of the) EncapsulatedClassifier and its internal parts. Ports are connected to Properties of the EncapsulatedClassifier by Connectors through which requests can be made to invoke BehavioralFeatures. A Port may specify the services an EncapsulatedClassifier provides (offers) to its environment as well as the services that an EncapsulatedClassifier expects (requires) of its environment.  A Port may have an associated ProtocolStateMachine.
    */
  trait UMLPort
	extends UMLProperty
  {}

  /**
    * A PrimitiveType defines a predefined DataType, without any substructure. A PrimitiveType may have an algebra and operations defined outside of UML, for example, mathematically.
    */
  trait UMLPrimitiveType
	extends UMLDataType
  {}

  /**
    * A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain.
    */
  trait UMLProfile
	extends UMLPackage
  {}

  /**
    * A profile application is used to show which profiles have been applied to a package.
    */
  trait UMLProfileApplication
	extends UMLDirectedRelationship
  {}

  /**
    * A Property is a StructuralFeature. A Property related by ownedAttribute to a Classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the Classifier to a value or set of values of the type of the attribute. A Property related by memberEnd to an Association represents an end of the Association. The type of the Property is the type of the end of the Association. A Property has the capability of being a DeploymentTarget in a Deployment relationship. This enables modeling the deployment to hierarchical nodes that have Properties functioning as internal parts.  Property specializes ParameterableElement to specify that a Property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
    */
  trait UMLProperty
	extends UMLConnectableElement
	with UMLDeploymentTarget
	with UMLStructuralFeature
  {}

  /**
    * A ProtocolStateMachine can be redefined into a more specific ProtocolStateMachine or into behavioral StateMachine. ProtocolConformance declares that the specific ProtocolStateMachine specifies a protocol that conforms to the general ProtocolStateMachine or that the specific behavioral StateMachine abides by the protocol of the general ProtocolStateMachine.
    */
  trait UMLProtocolConformance
	extends UMLDirectedRelationship
  {}

  /**
    * A ProtocolStateMachine is always defined in the context of a Classifier. It specifies which BehavioralFeatures of the Classifier can be called in which State and under which conditions, thus specifying the allowed invocation sequences on the Classifier's BehavioralFeatures. A ProtocolStateMachine specifies the possible and permitted Transitions on the instances of its context Classifier, together with the BehavioralFeatures that carry the Transitions. In this manner, an instance lifecycle can be specified for a Classifier, by defining the order in which the BehavioralFeatures can be activated and the States through which an instance progresses during its existence.
    */
  trait UMLProtocolStateMachine
	extends UMLStateMachine
  {}

  /**
    * A ProtocolTransition specifies a legal Transition for an Operation. Transitions of ProtocolStateMachines have the following information: a pre-condition (guard), a Trigger, and a post-condition. Every ProtocolTransition is associated with at most one BehavioralFeature belonging to the context Classifier of the ProtocolStateMachine.
    */
  trait UMLProtocolTransition
	extends UMLTransition
  {}

  /**
    * A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step.
    */
  trait UMLPseudostate
	extends UMLVertex
  {}

  /**
    * A QualifierValue is an Element that is used as part of LinkEndData to provide the value for a single qualifier of the end given by the LinkEndData.
    */
  trait UMLQualifierValue
	extends UMLElement
  {}

  /**
    * A RaiseExceptionAction is an Action that causes an exception to occur. The input value becomes the exception object.
    */
  trait UMLRaiseExceptionAction
	extends UMLAction
  {}

  /**
    * A ReadExtentAction is an Action that retrieves the current instances of a Classifier.
    */
  trait UMLReadExtentAction
	extends UMLAction
  {}

  /**
    * A ReadIsClassifiedObjectAction is an Action that determines whether an object is classified by a given Classifier.
    */
  trait UMLReadIsClassifiedObjectAction
	extends UMLAction
  {}

  /**
    * A ReadLinkAction is a LinkAction that navigates across an Association to retrieve the objects on one end.
    */
  trait UMLReadLinkAction
	extends UMLLinkAction
  {}

  /**
    * A ReadLinkObjectEndAction is an Action that retrieves an end object from a link object.
    */
  trait UMLReadLinkObjectEndAction
	extends UMLAction
  {}

  /**
    * A ReadLinkObjectEndQualifierAction is an Action that retrieves a qualifier end value from a link object.
    */
  trait UMLReadLinkObjectEndQualifierAction
	extends UMLAction
  {}

  /**
    * A ReadSelfAction is an Action that retrieves the context object of the Behavior execution within which the ReadSelfAction execution is taking place.
    */
  trait UMLReadSelfAction
	extends UMLAction
  {}

  /**
    * A ReadStructuralFeatureAction is a StructuralFeatureAction that retrieves the values of a StructuralFeature.
    */
  trait UMLReadStructuralFeatureAction
	extends UMLStructuralFeatureAction
  {}

  /**
    * A ReadVariableAction is a VariableAction that retrieves the values of a Variable.
    */
  trait UMLReadVariableAction
	extends UMLVariableAction
  {}

  /**
    * Realization is a specialized Abstraction relationship between two sets of model Elements, one representing a specification (the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model stepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.
    */
  trait UMLRealization
	extends UMLAbstraction
  {}

  /**
    * A Reception is a declaration stating that a Classifier is prepared to react to the receipt of a Signal.
    */
  trait UMLReception
	extends UMLBehavioralFeature
  {}

  /**
    * A ReclassifyObjectAction is an Action that changes the Classifiers that classify an object.
    */
  trait UMLReclassifyObjectAction
	extends UMLAction
  {}

  /**
    * A RedefinableElement is an element that, when defined in the context of a Classifier, can be redefined more specifically or differently in the context of another Classifier that specializes (directly or indirectly) the context Classifier.
    */
  trait UMLRedefinableElement
	extends UMLNamedElement
  {}

  /**
    * A RedefinableTemplateSignature supports the addition of formal template parameters in a specialization of a template classifier.
    */
  trait UMLRedefinableTemplateSignature
	extends UMLRedefinableElement
	with UMLTemplateSignature
  {}

  /**
    * A ReduceAction is an Action that reduces a collection to a single value by repeatedly combining the elements of the collection using a reducer Behavior.
    */
  trait UMLReduceAction
	extends UMLAction
  {}

  /**
    * A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel.
    */
  trait UMLRegion
	extends UMLNamespace
	with UMLRedefinableElement
  {}

  /**
    * Relationship is an abstract concept that specifies some kind of relationship between Elements.
    */
  trait UMLRelationship
	extends UMLElement
  {}

  /**
    * A RemoveStructuralFeatureValueAction is a WriteStructuralFeatureAction that removes values from a StructuralFeature.
    */
  trait UMLRemoveStructuralFeatureValueAction
	extends UMLWriteStructuralFeatureAction
  {}

  /**
    * A RemoveVariableValueAction is a WriteVariableAction that removes values from a Variables.
    */
  trait UMLRemoveVariableValueAction
	extends UMLWriteVariableAction
  {}

  /**
    * A ReplyAction is an Action that accepts a set of reply values and a value containing return information produced by a previous AcceptCallAction. The ReplyAction returns the values to the caller of the previous call, completing execution of the call.
    */
  trait UMLReplyAction
	extends UMLAction
  {}

  /**
    * A SendObjectAction is an InvocationAction that transmits an input object to the target object, which is handled as a request message by the target object. The requestor continues execution immediately after the object is sent out and cannot receive reply values.
    */
  trait UMLSendObjectAction
	extends UMLInvocationAction
  {}

  /**
    * A SendSignalAction is an InvocationAction that creates a Signal instance and transmits it to the target object. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instance is sent out and cannot receive reply values.
    */
  trait UMLSendSignalAction
	extends UMLInvocationAction
  {}

  /**
    * A SequenceNode is a StructuredActivityNode that executes a sequence of ExecutableNodes in order.
    */
  trait UMLSequenceNode
	extends UMLStructuredActivityNode
  {}

  /**
    * A Signal is a specification of a kind of communication between objects in which a reaction is asynchronously triggered in the receiver without a reply.
    */
  trait UMLSignal
	extends UMLClassifier
  {}

  /**
    * A SignalEvent represents the receipt of an asynchronous Signal instance.
    */
  trait UMLSignalEvent
	extends UMLMessageEvent
  {}

  /**
    * A Slot designates that an entity modeled by an InstanceSpecification has a value or values for a specific StructuralFeature.
    */
  trait UMLSlot
	extends UMLElement
  {}

  /**
    * A StartClassifierBehaviorAction is an Action that starts the classifierBehavior of the input object.
    */
  trait UMLStartClassifierBehaviorAction
	extends UMLAction
  {}

  /**
    * A StartObjectBehaviorAction is an InvocationAction that starts the execution either of a directly instantiated Behavior or of the classifierBehavior of an object. Argument values may be supplied for the input Parameters of the Behavior. If the Behavior is invoked synchronously, then output values may be obtained for output Parameters.
    */
  trait UMLStartObjectBehaviorAction
	extends UMLCallAction
  {}

  /**
    * A State models a situation during which some (usually implicit) invariant condition holds.
    */
  trait UMLState
	extends UMLNamespace
	with UMLRedefinableElement
	with UMLVertex
  {}

  /**
    * A StateInvariant is a runtime constraint on the participants of the Interaction. It may be used to specify a variety of different kinds of Constraints, such as values of Attributes or Variables, internal or external States, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline.
    */
  trait UMLStateInvariant
	extends UMLInteractionFragment
  {}

  /**
    * StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine.
    */
  trait UMLStateMachine
	extends UMLBehavior
  {}

  /**
    * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
    */
  trait UMLStereotype
	extends UMLClass
  {}

  /**
    * A StringExpression is an Expression that specifies a String value that is derived by concatenating a sequence of operands with String values or a sequence of subExpressions, some of which might be template parameters.
    */
  trait UMLStringExpression
	extends UMLExpression
	with UMLTemplateableElement
  {}

  /**
    * A StructuralFeature is a typed feature of a Classifier that specifies the structure of instances of the Classifier.
    */
  trait UMLStructuralFeature
	extends UMLFeature
	with UMLMultiplicityElement
	with UMLTypedElement
  {}

  /**
    * StructuralFeatureAction is an abstract class for all Actions that operate on StructuralFeatures.
    */
  trait UMLStructuralFeatureAction
	extends UMLAction
  {}

  /**
    * A StructuredActivityNode is an Action that is also an ActivityGroup and whose behavior is specified by the ActivityNodes and ActivityEdges it so contains. Unlike other kinds of ActivityGroup, a StructuredActivityNode owns the ActivityNodes and ActivityEdges it contains, and so a node or edge can only be directly contained in one StructuredActivityNode, though StructuredActivityNodes may be nested.
    */
  trait UMLStructuredActivityNode
	extends UMLAction
	with UMLActivityGroup
	with UMLNamespace
  {}

  /**
    * StructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier.
    */
  trait UMLStructuredClassifier
	extends UMLClassifier
  {}

  /**
    * A substitution is a relationship between two classifiers signifying that the substituting classifier complies with the contract specified by the contract classifier. This implies that instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.
    */
  trait UMLSubstitution
	extends UMLRealization
  {}

  /**
    * A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template.
    */
  trait UMLTemplateBinding
	extends UMLDirectedRelationship
  {}

  /**
    * A TemplateParameter exposes a ParameterableElement as a formal parameter of a template.
    */
  trait UMLTemplateParameter
	extends UMLElement
  {}

  /**
    * A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding.
    */
  trait UMLTemplateParameterSubstitution
	extends UMLElement
  {}

  /**
    * A Template Signature bundles the set of formal TemplateParameters for a template.
    */
  trait UMLTemplateSignature
	extends UMLElement
  {}

  /**
    * A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates.
    */
  trait UMLTemplateableElement
	extends UMLElement
  {}

  /**
    * A TestIdentityAction is an Action that tests if two values are identical objects.
    */
  trait UMLTestIdentityAction
	extends UMLAction
  {}

  /**
    * A TimeConstraint is a Constraint that refers to a TimeInterval.
    */
  trait UMLTimeConstraint
	extends UMLIntervalConstraint
  {}

  /**
    * A TimeEvent is an Event that occurs at a specific point in time.
    */
  trait UMLTimeEvent
	extends UMLEvent
  {}

  /**
    * A TimeExpression is a ValueSpecification that represents a time value.
    */
  trait UMLTimeExpression
	extends UMLValueSpecification
  {}

  /**
    * A TimeInterval defines the range between two TimeExpressions.
    */
  trait UMLTimeInterval
	extends UMLInterval
  {}

  /**
    * A TimeObservation is a reference to a time instant during an execution. It points out the NamedElement in the model to observe and whether the observation is when this NamedElement is entered or when it is exited.
    */
  trait UMLTimeObservation
	extends UMLObservation
  {}

  /**
    * A Transition represents an arc between exactly one source Vertex and exactly one Target vertex (the source and targets may be the same Vertex). It may form part of a compound transition, which takes the StateMachine from one steady State configuration to another, representing the full response of the StateMachine to an occurrence of an Event that triggered it.
    */
  trait UMLTransition
	extends UMLNamespace
	with UMLRedefinableElement
  {}

  /**
    * A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred.
    */
  trait UMLTrigger
	extends UMLNamedElement
  {}

  /**
    * A Type constrains the values represented by a TypedElement.
    */
  trait UMLType
	extends UMLPackageableElement
  {}

  /**
    * A TypedElement is a NamedElement that may have a Type specified for it.
    */
  trait UMLTypedElement
	extends UMLNamedElement
  {}

  /**
    * An UnmarshallAction is an Action that retrieves the values of the StructuralFeatures of an object and places them on OutputPins. 
    */
  trait UMLUnmarshallAction
	extends UMLAction
  {}

  /**
    * A Usage is a Dependency in which the client Element requires the supplier Element (or set of Elements) for its full implementation or operation.
    */
  trait UMLUsage
	extends UMLDependency
  {}

  /**
    * A UseCase specifies a set of actions performed by its subjects, which yields an observable result that is of value for one or more Actors or other stakeholders of each subject.
    */
  trait UMLUseCase
	extends UMLBehavioredClassifier
  {}

  /**
    * A ValuePin is an InputPin that provides a value by evaluating a ValueSpecification.
    */
  trait UMLValuePin
	extends UMLInputPin
  {}

  /**
    * A ValueSpecification is the specification of a (possibly empty) set of values. A ValueSpecification is a ParameterableElement that may be exposed as a formal TemplateParameter and provided as the actual parameter in the binding of a template.
    */
  trait UMLValueSpecification
	extends UMLPackageableElement
	with UMLTypedElement
  {}

  /**
    * A ValueSpecificationAction is an Action that evaluates a ValueSpecification and provides a result.
    */
  trait UMLValueSpecificationAction
	extends UMLAction
  {}

  /**
    * A Variable is a ConnectableElement that may store values during the execution of an Activity. Reading and writing the values of a Variable provides an alternative means for passing data than the use of ObjectFlows. A Variable may be owned directly by an Activity, in which case it is accessible from anywhere within that activity, or it may be owned by a StructuredActivityNode, in which case it is only accessible within that node.
    */
  trait UMLVariable
	extends UMLConnectableElement
	with UMLMultiplicityElement
  {}

  /**
    * VariableAction is an abstract class for Actions that operate on a specified Variable.
    */
  trait UMLVariableAction
	extends UMLAction
  {}

  /**
    * A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions.
    */
  trait UMLVertex
	extends UMLNamedElement
  {}

  /**
    * WriteLinkAction is an abstract class for LinkActions that create and destroy links.
    */
  trait UMLWriteLinkAction
	extends UMLLinkAction
  {}

  /**
    * WriteStructuralFeatureAction is an abstract class for StructuralFeatureActions that change StructuralFeature values.
    */
  trait UMLWriteStructuralFeatureAction
	extends UMLStructuralFeatureAction
  {}

  /**
    * WriteVariableAction is an abstract class for VariableActions that change Variable values.
    */
  trait UMLWriteVariableAction
	extends UMLVariableAction
  {}

  /**
    * In OMG MOF 2.5, a MOF Element is an instance of exactly 1 MOF metaclass.
    * This means that for serializing a MOF Element, it is sufficient to have support for concrete MOF metaclasses.
    * OTIElement is intended to be the single parent of case classes, 1 case class per distinct concrete MOF metaclass.
    * OTIElement provides the common data attributes necessary for uniquely identifying a MOF Element that is an
    * instance of a single MOF metaclass in an OMG CMOF metamodel (e.g., OMG UML 2.5).
    * The information about the MOF metaclass is represented as a JSon `type` field 
    */
  sealed trait OTIElement {
    val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID
  }

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Abstraction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAbstraction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isUnmarshall Defined in AcceptEventAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class AcceptCallAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isUnmarshall: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAcceptCallAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isUnmarshall Defined in AcceptEventAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class AcceptEventAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isUnmarshall: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAcceptEventAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ActionExecutionSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActionExecutionSpecification
  {}

  /** 
    * @param isControl Defined in Pin
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class ActionInputPin
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControl: Boolean,
    isControlType: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isUnique: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActionInputPin
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReadOnly Defined in Activity
    * @param isReentrant Defined in Behavior
    * @param isSingleExecution Defined in Activity
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Activity
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReadOnly: Boolean,
    isReentrant: Boolean,
    isSingleExecution: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActivity
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ActivityFinalNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActivityFinalNode
  {}

  /** 
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class ActivityParameterNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControlType: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActivityParameterNode
  {}

  /** 
    * @param isDimension Defined in ActivityPartition
    * @param isExternal Defined in ActivityPartition
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ActivityPartition
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isDimension: Boolean,
    isExternal: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActivityPartition
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Actor
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLActor
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isReplaceAll Defined in AddStructuralFeatureValueAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class AddStructuralFeatureValueAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isReplaceAll: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAddStructuralFeatureValueAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isReplaceAll Defined in AddVariableValueAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class AddVariableValueAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isReplaceAll: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAddVariableValueAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class AnyReceiveEvent
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAnyReceiveEvent
  {}

  /** 
    * @param fileName Defined in Artifact
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Artifact
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    fileName: Option[String],
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLArtifact
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isDerived Defined in Association
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Association
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isDerived: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAssociation
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isDerived Defined in Association
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class AssociationClass
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isDerived: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLAssociationClass
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class BehaviorExecutionSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLBehaviorExecutionSpecification
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class BroadcastSignalAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLBroadcastSignalAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isSynchronous Defined in CallAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CallBehaviorAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isSynchronous: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCallBehaviorAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class CallEvent
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCallEvent
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isSynchronous Defined in CallAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CallOperationAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isSynchronous: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCallOperationAction
  {}

  /** 
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class CentralBufferNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControlType: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCentralBufferNode
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class ChangeEvent
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLChangeEvent
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Class
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLClass
  {}

  /** 
    * @param allowSubstitutable Defined in ClassifierTemplateParameter
    */
  case class ClassifierTemplateParameter
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    allowSubstitutable: Boolean)
  extends OTIElement
  with UMLClassifierTemplateParameter
  {}

  /** 
    */
  case class Clause
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLClause
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ClearAssociationAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLClearAssociationAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ClearStructuralFeatureAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLClearStructuralFeatureAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ClearVariableAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLClearVariableAction
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Collaboration
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCollaboration
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CollaborationUse
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCollaborationUse
  {}

  /** 
    * @param interactionOperator Defined in CombinedFragment
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CombinedFragment
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    interactionOperator: Option[UMLInteractionOperatorKind],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCombinedFragment
  {}

  /** 
    * @param body Defined in Comment
    */
  case class Comment
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    body: Option[String])
  extends OTIElement
  with UMLComment
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isDerived Defined in Association
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class CommunicationPath
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isDerived: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCommunicationPath
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isIndirectlyInstantiated Defined in Component
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Component
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isIndirectlyInstantiated: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLComponent
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class ComponentRealization
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLComponentRealization
  {}

  /** 
    * @param isAssured Defined in ConditionalNode
    * @param isDeterminate Defined in ConditionalNode
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param mustIsolate Defined in StructuredActivityNode
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ConditionalNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAssured: Boolean,
    isDeterminate: Boolean,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    mustIsolate: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLConditionalNode
  {}

  /** 
    */
  case class ConnectableElementTemplateParameter
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLConnectableElementTemplateParameter
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ConnectionPointReference
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLConnectionPointReference
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isStatic Defined in Feature
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Connector
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isStatic: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLConnector
  {}

  /** 
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    */
  case class ConnectorEnd
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isOrdered: Boolean,
    isUnique: Boolean)
  extends OTIElement
  with UMLConnectorEnd
  {}

  /** 
    * @param interactionOperator Defined in CombinedFragment
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ConsiderIgnoreFragment
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    interactionOperator: Option[UMLInteractionOperatorKind],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLConsiderIgnoreFragment
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Constraint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLConstraint
  {}

  /** 
    * @param name Defined in NamedElement
    * @param setting Defined in Continuation
    * @param visibility Defined in NamedElement
    */
  case class Continuation
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    setting: Boolean,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLContinuation
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ControlFlow
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLControlFlow
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CreateLinkAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCreateLinkAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CreateLinkObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCreateLinkObjectAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class CreateObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLCreateObjectAction
  {}

  /** 
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class DataStoreNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControlType: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDataStoreNode
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class DataType
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDataType
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class DecisionNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDecisionNode
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Dependency
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDependency
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Deployment
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDeployment
  {}

  /** 
    * @param deploymentLocation Defined in DeploymentSpecification
    * @param executionLocation Defined in DeploymentSpecification
    * @param fileName Defined in Artifact
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class DeploymentSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    deploymentLocation: Option[String],
    executionLocation: Option[String],
    fileName: Option[String],
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDeploymentSpecification
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class DestroyLinkAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDestroyLinkAction
  {}

  /** 
    * @param isDestroyLinks Defined in DestroyObjectAction
    * @param isDestroyOwnedObjects Defined in DestroyObjectAction
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class DestroyObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isDestroyLinks: Boolean,
    isDestroyOwnedObjects: Boolean,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDestroyObjectAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class DestructionOccurrenceSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDestructionOccurrenceSpecification
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Device
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDevice
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Duration
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDuration
  {}

  /** 
    * @param firstEvent Defined in DurationConstraint
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class DurationConstraint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    firstEvent: Set[Boolean],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDurationConstraint
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class DurationInterval
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDurationInterval
  {}

  /** 
    * @param firstEvent Defined in DurationObservation
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class DurationObservation
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    firstEvent: Seq[Boolean],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLDurationObservation
  {}

  /** 
    * @param alias Defined in ElementImport
    * @param visibility Defined in ElementImport
    */
  case class ElementImport
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    alias: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLElementImport
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Enumeration
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLEnumeration
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class EnumerationLiteral
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLEnumerationLiteral
  {}

  /** 
    */
  case class ExceptionHandler
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLExceptionHandler
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class ExecutionEnvironment
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExecutionEnvironment
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ExecutionOccurrenceSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExecutionOccurrenceSpecification
  {}

  /** 
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class ExpansionNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControlType: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExpansionNode
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param mode Defined in ExpansionRegion
    * @param mustIsolate Defined in StructuredActivityNode
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ExpansionRegion
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    mode: Option[UMLExpansionKind],
    mustIsolate: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExpansionRegion
  {}

  /** 
    * @param name Defined in NamedElement
    * @param symbol Defined in Expression
    * @param visibility Defined in PackageableElement
    */
  case class Expression
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    symbol: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExpression
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Extend
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExtend
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isDerived Defined in Association
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Extension
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isDerived: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExtension
  {}

  /** 
    * @param aggregation Defined in Property
    * @param isDerived Defined in Property
    * @param isDerivedUnion Defined in Property
    * @param isID Defined in Property
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isReadOnly Defined in StructuralFeature
    * @param isStatic Defined in Feature
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ExtensionEnd
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    aggregation: Option[UMLAggregationKind],
    isDerived: Boolean,
    isDerivedUnion: Boolean,
    isID: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isReadOnly: Boolean,
    isStatic: Boolean,
    isUnique: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExtensionEnd
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ExtensionPoint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLExtensionPoint
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class FinalState
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLFinalState
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class FlowFinalNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLFlowFinalNode
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ForkNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLForkNode
  {}

  /** 
    * @param body Defined in OpaqueBehavior
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReentrant Defined in Behavior
    * @param language Defined in OpaqueBehavior
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class FunctionBehavior
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    body: Seq[String],
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReentrant: Boolean,
    language: Seq[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLFunctionBehavior
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Gate
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLGate
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class GeneralOrdering
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLGeneralOrdering
  {}

  /** 
    * @param isSubstitutable Defined in Generalization
    */
  case class Generalization
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isSubstitutable: Option[Boolean])
  extends OTIElement
  with UMLGeneralization
  {}

  /** 
    * @param isCovering Defined in GeneralizationSet
    * @param isDisjoint Defined in GeneralizationSet
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class GeneralizationSet
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isCovering: Boolean,
    isDisjoint: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLGeneralizationSet
  {}

  /** 
    * @param content Defined in Image
    * @param format Defined in Image
    * @param location Defined in Image
    */
  case class Image
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    content: Option[String],
    format: Option[String],
    location: Option[String])
  extends OTIElement
  with UMLImage
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Include
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInclude
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InformationFlow
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInformationFlow
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InformationItem
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInformationItem
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class InitialNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInitialNode
  {}

  /** 
    * @param isControl Defined in Pin
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class InputPin
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControl: Boolean,
    isControlType: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isUnique: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInputPin
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InstanceSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInstanceSpecification
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InstanceValue
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInstanceValue
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReentrant Defined in Behavior
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Interaction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInteraction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InteractionConstraint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInteractionConstraint
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class InteractionOperand
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInteractionOperand
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class InteractionUse
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInteractionUse
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Interface
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInterface
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class InterfaceRealization
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInterfaceRealization
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class InterruptibleActivityRegion
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInterruptibleActivityRegion
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Interval
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLInterval
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class IntervalConstraint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLIntervalConstraint
  {}

  /** 
    * @param isCombineDuplicate Defined in JoinNode
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class JoinNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isCombineDuplicate: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLJoinNode
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Lifeline
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLifeline
  {}

  /** 
    * @param isReplaceAll Defined in LinkEndCreationData
    */
  case class LinkEndCreationData
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isReplaceAll: Boolean)
  extends OTIElement
  with UMLLinkEndCreationData
  {}

  /** 
    */
  case class LinkEndData
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLLinkEndData
  {}

  /** 
    * @param isDestroyDuplicates Defined in LinkEndDestructionData
    */
  case class LinkEndDestructionData
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isDestroyDuplicates: Boolean)
  extends OTIElement
  with UMLLinkEndDestructionData
  {}

  /** 
    * @param name Defined in NamedElement
    * @param value Defined in LiteralBoolean
    * @param visibility Defined in PackageableElement
    */
  case class LiteralBoolean
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    value: Boolean,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralBoolean
  {}

  /** 
    * @param name Defined in NamedElement
    * @param value Defined in LiteralInteger
    * @param visibility Defined in PackageableElement
    */
  case class LiteralInteger
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    value: Int,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralInteger
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class LiteralNull
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralNull
  {}

  /** 
    * @param name Defined in NamedElement
    * @param value Defined in LiteralReal
    * @param visibility Defined in PackageableElement
    */
  case class LiteralReal
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    value: Double,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralReal
  {}

  /** 
    * @param name Defined in NamedElement
    * @param value Defined in LiteralString
    * @param visibility Defined in PackageableElement
    */
  case class LiteralString
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    value: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralString
  {}

  /** 
    * @param name Defined in NamedElement
    * @param value Defined in LiteralUnlimitedNatural
    * @param visibility Defined in PackageableElement
    */
  case class LiteralUnlimitedNatural
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    value: Int,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLiteralUnlimitedNatural
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isTestedFirst Defined in LoopNode
    * @param mustIsolate Defined in StructuredActivityNode
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class LoopNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isTestedFirst: Boolean,
    mustIsolate: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLLoopNode
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Manifestation
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLManifestation
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class MergeNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLMergeNode
  {}

  /** 
    * @param messageSort Defined in Message
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Message
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    messageSort: Option[UMLMessageSort],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLMessage
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class MessageOccurrenceSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLMessageOccurrenceSpecification
  {}

  /** 
    * @param URI Defined in Package
    * @param name Defined in NamedElement
    * @param viewpoint Defined in Model
    * @param visibility Defined in PackageableElement
    */
  case class Model
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    URI: Option[String],
    name: Option[String],
    viewpoint: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLModel
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Node
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLNode
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isMulticast Defined in ObjectFlow
    * @param isMultireceive Defined in ObjectFlow
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ObjectFlow
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isMulticast: Boolean,
    isMultireceive: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLObjectFlow
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class OccurrenceSpecification
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOccurrenceSpecification
  {}

  /** 
    * @param body Defined in OpaqueAction
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param language Defined in OpaqueAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class OpaqueAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    body: Seq[String],
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    language: Seq[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOpaqueAction
  {}

  /** 
    * @param body Defined in OpaqueBehavior
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReentrant Defined in Behavior
    * @param language Defined in OpaqueBehavior
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class OpaqueBehavior
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    body: Seq[String],
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReentrant: Boolean,
    language: Seq[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOpaqueBehavior
  {}

  /** 
    * @param body Defined in OpaqueExpression
    * @param language Defined in OpaqueExpression
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class OpaqueExpression
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    body: Seq[String],
    language: Seq[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOpaqueExpression
  {}

  /** 
    * @param concurrency Defined in BehavioralFeature
    * @param isAbstract Defined in BehavioralFeature
    * @param isLeaf Defined in RedefinableElement
    * @param isQuery Defined in Operation
    * @param isStatic Defined in Feature
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Operation
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    concurrency: Option[UMLCallConcurrencyKind],
    isAbstract: Boolean,
    isLeaf: Boolean,
    isQuery: Boolean,
    isStatic: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOperation
  {}

  /** 
    */
  case class OperationTemplateParameter
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLOperationTemplateParameter
  {}

  /** 
    * @param isControl Defined in Pin
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class OutputPin
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControl: Boolean,
    isControlType: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isUnique: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLOutputPin
  {}

  /** 
    * @param URI Defined in Package
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Package
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    URI: Option[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPackage
  {}

  /** 
    * @param visibility Defined in PackageImport
    */
  case class PackageImport
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPackageImport
  {}

  /** 
    */
  case class PackageMerge
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLPackageMerge
  {}

  /** 
    * @param direction Defined in Parameter
    * @param effect Defined in Parameter
    * @param isException Defined in Parameter
    * @param isOrdered Defined in MultiplicityElement
    * @param isStream Defined in Parameter
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Parameter
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    direction: Option[UMLParameterDirectionKind],
    effect: Option[UMLParameterEffectKind],
    isException: Boolean,
    isOrdered: Boolean,
    isStream: Boolean,
    isUnique: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLParameter
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ParameterSet
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLParameterSet
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class PartDecomposition
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPartDecomposition
  {}

  /** 
    * @param aggregation Defined in Property
    * @param isBehavior Defined in Port
    * @param isConjugated Defined in Port
    * @param isDerived Defined in Property
    * @param isDerivedUnion Defined in Property
    * @param isID Defined in Property
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isReadOnly Defined in StructuralFeature
    * @param isService Defined in Port
    * @param isStatic Defined in Feature
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Port
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    aggregation: Option[UMLAggregationKind],
    isBehavior: Boolean,
    isConjugated: Boolean,
    isDerived: Boolean,
    isDerivedUnion: Boolean,
    isID: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isReadOnly: Boolean,
    isService: Boolean,
    isStatic: Boolean,
    isUnique: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPort
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class PrimitiveType
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPrimitiveType
  {}

  /** 
    * @param URI Defined in Package
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Profile
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    URI: Option[String],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLProfile
  {}

  /** 
    * @param isStrict Defined in ProfileApplication
    */
  case class ProfileApplication
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isStrict: Boolean)
  extends OTIElement
  with UMLProfileApplication
  {}

  /** 
    * @param aggregation Defined in Property
    * @param isDerived Defined in Property
    * @param isDerivedUnion Defined in Property
    * @param isID Defined in Property
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isReadOnly Defined in StructuralFeature
    * @param isStatic Defined in Feature
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Property
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    aggregation: Option[UMLAggregationKind],
    isDerived: Boolean,
    isDerivedUnion: Boolean,
    isID: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isReadOnly: Boolean,
    isStatic: Boolean,
    isUnique: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLProperty
  {}

  /** 
    */
  case class ProtocolConformance
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLProtocolConformance
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReentrant Defined in Behavior
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class ProtocolStateMachine
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLProtocolStateMachine
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param kind Defined in Transition
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ProtocolTransition
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    kind: Option[UMLTransitionKind],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLProtocolTransition
  {}

  /** 
    * @param kind Defined in Pseudostate
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Pseudostate
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    kind: Option[UMLPseudostateKind],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLPseudostate
  {}

  /** 
    */
  case class QualifierValue
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLQualifierValue
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class RaiseExceptionAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRaiseExceptionAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadExtentAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadExtentAction
  {}

  /** 
    * @param isDirect Defined in ReadIsClassifiedObjectAction
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadIsClassifiedObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isDirect: Boolean,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadIsClassifiedObjectAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadLinkAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadLinkAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadLinkObjectEndAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadLinkObjectEndAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadLinkObjectEndQualifierAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadLinkObjectEndQualifierAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadSelfAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadSelfAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadStructuralFeatureAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadStructuralFeatureAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReadVariableAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReadVariableAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Realization
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRealization
  {}

  /** 
    * @param concurrency Defined in BehavioralFeature
    * @param isAbstract Defined in BehavioralFeature
    * @param isLeaf Defined in RedefinableElement
    * @param isStatic Defined in Feature
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Reception
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    concurrency: Option[UMLCallConcurrencyKind],
    isAbstract: Boolean,
    isLeaf: Boolean,
    isStatic: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReception
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isReplaceAll Defined in ReclassifyObjectAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReclassifyObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isReplaceAll: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReclassifyObjectAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class RedefinableTemplateSignature
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRedefinableTemplateSignature
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isOrdered Defined in ReduceAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReduceAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isOrdered: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReduceAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Region
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRegion
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isRemoveDuplicates Defined in RemoveStructuralFeatureValueAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class RemoveStructuralFeatureValueAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isRemoveDuplicates: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRemoveStructuralFeatureValueAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isRemoveDuplicates Defined in RemoveVariableValueAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class RemoveVariableValueAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isRemoveDuplicates: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLRemoveVariableValueAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ReplyAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLReplyAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class SendObjectAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSendObjectAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class SendSignalAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSendSignalAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param mustIsolate Defined in StructuredActivityNode
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class SequenceNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    mustIsolate: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSequenceNode
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Signal
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSignal
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class SignalEvent
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSignalEvent
  {}

  /** 
    */
  case class Slot
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLSlot
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class StartClassifierBehaviorAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStartClassifierBehaviorAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param isSynchronous Defined in CallAction
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class StartObjectBehaviorAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    isSynchronous: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStartObjectBehaviorAction
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class State
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLState
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class StateInvariant
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStateInvariant
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param isReentrant Defined in Behavior
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class StateMachine
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    isReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStateMachine
  {}

  /** 
    * @param isAbstract Defined in Class
    * @param isActive Defined in Class
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Stereotype
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isActive: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStereotype
  {}

  /** 
    * @param name Defined in NamedElement
    * @param symbol Defined in Expression
    * @param visibility Defined in PackageableElement
    */
  case class StringExpression
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    symbol: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStringExpression
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param mustIsolate Defined in StructuredActivityNode
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class StructuredActivityNode
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    mustIsolate: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLStructuredActivityNode
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Substitution
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLSubstitution
  {}

  /** 
    */
  case class TemplateBinding
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLTemplateBinding
  {}

  /** 
    */
  case class TemplateParameter
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLTemplateParameter
  {}

  /** 
    */
  case class TemplateParameterSubstitution
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLTemplateParameterSubstitution
  {}

  /** 
    */
  case class TemplateSignature
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID)
  extends OTIElement
  with UMLTemplateSignature
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class TestIdentityAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTestIdentityAction
  {}

  /** 
    * @param firstEvent Defined in TimeConstraint
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class TimeConstraint
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    firstEvent: Option[Boolean],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTimeConstraint
  {}

  /** 
    * @param isRelative Defined in TimeEvent
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class TimeEvent
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isRelative: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTimeEvent
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class TimeExpression
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTimeExpression
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class TimeInterval
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTimeInterval
  {}

  /** 
    * @param firstEvent Defined in TimeObservation
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class TimeObservation
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    firstEvent: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTimeObservation
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param kind Defined in Transition
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Transition
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    kind: Option[UMLTransitionKind],
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTransition
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Trigger
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLTrigger
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class UnmarshallAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLUnmarshallAction
  {}

  /** 
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class Usage
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLUsage
  {}

  /** 
    * @param isAbstract Defined in Classifier
    * @param isFinalSpecialization Defined in Classifier
    * @param isLeaf Defined in RedefinableElement
    * @param name Defined in NamedElement
    * @param visibility Defined in PackageableElement
    */
  case class UseCase
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isAbstract: Boolean,
    isFinalSpecialization: Boolean,
    isLeaf: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLUseCase
  {}

  /** 
    * @param isControl Defined in Pin
    * @param isControlType Defined in ObjectNode
    * @param isLeaf Defined in RedefinableElement
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param ordering Defined in ObjectNode
    * @param visibility Defined in NamedElement
    */
  case class ValuePin
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isControl: Boolean,
    isControlType: Boolean,
    isLeaf: Boolean,
    isOrdered: Boolean,
    isUnique: Boolean,
    name: Option[String],
    ordering: Option[UMLObjectNodeOrderingKind],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLValuePin
  {}

  /** 
    * @param isLeaf Defined in RedefinableElement
    * @param isLocallyReentrant Defined in Action
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class ValueSpecificationAction
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isLeaf: Boolean,
    isLocallyReentrant: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLValueSpecificationAction
  {}

  /** 
    * @param isOrdered Defined in MultiplicityElement
    * @param isUnique Defined in MultiplicityElement
    * @param name Defined in NamedElement
    * @param visibility Defined in NamedElement
    */
  case class Variable
  ( override val toolSpecific_uuid: String @@ TOOL_SPECIFIC_UUID,
    isOrdered: Boolean,
    isUnique: Boolean,
    name: Option[String],
    visibility: Option[UMLVisibilityKind])
  extends OTIElement
  with UMLVariable
  {}

  /**
    * Corresponds to a CMOF 2.5 Association with the additional restriction that it must be logically directed
    * from a source OTIElement to a target OTIElement.
    */
  sealed trait OTIRelationship {
  
    def source: String @@ TOOL_SPECIFIC_UUID
    def target: String @@ TOOL_SPECIFIC_UUID
  
  }

  /**
    * @param: source mapping: OpaqueExpression
    * @param: target abstraction: Abstraction
    */
  case class A_mapping_abstraction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source returnInformation: OutputPin
    * @param: target acceptCallAction: AcceptCallAction
    */
  case class A_returnInformation_acceptCallAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target acceptEventAction: AcceptEventAction
    */
  case class A_result_acceptEventAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source trigger: Trigger
    * @param: target acceptEventAction: AcceptEventAction
    */
  case class A_trigger_acceptEventAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source localPostcondition: Constraint
    * @param: target action: Action
    */
  case class A_localPostcondition_action
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source localPrecondition: Constraint
    * @param: target action: Action
    */
  case class A_localPrecondition_action
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source action: Action
    * @param: target actionExecutionSpecification: ActionExecutionSpecification
    */
  case class A_action_actionExecutionSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source fromAction: Action
    * @param: target actionInputPin: ActionInputPin
    */
  case class A_fromAction_actionInputPin
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source edge: ActivityEdge
    * @param: target activity: Activity
    */
  case class A_edge_activity
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source group: ActivityGroup
    * @param: target inActivity: Activity
    */
  case class A_group_inActivity
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source node: ActivityNode
    * @param: target activity: Activity
    */
  case class A_node_activity
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source partition: ActivityPartition
    * @param: target activity: Activity
    */
  case class A_partition_activity
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source variable: Variable
    * @param: target activityScope: Activity
    */
  case class A_variable_activityScope
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source guard: ValueSpecification
    * @param: target activityEdge: ActivityEdge
    */
  case class A_guard_activityEdge
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source inPartition: ActivityPartition
    * @param: target edge: ActivityEdge
    */
  case class A_edge_inPartition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedEdge: ActivityEdge
    * @param: target activityEdge: ActivityEdge
    */
  case class A_redefinedEdge_activityEdge
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source weight: ValueSpecification
    * @param: target activityEdge: ActivityEdge
    */
  case class A_weight_activityEdge
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}



  /**
    * @param: source inPartition: ActivityPartition
    * @param: target node: ActivityNode
    */
  case class A_inPartition_node
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source incoming: ActivityEdge
    * @param: target target: ActivityNode
    */
  case class A_incoming_target_node
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source outgoing: ActivityEdge
    * @param: target source: ActivityNode
    */
  case class A_outgoing_source_node
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedNode: ActivityNode
    * @param: target activityNode: ActivityNode
    */
  case class A_redefinedNode_activityNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source parameter: Parameter
    * @param: target activityParameterNode: ActivityParameterNode
    */
  case class A_parameter_activityParameterNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source represents: Element
    * @param: target activityPartition: ActivityPartition
    */
  case class A_represents_activityPartition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source subpartition: ActivityPartition
    * @param: target superPartition: ActivityPartition
    */
  case class A_subpartition_superPartition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source insertAt: InputPin
    * @param: target addStructuralFeatureValueAction: AddStructuralFeatureValueAction
    */
  case class A_insertAt_addStructuralFeatureValueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source insertAt: InputPin
    * @param: target addVariableValueAction: AddVariableValueAction
    */
  case class A_insertAt_addVariableValueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source manifestation: Manifestation
    * @param: target artifact: Artifact
    */
  case class A_manifestation_artifact
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source nestedArtifact: Artifact
    * @param: target artifact: Artifact
    */
  case class A_nestedArtifact_artifact
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedAttribute: Property
    * @param: target artifact: Artifact
    */
  case class A_ownedAttribute_artifact
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedOperation: Operation
    * @param: target artifact: Artifact
    */
  case class A_ownedOperation_artifact
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source memberEnd: Property
    * @param: target association: Association
    */
  case class A_memberEnd_association
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source navigableOwnedEnd: Property
    * @param: target association: Association
    */
  case class A_navigableOwnedEnd_association
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedEnd: Property
    * @param: target owningAssociation: Association
    */
  case class A_ownedEnd_owningAssociation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source ownedParameter: Parameter
    * @param: target behavior: Behavior
    */
  case class A_ownedParameter_behavior
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameterSet: ParameterSet
    * @param: target behavior: Behavior
    */
  case class A_ownedParameterSet_behavior
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source postcondition: Constraint
    * @param: target behavior: Behavior
    */
  case class A_postcondition_behavior
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source precondition: Constraint
    * @param: target behavior: Behavior
    */
  case class A_precondition_behavior
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedBehavior: Behavior
    * @param: target behavior: Behavior
    */
  case class A_redefinedBehavior_behavior
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: BehavioralFeature
    * @param: target method: Behavior
    */
  case class A_method_specification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source behavior: Behavior
    * @param: target behaviorExecutionSpecification: BehaviorExecutionSpecification
    */
  case class A_behavior_behaviorExecutionSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameter: Parameter
    * @param: target ownerFormalParam: BehavioralFeature
    */
  case class A_ownedParameter_ownerFormalParam
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameterSet: ParameterSet
    * @param: target behavioralFeature: BehavioralFeature
    */
  case class A_ownedParameterSet_behavioralFeature
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source raisedException: Type
    * @param: target behavioralFeature: BehavioralFeature
    */
  case class A_raisedException_behavioralFeature
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source classifierBehavior: Behavior
    * @param: target behavioredClassifier: BehavioredClassifier
    */
  case class A_classifierBehavior_behavioredClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source interfaceRealization: InterfaceRealization
    * @param: target implementingClassifier: BehavioredClassifier
    */
  case class A_interfaceRealization_implementingClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedBehavior: Behavior
    * @param: target behavioredClassifier: BehavioredClassifier
    */
  case class A_ownedBehavior_behavioredClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source signal: Signal
    * @param: target broadcastSignalAction: BroadcastSignalAction
    */
  case class A_signal_broadcastSignalAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target callAction: CallAction
    */
  case class A_result_callAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source behavior: Behavior
    * @param: target callBehaviorAction: CallBehaviorAction
    */
  case class A_behavior_callBehaviorAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source operation: Operation
    * @param: target callEvent: CallEvent
    */
  case class A_operation_callEvent
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source operation: Operation
    * @param: target callOperationAction: CallOperationAction
    */
  case class A_operation_callOperationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source target: InputPin
    * @param: target callOperationAction: CallOperationAction
    */
  case class A_target_callOperationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source changeExpression: ValueSpecification
    * @param: target changeEvent: ChangeEvent
    */
  case class A_changeExpression_changeEvent
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source nestedClassifier: Classifier
    * @param: target nestingClass: Class
    */
  case class A_nestedClassifier_nestingClass
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedAttribute: Property
    * @param: target class: Class
    */
  case class A_ownedAttribute_class
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedOperation: Operation
    * @param: target class: Class
    */
  case class A_ownedOperation_class
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedReception: Reception
    * @param: target class: Class
    */
  case class A_ownedReception_class
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source collaborationUse: CollaborationUse
    * @param: target classifier: Classifier
    */
  case class A_collaborationUse_classifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source generalization: Generalization
    * @param: target specific: Classifier
    */
  case class A_generalization_specific
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedTemplateSignature: RedefinableTemplateSignature
    * @param: target classifier: Classifier
    */
  case class A_ownedTemplateSignature_classifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedUseCase: UseCase
    * @param: target classifier: Classifier
    */
  case class A_ownedUseCase_classifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source powertypeExtent: GeneralizationSet
    * @param: target powertype: Classifier
    */
  case class A_powertypeExtent_powertype
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedClassifier: Classifier
    * @param: target classifier: Classifier
    */
  case class A_redefinedClassifier_classifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source representation: CollaborationUse
    * @param: target classifier: Classifier
    */
  case class A_representation_classifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source substitution: Substitution
    * @param: target substitutingClassifier: Classifier
    */
  case class A_substitution_substitutingClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source templateParameter: ClassifierTemplateParameter
    * @param: target parameteredElement: Classifier
    */
  case class A_classifier_templateParameter_parameteredElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source constrainingClassifier: Classifier
    * @param: target classifierTemplateParameter: ClassifierTemplateParameter
    */
  case class A_constrainingClassifier_classifierTemplateParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source body: ExecutableNode
    * @param: target clause: Clause
    */
  case class A_body_clause
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source bodyOutput: OutputPin
    * @param: target clause: Clause
    */
  case class A_bodyOutput_clause
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source decider: OutputPin
    * @param: target clause: Clause
    */
  case class A_decider_clause
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source successorClause: Clause
    * @param: target predecessorClause: Clause
    */
  case class A_predecessorClause_successorClause
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source test: ExecutableNode
    * @param: target clause: Clause
    */
  case class A_test_clause
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source association: Association
    * @param: target clearAssociationAction: ClearAssociationAction
    */
  case class A_association_clearAssociationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target clearAssociationAction: ClearAssociationAction
    */
  case class A_object_clearAssociationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target clearStructuralFeatureAction: ClearStructuralFeatureAction
    */
  case class A_result_clearStructuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source collaborationRole: ConnectableElement
    * @param: target collaboration: Collaboration
    */
  case class A_collaborationRole_collaboration
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source roleBinding: Dependency
    * @param: target collaborationUse: CollaborationUse
    */
  case class A_roleBinding_collaborationUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source type: Collaboration
    * @param: target collaborationUse: CollaborationUse
    */
  case class A_type_collaborationUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source cfragmentGate: Gate
    * @param: target combinedFragment: CombinedFragment
    */
  case class A_cfragmentGate_combinedFragment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source operand: InteractionOperand
    * @param: target combinedFragment: CombinedFragment
    */
  case class A_operand_combinedFragment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source annotatedElement: Element
    * @param: target comment: Comment
    */
  case class A_annotatedElement_comment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source packagedElement: PackageableElement
    * @param: target component: Component
    */
  case class A_packagedElement_component
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realization: ComponentRealization
    * @param: target abstraction: Component
    */
  case class A_realization_abstraction_component
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realizingClassifier: Classifier
    * @param: target componentRealization: ComponentRealization
    */
  case class A_realizingClassifier_componentRealization
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source clause: Clause
    * @param: target conditionalNode: ConditionalNode
    */
  case class A_clause_conditionalNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target conditionalNode: ConditionalNode
    */
  case class A_result_conditionalNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source parameteredElement: ConnectableElement
    * @param: target templateParameter: ConnectableElementTemplateParameter
    */
  case class A_connectableElement_templateParameter_parameteredElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source entry: Pseudostate
    * @param: target connectionPointReference: ConnectionPointReference
    */
  case class A_entry_connectionPointReference
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source exit: Pseudostate
    * @param: target connectionPointReference: ConnectionPointReference
    */
  case class A_exit_connectionPointReference
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source contract: Behavior
    * @param: target connector: Connector
    */
  case class A_contract_connector
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source end: ConnectorEnd
    * @param: target connector: Connector
    */
  case class A_end_connector
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedConnector: Connector
    * @param: target connector: Connector
    */
  case class A_redefinedConnector_connector
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source type: Association
    * @param: target connector: Connector
    */
  case class A_type_connector
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source partWithPort: Property
    * @param: target connectorEnd: ConnectorEnd
    */
  case class A_partWithPort_connectorEnd
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source role: ConnectableElement
    * @param: target end: ConnectorEnd
    */
  case class A_end_role
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source message: NamedElement
    * @param: target considerIgnoreFragment: ConsiderIgnoreFragment
    */
  case class A_message_considerIgnoreFragment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source constrainedElement: Element
    * @param: target constraint: Constraint
    */
  case class A_constrainedElement_constraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: ValueSpecification
    * @param: target owningConstraint: Constraint
    */
  case class A_specification_owningConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}




  /**
    * @param: source endData: LinkEndCreationData
    * @param: target createLinkAction: CreateLinkAction
    */
  case class A_endData_createLinkAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target createLinkObjectAction: CreateLinkObjectAction
    */
  case class A_result_createLinkObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source classifier: Classifier
    * @param: target createObjectAction: CreateObjectAction
    */
  case class A_classifier_createObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target createObjectAction: CreateObjectAction
    */
  case class A_result_createObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source ownedAttribute: Property
    * @param: target datatype: DataType
    */
  case class A_ownedAttribute_datatype
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedOperation: Operation
    * @param: target datatype: DataType
    */
  case class A_ownedOperation_datatype
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source decisionInput: Behavior
    * @param: target decisionNode: DecisionNode
    */
  case class A_decisionInput_decisionNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source decisionInputFlow: ObjectFlow
    * @param: target decisionNode: DecisionNode
    */
  case class A_decisionInputFlow_decisionNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source client: NamedElement
    * @param: target clientDependency: Dependency
    */
  case class A_clientDependency_client
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source supplier: NamedElement
    * @param: target supplierDependency: Dependency
    */
  case class A_supplier_supplierDependency
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source configuration: DeploymentSpecification
    * @param: target deployment: Deployment
    */
  case class A_configuration_deployment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source deployedArtifact: DeployedArtifact
    * @param: target deploymentForArtifact: Deployment
    */
  case class A_deployedArtifact_deploymentForArtifact
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source deployment: Deployment
    * @param: target location: DeploymentTarget
    */
  case class A_deployment_location
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source endData: LinkEndDestructionData
    * @param: target destroyLinkAction: DestroyLinkAction
    */
  case class A_endData_destroyLinkAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source target: InputPin
    * @param: target destroyObjectAction: DestroyObjectAction
    */
  case class A_target_destroyObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}




  /**
    * @param: source expr: ValueSpecification
    * @param: target duration: Duration
    */
  case class A_expr_duration
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source observation: Observation
    * @param: target duration: Duration
    */
  case class A_observation_duration
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: DurationInterval
    * @param: target durationConstraint: DurationConstraint
    */
  case class A_specification_durationConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source max: Duration
    * @param: target durationInterval: DurationInterval
    */
  case class A_max_durationInterval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source min: Duration
    * @param: target durationInterval: DurationInterval
    */
  case class A_min_durationInterval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source event: NamedElement
    * @param: target durationObservation: DurationObservation
    */
  case class A_event_durationObservation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedComment: Comment
    * @param: target owningElement: Element
    */
  case class A_ownedComment_owningElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source importedElement: PackageableElement
    * @param: target import: ElementImport
    */
  case class A_importedElement_import
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source ownedLiteral: EnumerationLiteral
    * @param: target enumeration: Enumeration
    */
  case class A_ownedLiteral_enumeration
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}



  /**
    * @param: source exceptionInput: ObjectNode
    * @param: target exceptionHandler: ExceptionHandler
    */
  case class A_exceptionInput_exceptionHandler
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source exceptionType: Classifier
    * @param: target exceptionHandler: ExceptionHandler
    */
  case class A_exceptionType_exceptionHandler
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source handlerBody: ExecutableNode
    * @param: target exceptionHandler: ExceptionHandler
    */
  case class A_handlerBody_exceptionHandler
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source handler: ExceptionHandler
    * @param: target protectedNode: ExecutableNode
    */
  case class A_handler_protectedNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source execution: ExecutionSpecification
    * @param: target executionOccurrenceSpecification: ExecutionOccurrenceSpecification
    */
  case class A_execution_executionOccurrenceSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source finish: OccurrenceSpecification
    * @param: target executionSpecification: ExecutionSpecification
    */
  case class A_finish_executionSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source start: OccurrenceSpecification
    * @param: target executionSpecification: ExecutionSpecification
    */
  case class A_start_executionSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source inputElement: ExpansionNode
    * @param: target regionAsInput: ExpansionRegion
    */
  case class A_inputElement_regionAsInput
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source outputElement: ExpansionNode
    * @param: target regionAsOutput: ExpansionRegion
    */
  case class A_outputElement_regionAsOutput
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source operand: ValueSpecification
    * @param: target expression: Expression
    */
  case class A_operand_expression
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source condition: Constraint
    * @param: target extend: Extend
    */
  case class A_condition_extend
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source extendedCase: UseCase
    * @param: target extend: Extend
    */
  case class A_extendedCase_extend
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source extensionLocation: ExtensionPoint
    * @param: target extension: Extend
    */
  case class A_extensionLocation_extension
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedEnd: ExtensionEnd
    * @param: target extension: Extension
    */
  case class A_ownedEnd_extension
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source type: Stereotype
    * @param: target extensionEnd: ExtensionEnd
    */
  case class A_type_extensionEnd
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}










  /**
    * @param: source general: Classifier
    * @param: target generalization: Generalization
    */
  case class A_general_generalization
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source generalization: Generalization
    * @param: target generalizationSet: GeneralizationSet
    */
  case class A_generalizationSet_generalization
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source addition: UseCase
    * @param: target include: Include
    */
  case class A_addition_include
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source conveyed: Classifier
    * @param: target conveyingFlow: InformationFlow
    */
  case class A_conveyed_conveyingFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source informationSource: NamedElement
    * @param: target informationFlow: InformationFlow
    */
  case class A_informationSource_informationFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source informationTarget: NamedElement
    * @param: target informationFlow: InformationFlow
    */
  case class A_informationTarget_informationFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realization: Relationship
    * @param: target abstraction: InformationFlow
    */
  case class A_realization_abstraction_flow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realizingActivityEdge: ActivityEdge
    * @param: target informationFlow: InformationFlow
    */
  case class A_realizingActivityEdge_informationFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realizingConnector: Connector
    * @param: target informationFlow: InformationFlow
    */
  case class A_realizingConnector_informationFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source realizingMessage: Message
    * @param: target informationFlow: InformationFlow
    */
  case class A_realizingMessage_informationFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source represented: Classifier
    * @param: target representation: InformationItem
    */
  case class A_represented_representation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}



  /**
    * @param: source classifier: Classifier
    * @param: target instanceSpecification: InstanceSpecification
    */
  case class A_classifier_instanceSpecification
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source slot: Slot
    * @param: target owningInstance: InstanceSpecification
    */
  case class A_slot_owningInstance
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: ValueSpecification
    * @param: target owningInstanceSpec: InstanceSpecification
    */
  case class A_specification_owningInstanceSpec
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source instance: InstanceSpecification
    * @param: target instanceValue: InstanceValue
    */
  case class A_instance_instanceValue
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source action: Action
    * @param: target interaction: Interaction
    */
  case class A_action_interaction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source formalGate: Gate
    * @param: target interaction: Interaction
    */
  case class A_formalGate_interaction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source fragment: InteractionFragment
    * @param: target enclosingInteraction: Interaction
    */
  case class A_fragment_enclosingInteraction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source lifeline: Lifeline
    * @param: target interaction: Interaction
    */
  case class A_lifeline_interaction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source message: Message
    * @param: target interaction: Interaction
    */
  case class A_message_interaction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source maxint: ValueSpecification
    * @param: target interactionConstraint: InteractionConstraint
    */
  case class A_maxint_interactionConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source minint: ValueSpecification
    * @param: target interactionConstraint: InteractionConstraint
    */
  case class A_minint_interactionConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source generalOrdering: GeneralOrdering
    * @param: target interactionFragment: InteractionFragment
    */
  case class A_generalOrdering_interactionFragment
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source fragment: InteractionFragment
    * @param: target enclosingOperand: InteractionOperand
    */
  case class A_fragment_enclosingOperand
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source guard: InteractionConstraint
    * @param: target interactionOperand: InteractionOperand
    */
  case class A_guard_interactionOperand
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source actualGate: Gate
    * @param: target interactionUse: InteractionUse
    */
  case class A_actualGate_interactionUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source argument: ValueSpecification
    * @param: target interactionUse: InteractionUse
    */
  case class A_argument_interactionUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source refersTo: Interaction
    * @param: target interactionUse: InteractionUse
    */
  case class A_refersTo_interactionUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source returnValue: ValueSpecification
    * @param: target interactionUse: InteractionUse
    */
  case class A_returnValue_interactionUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source returnValueRecipient: Property
    * @param: target interactionUse: InteractionUse
    */
  case class A_returnValueRecipient_interactionUse
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source nestedClassifier: Classifier
    * @param: target interface: Interface
    */
  case class A_nestedClassifier_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedAttribute: Property
    * @param: target interface: Interface
    */
  case class A_ownedAttribute_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedOperation: Operation
    * @param: target interface: Interface
    */
  case class A_ownedOperation_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedReception: Reception
    * @param: target interface: Interface
    */
  case class A_ownedReception_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source protocol: ProtocolStateMachine
    * @param: target interface: Interface
    */
  case class A_protocol_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedInterface: Interface
    * @param: target interface: Interface
    */
  case class A_redefinedInterface_interface
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source contract: Interface
    * @param: target interfaceRealization: InterfaceRealization
    */
  case class A_contract_interfaceRealization
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source interruptingEdge: ActivityEdge
    * @param: target interrupts: InterruptibleActivityRegion
    */
  case class A_interruptingEdge_interrupts
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source node: ActivityNode
    * @param: target inInterruptibleRegion: InterruptibleActivityRegion
    */
  case class A_inInterruptibleRegion_node
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source max: ValueSpecification
    * @param: target interval: Interval
    */
  case class A_max_interval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source min: ValueSpecification
    * @param: target interval: Interval
    */
  case class A_min_interval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: Interval
    * @param: target intervalConstraint: IntervalConstraint
    */
  case class A_specification_intervalConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source argument: InputPin
    * @param: target invocationAction: InvocationAction
    */
  case class A_argument_invocationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source onPort: Port
    * @param: target invocationAction: InvocationAction
    */
  case class A_onPort_invocationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source joinSpec: ValueSpecification
    * @param: target joinNode: JoinNode
    */
  case class A_joinSpec_joinNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source coveredBy: InteractionFragment
    * @param: target covered: Lifeline
    */
  case class A_covered_coveredBy
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source decomposedAs: PartDecomposition
    * @param: target lifeline: Lifeline
    */
  case class A_decomposedAs_lifeline
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source represents: ConnectableElement
    * @param: target lifeline: Lifeline
    */
  case class A_represents_lifeline
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source selector: ValueSpecification
    * @param: target lifeline: Lifeline
    */
  case class A_selector_lifeline
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source endData: LinkEndData
    * @param: target linkAction: LinkAction
    */
  case class A_endData_linkAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source inputValue: InputPin
    * @param: target linkAction: LinkAction
    */
  case class A_inputValue_linkAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source insertAt: InputPin
    * @param: target linkEndCreationData: LinkEndCreationData
    */
  case class A_insertAt_linkEndCreationData
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source end: Property
    * @param: target linkEndData: LinkEndData
    */
  case class A_end_linkEndData
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source qualifier: QualifierValue
    * @param: target linkEndData: LinkEndData
    */
  case class A_qualifier_linkEndData
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: InputPin
    * @param: target linkEndData: LinkEndData
    */
  case class A_value_linkEndData
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source destroyAt: InputPin
    * @param: target linkEndDestructionData: LinkEndDestructionData
    */
  case class A_destroyAt_linkEndDestructionData
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}








  /**
    * @param: source bodyOutput: OutputPin
    * @param: target loopNode: LoopNode
    */
  case class A_bodyOutput_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source bodyPart: ExecutableNode
    * @param: target loopNode: LoopNode
    */
  case class A_bodyPart_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source decider: OutputPin
    * @param: target loopNode: LoopNode
    */
  case class A_decider_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source loopVariable: OutputPin
    * @param: target loopNode: LoopNode
    */
  case class A_loopVariable_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source loopVariableInput: InputPin
    * @param: target loopNode: LoopNode
    */
  case class A_loopVariableInput_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target loopNode: LoopNode
    */
  case class A_result_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source setupPart: ExecutableNode
    * @param: target loopNode: LoopNode
    */
  case class A_setupPart_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source test: ExecutableNode
    * @param: target loopNode: LoopNode
    */
  case class A_test_loopNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source utilizedElement: PackageableElement
    * @param: target manifestation: Manifestation
    */
  case class A_utilizedElement_manifestation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source argument: ValueSpecification
    * @param: target message: Message
    */
  case class A_argument_message
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source connector: Connector
    * @param: target message: Message
    */
  case class A_connector_message
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source receiveEvent: MessageEnd
    * @param: target endMessage: Message
    */
  case class A_receiveEvent_endMessage
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source sendEvent: MessageEnd
    * @param: target endMessage: Message
    */
  case class A_sendEvent_endMessage
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source signature: NamedElement
    * @param: target message: Message
    */
  case class A_signature_message
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source message: Message
    * @param: target messageEnd: MessageEnd
    */
  case class A_message_messageEnd
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}




  /**
    * @param: source lowerValue: ValueSpecification
    * @param: target owningLower: MultiplicityElement
    */
  case class A_lowerValue_owningLower
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source upperValue: ValueSpecification
    * @param: target owningUpper: MultiplicityElement
    */
  case class A_upperValue_owningUpper
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source nameExpression: StringExpression
    * @param: target namedElement: NamedElement
    */
  case class A_nameExpression_namedElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source elementImport: ElementImport
    * @param: target importingNamespace: Namespace
    */
  case class A_elementImport_importingNamespace
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedRule: Constraint
    * @param: target context: Namespace
    */
  case class A_ownedRule_context
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source packageImport: PackageImport
    * @param: target importingNamespace: Namespace
    */
  case class A_packageImport_importingNamespace
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source nestedNode: Node
    * @param: target node: Node
    */
  case class A_nestedNode_node
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source selection: Behavior
    * @param: target objectFlow: ObjectFlow
    */
  case class A_selection_objectFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source transformation: Behavior
    * @param: target objectFlow: ObjectFlow
    */
  case class A_transformation_objectFlow
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source inState: State
    * @param: target objectNode: ObjectNode
    */
  case class A_inState_objectNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source selection: Behavior
    * @param: target objectNode: ObjectNode
    */
  case class A_selection_objectNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source upperBound: ValueSpecification
    * @param: target objectNode: ObjectNode
    */
  case class A_upperBound_objectNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source covered: Lifeline
    * @param: target events: OccurrenceSpecification
    */
  case class A_covered_events
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source toAfter: GeneralOrdering
    * @param: target before: OccurrenceSpecification
    */
  case class A_before_toAfter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source toBefore: GeneralOrdering
    * @param: target after: OccurrenceSpecification
    */
  case class A_toBefore_after
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source inputValue: InputPin
    * @param: target opaqueAction: OpaqueAction
    */
  case class A_inputValue_opaqueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source outputValue: OutputPin
    * @param: target opaqueAction: OpaqueAction
    */
  case class A_outputValue_opaqueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source behavior: Behavior
    * @param: target opaqueExpression: OpaqueExpression
    */
  case class A_behavior_opaqueExpression
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source bodyCondition: Constraint
    * @param: target bodyContext: Operation
    */
  case class A_bodyCondition_bodyContext
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameter: Parameter
    * @param: target operation: Operation
    */
  case class A_ownedParameter_operation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source postcondition: Constraint
    * @param: target postContext: Operation
    */
  case class A_postcondition_postContext
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source precondition: Constraint
    * @param: target preContext: Operation
    */
  case class A_precondition_preContext
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source raisedException: Type
    * @param: target operation: Operation
    */
  case class A_raisedException_operation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedOperation: Operation
    * @param: target operation: Operation
    */
  case class A_redefinedOperation_operation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source parameteredElement: Operation
    * @param: target templateParameter: OperationTemplateParameter
    */
  case class A_operation_templateParameter_parameteredElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source packageMerge: PackageMerge
    * @param: target receivingPackage: Package
    */
  case class A_packageMerge_receivingPackage
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source packagedElement: PackageableElement
    * @param: target owningPackage: Package
    */
  case class A_packagedElement_owningPackage
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source profileApplication: ProfileApplication
    * @param: target applyingPackage: Package
    */
  case class A_profileApplication_applyingPackage
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source importedPackage: Package
    * @param: target packageImport: PackageImport
    */
  case class A_importedPackage_packageImport
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source mergedPackage: Package
    * @param: target packageMerge: PackageMerge
    */
  case class A_mergedPackage_packageMerge
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source defaultValue: ValueSpecification
    * @param: target owningParameter: Parameter
    */
  case class A_defaultValue_owningParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source condition: Constraint
    * @param: target parameterSet: ParameterSet
    */
  case class A_condition_parameterSet
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source parameter: Parameter
    * @param: target parameterSet: ParameterSet
    */
  case class A_parameterSet_parameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source templateParameter: TemplateParameter
    * @param: target parameteredElement: ParameterableElement
    */
  case class A_parameteredElement_templateParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}



  /**
    * @param: source protocol: ProtocolStateMachine
    * @param: target port: Port
    */
  case class A_protocol_port
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedPort: Port
    * @param: target port: Port
    */
  case class A_redefinedPort_port
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source metaclassReference: ElementImport
    * @param: target profile: Profile
    */
  case class A_metaclassReference_profile
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source metamodelReference: PackageImport
    * @param: target profile: Profile
    */
  case class A_metamodelReference_profile
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source appliedProfile: Profile
    * @param: target profileApplication: ProfileApplication
    */
  case class A_appliedProfile_profileApplication
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source defaultValue: ValueSpecification
    * @param: target owningProperty: Property
    */
  case class A_defaultValue_owningProperty
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source qualifier: Property
    * @param: target associationEnd: Property
    */
  case class A_qualifier_associationEnd
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedProperty: Property
    * @param: target property: Property
    */
  case class A_redefinedProperty_property
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source subsettedProperty: Property
    * @param: target property: Property
    */
  case class A_subsettedProperty_property
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source generalMachine: ProtocolStateMachine
    * @param: target protocolConformance: ProtocolConformance
    */
  case class A_generalMachine_protocolConformance
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source conformance: ProtocolConformance
    * @param: target specificMachine: ProtocolStateMachine
    */
  case class A_conformance_specificMachine
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source postCondition: Constraint
    * @param: target owningTransition: ProtocolTransition
    */
  case class A_postCondition_owningTransition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source preCondition: Constraint
    * @param: target protocolTransition: ProtocolTransition
    */
  case class A_preCondition_protocolTransition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source qualifier: Property
    * @param: target qualifierValue: QualifierValue
    */
  case class A_qualifier_qualifierValue
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: InputPin
    * @param: target qualifierValue: QualifierValue
    */
  case class A_value_qualifierValue
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source exception: InputPin
    * @param: target raiseExceptionAction: RaiseExceptionAction
    */
  case class A_exception_raiseExceptionAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source classifier: Classifier
    * @param: target readExtentAction: ReadExtentAction
    */
  case class A_classifier_readExtentAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readExtentAction: ReadExtentAction
    */
  case class A_result_readExtentAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source classifier: Classifier
    * @param: target readIsClassifiedObjectAction: ReadIsClassifiedObjectAction
    */
  case class A_classifier_readIsClassifiedObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target readIsClassifiedObjectAction: ReadIsClassifiedObjectAction
    */
  case class A_object_readIsClassifiedObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readIsClassifiedObjectAction: ReadIsClassifiedObjectAction
    */
  case class A_result_readIsClassifiedObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readLinkAction: ReadLinkAction
    */
  case class A_result_readLinkAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source end: Property
    * @param: target readLinkObjectEndAction: ReadLinkObjectEndAction
    */
  case class A_end_readLinkObjectEndAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target readLinkObjectEndAction: ReadLinkObjectEndAction
    */
  case class A_object_readLinkObjectEndAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readLinkObjectEndAction: ReadLinkObjectEndAction
    */
  case class A_result_readLinkObjectEndAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target readLinkObjectEndQualifierAction: ReadLinkObjectEndQualifierAction
    */
  case class A_object_readLinkObjectEndQualifierAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source qualifier: Property
    * @param: target readLinkObjectEndQualifierAction: ReadLinkObjectEndQualifierAction
    */
  case class A_qualifier_readLinkObjectEndQualifierAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readLinkObjectEndQualifierAction: ReadLinkObjectEndQualifierAction
    */
  case class A_result_readLinkObjectEndQualifierAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readSelfAction: ReadSelfAction
    */
  case class A_result_readSelfAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readStructuralFeatureAction: ReadStructuralFeatureAction
    */
  case class A_result_readStructuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target readVariableAction: ReadVariableAction
    */
  case class A_result_readVariableAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source signal: Signal
    * @param: target reception: Reception
    */
  case class A_signal_reception
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source newClassifier: Classifier
    * @param: target reclassifyObjectAction: ReclassifyObjectAction
    */
  case class A_newClassifier_reclassifyObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target reclassifyObjectAction: ReclassifyObjectAction
    */
  case class A_object_reclassifyObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source oldClassifier: Classifier
    * @param: target reclassifyObjectAction: ReclassifyObjectAction
    */
  case class A_oldClassifier_reclassifyObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source extendedSignature: RedefinableTemplateSignature
    * @param: target redefinableTemplateSignature: RedefinableTemplateSignature
    */
  case class A_extendedSignature_redefinableTemplateSignature
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source collection: InputPin
    * @param: target reduceAction: ReduceAction
    */
  case class A_collection_reduceAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source reducer: Behavior
    * @param: target reduceAction: ReduceAction
    */
  case class A_reducer_reduceAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target reduceAction: ReduceAction
    */
  case class A_result_reduceAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source extendedRegion: Region
    * @param: target region: Region
    */
  case class A_extendedRegion_region
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source subvertex: Vertex
    * @param: target container: Region
    */
  case class A_subvertex_container
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source transition: Transition
    * @param: target container: Region
    */
  case class A_transition_container
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source removeAt: InputPin
    * @param: target removeStructuralFeatureValueAction: RemoveStructuralFeatureValueAction
    */
  case class A_removeAt_removeStructuralFeatureValueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source removeAt: InputPin
    * @param: target removeVariableValueAction: RemoveVariableValueAction
    */
  case class A_removeAt_removeVariableValueAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source replyToCall: Trigger
    * @param: target replyAction: ReplyAction
    */
  case class A_replyToCall_replyAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source replyValue: InputPin
    * @param: target replyAction: ReplyAction
    */
  case class A_replyValue_replyAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source returnInformation: InputPin
    * @param: target replyAction: ReplyAction
    */
  case class A_returnInformation_replyAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source request: InputPin
    * @param: target sendObjectAction: SendObjectAction
    */
  case class A_request_sendObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source target: InputPin
    * @param: target sendObjectAction: SendObjectAction
    */
  case class A_target_sendObjectAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source signal: Signal
    * @param: target sendSignalAction: SendSignalAction
    */
  case class A_signal_sendSignalAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source target: InputPin
    * @param: target sendSignalAction: SendSignalAction
    */
  case class A_target_sendSignalAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source executableNode: ExecutableNode
    * @param: target sequenceNode: SequenceNode
    */
  case class A_executableNode_sequenceNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedAttribute: Property
    * @param: target owningSignal: Signal
    */
  case class A_ownedAttribute_owningSignal
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source signal: Signal
    * @param: target signalEvent: SignalEvent
    */
  case class A_signal_signalEvent
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source definingFeature: StructuralFeature
    * @param: target slot: Slot
    */
  case class A_definingFeature_slot
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: ValueSpecification
    * @param: target owningSlot: Slot
    */
  case class A_value_owningSlot
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target startClassifierBehaviorAction: StartClassifierBehaviorAction
    */
  case class A_object_startClassifierBehaviorAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target startObjectBehaviorAction: StartObjectBehaviorAction
    */
  case class A_object_startObjectBehaviorAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source connection: ConnectionPointReference
    * @param: target state: State
    */
  case class A_connection_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source connectionPoint: Pseudostate
    * @param: target state: State
    */
  case class A_connectionPoint_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source deferrableTrigger: Trigger
    * @param: target state: State
    */
  case class A_deferrableTrigger_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source doActivity: Behavior
    * @param: target state: State
    */
  case class A_doActivity_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source entry: Behavior
    * @param: target state: State
    */
  case class A_entry_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source exit: Behavior
    * @param: target state: State
    */
  case class A_exit_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedState: State
    * @param: target state: State
    */
  case class A_redefinedState_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source region: Region
    * @param: target state: State
    */
  case class A_region_state
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source stateInvariant: Constraint
    * @param: target owningState: State
    */
  case class A_stateInvariant_owningState
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source covered: Lifeline
    * @param: target stateInvariant: StateInvariant
    */
  case class A_covered_stateInvariant
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source invariant: Constraint
    * @param: target stateInvariant: StateInvariant
    */
  case class A_invariant_stateInvariant
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source connectionPoint: Pseudostate
    * @param: target stateMachine: StateMachine
    */
  case class A_connectionPoint_stateMachine
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source extendedStateMachine: StateMachine
    * @param: target stateMachine: StateMachine
    */
  case class A_extendedStateMachine_stateMachine
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source region: Region
    * @param: target stateMachine: StateMachine
    */
  case class A_region_stateMachine
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source submachineState: State
    * @param: target submachine: StateMachine
    */
  case class A_submachineState_submachine
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source icon: Image
    * @param: target stereotype: Stereotype
    */
  case class A_icon_stereotype
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source subExpression: StringExpression
    * @param: target owningExpression: StringExpression
    */
  case class A_subExpression_owningExpression
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source object: InputPin
    * @param: target structuralFeatureAction: StructuralFeatureAction
    */
  case class A_object_structuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source structuralFeature: StructuralFeature
    * @param: target structuralFeatureAction: StructuralFeatureAction
    */
  case class A_structuralFeature_structuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source edge: ActivityEdge
    * @param: target inStructuredNode: StructuredActivityNode
    */
  case class A_edge_inStructuredNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source node: ActivityNode
    * @param: target inStructuredNode: StructuredActivityNode
    */
  case class A_node_inStructuredNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source structuredNodeInput: InputPin
    * @param: target structuredActivityNode: StructuredActivityNode
    */
  case class A_structuredNodeInput_structuredActivityNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source structuredNodeOutput: OutputPin
    * @param: target structuredActivityNode: StructuredActivityNode
    */
  case class A_structuredNodeOutput_structuredActivityNode
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source variable: Variable
    * @param: target scope: StructuredActivityNode
    */
  case class A_variable_scope
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedAttribute: Property
    * @param: target structuredClassifier: StructuredClassifier
    */
  case class A_ownedAttribute_structuredClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedConnector: Connector
    * @param: target structuredClassifier: StructuredClassifier
    */
  case class A_ownedConnector_structuredClassifier
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source contract: Classifier
    * @param: target substitution: Substitution
    */
  case class A_contract_substitution
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source parameterSubstitution: TemplateParameterSubstitution
    * @param: target templateBinding: TemplateBinding
    */
  case class A_parameterSubstitution_templateBinding
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source signature: TemplateSignature
    * @param: target templateBinding: TemplateBinding
    */
  case class A_signature_templateBinding
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source default: ParameterableElement
    * @param: target templateParameter: TemplateParameter
    */
  case class A_default_templateParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedDefault: ParameterableElement
    * @param: target templateParameter: TemplateParameter
    */
  case class A_ownedDefault_templateParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameteredElement: ParameterableElement
    * @param: target owningTemplateParameter: TemplateParameter
    */
  case class A_ownedParameteredElement_owningTemplateParameter
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source actual: ParameterableElement
    * @param: target templateParameterSubstitution: TemplateParameterSubstitution
    */
  case class A_actual_templateParameterSubstitution
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source formal: TemplateParameter
    * @param: target templateParameterSubstitution: TemplateParameterSubstitution
    */
  case class A_formal_templateParameterSubstitution
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedActual: ParameterableElement
    * @param: target owningTemplateParameterSubstitution: TemplateParameterSubstitution
    */
  case class A_ownedActual_owningTemplateParameterSubstitution
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedParameter: TemplateParameter
    * @param: target signature: TemplateSignature
    */
  case class A_ownedParameter_signature
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source parameter: TemplateParameter
    * @param: target templateSignature: TemplateSignature
    */
  case class A_parameter_templateSignature
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source ownedTemplateSignature: TemplateSignature
    * @param: target template: TemplateableElement
    */
  case class A_ownedTemplateSignature_template
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source templateBinding: TemplateBinding
    * @param: target boundElement: TemplateableElement
    */
  case class A_templateBinding_boundElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source first: InputPin
    * @param: target testIdentityAction: TestIdentityAction
    */
  case class A_first_testIdentityAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target testIdentityAction: TestIdentityAction
    */
  case class A_result_testIdentityAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source second: InputPin
    * @param: target testIdentityAction: TestIdentityAction
    */
  case class A_second_testIdentityAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source specification: TimeInterval
    * @param: target timeConstraint: TimeConstraint
    */
  case class A_specification_timeConstraint
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source when: TimeExpression
    * @param: target timeEvent: TimeEvent
    */
  case class A_when_timeEvent
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source expr: ValueSpecification
    * @param: target timeExpression: TimeExpression
    */
  case class A_expr_timeExpression
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source observation: Observation
    * @param: target timeExpression: TimeExpression
    */
  case class A_observation_timeExpression
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source max: TimeExpression
    * @param: target timeInterval: TimeInterval
    */
  case class A_max_timeInterval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source min: TimeExpression
    * @param: target timeInterval: TimeInterval
    */
  case class A_min_timeInterval
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source event: NamedElement
    * @param: target timeObservation: TimeObservation
    */
  case class A_event_timeObservation
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source effect: Behavior
    * @param: target transition: Transition
    */
  case class A_effect_transition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source guard: Constraint
    * @param: target transition: Transition
    */
  case class A_guard_transition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source redefinedTransition: Transition
    * @param: target transition: Transition
    */
  case class A_redefinedTransition_transition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source source: Vertex
    * @param: target outgoing: Transition
    */
  case class A_outgoing_source_vertex
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source target: Vertex
    * @param: target incoming: Transition
    */
  case class A_incoming_target_vertex
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source trigger: Trigger
    * @param: target transition: Transition
    */
  case class A_trigger_transition
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source event: Event
    * @param: target trigger: Trigger
    */
  case class A_event_trigger
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source port: Port
    * @param: target trigger: Trigger
    */
  case class A_port_trigger
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source type: Type
    * @param: target typedElement: TypedElement
    */
  case class A_type_typedElement
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source object: InputPin
    * @param: target unmarshallAction: UnmarshallAction
    */
  case class A_object_unmarshallAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source result: OutputPin
    * @param: target unmarshallAction: UnmarshallAction
    */
  case class A_result_unmarshallAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source unmarshallType: Classifier
    * @param: target unmarshallAction: UnmarshallAction
    */
  case class A_unmarshallType_unmarshallAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source extend: Extend
    * @param: target extension: UseCase
    */
  case class A_extend_extension
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source extensionPoint: ExtensionPoint
    * @param: target useCase: UseCase
    */
  case class A_extensionPoint_useCase
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source include: Include
    * @param: target includingCase: UseCase
    */
  case class A_include_includingCase
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source subject: Classifier
    * @param: target useCase: UseCase
    */
  case class A_subject_useCase
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: ValueSpecification
    * @param: target valuePin: ValuePin
    */
  case class A_value_valuePin
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source result: OutputPin
    * @param: target valueSpecificationAction: ValueSpecificationAction
    */
  case class A_result_valueSpecificationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: ValueSpecification
    * @param: target valueSpecificationAction: ValueSpecificationAction
    */
  case class A_value_valueSpecificationAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}


  /**
    * @param: source variable: Variable
    * @param: target variableAction: VariableAction
    */
  case class A_variable_variableAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}



  /**
    * @param: source result: OutputPin
    * @param: target writeStructuralFeatureAction: WriteStructuralFeatureAction
    */
  case class A_result_writeStructuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: InputPin
    * @param: target writeStructuralFeatureAction: WriteStructuralFeatureAction
    */
  case class A_value_writeStructuralFeatureAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  /**
    * @param: source value: InputPin
    * @param: target writeVariableAction: WriteVariableAction
    */
  case class A_value_writeVariableAction
  ( override val source: String @@ TOOL_SPECIFIC_UUID,
    override val target: String @@ TOOL_SPECIFIC_UUID )
  extends OTIRelationship
  {}

  // <!-- Start of user code json rules -->
  
  implicit def taggedStringFormat[T]
  : Format[String @@ T]
  = new Format[String @@ T] {
    def reads(json: JsValue): JsResult[String @@ T] = json match {
      case JsString(v) => JsSuccess(Tag.of[T](v))
      case unknown => JsError(s"String value expected, got: $unknown")
    }

    def writes(v: String @@ T): JsValue = JsString(Tag.unwrap(v))
  }

  implicit val formatsOTIElement
  : Format[OTIElement]
  = Variants.format[OTIElement]

  implicit val writesOTIElement
  : Writes[OTIElement]
  = Variants.writes[OTIElement]

  implicit val readsOTIElement
  : Reads[OTIElement]
  = Variants.reads[OTIElement]

  implicit val formatsOTIRelationship
  : Format[OTIRelationship]
  = Variants.format[OTIRelationship]
  
  implicit val writesOTIRelationship
  : Writes[OTIRelationship]
  = Variants.writes[OTIRelationship]
  
  implicit val readsOTIRelationship
  : Reads[OTIRelationship]
  = Variants.reads[OTIRelationship]
  
  // <!-- End of user code json rules -->

}