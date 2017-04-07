import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.dto.ClinetArticleDto;
import com.ldsh.blog.system.mapper.ArticleMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArticleServiceTest extends SpringTxTestCase {

    @Autowired
    private ArticleMapper articleMapper;


    @Test
    @Ignore
    public void testSelectArticles() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("title","tat");
        List<ArticleDto> articleDtos = articleMapper.adminSelectArticles(map);
        System.out.println(articleDtos.size());

    }

    @Test
    @Ignore
    public void testClientSelectArticle()throws Exception{
        Map<String,Object> map = new HashMap<>();
        map.put("userId","455d2c30d25c11e69562fcaa14e16be9");
        List<ClinetArticleDto> clinetArticleDtos = articleMapper.clientSelectArticles(map);
        System.out.println(clinetArticleDtos.size());
    }

}
