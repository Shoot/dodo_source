package defpackage;

import java.io.Reader;
import java.io.StringReader;
/* compiled from: Parser.java */
/* renamed from: fr7  reason: default package */
/* loaded from: classes3.dex */
public class fr7 {
    private pmb a;
    private br7 c;
    private boolean d = false;
    private ar7 b = ar7.w();

    public fr7(pmb pmbVar) {
        this.a = pmbVar;
        this.c = pmbVar.c();
    }

    public static fr7 b() {
        return new fr7(new xp4());
    }

    public static fr7 i() {
        return new fr7(new xbc());
    }

    public ar7 a() {
        return this.b;
    }

    public boolean c() {
        if (this.b.f() > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.d;
    }

    public h53 e(Reader reader, String str) {
        return this.a.h(reader, str, this);
    }

    public h53 f(String str, String str2) {
        return this.a.h(new StringReader(str), str2, this);
    }

    public br7 g() {
        return this.c;
    }

    public fr7 h(br7 br7Var) {
        this.c = br7Var;
        return this;
    }
}
