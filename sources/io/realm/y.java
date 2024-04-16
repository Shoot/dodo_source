package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.ObjectId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class y extends u<ObjectId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public y(a aVar, OsList osList, Class<ObjectId> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.i((ObjectId) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof ObjectId)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.ObjectId", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.B(i, (ObjectId) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.S(i, (ObjectId) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public ObjectId g(int i) {
        return (ObjectId) this.b.s(i);
    }
}
