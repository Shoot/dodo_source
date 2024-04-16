package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: RegexCache.java */
/* renamed from: gc9  reason: default package */
/* loaded from: classes.dex */
public class gc9 {
    private a<String, Pattern> a;

    /* compiled from: RegexCache.java */
    /* renamed from: gc9$a */
    /* loaded from: classes.dex */
    private static class a<K, V> {
        private LinkedHashMap<K, V> a;
        private int b;

        /* compiled from: RegexCache.java */
        /* renamed from: gc9$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0325a extends LinkedHashMap<K, V> {
            C0325a(int i, float f, boolean z) {
                super(i, f, z);
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
                if (size() > a.this.b) {
                    return true;
                }
                return false;
            }
        }

        public a(int i) {
            this.b = i;
            this.a = new C0325a(((i * 4) / 3) + 1, 0.75f, true);
        }

        public synchronized V b(K k) {
            return this.a.get(k);
        }

        public synchronized void c(K k, V v) {
            this.a.put(k, v);
        }
    }

    public gc9(int i) {
        this.a = new a<>(i);
    }

    public Pattern a(String str) {
        Pattern b = this.a.b(str);
        if (b == null) {
            Pattern compile = Pattern.compile(str);
            this.a.c(str, compile);
            return compile;
        }
        return b;
    }
}
