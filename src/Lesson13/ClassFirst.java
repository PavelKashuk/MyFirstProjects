package Lesson13;

import java.util.*;

public class ClassFirst {
    private List<String> ListClassFirst = new ArrayList<>();
    private Set<String> SetClassFirst = new HashSet<>();
    private Map<String, Double> MapClassFirst = new HashMap<>();

    public List<String> getListClassFirst() {
        return ListClassFirst;
    }
    public void setListClassFirst(List<String> listClassFirst) {
        ListClassFirst = listClassFirst;
    }
    public Set<String> getSetClassFirst() {
        return SetClassFirst;
    }
    public void setSetClassFirst(Set<String> setClassFirst) {
        SetClassFirst = setClassFirst;
    }
    public Map<String, Double> getMapClassFirst() {
        return MapClassFirst;
    }
    public void setMapClassFirst(Map<String, Double> mapClassFirst) {
        MapClassFirst = mapClassFirst;
    }
}
