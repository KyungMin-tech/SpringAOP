package tommy.spring.board.dao;

import tommy.spring.board.vo.ArticleVO;

//데이터 베이스 처리 구현 클래스
//OracleDAO 인터페이스를 구현한 OracleArticleDAO 클래스 구현
public class OracleArticleDAO implements ArticleDAO {
	@Override
	public void insert(ArticleVO article) {
		System.out.println("MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id) {
		System.out.println("MyOracleArticleDAO.updateReadCount() 실행");
	}
}
