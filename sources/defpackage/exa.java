package defpackage;

import defpackage.rc5;
import java.util.Collection;
/* compiled from: StdTypeResolverBuilder.java */
/* renamed from: exa  reason: default package */
/* loaded from: classes2.dex */
public class exa implements aob<exa> {
    protected rc5.b a;
    protected rc5.a b;
    protected String c;
    protected boolean d = false;
    protected Class<?> e;
    protected snb f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StdTypeResolverBuilder.java */
    /* renamed from: exa$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[rc5.b.values().length];
            b = iArr;
            try {
                iArr[rc5.b.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[rc5.b.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[rc5.b.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[rc5.b.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[rc5.b.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[rc5.b.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[rc5.a.values().length];
            a = iArr2;
            try {
                iArr2[rc5.a.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[rc5.a.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[rc5.a.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[rc5.a.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[rc5.a.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static exa l() {
        return new exa().f(rc5.b.NONE, null);
    }

    @Override // defpackage.aob
    public bob e(pca pcaVar, y85 y85Var, Collection<ss6> collection) {
        if (this.a == rc5.b.NONE) {
            return null;
        }
        if (y85Var.b0() && !g(pcaVar, y85Var)) {
            return null;
        }
        snb i = i(pcaVar, y85Var, m(pcaVar), collection, true, false);
        if (this.a == rc5.b.DEDUCTION) {
            return new cs(i, null, this.c);
        }
        int i2 = a.a[this.b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return new cs(i, null, this.c);
                        }
                        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.b);
                    }
                    return new ds(i, null, this.c);
                }
                return new fs(i, null);
            }
            return new es(i, null, this.c);
        }
        return new bs(i, null);
    }

    protected boolean g(w76<?> w76Var, y85 y85Var) {
        return false;
    }

    @Override // defpackage.aob
    /* renamed from: h */
    public exa c(Class<?> cls) {
        this.e = cls;
        return this;
    }

    protected snb i(w76<?> w76Var, y85 y85Var, se8 se8Var, Collection<ss6> collection, boolean z, boolean z2) {
        snb snbVar = this.f;
        if (snbVar != null) {
            return snbVar;
        }
        rc5.b bVar = this.a;
        if (bVar != null) {
            int i = a.b[bVar.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return null;
                        }
                        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.a);
                    }
                    return xnb.e(w76Var, y85Var, collection, z, z2);
                }
                return ll6.f(y85Var, w76Var, se8Var);
            }
            return l81.e(y85Var, w76Var, se8Var);
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    @Override // defpackage.aob
    /* renamed from: j */
    public exa d(rc5.a aVar) {
        if (aVar != null) {
            this.b = aVar;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    @Override // defpackage.aob
    /* renamed from: k */
    public exa f(rc5.b bVar, snb snbVar) {
        if (bVar != null) {
            this.a = bVar;
            this.f = snbVar;
            this.c = bVar.a();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public se8 m(w76<?> w76Var) {
        return w76Var.H();
    }

    @Override // defpackage.aob
    /* renamed from: n */
    public exa a(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.aob
    /* renamed from: o */
    public exa b(String str) {
        if (str == null || str.isEmpty()) {
            str = this.a.a();
        }
        this.c = str;
        return this;
    }
}
