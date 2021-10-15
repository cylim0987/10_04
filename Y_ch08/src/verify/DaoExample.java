/*4. Diaotsample 클래스의 main() 메소드에서 lb Work () 메소드를 호출할 때 OracleDao
와 MySqlDao 객체를 매개값으로 주고 호출했습니다. lb work () 메소드는 두 객체를 모두 매
개값으로 받기 위해 DataAccessObject 타입의 매개 변수를 가지고 있습니다. 실행 결과를 보고
DatalAccessObject 인터페이스와 OracleDav, MySqlDao 구현 클래스를 각각 작성해보세요.

Console값 :
Oracle DB에서 검색
Oracle DB 에 삽입
Oracle DB를 수정
Oracle DB에서 삭제
Mysql DB에서 검색
Mysql DB 에 삽입
Mysql DB 를 수정
Mysql DB에서 삭제
*/

package verify;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}

	public static void main(String[] args) {
		dbWork (new OracleDao());
		dbWork (new MySqlDao());
}
}