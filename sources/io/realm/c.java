package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class c extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), e0.a.BINARY, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((byte[]) super.g(byte[].class));
    }

    @Override // io.realm.b0
    public boolean equals(Object obj) {
        if (obj != null && c.class.equals(obj.getClass())) {
            return Arrays.equals((byte[]) g(byte[].class), (byte[]) ((h0) obj).g(byte[].class));
        }
        return false;
    }
}
