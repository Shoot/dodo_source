package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
/* compiled from: JsonWriteContext.java */
/* renamed from: cd5  reason: default package */
/* loaded from: classes2.dex */
public class cd5 extends jc5 {
    protected final cd5 c;
    protected i93 d;
    protected cd5 e;
    protected String f;
    protected Object g;
    protected boolean h;

    protected cd5(int i, cd5 cd5Var, i93 i93Var) {
        this.a = i;
        this.c = cd5Var;
        this.d = i93Var;
        this.b = -1;
    }

    private final void j(i93 i93Var, String str) throws JsonProcessingException {
        ua5 ua5Var;
        if (i93Var.c(str)) {
            Object b = i93Var.b();
            String str2 = "Duplicate field '" + str + "'";
            if (b instanceof ua5) {
                ua5Var = (ua5) b;
            } else {
                ua5Var = null;
            }
            throw new JsonGenerationException(str2, ua5Var);
        }
    }

    public static cd5 p(i93 i93Var) {
        return new cd5(0, null, i93Var);
    }

    @Override // defpackage.jc5
    public final String b() {
        return this.f;
    }

    @Override // defpackage.jc5
    public Object c() {
        return this.g;
    }

    @Override // defpackage.jc5
    public void h(Object obj) {
        this.g = obj;
    }

    public cd5 k() {
        this.g = null;
        return this.c;
    }

    public cd5 l() {
        i93 a;
        cd5 cd5Var = this.e;
        if (cd5Var == null) {
            i93 i93Var = this.d;
            if (i93Var == null) {
                a = null;
            } else {
                a = i93Var.a();
            }
            cd5 cd5Var2 = new cd5(1, this, a);
            this.e = cd5Var2;
            return cd5Var2;
        }
        return cd5Var.s(1);
    }

    public cd5 m(Object obj) {
        i93 a;
        cd5 cd5Var = this.e;
        if (cd5Var == null) {
            i93 i93Var = this.d;
            if (i93Var == null) {
                a = null;
            } else {
                a = i93Var.a();
            }
            cd5 cd5Var2 = new cd5(1, this, a, obj);
            this.e = cd5Var2;
            return cd5Var2;
        }
        return cd5Var.t(1, obj);
    }

    public cd5 n() {
        i93 a;
        cd5 cd5Var = this.e;
        if (cd5Var == null) {
            i93 i93Var = this.d;
            if (i93Var == null) {
                a = null;
            } else {
                a = i93Var.a();
            }
            cd5 cd5Var2 = new cd5(2, this, a);
            this.e = cd5Var2;
            return cd5Var2;
        }
        return cd5Var.s(2);
    }

    public cd5 o(Object obj) {
        i93 a;
        cd5 cd5Var = this.e;
        if (cd5Var == null) {
            i93 i93Var = this.d;
            if (i93Var == null) {
                a = null;
            } else {
                a = i93Var.a();
            }
            cd5 cd5Var2 = new cd5(2, this, a, obj);
            this.e = cd5Var2;
            return cd5Var2;
        }
        return cd5Var.t(2, obj);
    }

    public i93 q() {
        return this.d;
    }

    @Override // defpackage.jc5
    /* renamed from: r */
    public final cd5 e() {
        return this.c;
    }

    public cd5 s(int i) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = null;
        i93 i93Var = this.d;
        if (i93Var != null) {
            i93Var.d();
        }
        return this;
    }

    public cd5 t(int i, Object obj) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = obj;
        i93 i93Var = this.d;
        if (i93Var != null) {
            i93Var.d();
        }
        return this;
    }

    public cd5 u(i93 i93Var) {
        this.d = i93Var;
        return this;
    }

    public int v(String str) throws JsonProcessingException {
        if (this.a == 2 && !this.h) {
            this.h = true;
            this.f = str;
            i93 i93Var = this.d;
            if (i93Var != null) {
                j(i93Var, str);
            }
            if (this.b >= 0) {
                return 1;
            }
            return 0;
        }
        return 4;
    }

    public int w() {
        int i = this.a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 == 0) {
                return 0;
            }
            return 3;
        }
    }

    protected cd5(int i, cd5 cd5Var, i93 i93Var, Object obj) {
        this.a = i;
        this.c = cd5Var;
        this.d = i93Var;
        this.b = -1;
        this.g = obj;
    }
}
