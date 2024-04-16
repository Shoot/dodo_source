package defpackage;

import defpackage.cb5;
import defpackage.ic5;
import defpackage.ta5;
import defpackage.v1c;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ConfigOverrides.java */
/* renamed from: vp1  reason: default package */
/* loaded from: classes2.dex */
public class vp1 implements Serializable {
    protected Map<Class<?>, Object> a;
    protected cb5.b b;
    protected ic5.a c;
    protected v1c<?> d;
    protected Boolean e;
    protected Boolean f;

    public vp1() {
        this(null, cb5.b.c(), ic5.a.c(), v1c.a.r(), null, null);
    }

    public ta5.d a(Class<?> cls) {
        up1 up1Var;
        ta5.d b;
        Map<Class<?>, Object> map = this.a;
        if (map != null && (up1Var = (up1) map.get(cls)) != null && (b = up1Var.b()) != null) {
            if (!b.l()) {
                return b.s(this.f);
            }
            return b;
        }
        Boolean bool = this.f;
        if (bool == null) {
            return ta5.d.b();
        }
        return ta5.d.c(bool.booleanValue());
    }

    public up1 b(Class<?> cls) {
        Map<Class<?>, Object> map = this.a;
        if (map == null) {
            return null;
        }
        return (up1) map.get(cls);
    }

    public cb5.b c() {
        return this.b;
    }

    public Boolean d() {
        return this.e;
    }

    public ic5.a e() {
        return this.c;
    }

    public v1c<?> f() {
        return this.d;
    }

    protected vp1(Map<Class<?>, Object> map, cb5.b bVar, ic5.a aVar, v1c<?> v1cVar, Boolean bool, Boolean bool2) {
        this.a = map;
        this.b = bVar;
        this.c = aVar;
        this.d = v1cVar;
        this.e = bool;
        this.f = bool2;
    }
}
