package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: MultiTransformation.java */
/* renamed from: aq6  reason: default package */
/* loaded from: classes.dex */
public class aq6<T> implements tkb<T> {
    private final Collection<? extends tkb<T>> b;

    @SafeVarargs
    public aq6(@NonNull tkb<T>... tkbVarArr) {
        if (tkbVarArr.length != 0) {
            this.b = Arrays.asList(tkbVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // defpackage.tkb
    @NonNull
    public nj9<T> a(@NonNull Context context, @NonNull nj9<T> nj9Var, int i, int i2) {
        nj9<T> nj9Var2 = nj9Var;
        for (tkb<T> tkbVar : this.b) {
            nj9<T> a = tkbVar.a(context, nj9Var2, i, i2);
            if (nj9Var2 != null && !nj9Var2.equals(nj9Var) && !nj9Var2.equals(a)) {
                nj9Var2.b();
            }
            nj9Var2 = a;
        }
        return nj9Var2;
    }

    @Override // defpackage.se5
    public void b(@NonNull MessageDigest messageDigest) {
        for (tkb<T> tkbVar : this.b) {
            tkbVar.b(messageDigest);
        }
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if (obj instanceof aq6) {
            return this.b.equals(((aq6) obj).b);
        }
        return false;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return this.b.hashCode();
    }
}
