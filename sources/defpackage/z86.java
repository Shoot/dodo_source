package defpackage;

import androidx.annotation.NonNull;
/* compiled from: MarkwonVisitor.java */
/* renamed from: z86  reason: default package */
/* loaded from: classes3.dex */
public interface z86 extends w1c {

    /* compiled from: MarkwonVisitor.java */
    /* renamed from: z86$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NonNull z86 z86Var, @NonNull jz6 jz6Var);

        void b(@NonNull z86 z86Var, @NonNull jz6 jz6Var);
    }

    /* compiled from: MarkwonVisitor.java */
    /* renamed from: z86$b */
    /* loaded from: classes3.dex */
    public interface b {
        @NonNull
        z86 a(@NonNull s86 s86Var, @NonNull dg9 dg9Var);

        @NonNull
        <N extends jz6> b b(@NonNull Class<N> cls, c<? super N> cVar);
    }

    /* compiled from: MarkwonVisitor.java */
    /* renamed from: z86$c */
    /* loaded from: classes3.dex */
    public interface c<N extends jz6> {
        void a(@NonNull z86 z86Var, @NonNull N n);
    }

    void C();

    void F(@NonNull jz6 jz6Var);

    @NonNull
    zqa f();

    void g(int i, Object obj);

    void j(@NonNull jz6 jz6Var);

    int length();

    void n(@NonNull jz6 jz6Var);

    @NonNull
    dg9 q();

    boolean s(@NonNull jz6 jz6Var);

    <N extends jz6> void v(@NonNull N n, int i);

    @NonNull
    s86 x();

    void z();
}
