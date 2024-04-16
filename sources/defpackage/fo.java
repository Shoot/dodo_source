package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: fo  reason: default package */
/* loaded from: classes2.dex */
public class fo {
    private final jvc a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    /* renamed from: fo$a */
    /* loaded from: classes2.dex */
    public interface a extends h1d {
    }

    public fo(jvc jvcVar) {
        this.a = jvcVar;
    }

    public void a(@NonNull String str, String str2, Bundle bundle) {
        this.a.n(str, str2, bundle);
    }

    @NonNull
    public List<Bundle> b(String str, String str2) {
        return this.a.c(str, str2);
    }

    public int c(@NonNull String str) {
        return this.a.a(str);
    }

    @NonNull
    public Map<String, Object> d(String str, String str2, boolean z) {
        return this.a.d(str, str2, z);
    }

    public void e(@NonNull String str, @NonNull String str2, Bundle bundle) {
        this.a.A(str, str2, bundle);
    }

    public void f(@NonNull a aVar) {
        this.a.u(aVar);
    }

    public void g(@NonNull Bundle bundle) {
        this.a.k(bundle);
    }

    public void h(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.a.p(str, str2, obj, true);
    }

    public final void i(boolean z) {
        this.a.v(z);
    }
}
