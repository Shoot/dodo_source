package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
/* renamed from: jc  reason: default package */
/* loaded from: classes2.dex */
public interface jc {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    /* renamed from: jc$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    /* renamed from: jc$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, Bundle bundle);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    /* renamed from: jc$c */
    /* loaded from: classes2.dex */
    public static class c {
        @NonNull
        public String a;
        @NonNull
        public String b;
        public Object c;
        public String d;
        public long e;
        public String f;
        public Bundle g;
        public String h;
        public Bundle i;
        public long j;
        public String k;
        public Bundle l;
        public long m;
        public boolean n;
        public long o;
    }

    void a(@NonNull c cVar);

    void b(@NonNull String str, @NonNull String str2, Bundle bundle);

    void c(@NonNull String str, @NonNull String str2, @NonNull Object obj);

    void clearConditionalUserProperty(@NonNull String str, String str2, Bundle bundle);

    @NonNull
    Map<String, Object> d(boolean z);

    a e(@NonNull String str, @NonNull b bVar);

    int f(@NonNull String str);

    @NonNull
    List<c> g(@NonNull String str, String str2);
}
