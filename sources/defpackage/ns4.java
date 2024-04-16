package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: ns4  reason: default package */
/* loaded from: classes2.dex */
public interface ns4 extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: ns4$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends cqc implements ns4 {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        public static ns4 C(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof ns4) {
                return (ns4) queryLocalInterface;
            }
            return new sqc(iBinder);
        }
    }
}
