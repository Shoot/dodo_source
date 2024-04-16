package defpackage;

import com.google.crypto.tink.shaded.protobuf.m0;
import java.security.GeneralSecurityException;
/* compiled from: PrimitiveFactory.java */
/* renamed from: qj8  reason: default package */
/* loaded from: classes2.dex */
public abstract class qj8<PrimitiveT, KeyProtoT extends m0> {
    private final Class<PrimitiveT> a;

    public qj8(Class<PrimitiveT> cls) {
        this.a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> b() {
        return this.a;
    }
}
