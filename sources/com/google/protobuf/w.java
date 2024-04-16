package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class w {
    static final Charset a = Charset.forName("US-ASCII");
    static final Charset b = Charset.forName("UTF-8");
    static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final com.google.protobuf.g f;

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface c {
        int e();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
        void S0(int i);

        int getInt(int i);

        @Override // com.google.protobuf.w.i
        i<Integer> i(int i);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> i(int i);

        void l();

        boolean o();
    }

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = com.google.protobuf.g.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        if (z) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return g1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        return ((k0) obj).b().n0((k0) obj2).k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, b);
    }
}
