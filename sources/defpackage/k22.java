package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
/* compiled from: CreationContext.java */
@AutoValue
/* renamed from: k22  reason: default package */
/* loaded from: classes2.dex */
public abstract class k22 {
    public static k22 a(Context context, x91 x91Var, x91 x91Var2, String str) {
        return new m20(context, x91Var, x91Var2, str);
    }

    public abstract Context b();

    @NonNull
    public abstract String c();

    public abstract x91 d();

    public abstract x91 e();
}
