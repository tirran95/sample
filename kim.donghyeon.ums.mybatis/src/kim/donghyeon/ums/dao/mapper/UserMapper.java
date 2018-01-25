package kim.donghyeon.ums.dao.mapper;

import java.util.*;

import kim.donghyeon.ums.domain.User;

//데이터 처리항목들을 표현 (실제알고리즘은 마이바티스가만들어줌)
public interface UserMapper {
	List<User> getUsers();	//유저리스트를받음
	User getUser(int userId);	//user_id로 1명을받음
	int addUser(String userName);	//user데이타로 db에 로우를추가하고 성공건수를리턴
	int updateUser(User user); //user데이타로 db에pk값이같은로우를 수정하고 성공건수를 리턴
	int delUser(int userId); //user_id(pk)로 db에서 그로우를 삭제하고 성공건수를 리턴
}