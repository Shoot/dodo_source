package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: Cache.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: Cache.java */
    /* renamed from: com.android.volley.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0093a {
        public byte[] a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();
        public List<en4> h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(long j) {
            if (this.e < j) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(long j) {
            if (this.f < j) {
                return true;
            }
            return false;
        }
    }

    void a(String str, boolean z);

    void b(String str, C0093a c0093a);

    C0093a get(String str);

    void initialize();
}
