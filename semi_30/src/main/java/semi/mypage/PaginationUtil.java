package semi.mypage;

public class PaginationUtil {

	public static int paginationStart(int pageNumber, int pageSize) {
		return (pageNumber - 1) * pageSize + 1;
	}
	
	public static int paginationEnd(int pageNumber, int pageSize) {
		return pageNumber * pageSize;
	}
	
	public static int paginationTotalPages(int totalItems, int pageSize) {
		return (int) Math.ceil((double)totalItems / pageSize);
	}
}
