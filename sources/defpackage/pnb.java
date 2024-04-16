package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: TypeBase.java */
/* renamed from: pnb  reason: default package */
/* loaded from: classes2.dex */
public abstract class pnb extends y85 implements dc5 {
    private static final qnb j = qnb.j();
    private static final y85[] k = new y85[0];
    protected final y85 f;
    protected final y85[] g;
    protected final qnb h;
    volatile transient String i;

    /* JADX INFO: Access modifiers changed from: protected */
    public pnb(Class<?> cls, qnb qnbVar, y85 y85Var, y85[] y85VarArr, int i, Object obj, Object obj2, boolean z) {
        super(cls, i, obj, obj2, z);
        this.h = qnbVar == null ? j : qnbVar;
        this.f = y85Var;
        this.g = y85VarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static StringBuilder x0(Class<?> cls, StringBuilder sb, boolean z) {
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                sb.append('Z');
            } else if (cls == Byte.TYPE) {
                sb.append('B');
            } else if (cls == Short.TYPE) {
                sb.append('S');
            } else if (cls == Character.TYPE) {
                sb.append('C');
            } else if (cls == Integer.TYPE) {
                sb.append('I');
            } else if (cls == Long.TYPE) {
                sb.append('J');
            } else if (cls == Float.TYPE) {
                sb.append('F');
            } else if (cls == Double.TYPE) {
                sb.append('D');
            } else if (cls == Void.TYPE) {
                sb.append('V');
            } else {
                throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
            }
        } else {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                sb.append(';');
            }
        }
        return sb;
    }

    protected String E0() {
        return this.a.getName();
    }

    @Override // defpackage.dc5
    public void a(ua5 ua5Var, bda bdaVar) throws IOException {
        ua5Var.q1(e());
    }

    @Override // defpackage.dc5
    public void d(ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
        c9c c9cVar = new c9c(this, nc5.VALUE_STRING);
        bobVar.g(ua5Var, c9cVar);
        a(ua5Var, bdaVar);
        bobVar.h(ua5Var, c9cVar);
    }

    @Override // defpackage.lj9
    public String e() {
        String str = this.i;
        if (str == null) {
            return E0();
        }
        return str;
    }

    @Override // defpackage.y85
    public y85 f(int i) {
        return this.h.l(i);
    }

    @Override // defpackage.y85
    public int i() {
        return this.h.q();
    }

    @Override // defpackage.y85
    public final y85 k(Class<?> cls) {
        y85 k2;
        y85[] y85VarArr;
        if (cls == this.a) {
            return this;
        }
        if (cls.isInterface() && (y85VarArr = this.g) != null) {
            int length = y85VarArr.length;
            for (int i = 0; i < length; i++) {
                y85 k3 = this.g[i].k(cls);
                if (k3 != null) {
                    return k3;
                }
            }
        }
        y85 y85Var = this.f;
        if (y85Var != null && (k2 = y85Var.k(cls)) != null) {
            return k2;
        }
        return null;
    }

    @Override // defpackage.y85
    public qnb l() {
        return this.h;
    }

    @Override // defpackage.y85
    public List<y85> r() {
        y85[] y85VarArr = this.g;
        if (y85VarArr == null) {
            return Collections.emptyList();
        }
        int length = y85VarArr.length;
        if (length != 0) {
            if (length != 1) {
                return Arrays.asList(y85VarArr);
            }
            return Collections.singletonList(y85VarArr[0]);
        }
        return Collections.emptyList();
    }

    @Override // defpackage.y85
    public y85 x() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z0(int i) {
        if (this.a.getTypeParameters().length == i) {
            return true;
        }
        return false;
    }
}
