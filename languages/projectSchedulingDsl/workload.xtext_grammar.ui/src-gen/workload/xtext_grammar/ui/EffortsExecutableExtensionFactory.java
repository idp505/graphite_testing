/*
 * generated by Xtext 2.36.0
 */
package workload.xtext_grammar.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import workload.xtext_grammar.ui.internal.Xtext_grammarActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EffortsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Xtext_grammarActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Xtext_grammarActivator activator = Xtext_grammarActivator.getInstance();
		return activator != null ? activator.getInjector(Xtext_grammarActivator.WORKLOAD_XTEXT_GRAMMAR_EFFORTS) : null;
	}

}
