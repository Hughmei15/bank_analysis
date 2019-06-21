package annotataion;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * �Զ���Validator
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = Amount.AmountValidator.class)
public @interface Amount {

    String message() default "��������";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    public class AmountValidator implements ConstraintValidator<Amount, String> {

        /**
         * ��ʾ����������ʽ
         */
        private String moneyReg = "^\\d+(\\.\\d{1,2})?$";
        private Pattern moneyPattern = Pattern.compile(moneyReg);

        @Override
        public void initialize(Amount amount) {

        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext arg1) {
            return moneyPattern.matcher(value.toString()).matches();
        }

    }

}
