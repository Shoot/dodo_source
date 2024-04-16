package defpackage;

import com.google.crypto.tink.internal.TinkBugException;
import defpackage.rca;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: MutableSerializationRegistry.java */
/* renamed from: br6  reason: default package */
/* loaded from: classes2.dex */
public final class br6 {
    private static final br6 b = new br6();
    private final AtomicReference<rca> a = new AtomicReference<>(new rca.b().e());

    public static br6 a() {
        return b;
    }

    public <SerializationT extends oca> te5 b(SerializationT serializationt, q2a q2aVar) throws GeneralSecurityException {
        return this.a.get().e(serializationt, q2aVar);
    }

    public te5 c(kr8 kr8Var, q2a q2aVar) {
        if (q2aVar != null) {
            try {
                try {
                    return b(kr8Var, q2aVar);
                } catch (GeneralSecurityException e) {
                    throw new TinkBugException("Creating a LegacyProtoKey failed", e);
                }
            } catch (GeneralSecurityException unused) {
                return new mo5(kr8Var, q2aVar);
            }
        }
        throw new NullPointerException("access cannot be null");
    }

    public synchronized <SerializationT extends oca> void d(mf5<SerializationT> mf5Var) throws GeneralSecurityException {
        this.a.set(new rca.b(this.a.get()).f(mf5Var).e());
    }

    public synchronized <KeyT extends te5, SerializationT extends oca> void e(rf5<KeyT, SerializationT> rf5Var) throws GeneralSecurityException {
        this.a.set(new rca.b(this.a.get()).g(rf5Var).e());
    }

    public synchronized <SerializationT extends oca> void f(mq7<SerializationT> mq7Var) throws GeneralSecurityException {
        this.a.set(new rca.b(this.a.get()).h(mq7Var).e());
    }

    public synchronized <ParametersT extends lq7, SerializationT extends oca> void g(nq7<ParametersT, SerializationT> nq7Var) throws GeneralSecurityException {
        this.a.set(new rca.b(this.a.get()).i(nq7Var).e());
    }
}
