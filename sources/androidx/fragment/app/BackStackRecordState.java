package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.p;
import androidx.lifecycle.d;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    final int[] a;
    final ArrayList<String> b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList<String> l;
    final ArrayList<String> m;
    final boolean n;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.a = new int[size * 6];
        if (aVar.i) {
            this.b = new ArrayList<>(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                p.a aVar2 = aVar.c.get(i2);
                int i3 = i + 1;
                this.a[i] = aVar2.a;
                ArrayList<String> arrayList = this.b;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.a;
                iArr[i3] = aVar2.c ? 1 : 0;
                iArr[i + 2] = aVar2.d;
                iArr[i + 3] = aVar2.e;
                int i4 = i + 5;
                iArr[i + 4] = aVar2.f;
                i += 6;
                iArr[i4] = aVar2.g;
                this.c[i2] = aVar2.h.ordinal();
                this.d[i2] = aVar2.i.ordinal();
            }
            this.e = aVar.h;
            this.f = aVar.k;
            this.g = aVar.v;
            this.h = aVar.l;
            this.i = aVar.m;
            this.j = aVar.n;
            this.k = aVar.o;
            this.l = aVar.p;
            this.m = aVar.q;
            this.n = aVar.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(@NonNull androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.a.length) {
                p.a aVar2 = new p.a();
                int i3 = i + 1;
                aVar2.a = this.a[i];
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.a[i3]);
                }
                aVar2.h = d.b.values()[this.c[i2]];
                aVar2.i = d.b.values()[this.d[i2]];
                int[] iArr = this.a;
                int i4 = i + 2;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.c = z;
                int i5 = iArr[i4];
                aVar2.d = i5;
                int i6 = iArr[i + 3];
                aVar2.e = i6;
                int i7 = i + 5;
                int i8 = iArr[i + 4];
                aVar2.f = i8;
                i += 6;
                int i9 = iArr[i7];
                aVar2.g = i9;
                aVar.d = i5;
                aVar.e = i6;
                aVar.f = i8;
                aVar.g = i9;
                aVar.g(aVar2);
                i2++;
            } else {
                aVar.h = this.e;
                aVar.k = this.f;
                aVar.i = true;
                aVar.l = this.h;
                aVar.m = this.i;
                aVar.n = this.j;
                aVar.o = this.k;
                aVar.p = this.l;
                aVar.q = this.m;
                aVar.r = this.n;
                return;
            }
        }
    }

    @NonNull
    public androidx.fragment.app.a b(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.v = this.g;
        for (int i = 0; i < this.b.size(); i++) {
            String str = this.b.get(i);
            if (str != null) {
                aVar.c.get(i).b = fragmentManager.i0(str);
            }
        }
        aVar.C(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
