package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.q86;
import java.util.List;
/* compiled from: MarkwonImpl.java */
/* renamed from: t86  reason: default package */
/* loaded from: classes3.dex */
class t86 extends q86 {
    private final TextView.BufferType a;
    private final cr7 b;
    private final a96 c;
    private final s86 d;
    private final List<v86> e;
    private final boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t86(@NonNull TextView.BufferType bufferType, q86.b bVar, @NonNull cr7 cr7Var, @NonNull a96 a96Var, @NonNull s86 s86Var, @NonNull List<v86> list, boolean z) {
        this.a = bufferType;
        this.b = cr7Var;
        this.c = a96Var;
        this.d = s86Var;
        this.e = list;
        this.f = z;
    }

    @Override // defpackage.q86
    @NonNull
    public Spanned b(@NonNull String str) {
        Spanned d = d(c(str));
        if (TextUtils.isEmpty(d) && this.f && !TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(str);
        }
        return d;
    }

    @NonNull
    public jz6 c(@NonNull String str) {
        for (v86 v86Var : this.e) {
            str = v86Var.processMarkdown(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned d(@NonNull jz6 jz6Var) {
        for (v86 v86Var : this.e) {
            v86Var.beforeRender(jz6Var);
        }
        z86 a = this.c.a();
        jz6Var.a(a);
        for (v86 v86Var2 : this.e) {
            v86Var2.afterRender(jz6Var, a);
        }
        return a.f().l();
    }
}
