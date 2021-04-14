package uk.ac.kcl.inf.group20.docker.scoping;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import uk.ac.kcl.inf.group20.docker.docker.AttachStatement;
import uk.ac.kcl.inf.group20.docker.docker.CommitStatement;
import uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration;
import uk.ac.kcl.inf.group20.docker.docker.DiffStatement;
import uk.ac.kcl.inf.group20.docker.docker.ExecStatement;
import uk.ac.kcl.inf.group20.docker.docker.ExportStatement;
import uk.ac.kcl.inf.group20.docker.docker.KillStatement;
import uk.ac.kcl.inf.group20.docker.docker.LogsStatement;
import uk.ac.kcl.inf.group20.docker.docker.Model;
import uk.ac.kcl.inf.group20.docker.docker.PauseStatement;
import uk.ac.kcl.inf.group20.docker.docker.PortStatement;
import uk.ac.kcl.inf.group20.docker.docker.RemoveStatement;
import uk.ac.kcl.inf.group20.docker.docker.RestartStatement;
import uk.ac.kcl.inf.group20.docker.docker.RunOption;
import uk.ac.kcl.inf.group20.docker.docker.SourceOption;
import uk.ac.kcl.inf.group20.docker.docker.StartStatement;
import uk.ac.kcl.inf.group20.docker.docker.StopStatement;
import uk.ac.kcl.inf.group20.docker.docker.UnpauseStatement;
import uk.ac.kcl.inf.group20.docker.docker.WaitStatement;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DockerScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_RunOption_containerName(final RunOption context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_RemoveStatement_containerName(final RemoveStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_KillStatement_containerName(final KillStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_StartStatement_containerName(final StartStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_StopStatement_containerName(final StopStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_RestartStatement_containerName(final RestartStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_PauseStatement_containerName(final PauseStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_UnpauseStatement_containerName(final UnpauseStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_ExecStatement_containerName(final ExecStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_AttachStatement_containerName(final AttachStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_LogsStatement_containerName(final LogsStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_WaitStatement_containerName(final WaitStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_ExportStatement_containerName(final ExportStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_PortStatemnt_containerName(final PortStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_CommitStatement_containerName(final CommitStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_SourceOption_containerName(final SourceOption context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
  
  public IScope scope_DiffStatement_containerName(final DiffStatement context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Model containingProgram = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
      _xblockexpression = Scopes.scopeFor(Iterables.<ContainerNameDeclaration>filter(containingProgram.getStatements(), ContainerNameDeclaration.class));
    }
    return _xblockexpression;
  }
}
