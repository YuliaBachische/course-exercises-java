/*
Задание Аннотации. Реализовать аннотацию Transaction и анализатор
данной транзакции. Смысл данной аннотации заключается в том, что
если метод помечен данной аннотацией, значит он вызывается в рамках
транзакции. В рамках транзакции -
когда выводится на консоль два
сообщения: “Transaction is started”; “Transaction is ended”
*/
package lections_exercises09;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Transaction {
}
