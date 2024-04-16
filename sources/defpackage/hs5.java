package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.uk2;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: LocalUriFetcher.java */
/* renamed from: hs5  reason: default package */
/* loaded from: classes.dex */
public abstract class hs5<T> implements uk2<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    public hs5(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.uk2
    public void b() {
        T t = this.c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t) throws IOException;

    @Override // defpackage.uk2
    public final void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super T> aVar) {
        try {
            T f = f(this.a, this.b);
            this.c = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.uk2
    @NonNull
    public dl2 e() {
        return dl2.LOCAL;
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // defpackage.uk2
    public void cancel() {
    }
}
