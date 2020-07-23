/**
 *
 * $Id$
 */
package smart_nursing_home.validation;

import org.eclipse.emf.common.util.EList;

import smart_nursing_home.Clazz;

/**
 * A sample validator interface for {@link smart_nursing_home.SmartNursingHome}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SmartNursingHomeValidator {
	boolean validate();

	boolean validateClazz(EList<Clazz> value);
}