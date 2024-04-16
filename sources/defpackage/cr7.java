package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: Parser.java */
/* renamed from: cr7  reason: default package */
/* loaded from: classes3.dex */
public class cr7 {
    private final List<ed0> a;
    private final List<mu2> b;
    private final h35 c;
    private final List<bg8> d;

    /* compiled from: Parser.java */
    /* renamed from: cr7$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final List<ed0> a = new ArrayList();
        private final List<mu2> b = new ArrayList();
        private final List<bg8> c = new ArrayList();
        private Set<Class<? extends wc0>> d = n53.s();
        private h35 e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Parser.java */
        /* renamed from: cr7$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0275a implements h35 {
            C0275a() {
            }

            @Override // defpackage.h35
            public e35 a(f35 f35Var) {
                return new i35(f35Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h35 i() {
            h35 h35Var = this.e;
            if (h35Var != null) {
                return h35Var;
            }
            return new C0275a();
        }

        public cr7 f() {
            return new cr7(this);
        }

        public a g(mu2 mu2Var) {
            if (mu2Var != null) {
                this.b.add(mu2Var);
                return this;
            }
            throw new NullPointerException("delimiterProcessor must not be null");
        }

        public a h(Iterable<? extends pn3> iterable) {
            if (iterable != null) {
                for (pn3 pn3Var : iterable) {
                    if (pn3Var instanceof c) {
                        ((c) pn3Var).a(this);
                    }
                }
                return this;
            }
            throw new NullPointerException("extensions must not be null");
        }
    }

    /* compiled from: Parser.java */
    /* renamed from: cr7$c */
    /* loaded from: classes3.dex */
    public interface c extends pn3 {
        void a(a aVar);
    }

    private n53 a() {
        return new n53(this.a, this.c, this.b);
    }

    private jz6 c(jz6 jz6Var) {
        for (bg8 bg8Var : this.d) {
            jz6Var = bg8Var.a(jz6Var);
        }
        return jz6Var;
    }

    public jz6 b(String str) {
        if (str != null) {
            return c(a().u(str));
        }
        throw new NullPointerException("input must not be null");
    }

    private cr7(a aVar) {
        this.a = n53.l(aVar.a, aVar.d);
        h35 i = aVar.i();
        this.c = i;
        this.d = aVar.c;
        List<mu2> list = aVar.b;
        this.b = list;
        i.a(new g35(list, Collections.emptyMap()));
    }
}
