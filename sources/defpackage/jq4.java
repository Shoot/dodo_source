package defpackage;

import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.InputStream;
/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: jq4  reason: default package */
/* loaded from: classes.dex */
public class jq4 implements mm6<gg4, InputStream> {
    public static final mb7<Integer> b = mb7.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final lm6<gg4, gg4> a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: jq4$a */
    /* loaded from: classes.dex */
    public static class a implements nm6<gg4, InputStream> {
        private final lm6<gg4, gg4> a = new lm6<>(500);

        @Override // defpackage.nm6
        @NonNull
        public mm6<gg4, InputStream> d(qp6 qp6Var) {
            return new jq4(this.a);
        }
    }

    public jq4(lm6<gg4, gg4> lm6Var) {
        this.a = lm6Var;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<InputStream> b(@NonNull gg4 gg4Var, int i, int i2, @NonNull ac7 ac7Var) {
        lm6<gg4, gg4> lm6Var = this.a;
        if (lm6Var != null) {
            gg4 a2 = lm6Var.a(gg4Var, 0, 0);
            if (a2 == null) {
                this.a.b(gg4Var, 0, 0, gg4Var);
            } else {
                gg4Var = a2;
            }
        }
        return new mm6.a<>(gg4Var, new uq4(gg4Var, ((Integer) ac7Var.c(b)).intValue()));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull gg4 gg4Var) {
        return true;
    }
}
