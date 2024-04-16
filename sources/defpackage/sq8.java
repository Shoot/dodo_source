package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.cb5;
import defpackage.fc5;
/* compiled from: PropertyBuilder.java */
/* renamed from: sq8  reason: default package */
/* loaded from: classes2.dex */
public class sq8 {
    private static final Object g = Boolean.FALSE;
    protected final pca a;
    protected final fa0 b;
    protected final ql c;
    protected Object d;
    protected final cb5.b e;
    protected final boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PropertyBuilder.java */
    /* renamed from: sq8$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cb5.a.values().length];
            a = iArr;
            try {
                iArr[cb5.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cb5.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cb5.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cb5.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cb5.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cb5.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public sq8(pca pcaVar, fa0 fa0Var) {
        boolean z;
        this.a = pcaVar;
        this.b = fa0Var;
        cb5.b k = cb5.b.k(fa0Var.g(cb5.b.c()), pcaVar.u(fa0Var.i(), cb5.b.c()));
        this.e = cb5.b.k(pcaVar.m0(), k);
        if (k.j() == cb5.a.NON_DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.c = pcaVar.i();
    }

    protected ka0 a(ja0 ja0Var, hl hlVar, tl tlVar, y85 y85Var, gc5<?> gc5Var, bob bobVar, y85 y85Var2, boolean z, Object obj, Class<?>[] clsArr) throws JsonMappingException {
        return new ka0(ja0Var, hlVar, tlVar, y85Var, gc5Var, bobVar, y85Var2, z, obj, clsArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object b(java.lang.Exception r3, java.lang.String r4, java.lang.Object r5) {
        /*
            r2 = this;
        L0:
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto Lb
            java.lang.Throwable r3 = r3.getCause()
            goto L0
        Lb:
            defpackage.q81.V(r3)
            defpackage.q81.X(r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to get property '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' of default "
            r0.append(r4)
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " instance"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq8.b(java.lang.Exception, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ka0 c(bda bdaVar, ja0 ja0Var, y85 y85Var, gc5<?> gc5Var, bob bobVar, bob bobVar2, hl hlVar, boolean z) throws JsonMappingException {
        y85 y85Var2;
        y85 y85Var3;
        Object a2;
        Object e;
        Object obj;
        boolean z2;
        boolean z3 = false;
        try {
            y85 d = d(hlVar, z, y85Var);
            if (bobVar2 != null) {
                if (d == null) {
                    d = y85Var;
                }
                if (d.m() == null) {
                    fa0 fa0Var = this.b;
                    bdaVar.P0(fa0Var, ja0Var, "serialization type " + d + " has no content", new Object[0]);
                }
                y85 n0 = d.n0(bobVar2);
                n0.m();
                y85Var2 = n0;
            } else {
                y85Var2 = d;
            }
            if (y85Var2 == null) {
                y85Var3 = y85Var;
            } else {
                y85Var3 = y85Var2;
            }
            hl k = ja0Var.k();
            if (k == null) {
                return (ka0) bdaVar.P0(this.b, ja0Var, "could not determine property type", new Object[0]);
            }
            cb5.b o = this.a.o(y85Var3.u(), k.c(), this.e).o(ja0Var.g());
            cb5.a j = o.j();
            if (j == cb5.a.USE_DEFAULTS) {
                j = cb5.a.ALWAYS;
            }
            int i = a.a[j.ordinal()];
            Object obj2 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                z3 = true;
                            }
                            qca qcaVar = qca.WRITE_EMPTY_JSON_ARRAYS;
                            if (y85Var3.N() && !this.a.K0(qcaVar)) {
                                a2 = ka0.s;
                            }
                            z2 = z3;
                            obj = obj2;
                        } else {
                            a2 = bdaVar.J0(ja0Var, o.i());
                            if (a2 != null) {
                                z3 = bdaVar.K0(a2);
                            }
                        }
                        obj = a2;
                        z2 = z3;
                    } else {
                        a2 = ka0.s;
                    }
                } else {
                    if (y85Var3.c()) {
                        a2 = ka0.s;
                    }
                    obj = obj2;
                    z2 = true;
                }
                obj = a2;
                z2 = true;
            } else {
                if (this.f && (e = e()) != null) {
                    if (bdaVar.L0(y76.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        hlVar.i(this.a.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        obj2 = hlVar.n(e);
                    } catch (Exception e2) {
                        b(e2, ja0Var.v(), e);
                    }
                } else {
                    obj2 = qa0.b(y85Var3);
                    z3 = true;
                }
                if (obj2 != null) {
                    if (obj2.getClass().isArray()) {
                        a2 = er.a(obj2);
                        obj = a2;
                        z2 = z3;
                    }
                    z2 = z3;
                    obj = obj2;
                }
                obj = obj2;
                z2 = true;
            }
            Class<?>[] i2 = ja0Var.i();
            if (i2 == null) {
                i2 = this.b.b();
            }
            ka0 a3 = a(ja0Var, hlVar, this.b.j(), y85Var, gc5Var, bobVar, y85Var2, z2, obj, i2);
            Object y = this.c.y(hlVar);
            if (y != null) {
                a3.i(bdaVar.T0(hlVar, y));
            }
            ps6 x0 = this.c.x0(hlVar);
            if (x0 != null) {
                return a3.H(x0);
            }
            return a3;
        } catch (JsonMappingException e3) {
            if (ja0Var == null) {
                return (ka0) bdaVar.k(y85Var, q81.n(e3));
            }
            return (ka0) bdaVar.P0(this.b, ja0Var, q81.n(e3), new Object[0]);
        }
    }

    protected y85 d(al alVar, boolean z, y85 y85Var) throws JsonMappingException {
        y85 U0 = this.c.U0(this.a, alVar, y85Var);
        if (U0 != y85Var) {
            Class<?> u = U0.u();
            Class<?> u2 = y85Var.u();
            if (u.isAssignableFrom(u2) || u2.isAssignableFrom(u)) {
                z = true;
                y85Var = U0;
            } else {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + alVar.getName() + "': class " + u.getName() + " not a super-type of (declared) class " + u2.getName());
            }
        }
        fc5.b m0 = this.c.m0(alVar);
        if (m0 != null && m0 != fc5.b.DEFAULT_TYPING) {
            if (m0 != fc5.b.STATIC) {
                return null;
            }
        } else if (!z) {
            return null;
        }
        return y85Var.p0();
    }

    protected Object e() {
        Object obj = this.d;
        if (obj == null) {
            obj = this.b.o(this.a.b());
            if (obj == null) {
                obj = g;
            }
            this.d = obj;
        }
        if (obj == g) {
            return null;
        }
        return this.d;
    }
}
