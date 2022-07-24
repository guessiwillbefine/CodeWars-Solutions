package solution;
import java.util.List;
public class PaginationHelper<I> {
    private final int itemsPerPage;
    private final List<I> collection;
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        this.collection = collection;
    }
    public int itemCount() {
        return collection.size();
    }
    public int pageCount() {
        if (collection.size() % itemsPerPage == 0)
            return collection.size() / itemsPerPage;
        return collection.size() / itemsPerPage + 1;
    }
    public int pageItemCount(int pageIndex) {
        int c = pageCount();
        if(pageIndex < 0 || pageIndex >= c) return -1;
        if(pageIndex == c-1)
            return itemCount()%itemsPerPage;
        else
            return itemsPerPage;
    }
    public int pageIndex(int itemIndex) {
        if (itemIndex > itemCount())
            return -1;
        if (itemIndex < 0)
            return -1;
        int temp = itemsPerPage;
        for (int i = 0; i < itemCount(); i++){
            if (temp>itemIndex)
                return i;
            temp += itemsPerPage;
        }
        return -1;
    }
}