package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMapEntry.java */
/* renamed from: r1  reason: default package */
/* loaded from: classes2.dex */
public abstract class r1<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!n57.a(getKey(), entry.getKey()) || !n57.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        K key = getKey();
        V value = getValue();
        int i = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(valueOf2);
        return sb.toString();
    }
}
