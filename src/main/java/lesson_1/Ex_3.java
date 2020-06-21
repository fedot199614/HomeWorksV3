package lesson_1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex_3 {

public Collection getDuplicates(List<String> list) {
    List<String> getDuplicates = list.stream().filter(i -> Collections.frequency(list, i) > 1)
            .collect(Collectors.toList());
    getDuplicates.stream().forEach(System.out::println);
    return getDuplicates;
}
public Collection getUniqueValues(List<String> list) {
        Set<String> getUniqueValues = list.stream().distinct().collect(Collectors.toSet());
        getUniqueValues.stream().forEach(System.out::println);
        return getUniqueValues;
}
}
