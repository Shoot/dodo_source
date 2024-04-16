package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class n extends ecd {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        gh8.a(z);
        this.a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] T1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] U1();

    @Override // defpackage.rcd
    public final int c() {
        return this.a;
    }

    @Override // defpackage.rcd
    public final ns4 d() {
        return k57.U1(U1());
    }

    public final boolean equals(Object obj) {
        ns4 d;
        if (obj != null && (obj instanceof rcd)) {
            try {
                rcd rcdVar = (rcd) obj;
                if (rcdVar.c() != this.a || (d = rcdVar.d()) == null) {
                    return false;
                }
                return Arrays.equals(U1(), (byte[]) k57.T1(d));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
