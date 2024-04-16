package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ContextAttributes.java */
/* renamed from: gu1  reason: default package */
/* loaded from: classes2.dex */
public abstract class gu1 {

    /* compiled from: ContextAttributes.java */
    /* renamed from: gu1$a */
    /* loaded from: classes2.dex */
    public static class a extends gu1 implements Serializable {
        protected static final a c = new a(Collections.emptyMap());
        protected static final Object d = new Object();
        protected final Map<?, ?> a;
        protected transient Map<Object, Object> b;

        protected a(Map<?, ?> map) {
            this.a = map;
            this.b = null;
        }

        public static gu1 b() {
            return c;
        }

        @Override // defpackage.gu1
        public Object a(Object obj) {
            Object obj2;
            Map<Object, Object> map = this.b;
            if (map != null && (obj2 = map.get(obj)) != null) {
                if (obj2 == d) {
                    return null;
                }
                return obj2;
            }
            return this.a.get(obj);
        }

        @Override // defpackage.gu1
        public gu1 c(Object obj, Object obj2) {
            if (obj2 == null) {
                if (this.a.containsKey(obj)) {
                    obj2 = d;
                } else {
                    Map<Object, Object> map = this.b;
                    if (map != null && map.containsKey(obj)) {
                        this.b.remove(obj);
                    }
                    return this;
                }
            }
            Map<Object, Object> map2 = this.b;
            if (map2 == null) {
                return d(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected gu1 d(Object obj, Object obj2) {
            HashMap hashMap = new HashMap();
            if (obj2 == null) {
                obj2 = d;
            }
            hashMap.put(obj, obj2);
            return new a(this.a, hashMap);
        }

        protected a(Map<?, ?> map, Map<Object, Object> map2) {
            this.a = map;
            this.b = map2;
        }
    }

    public static gu1 b() {
        return a.b();
    }

    public abstract Object a(Object obj);

    public abstract gu1 c(Object obj, Object obj2);
}
