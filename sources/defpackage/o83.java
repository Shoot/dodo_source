package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.i;
import defpackage.h83;
/* compiled from: DrawableTransitionOptions.java */
/* renamed from: o83  reason: default package */
/* loaded from: classes.dex */
public final class o83 extends i<o83, Drawable> {
    @NonNull
    public static o83 i() {
        return new o83().f();
    }

    @NonNull
    public static o83 j(@NonNull h83 h83Var) {
        return new o83().h(h83Var);
    }

    @Override // com.bumptech.glide.i
    public boolean equals(Object obj) {
        if ((obj instanceof o83) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @NonNull
    public o83 f() {
        return g(new h83.a());
    }

    @NonNull
    public o83 g(@NonNull h83.a aVar) {
        return h(aVar.a());
    }

    @NonNull
    public o83 h(@NonNull h83 h83Var) {
        return e(h83Var);
    }

    @Override // com.bumptech.glide.i
    public int hashCode() {
        return super.hashCode();
    }
}
