package defpackage;

import androidx.annotation.NonNull;
import defpackage.z86;
/* compiled from: MarkwonVisitorFactory.java */
/* renamed from: a96  reason: default package */
/* loaded from: classes3.dex */
abstract class a96 {

    /* compiled from: MarkwonVisitorFactory.java */
    /* renamed from: a96$a */
    /* loaded from: classes3.dex */
    class a extends a96 {
        final /* synthetic */ z86.b a;
        final /* synthetic */ s86 b;

        a(z86.b bVar, s86 s86Var) {
            this.a = bVar;
            this.b = s86Var;
        }

        @Override // defpackage.a96
        @NonNull
        z86 a() {
            return this.a.a(this.b, new eg9());
        }
    }

    a96() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static a96 b(@NonNull z86.b bVar, @NonNull s86 s86Var) {
        return new a(bVar, s86Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract z86 a();
}
