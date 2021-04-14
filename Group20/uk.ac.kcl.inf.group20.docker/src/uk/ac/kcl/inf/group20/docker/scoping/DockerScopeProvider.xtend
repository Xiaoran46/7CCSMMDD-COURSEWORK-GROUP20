package uk.ac.kcl.inf.group20.docker.scoping;

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import uk.ac.kcl.inf.group20.docker.docker.RemoveStatement
import org.eclipse.emf.ecore.EReference

import static extension org.eclipse.xtext.EcoreUtil2.*
import static org.eclipse.xtext.scoping.Scopes.*
import uk.ac.kcl.inf.group20.docker.docker.Model
import uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration
import uk.ac.kcl.inf.group20.docker.docker.RunOption

import uk.ac.kcl.inf.group20.docker.docker.StartStatement
import uk.ac.kcl.inf.group20.docker.docker.StopStatement
import uk.ac.kcl.inf.group20.docker.docker.RestartStatement
import uk.ac.kcl.inf.group20.docker.docker.PauseStatement
import uk.ac.kcl.inf.group20.docker.docker.UnpauseStatement
import uk.ac.kcl.inf.group20.docker.docker.ExecStatement
import uk.ac.kcl.inf.group20.docker.docker.AttachStatement
import uk.ac.kcl.inf.group20.docker.docker.LogsStatement
import uk.ac.kcl.inf.group20.docker.docker.WaitStatement
import uk.ac.kcl.inf.group20.docker.docker.ExportStatement
import uk.ac.kcl.inf.group20.docker.docker.CommitStatement
import uk.ac.kcl.inf.group20.docker.docker.CpStatement
import uk.ac.kcl.inf.group20.docker.docker.DiffStatement
import uk.ac.kcl.inf.group20.docker.docker.KillStatement
import uk.ac.kcl.inf.group20.docker.docker.SourceOption
import uk.ac.kcl.inf.group20.docker.docker.PortStatement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class DockerScopeProvider extends AbstractDeclarativeScopeProvider {

 	def IScope scope_RunOption_containerName(RunOption context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 	
 	def IScope scope_RemoveStatement_containerName(RemoveStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 	
 	def IScope scope_KillStatement_containerName(KillStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_StartStatement_containerName(StartStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_StopStatement_containerName(StopStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_RestartStatement_containerName(RestartStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_PauseStatement_containerName(PauseStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_UnpauseStatement_containerName(UnpauseStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_ExecStatement_containerName(ExecStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_AttachStatement_containerName(AttachStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_LogsStatement_containerName(LogsStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_WaitStatement_containerName(WaitStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_ExportStatement_containerName(ExportStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_PortStatemnt_containerName(PortStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_CommitStatement_containerName(CommitStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_SourceOption_containerName(SourceOption context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
 
 	def IScope scope_DiffStatement_containerName(DiffStatement context, EReference ref){
  		val containingProgram = context.getContainerOfType(Model)
  		scopeFor(containingProgram.statements.filter(ContainerNameDeclaration))
 	}
}