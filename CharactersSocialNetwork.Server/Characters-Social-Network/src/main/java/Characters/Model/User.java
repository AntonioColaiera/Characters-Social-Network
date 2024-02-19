package Characters.Model;

import java.util.List; 
import jakarta.persistence.*;

import jakarta.persistence.OneToMany;
import lombok.Data; 
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor; 


@Entity
@Table(name = "users") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    private String bio;
    
    @Column(name = "profile_picture_url")
    private String profilePictureUrl;
    
    @OneToMany(mappedBy = "user")
    private List<User> friends; 
    
    @OneToMany(mappedBy = "user")  
    private List<Post> posts;
    
    @OneToMany(mappedBy = "user")  
    private List<Character> characters;
    
    
}
