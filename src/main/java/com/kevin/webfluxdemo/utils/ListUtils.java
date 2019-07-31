package com.kevin.webfluxdemo.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static <T> List pagingList(List<T> list, int start, int num) {
        if (list == null || list.size() < 1) {
            return null;
        }
        int size = list.size();
        if (start < 1) {
            start = 1;
        }
        List<T> subList = new ArrayList<>();
        if (size / num == 0) {
            if (start <= size) {
                subList = list.subList(start - 1, size);
            }
        } else if (size / num > 0) {
            if (size >= start + num) {
                subList = list.subList(start - 1, start + num - 1);
            } else if (start <= size) {
                subList = list.subList(start - 1, size);
            }
        }

        return subList;
    }

}
