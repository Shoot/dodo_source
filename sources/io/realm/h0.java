package io.realm;

import io.realm.e0;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public abstract class h0 {
    private NativeRealmAny a;
    private e0.a b;

    /* compiled from: RealmAnyOperator.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e0.a.values().length];
            a = iArr;
            try {
                iArr[e0.a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e0.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e0.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e0.a.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e0.a.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e0.a.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e0.a.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e0.a.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e0.a.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[e0.a.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[e0.a.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[e0.a.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h0(e0.a aVar) {
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 b(io.realm.a aVar, NativeRealmAny nativeRealmAny) {
        e0.a type = nativeRealmAny.getType();
        switch (a.a[type.ordinal()]) {
            case 1:
                return new s(nativeRealmAny);
            case 2:
                return new e(nativeRealmAny);
            case 3:
                return new s0(nativeRealmAny);
            case 4:
                return new c(nativeRealmAny);
            case 5:
                return new h(nativeRealmAny);
            case 6:
                return new p(nativeRealmAny);
            case 7:
                return new l(nativeRealmAny);
            case 8:
                return new j(nativeRealmAny);
            case 9:
                return new z(nativeRealmAny);
            case 10:
                return new u0(nativeRealmAny);
            case 11:
                if (aVar instanceof d0) {
                    try {
                        return new m0(aVar, nativeRealmAny, nativeRealmAny.getModelClass(aVar.e, aVar.c.o()));
                    } catch (RealmException unused) {
                    }
                }
                return new n(aVar, nativeRealmAny);
            case 12:
                return new x(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    private synchronized NativeRealmAny d() {
        try {
            if (this.a == null) {
                this.a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    protected abstract NativeRealmAny a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return d().getNativePtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0.a e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> f() {
        return this.b.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <T> T g(Class<T> cls);

    /* JADX INFO: Access modifiers changed from: protected */
    public h0(e0.a aVar, NativeRealmAny nativeRealmAny) {
        this.b = aVar;
        this.a = nativeRealmAny;
    }
}
