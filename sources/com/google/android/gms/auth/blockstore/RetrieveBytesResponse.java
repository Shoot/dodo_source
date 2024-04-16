package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* loaded from: classes2.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new d();
    @Deprecated
    private final Bundle a;
    private final List b;
    private final Map c;

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
    /* loaded from: classes2.dex */
    public static class BlockstoreData extends AbstractSafeParcelable {
        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new a();
        private final byte[] a;
        private final String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BlockstoreData(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.a, ((BlockstoreData) obj).a);
        }

        @NonNull
        public byte[] h() {
            return this.a;
        }

        public int hashCode() {
            return m57.b(Integer.valueOf(Arrays.hashCode(this.a)));
        }

        @NonNull
        public final String k() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int a = ys9.a(parcel);
            ys9.g(parcel, 1, h(), false);
            ys9.t(parcel, 2, this.b, false);
            ys9.b(parcel, a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            hashMap.put(blockstoreData.k(), blockstoreData);
        }
        this.c = hashMap;
    }

    @NonNull
    public Map<String, BlockstoreData> h() {
        return Collections.unmodifiableMap(this.c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.e(parcel, 1, this.a, false);
        ys9.x(parcel, 2, this.b, false);
        ys9.b(parcel, a);
    }
}
