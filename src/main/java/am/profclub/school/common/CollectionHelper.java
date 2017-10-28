package am.profclub.school.common;

import java.util.List;

public class CollectionHelper {

    public static boolean isEmpty(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static boolean isNotEmpty(List<?> list) {
        return !isEmpty(list);
    }
}
