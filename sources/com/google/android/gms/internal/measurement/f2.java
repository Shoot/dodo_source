package com.google.android.gms.internal.measurement;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class f2<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, q2d> a;

    public final q2d a() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        return q2d.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof h3d) {
            return this.a.getValue().a((h3d) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private f2(Map.Entry<K, q2d> entry) {
        this.a = entry;
    }
}
