package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.w0;
import defpackage.n0d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class w0<MessageType extends w0<MessageType, BuilderType>, BuilderType extends n0d<MessageType, BuilderType>> implements h3d {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void i(Iterable<T> iterable, List<? super T> list) {
        d2.e(iterable);
        if (iterable instanceof t2d) {
            List<?> b = ((t2d) iterable).b();
            t2d t2dVar = (t2d) list;
            int size = list.size();
            for (Object obj : b) {
                if (obj == null) {
                    String str = "Element at index " + (t2dVar.size() - size) + " is null.";
                    for (int size2 = t2dVar.size() - 1; size2 >= size; size2--) {
                        t2dVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof d1) {
                    t2dVar.b0((d1) obj);
                } else {
                    t2dVar.add((String) obj);
                }
            }
        } else if (iterable instanceof f3) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(j3 j3Var) {
        int j = j();
        if (j == -1) {
            int a = j3Var.a(this);
            l(a);
            return a;
        }
        return j;
    }

    @Override // defpackage.h3d
    public final d1 h() {
        try {
            k1 T = d1.T(f());
            b(T.b());
            return T.a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        throw new UnsupportedOperationException();
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[f()];
            zzio H = zzio.H(bArr);
            b(H);
            H.I();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
