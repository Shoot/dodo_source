package defpackage;

import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.w86;
import defpackage.xw1;
import defpackage.z86;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CorePlugin.java */
/* renamed from: ww1  reason: default package */
/* loaded from: classes3.dex */
public class ww1 extends s1 {
    private final List<p> a = new ArrayList(0);
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$a */
    /* loaded from: classes3.dex */
    public class a implements z86.c<odb> {
        a() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull odb odbVar) {
            z86Var.F(odbVar);
            int length = z86Var.length();
            z86Var.f().append((char) 160);
            z86Var.v(odbVar, length);
            z86Var.j(odbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$b */
    /* loaded from: classes3.dex */
    public class b implements z86.c<kn4> {
        b() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull kn4 kn4Var) {
            z86Var.F(kn4Var);
            int length = z86Var.length();
            z86Var.n(kn4Var);
            xw1.d.e(z86Var.q(), Integer.valueOf(kn4Var.n()));
            z86Var.v(kn4Var, length);
            z86Var.j(kn4Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$c */
    /* loaded from: classes3.dex */
    public class c implements z86.c<hqa> {
        c() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull hqa hqaVar) {
            z86Var.f().append(' ');
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$d */
    /* loaded from: classes3.dex */
    public class d implements z86.c<wm4> {
        d() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull wm4 wm4Var) {
            z86Var.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$e */
    /* loaded from: classes3.dex */
    public class e implements z86.c<aq7> {
        e() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull aq7 aq7Var) {
            boolean o = ww1.o(aq7Var);
            if (!o) {
                z86Var.F(aq7Var);
            }
            int length = z86Var.length();
            z86Var.n(aq7Var);
            xw1.f.e(z86Var.q(), Boolean.valueOf(o));
            z86Var.v(aq7Var, length);
            if (!o) {
                z86Var.j(aq7Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$f */
    /* loaded from: classes3.dex */
    public class f implements z86.c<iq5> {
        f() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull iq5 iq5Var) {
            int length = z86Var.length();
            z86Var.n(iq5Var);
            xw1.e.e(z86Var.q(), iq5Var.m());
            z86Var.v(iq5Var, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$g */
    /* loaded from: classes3.dex */
    public class g implements z86.c<g9b> {
        g() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull g9b g9bVar) {
            String m = g9bVar.m();
            z86Var.f().d(m);
            if (!ww1.this.a.isEmpty()) {
                int length = z86Var.length() - m.length();
                for (p pVar : ww1.this.a) {
                    pVar.onTextAdded(z86Var, m, length);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$h */
    /* loaded from: classes3.dex */
    public class h implements z86.c<t0b> {
        h() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull t0b t0bVar) {
            int length = z86Var.length();
            z86Var.n(t0bVar);
            z86Var.v(t0bVar, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$i */
    /* loaded from: classes3.dex */
    public class i implements z86.c<zf3> {
        i() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull zf3 zf3Var) {
            int length = z86Var.length();
            z86Var.n(zf3Var);
            z86Var.v(zf3Var, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$j */
    /* loaded from: classes3.dex */
    public class j implements z86.c<fd0> {
        j() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull fd0 fd0Var) {
            z86Var.F(fd0Var);
            int length = z86Var.length();
            z86Var.n(fd0Var);
            z86Var.v(fd0Var, length);
            z86Var.j(fd0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$k */
    /* loaded from: classes3.dex */
    public class k implements z86.c<ma1> {
        k() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull ma1 ma1Var) {
            int length = z86Var.length();
            z86Var.f().append((char) 160).d(ma1Var.m()).append((char) 160);
            z86Var.v(ma1Var, length);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$l */
    /* loaded from: classes3.dex */
    public class l implements z86.c<cs3> {
        l() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull cs3 cs3Var) {
            ww1.y(z86Var, cs3Var.q(), cs3Var.r(), cs3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$m */
    /* loaded from: classes3.dex */
    public class m implements z86.c<h05> {
        m() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull h05 h05Var) {
            ww1.y(z86Var, null, h05Var.n(), h05Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$n */
    /* loaded from: classes3.dex */
    public class n implements z86.c<bu4> {
        n() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull bu4 bu4Var) {
            tqa a = z86Var.x().e().a(bu4.class);
            if (a == null) {
                z86Var.n(bu4Var);
                return;
            }
            int length = z86Var.length();
            z86Var.n(bu4Var);
            if (length == z86Var.length()) {
                z86Var.f().append((char) 65532);
            }
            s86 x = z86Var.x();
            String b = x.b().b(bu4Var.m());
            dg9 q = z86Var.q();
            kv4.a.e(q, b);
            kv4.b.e(q, Boolean.valueOf(bu4Var.f() instanceof iq5));
            kv4.c.e(q, null);
            z86Var.g(length, a.a(x, q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$o */
    /* loaded from: classes3.dex */
    public class o implements z86.c<ar5> {
        o() {
        }

        @Override // defpackage.z86.c
        /* renamed from: b */
        public void a(@NonNull z86 z86Var, @NonNull ar5 ar5Var) {
            int length = z86Var.length();
            z86Var.n(ar5Var);
            wc0 f = ar5Var.f();
            if (f instanceof yl7) {
                yl7 yl7Var = (yl7) f;
                int q = yl7Var.q();
                xw1.a.e(z86Var.q(), xw1.a.ORDERED);
                xw1.c.e(z86Var.q(), Integer.valueOf(q));
                yl7Var.s(yl7Var.q() + 1);
            } else {
                xw1.a.e(z86Var.q(), xw1.a.BULLET);
                xw1.b.e(z86Var.q(), Integer.valueOf(ww1.r(ar5Var)));
            }
            z86Var.v(ar5Var, length);
            if (z86Var.s(ar5Var)) {
                z86Var.C();
            }
        }
    }

    /* compiled from: CorePlugin.java */
    /* renamed from: ww1$p */
    /* loaded from: classes3.dex */
    public interface p {
        void onTextAdded(@NonNull z86 z86Var, @NonNull String str, int i);
    }

    protected ww1() {
    }

    private static void e(@NonNull z86.b bVar) {
        bVar.b(fd0.class, new j());
    }

    private static void f(@NonNull z86.b bVar) {
        bVar.b(th0.class, new zka());
    }

    private static void g(@NonNull z86.b bVar) {
        bVar.b(ma1.class, new k());
    }

    @NonNull
    public static ww1 h() {
        return new ww1();
    }

    private static void i(@NonNull z86.b bVar) {
        bVar.b(zf3.class, new i());
    }

    private static void j(@NonNull z86.b bVar) {
        bVar.b(cs3.class, new l());
    }

    private static void k(@NonNull z86.b bVar) {
        bVar.b(wm4.class, new d());
    }

    private static void l(@NonNull z86.b bVar) {
        bVar.b(kn4.class, new b());
    }

    private static void m(z86.b bVar) {
        bVar.b(bu4.class, new n());
    }

    private static void n(@NonNull z86.b bVar) {
        bVar.b(h05.class, new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(@NonNull aq7 aq7Var) {
        wc0 f2 = aq7Var.f();
        if (f2 != null) {
            jz6 f3 = f2.f();
            if (f3 instanceof vq5) {
                return ((vq5) f3).n();
            }
            return false;
        }
        return false;
    }

    private static void p(@NonNull z86.b bVar) {
        bVar.b(iq5.class, new f());
    }

    private static void q(@NonNull z86.b bVar) {
        bVar.b(ar5.class, new o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(@NonNull jz6 jz6Var) {
        int i2 = 0;
        for (jz6 f2 = jz6Var.f(); f2 != null; f2 = f2.f()) {
            if (f2 instanceof ar5) {
                i2++;
            }
        }
        return i2;
    }

    private static void s(@NonNull z86.b bVar) {
        bVar.b(yl7.class, new zka());
    }

    private static void t(@NonNull z86.b bVar) {
        bVar.b(aq7.class, new e());
    }

    private static void u(@NonNull z86.b bVar) {
        bVar.b(hqa.class, new c());
    }

    private static void v(@NonNull z86.b bVar) {
        bVar.b(t0b.class, new h());
    }

    private void w(@NonNull z86.b bVar) {
        bVar.b(g9b.class, new g());
    }

    private static void x(@NonNull z86.b bVar) {
        bVar.b(odb.class, new a());
    }

    static void y(@NonNull z86 z86Var, String str, @NonNull String str2, @NonNull jz6 jz6Var) {
        z86Var.F(jz6Var);
        int length = z86Var.length();
        z86Var.f().append((char) 160).append('\n').append(z86Var.x().f().a(str, str2));
        z86Var.C();
        z86Var.f().append((char) 160);
        xw1.g.e(z86Var.q(), str);
        z86Var.v(jz6Var, length);
        z86Var.j(jz6Var);
    }

    @Override // defpackage.s1
    public void afterSetText(@NonNull TextView textView) {
        if (!this.b && textView.getMovementMethod() == null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // defpackage.s1
    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
        zl7.a(textView, spanned);
        if (spanned instanceof Spannable) {
            idb.a((Spannable) spanned, textView);
        }
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureSpansFactory(@NonNull w86.a aVar) {
        oa1 oa1Var = new oa1();
        aVar.b(t0b.class, new v0b()).b(zf3.class, new cg3()).b(fd0.class, new id0()).b(ma1.class, new qa1()).b(cs3.class, oa1Var).b(h05.class, oa1Var).b(ar5.class, new cr5()).b(kn4.class, new nn4()).b(iq5.class, new pq5()).b(odb.class, new rdb());
    }

    @Override // defpackage.s1, defpackage.v86
    public void configureVisitor(@NonNull z86.b bVar) {
        w(bVar);
        v(bVar);
        i(bVar);
        e(bVar);
        g(bVar);
        j(bVar);
        n(bVar);
        m(bVar);
        f(bVar);
        s(bVar);
        q(bVar);
        x(bVar);
        l(bVar);
        u(bVar);
        k(bVar);
        t(bVar);
        p(bVar);
    }

    @NonNull
    public ww1 d(@NonNull p pVar) {
        this.a.add(pVar);
        return this;
    }
}
