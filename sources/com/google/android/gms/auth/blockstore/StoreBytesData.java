package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* loaded from: classes2.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new e();
    private final byte[] a;
    private final boolean b;
    private final String c;

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private byte[] a;
        private boolean b;
        private String c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        @NonNull
        public StoreBytesData a() {
            return new StoreBytesData(this.a, this.b, this.c);
        }

        @NonNull
        public a b(@NonNull byte[] bArr) {
            this.a = bArr;
            return this;
        }

        @NonNull
        public a c(@NonNull String str) {
            gh8.g(str, "key cannot be null or empty");
            this.c = str;
            return this;
        }

        @NonNull
        public a d(boolean z) {
            this.b = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StoreBytesData(byte[] bArr, boolean z, String str) {
        this.a = bArr;
        this.b = z;
        this.c = str;
    }

    @NonNull
    public byte[] h() {
        return this.a;
    }

    @NonNull
    public String k() {
        return this.c;
    }

    public boolean p() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.g(parcel, 1, h(), false);
        ys9.c(parcel, 2, p());
        ys9.t(parcel, 3, k(), false);
        ys9.b(parcel, a2);
    }
}
