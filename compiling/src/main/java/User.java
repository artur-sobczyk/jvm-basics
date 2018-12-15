import lombok.*;


/**
 * Lombok is a framework that add byte code to compiled class basing on annotations. Allows significantly reduce amount of boilerplate code. Look at compiled class.
 */
@Data
@Builder
public class User {

    private String fistname;
    private String lastname;
}