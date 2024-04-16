package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* loaded from: classes2.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new b();
    private final List a;
    private final boolean b;

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
    /* loaded from: classes2.dex */
    public static final class a {
        private List a = new ArrayList();
        private boolean b = false;

        @NonNull
        public DeleteBytesRequest a() {
            return new DeleteBytesRequest(this.a, this.b);
        }

        @NonNull
        public a b(boolean z) {
            this.b = z;
            return this;
        }

        @NonNull
        public a c(@NonNull List<String> list) {
            gh8.k(list, "Keys cannot be set to null");
            this.a = list;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            gh8.n(z2, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.b = z;
        this.a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                gh8.g(str, "Element in keys cannot be null or empty");
                this.a.add(str);
            }
        }
    }

    public boolean h() {
        return this.b;
    }

    @NonNull
    public List<String> k() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a2 = ys9.a(parcel);
        ys9.v(parcel, 1, k(), false);
        ys9.c(parcel, 2, h());
        ys9.b(parcel, a2);
    }
}
