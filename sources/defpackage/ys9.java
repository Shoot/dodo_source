package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: ys9  reason: default package */
/* loaded from: classes2.dex */
public class ys9 {
    private static void A(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void B(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(@NonNull Parcel parcel) {
        return y(parcel, 20293);
    }

    public static void b(@NonNull Parcel parcel, int i) {
        z(parcel, i);
    }

    public static void c(@NonNull Parcel parcel, int i, boolean z) {
        A(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        A(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void e(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeBundle(bundle);
        z(parcel, y);
    }

    public static void f(@NonNull Parcel parcel, int i, byte b) {
        A(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void g(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeByteArray(bArr);
        z(parcel, y);
    }

    public static void h(@NonNull Parcel parcel, int i, double d) {
        A(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void i(@NonNull Parcel parcel, int i, @NonNull Double d, boolean z) {
        if (d == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        A(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void j(@NonNull Parcel parcel, int i, float f) {
        A(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void k(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z) {
        if (f == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        A(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void l(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeStrongBinder(iBinder);
        z(parcel, y);
    }

    public static void m(@NonNull Parcel parcel, int i, int i2) {
        A(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void n(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeIntArray(iArr);
        z(parcel, y);
    }

    public static void o(@NonNull Parcel parcel, int i, @NonNull List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        z(parcel, y);
    }

    public static void p(@NonNull Parcel parcel, int i, @NonNull Integer num, boolean z) {
        if (num == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        A(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void q(@NonNull Parcel parcel, int i, long j) {
        A(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void r(@NonNull Parcel parcel, int i, @NonNull Long l, boolean z) {
        if (l == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        A(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void s(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        z(parcel, y);
    }

    public static void t(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeString(str);
        z(parcel, y);
    }

    public static void u(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeStringArray(strArr);
        z(parcel, y);
    }

    public static void v(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeStringList(list);
        z(parcel, y);
    }

    public static <T extends Parcelable> void w(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                B(parcel, t, i2);
            }
        }
        z(parcel, y);
    }

    public static <T extends Parcelable> void x(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                A(parcel, i, 0);
                return;
            }
            return;
        }
        int y = y(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                B(parcel, t, 0);
            }
        }
        z(parcel, y);
    }

    private static int y(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void z(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
