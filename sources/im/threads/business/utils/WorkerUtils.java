package im.threads.business.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
/* compiled from: WorkerUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lim/threads/business/utils/WorkerUtils;", "", "()V", "marshall", "", "parcelable", "Landroid/os/Parcelable;", "unmarshall", "Landroid/os/Parcel;", "bytes", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerUtils {
    public static final WorkerUtils INSTANCE = new WorkerUtils();

    private WorkerUtils() {
    }

    public final byte[] marshall(Parcelable parcelable) {
        z65.h(parcelable, "parcelable");
        Parcel obtain = Parcel.obtain();
        z65.g(obtain, "obtain()");
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        z65.g(marshall, "bytes");
        return marshall;
    }

    public final Parcel unmarshall(byte[] bArr) {
        z65.h(bArr, "bytes");
        Parcel obtain = Parcel.obtain();
        z65.g(obtain, "obtain()");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        return obtain;
    }
}
