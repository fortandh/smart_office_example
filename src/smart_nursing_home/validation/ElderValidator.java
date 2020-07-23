/**
 *
 * $Id$
 */
package smart_nursing_home.validation;

import org.eclipse.emf.common.util.EList;

import smart_nursing_home.Disease;

/**
 * A sample validator interface for {@link smart_nursing_home.Elder}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElderValidator {
	boolean validate();

	boolean validateBySelf(boolean value);
	boolean validateTidy(boolean value);
	boolean validateTemperatureCheck(boolean value);
	boolean validateBloodOxygenCheck(boolean value);
	boolean validateDisease(EList<Disease> value);
}
