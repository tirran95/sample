package kim.donghyeon.ums.config;
//맵퍼 설정
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class Configuration {
	private static SqlSession sqlSession;
	
	static{
		try{
			Reader reader = Resources.getResourceAsReader("kim/donghyeon/ums/config/SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
											//true 자동커밋
			sqlSession=sqlSessionFactory.openSession(true);
			reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	//맵퍼 클래스정보를 para로받아서 멥퍼리턴
	public static <T>T getMapper(Class<T> arg){
		return sqlSession.getMapper(arg);
	}
}
