/* Author: Pedro Henrique Resende Ribeiro
 * Description: Creating an annotation
 * Date: 18/06/2022 - Hour: 14:00
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PositiveDouble {

	// Target defines where annotation is valid
	// FIELD means that annotation is valid for attributes
	
	// Retention defines where annotation is available
	// RUNTIME means that annotation is available to JVM
	
}
