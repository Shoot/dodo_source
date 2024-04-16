package defpackage;

import kotlin.Metadata;
/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0007"}, d2 = {"Ldea;", "", "", "sessionId", "", "b", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: dea  reason: default package */
/* loaded from: classes2.dex */
public interface dea {
    public static final a a = a.a;

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldea$a;", "", "Ldea;", "a", "()Ldea;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: dea$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final dea a() {
            Object j = hw3.a(kv3.a).j(dea.class);
            z65.g(j, "Firebase.app[SessionDatastore::class.java]");
            return (dea) j;
        }
    }

    String a();

    void b(String str);
}
