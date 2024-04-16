package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import defpackage.b77;
import defpackage.cm0;
import java.io.File;
import java.io.IOException;
/* compiled from: OkHttp3Downloader.java */
/* renamed from: a77  reason: default package */
/* loaded from: classes3.dex */
public final class a77 implements z63 {
    final cm0.a a;
    private final il0 b;
    private boolean c;

    public a77(Context context) {
        this(evb.f(context));
    }

    @Override // defpackage.z63
    @NonNull
    public ik9 a(@NonNull hi9 hi9Var) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.a.a(hi9Var));
    }

    public a77(File file) {
        this(file, evb.a(file));
    }

    public a77(File file, long j) {
        this(new b77.a().d(new il0(file, j)).c());
        this.c = false;
    }

    public a77(b77 b77Var) {
        this.c = true;
        this.a = b77Var;
        this.b = b77Var.f();
    }
}
