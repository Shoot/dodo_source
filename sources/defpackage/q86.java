package defpackage;

import android.content.Context;
import android.text.Spanned;
import androidx.annotation.NonNull;
/* compiled from: Markwon.java */
/* renamed from: q86  reason: default package */
/* loaded from: classes3.dex */
public abstract class q86 {

    /* compiled from: Markwon.java */
    /* renamed from: q86$a */
    /* loaded from: classes3.dex */
    public interface a {
        @NonNull
        q86 a();

        @NonNull
        a b(@NonNull v86 v86Var);
    }

    /* compiled from: Markwon.java */
    /* renamed from: q86$b */
    /* loaded from: classes3.dex */
    public interface b {
    }

    @NonNull
    public static a a(@NonNull Context context) {
        return new r86(context).b(ww1.h());
    }

    @NonNull
    public abstract Spanned b(@NonNull String str);
}
