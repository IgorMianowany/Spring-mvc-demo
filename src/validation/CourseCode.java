package validation;

import org.springframework.stereotype.Controller;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Constraint(validatedBy = CourseCode.CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    String value() default "LUV";

    //define default error message
    String message() default "must start with LUV";

    // define default groups
    Class<?>[] groups() default {};

    //define default payloads
    Class<? extends Payload>[] payload() default {};

}
