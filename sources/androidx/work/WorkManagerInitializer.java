package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements y25<h7c> {
    private static final String a = nx5.f("WrkMgrInitializer");

    @Override // defpackage.y25
    @NonNull
    public List<Class<? extends y25<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.y25
    @NonNull
    /* renamed from: c */
    public h7c b(@NonNull Context context) {
        nx5.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        h7c.j(context, new a.b().a());
        return h7c.i(context);
    }
}
