package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* compiled from: MapEntryLite.java */
/* loaded from: classes2.dex */
public class f0<K, V> {

    /* compiled from: MapEntryLite.java */
    /* loaded from: classes2.dex */
    static class a<K, V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k, V v) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void d(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        throw null;
    }

    public int a(int i, K k, V v) {
        return CodedOutputStream.U(i) + CodedOutputStream.C(b(null, k, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return null;
    }
}
