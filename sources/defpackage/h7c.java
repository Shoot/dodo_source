package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* renamed from: h7c  reason: default package */
/* loaded from: classes.dex */
public abstract class h7c {
    @NonNull
    @Deprecated
    public static h7c h() {
        j7c o = j7c.o();
        if (o != null) {
            return o;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    @NonNull
    public static h7c i(@NonNull Context context) {
        return j7c.p(context);
    }

    public static void j(@NonNull Context context, @NonNull a aVar) {
        j7c.j(context, aVar);
    }

    @NonNull
    public final w6c a(@NonNull String str, @NonNull ym3 ym3Var, @NonNull aa7 aa7Var) {
        return b(str, ym3Var, Collections.singletonList(aa7Var));
    }

    @NonNull
    public abstract w6c b(@NonNull String str, @NonNull ym3 ym3Var, @NonNull List<aa7> list);

    @NonNull
    public abstract ua7 c(@NonNull String str);

    @NonNull
    public final ua7 d(@NonNull s7c s7cVar) {
        return e(Collections.singletonList(s7cVar));
    }

    @NonNull
    public abstract ua7 e(@NonNull List<? extends s7c> list);

    @NonNull
    public ua7 f(@NonNull String str, @NonNull ym3 ym3Var, @NonNull aa7 aa7Var) {
        return g(str, ym3Var, Collections.singletonList(aa7Var));
    }

    @NonNull
    public abstract ua7 g(@NonNull String str, @NonNull ym3 ym3Var, @NonNull List<aa7> list);
}
