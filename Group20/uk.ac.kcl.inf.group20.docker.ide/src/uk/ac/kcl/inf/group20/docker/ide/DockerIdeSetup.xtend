/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.kcl.inf.group20.docker.DockerRuntimeModule
import uk.ac.kcl.inf.group20.docker.DockerStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DockerIdeSetup extends DockerStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DockerRuntimeModule, new DockerIdeModule))
	}
	
}
