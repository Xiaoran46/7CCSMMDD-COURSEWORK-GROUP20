/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.group20.docker.DockerRuntimeModule;
import uk.ac.kcl.inf.group20.docker.DockerStandaloneSetup;
import uk.ac.kcl.inf.group20.docker.ide.DockerIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DockerIdeSetup extends DockerStandaloneSetup {
  @Override
  public Injector createInjector() {
    DockerRuntimeModule _dockerRuntimeModule = new DockerRuntimeModule();
    DockerIdeModule _dockerIdeModule = new DockerIdeModule();
    return Guice.createInjector(Modules2.mixin(_dockerRuntimeModule, _dockerIdeModule));
  }
}