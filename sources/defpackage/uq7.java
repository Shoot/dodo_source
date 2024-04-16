package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* renamed from: uq7  reason: default package */
/* loaded from: classes.dex */
public final class uq7 implements rj9<ParcelFileDescriptor, Bitmap> {
    private final g73 a;

    public uq7(g73 g73Var) {
        this.a = g73Var;
    }

    private boolean e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        return this.a.e(parcelFileDescriptor, i, i2, ac7Var);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull ac7 ac7Var) {
        if (e(parcelFileDescriptor) && this.a.o(parcelFileDescriptor)) {
            return true;
        }
        return false;
    }
}
