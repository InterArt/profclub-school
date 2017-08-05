package am.profclub.school.common.exception;

/**
 * This exception is thrown when the requested data entry is not found.
 *
 */
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 6410866039708844675L;

    public NotFoundException(final String id) {
        super(String.format("No chat entry found with id: <%s>", id));
    }
}