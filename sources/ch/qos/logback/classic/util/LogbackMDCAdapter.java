package ch.qos.logback.classic.util;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;
/* loaded from: classes.dex */
public final class LogbackMDCAdapter implements MDCAdapter {
    private static final int MAP_COPY_OPERATION = 2;
    private static final int WRITE_OPERATION = 1;
    final ThreadLocal<Map<String, String>> copyOnThreadLocal = new ThreadLocal<>();
    final ThreadLocal<Integer> lastOperation = new ThreadLocal<>();

    private Map<String, String> duplicateAndInsertNewMap(Map<String, String> map) {
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.copyOnThreadLocal.set(synchronizedMap);
        return synchronizedMap;
    }

    private Integer getAndSetLastOperation(int i) {
        Integer num = this.lastOperation.get();
        this.lastOperation.set(Integer.valueOf(i));
        return num;
    }

    private boolean wasLastOpReadOrNull(Integer num) {
        if (num != null && num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        this.lastOperation.set(1);
        this.copyOnThreadLocal.remove();
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clearDequeByKey(String str) {
        put(str, null);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        Map<String, String> map = this.copyOnThreadLocal.get();
        if (map != null && str != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map<String, String> getCopyOfContextMap() {
        Map<String, String> map = this.copyOnThreadLocal.get();
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Deque<String> getCopyOfDequeByKey(String str) {
        if (get(str) == null) {
            return null;
        }
        return new ArrayDeque(Collections.singletonList(get(str)));
    }

    public Set<String> getKeys() {
        Map<String, String> propertyMap = getPropertyMap();
        if (propertyMap != null) {
            return propertyMap.keySet();
        }
        return null;
    }

    public Map<String, String> getPropertyMap() {
        this.lastOperation.set(2);
        return this.copyOnThreadLocal.get();
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String popByKey(String str) {
        return get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void pushByKey(String str, String str2) {
        put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) throws IllegalArgumentException {
        if (str != null) {
            Map<String, String> map = this.copyOnThreadLocal.get();
            if (wasLastOpReadOrNull(getAndSetLastOperation(1)) || map == null) {
                map = duplicateAndInsertNewMap(map);
            }
            map.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        Map<String, String> map;
        if (str == null || (map = this.copyOnThreadLocal.get()) == null) {
            return;
        }
        if (wasLastOpReadOrNull(getAndSetLastOperation(1))) {
            map = duplicateAndInsertNewMap(map);
        }
        map.remove(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map<String, String> map) {
        this.lastOperation.set(1);
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.putAll(map);
        this.copyOnThreadLocal.set(synchronizedMap);
    }
}
