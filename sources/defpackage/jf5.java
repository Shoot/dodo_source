package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.m0;
import defpackage.yf5;
import java.security.GeneralSecurityException;
/* compiled from: KeyManagerImpl.java */
/* renamed from: jf5  reason: default package */
/* loaded from: classes2.dex */
class jf5<PrimitiveT, KeyProtoT extends m0> implements if5<PrimitiveT> {
    private final yf5<KeyProtoT> a;
    private final Class<PrimitiveT> b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyManagerImpl.java */
    /* renamed from: jf5$a */
    /* loaded from: classes2.dex */
    public static class a<KeyFormatProtoT extends m0, KeyProtoT extends m0> {
        final yf5.a<KeyFormatProtoT, KeyProtoT> a;

        a(yf5.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException {
            this.a.e(keyformatprotot);
            return this.a.a(keyformatprotot);
        }

        KeyProtoT a(h hVar) throws GeneralSecurityException, InvalidProtocolBufferException {
            return b(this.a.d(hVar));
        }
    }

    public jf5(yf5<KeyProtoT> yf5Var, Class<PrimitiveT> cls) {
        if (!yf5Var.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", yf5Var.toString(), cls.getName()));
        }
        this.a = yf5Var;
        this.b = cls;
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.b)) {
            this.a.j(keyprotot);
            return (PrimitiveT) this.a.e(keyprotot, (Class<PrimitiveT>) this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // defpackage.if5
    public final we5 a(h hVar) throws GeneralSecurityException {
        try {
            return we5.T().z(b()).A(e().a(hVar).c()).y(this.a.g()).a();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // defpackage.if5
    public final String b() {
        return this.a.d();
    }

    @Override // defpackage.if5
    public final PrimitiveT c(h hVar) throws GeneralSecurityException {
        try {
            return f(this.a.h(hVar));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.c().getName(), e);
        }
    }

    @Override // defpackage.if5
    public final m0 d(h hVar) throws GeneralSecurityException {
        try {
            return e().a(hVar);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.f().b().getName(), e);
        }
    }
}
