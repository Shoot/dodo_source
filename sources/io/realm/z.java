package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class z extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), e0.a.OBJECT_ID, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((ObjectId) super.g(ObjectId.class));
    }
}
