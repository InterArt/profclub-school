package am.profclub.school.domain;

public abstract class BaseAuditEntity extends BaseEntity {

    private Long dateAdded;
    private Long dateEdited;

    public Long getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Long dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Long getDateEdited() {
        return dateEdited;
    }

    public void setDateEdited(Long dateEdited) {
        this.dateEdited = dateEdited;
    }
}
