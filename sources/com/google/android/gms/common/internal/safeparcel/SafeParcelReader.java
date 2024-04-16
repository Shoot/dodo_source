package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes2.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ParseException(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static void A(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i));
    }

    public static int B(@NonNull Parcel parcel) {
        int t = t(parcel);
        int z = z(parcel, t);
        int dataPosition = parcel.dataPosition();
        if (l(t) == 20293) {
            int i = z + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(t))), parcel);
    }

    private static void C(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
    }

    private static void D(Parcel parcel, int i, int i2) {
        int z = z(parcel, i);
        if (z == i2) {
            return;
        }
        String hexString = Integer.toHexString(z);
        throw new ParseException("Expected size " + i2 + " got " + z + " (0x" + hexString + ")", parcel);
    }

    @NonNull
    public static Bundle a(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z);
        return readBundle;
    }

    @NonNull
    public static byte[] b(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + z);
        return createByteArray;
    }

    @NonNull
    public static int[] c(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + z);
        return createIntArray;
    }

    @NonNull
    public static ArrayList<Integer> d(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + z);
        return arrayList;
    }

    @NonNull
    public static <T extends Parcelable> T e(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z);
        return createFromParcel;
    }

    @NonNull
    public static String f(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z);
        return readString;
    }

    @NonNull
    public static String[] g(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + z);
        return createStringArray;
    }

    @NonNull
    public static ArrayList<String> h(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + z);
        return createStringArrayList;
    }

    @NonNull
    public static <T> T[] i(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> j(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + z);
        return createTypedArrayList;
    }

    public static void k(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i, parcel);
    }

    public static int l(int i) {
        return (char) i;
    }

    public static boolean m(@NonNull Parcel parcel, int i) {
        D(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Boolean n(@NonNull Parcel parcel, int i) {
        boolean z;
        int z2 = z(parcel, i);
        if (z2 == 0) {
            return null;
        }
        C(parcel, i, z2, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static byte o(@NonNull Parcel parcel, int i) {
        D(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double p(@NonNull Parcel parcel, int i) {
        D(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double q(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        C(parcel, i, z, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(@NonNull Parcel parcel, int i) {
        D(parcel, i, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float s(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        C(parcel, i, z, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    public static IBinder u(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (z == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + z);
        return readStrongBinder;
    }

    public static int v(@NonNull Parcel parcel, int i) {
        D(parcel, i, 4);
        return parcel.readInt();
    }

    @NonNull
    public static Integer w(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        C(parcel, i, z, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(@NonNull Parcel parcel, int i) {
        D(parcel, i, 8);
        return parcel.readLong();
    }

    @NonNull
    public static Long y(@NonNull Parcel parcel, int i) {
        int z = z(parcel, i);
        if (z == 0) {
            return null;
        }
        C(parcel, i, z, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int z(@NonNull Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }
}
