package ch.qos.logback.classic.turbo;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
class LRUMessageCache extends LinkedHashMap<String, Integer> {
    private static final long serialVersionUID = 1;
    final int cacheSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LRUMessageCache(int i) {
        super((int) (i * 1.3333334f), 0.75f, true);
        if (i >= 1) {
            this.cacheSize = i;
            return;
        }
        throw new IllegalArgumentException("Cache size cannot be smaller than 1");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMessageCountAndThenIncrement(String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        synchronized (this) {
            try {
                Integer num = (Integer) super.get(str);
                if (num == null) {
                    valueOf = 0;
                } else {
                    valueOf = Integer.valueOf(num.intValue() + 1);
                }
                super.put(str, valueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
        return valueOf.intValue();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        if (size() > this.cacheSize) {
            return true;
        }
        return false;
    }
}
