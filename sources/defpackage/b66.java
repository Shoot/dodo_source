package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: MapBackedMetadataContainer.java */
/* renamed from: b66  reason: default package */
/* loaded from: classes.dex */
final class b66<T> implements pi6 {
    private final ConcurrentMap<T, com.google.i18n.phonenumbers.c> a = new ConcurrentHashMap();
    private final c<T> b;

    /* compiled from: MapBackedMetadataContainer.java */
    /* renamed from: b66$a */
    /* loaded from: classes.dex */
    class a implements c<String> {
        a() {
        }

        @Override // defpackage.b66.c
        /* renamed from: b */
        public String a(com.google.i18n.phonenumbers.c cVar) {
            return cVar.getId();
        }
    }

    /* compiled from: MapBackedMetadataContainer.java */
    /* renamed from: b66$b */
    /* loaded from: classes.dex */
    class b implements c<Integer> {
        b() {
        }

        @Override // defpackage.b66.c
        /* renamed from: b */
        public Integer a(com.google.i18n.phonenumbers.c cVar) {
            return Integer.valueOf(cVar.a());
        }
    }

    /* compiled from: MapBackedMetadataContainer.java */
    /* renamed from: b66$c */
    /* loaded from: classes.dex */
    interface c<T> {
        T a(com.google.i18n.phonenumbers.c cVar);
    }

    private b66(c<T> cVar) {
        this.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b66<Integer> b() {
        return new b66<>(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b66<String> c() {
        return new b66<>(new a());
    }

    @Override // defpackage.pi6
    public void a(com.google.i18n.phonenumbers.c cVar) {
        this.a.put(this.b.a(cVar), cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<T> d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.i18n.phonenumbers.c e(T t) {
        if (t != null) {
            return this.a.get(t);
        }
        return null;
    }
}
