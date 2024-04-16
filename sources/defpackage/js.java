package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.uk2;
import java.io.IOException;
/* compiled from: AssetPathFetcher.java */
/* renamed from: js  reason: default package */
/* loaded from: classes.dex */
public abstract class js<T> implements uk2<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    public js(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.uk2
    public void b() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // defpackage.uk2
    public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super T> aVar) {
        try {
            T f = f(this.b, this.a);
            this.c = f;
            aVar.f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.uk2
    @NonNull
    public dl2 e() {
        return dl2.LOCAL;
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // defpackage.uk2
    public void cancel() {
    }
}
