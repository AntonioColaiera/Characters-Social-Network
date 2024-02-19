
package Characters.Model;

import jakarta.persistence.*;
import lombok.Data; 
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor; 
import java.util.List;

@Entity
@Table(name = "posts") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String postId;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false, name = "description")
    private String description;
    
    @ManyToMany
    @JoinTable(
        name = "post_characters",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Character> characters;
    
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    
    
}