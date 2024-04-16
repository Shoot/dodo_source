package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: LoaderManager.java */
/* renamed from: yr5  reason: default package */
/* loaded from: classes.dex */
public abstract class yr5 {

    /* compiled from: LoaderManager.java */
    /* renamed from: yr5$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        void a(@NonNull wr5<D> wr5Var);

        void b(@NonNull wr5<D> wr5Var, D d);

        @NonNull
        wr5<D> c(int i, Bundle bundle);
    }

    @NonNull
    public static <T extends op5 & vzb> yr5 b(@NonNull T t) {
        return new zr5(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract <D> wr5<D> c(int i, Bundle bundle, @NonNull a<D> aVar);

    public abstract void d();
}
