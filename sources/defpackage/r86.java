package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.b96;
import defpackage.cr7;
import defpackage.q86;
import defpackage.s86;
import defpackage.x86;
import defpackage.y86;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkwonBuilderImpl.java */
/* renamed from: r86  reason: default package */
/* loaded from: classes3.dex */
public class r86 implements q86.a {
    private final Context a;
    private final List<v86> b = new ArrayList(3);
    private TextView.BufferType c = TextView.BufferType.SPANNABLE;
    private boolean d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r86(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    private static List<v86> c(@NonNull List<v86> list) {
        return new mc9(list).e();
    }

    @Override // defpackage.q86.a
    @NonNull
    public q86 a() {
        if (!this.b.isEmpty()) {
            List<v86> c = c(this.b);
            cr7.a aVar = new cr7.a();
            y86.a j = y86.j(this.a);
            s86.b bVar = new s86.b();
            b96.a aVar2 = new b96.a();
            x86.a aVar3 = new x86.a();
            for (v86 v86Var : c) {
                v86Var.configureParser(aVar);
                v86Var.configureTheme(j);
                v86Var.configureConfiguration(bVar);
                v86Var.configureVisitor(aVar2);
                v86Var.configureSpansFactory(aVar3);
            }
            s86 i = bVar.i(j.A(), aVar3.a());
            return new t86(this.c, null, aVar.f(), a96.b(aVar2, i), i, Collections.unmodifiableList(c), this.d);
        }
        throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
    }

    @Override // defpackage.q86.a
    @NonNull
    public q86.a b(@NonNull v86 v86Var) {
        this.b.add(v86Var);
        return this;
    }
}
