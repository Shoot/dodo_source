package defpackage;

import androidx.annotation.NonNull;
/* compiled from: InputMergerFactory.java */
/* renamed from: q35  reason: default package */
/* loaded from: classes.dex */
public abstract class q35 {

    /* compiled from: InputMergerFactory.java */
    /* renamed from: q35$a */
    /* loaded from: classes.dex */
    class a extends q35 {
        a() {
        }

        @Override // defpackage.q35
        public p35 a(@NonNull String str) {
            return null;
        }
    }

    @NonNull
    public static q35 c() {
        return new a();
    }

    public abstract p35 a(@NonNull String str);

    public final p35 b(@NonNull String str) {
        p35 a2 = a(str);
        if (a2 == null) {
            return p35.a(str);
        }
        return a2;
    }
}
