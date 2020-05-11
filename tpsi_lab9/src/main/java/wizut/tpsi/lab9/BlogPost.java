package wizut.tpsi.lab9;

public class BlogPost {
    private Long id;
    private String content;
    private String title;
    
public BlogPost()
{

}

    public BlogPost(Long id, String title, String content) {
       this.content = content;
       this.id = id;
       this.title = title;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    public String getTitle(){
        return this.title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    
}
