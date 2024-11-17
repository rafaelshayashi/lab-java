package unannotated;

import jakarta.validation.constraints.NotEmpty;

public class AnnotatedClass {

    @NotEmpty
    private String title;
    @NotEmpty
    private String user;

}