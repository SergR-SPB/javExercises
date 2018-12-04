package my.OOP.annotation2.excpertions;

public class AnnotationInvalidFieldTypeException extends IllegalArgumentException {

    public AnnotationInvalidFieldTypeException(String message) {
        super(message);
    }

    public AnnotationInvalidFieldTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}

