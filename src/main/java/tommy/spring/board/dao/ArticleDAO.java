package tommy.spring.board.dao;

import tommy.spring.board.vo.ArticleVO;

public interface ArticleDAO {
	//데이터베이스 처리 ArticleDAO 인터페이스
	void insert(ArticleVO article);
	void updateReadCount(int id);
}
