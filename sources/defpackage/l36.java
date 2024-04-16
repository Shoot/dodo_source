package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import defpackage.tc6;
/* compiled from: LruResourceCache.java */
/* renamed from: l36  reason: default package */
/* loaded from: classes.dex */
public class l36 extends i36<se5, nj9<?>> implements tc6 {
    private tc6.a e;

    public l36(long j) {
        super(j);
    }

    @Override // defpackage.tc6
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            m(h() / 2);
        }
    }

    @Override // defpackage.tc6
    public /* bridge */ /* synthetic */ nj9 c(@NonNull se5 se5Var) {
        return (nj9) super.l(se5Var);
    }

    @Override // defpackage.tc6
    public void d(@NonNull tc6.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.tc6
    public /* bridge */ /* synthetic */ nj9 e(@NonNull se5 se5Var, nj9 nj9Var) {
        return (nj9) super.k(se5Var, nj9Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.i36
    /* renamed from: n */
    public int i(nj9<?> nj9Var) {
        if (nj9Var == null) {
            return super.i(null);
        }
        return nj9Var.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.i36
    /* renamed from: o */
    public void j(@NonNull se5 se5Var, nj9<?> nj9Var) {
        tc6.a aVar = this.e;
        if (aVar != null && nj9Var != null) {
            aVar.c(nj9Var);
        }
    }
}
