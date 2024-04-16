package defpackage;

import defpackage.j4;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: BaseSettings.java */
/* renamed from: i80  reason: default package */
/* loaded from: classes2.dex */
public final class i80 implements Serializable {
    private static final TimeZone l = TimeZone.getTimeZone("UTC");
    protected final rnb a;
    protected final j81 b;
    protected final ql c;
    protected final wq8 d;
    protected final j4.a e;
    protected final aob<?> f;
    protected final se8 g;
    protected final DateFormat h;
    protected final Locale i;
    protected final TimeZone j;
    protected final v60 k;

    public i80(j81 j81Var, ql qlVar, wq8 wq8Var, rnb rnbVar, aob<?> aobVar, DateFormat dateFormat, im4 im4Var, Locale locale, TimeZone timeZone, v60 v60Var, se8 se8Var, j4.a aVar) {
        this.b = j81Var;
        this.c = qlVar;
        this.d = wq8Var;
        this.a = rnbVar;
        this.f = aobVar;
        this.h = dateFormat;
        this.i = locale;
        this.j = timeZone;
        this.k = v60Var;
        this.g = se8Var;
        this.e = aVar;
    }

    public j4.a a() {
        return this.e;
    }

    public ql b() {
        return this.c;
    }

    public v60 c() {
        return this.k;
    }

    public j81 d() {
        return this.b;
    }

    public DateFormat e() {
        return this.h;
    }

    public im4 f() {
        return null;
    }

    public Locale i() {
        return this.i;
    }

    public se8 j() {
        return this.g;
    }

    public wq8 k() {
        return this.d;
    }

    public TimeZone l() {
        TimeZone timeZone = this.j;
        if (timeZone == null) {
            return l;
        }
        return timeZone;
    }

    public rnb m() {
        return this.a;
    }

    public aob<?> n() {
        return this.f;
    }

    public i80 o(j81 j81Var) {
        if (this.b == j81Var) {
            return this;
        }
        return new i80(j81Var, this.c, this.d, this.a, this.f, this.h, null, this.i, this.j, this.k, this.g, this.e);
    }
}
