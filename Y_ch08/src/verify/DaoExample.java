/*4. Diaotsample Ŭ������ main() �޼ҵ忡�� lb Work () �޼ҵ带 ȣ���� �� OracleDao
�� MySqlDao ��ü�� �Ű������� �ְ� ȣ���߽��ϴ�. lb work () �޼ҵ�� �� ��ü�� ��� ��
�������� �ޱ� ���� DataAccessObject Ÿ���� �Ű� ������ ������ �ֽ��ϴ�. ���� ����� ����
DatalAccessObject �������̽��� OracleDav, MySqlDao ���� Ŭ������ ���� �ۼ��غ�����.

Console�� :
Oracle DB���� �˻�
Oracle DB �� ����
Oracle DB�� ����
Oracle DB���� ����
Mysql DB���� �˻�
Mysql DB �� ����
Mysql DB �� ����
Mysql DB���� ����
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