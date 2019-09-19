package MybatisUtil;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mybatis_Util {
	private static SqlSession sqlSession = null;
	private static InputStream in = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		in = Mybatis_Util.class.getClassLoader().getResourceAsStream("config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
	}
	public static SqlSession getSqlSession(boolean b) {		
		sqlSession = sqlSessionFactory.openSession(b);
		return sqlSession;
	}
	public static void closeSession() {
		sqlSession.close();
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
