package my.OOP.annotation2;

public class AnnotationInvalidFieldTypeException extends IllegalArgumentException {


    public AnnotationInvalidFieldTypeException(String message) {
        super(message);
    }

    public AnnotationInvalidFieldTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}