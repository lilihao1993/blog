import com.ldsh.blog.system.dto.ArticleDto;
import com.ldsh.blog.system.mapper.ArticleMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArticleServiceTest extends SpringTxTestCase {

    @Autowired
    private ArticleMapper articleMapper;


    @Test
    public void testSelectArticles() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("title","tat");
        List<ArticleDto> articleDtos = articleMapper.selectArticles(map);
        System.out.println(articleDtos.size());

    }

}
