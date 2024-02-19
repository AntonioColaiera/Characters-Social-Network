package Characters.Model;

import jakarta.persistence.*;
import lombok.Data; 
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor; 

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
    
    @Column(nullable = false)
    private String content;
    
    @Column(name = "photo")
    private String photo;
    
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
    

}
