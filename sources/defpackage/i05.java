package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: IndentedCodeBlockParser.java */
/* renamed from: i05  reason: default package */
/* loaded from: classes3.dex */
public class i05 extends x0 {
    private final h05 a = new h05();
    private final List<CharSequence> b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    /* renamed from: i05$a */
    /* loaded from: classes3.dex */
    public static class a extends y0 {
        @Override // defpackage.ed0
        public jd0 a(ir7 ir7Var, u96 u96Var) {
            if (ir7Var.d() >= jr7.a && !ir7Var.a() && !(ir7Var.f().e() instanceof aq7)) {
                return jd0.d(new i05()).a(ir7Var.c() + jr7.a);
            }
            return jd0.c();
        }
    }

    @Override // defpackage.dd0
    public wc0 e() {
        return this.a;
    }

    @Override // defpackage.x0, defpackage.dd0
    public void f(CharSequence charSequence) {
        this.b.add(charSequence);
    }

    @Override // defpackage.dd0
    public ad0 g(ir7 ir7Var) {
        if (ir7Var.d() >= jr7.a) {
            return ad0.a(ir7Var.c() + jr7.a);
        }
        if (ir7Var.a()) {
            return ad0.b(ir7Var.e());
        }
        return ad0.d();
    }

    @Override // defpackage.x0, defpackage.dd0
    public void h() {
        int size = this.b.size() - 1;
        while (size >= 0 && jr7.f(this.b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append(this.b.get(i));
            sb.append('\n');
        }
        this.a.o(sb.toString());
    }
}
