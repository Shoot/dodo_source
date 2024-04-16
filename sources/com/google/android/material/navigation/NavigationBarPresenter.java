package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.internal.ParcelableSparseArray;
/* loaded from: classes2.dex */
public class NavigationBarPresenter implements j {
    private e a;
    private b b;
    private boolean c = false;
    private int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        ParcelableSparseArray b;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(@NonNull Parcel parcel) {
            this.a = parcel.readInt();
            this.b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, 0);
        }
    }

    public void b(int i) {
        this.d = i;
    }

    public void c(@NonNull b bVar) {
        this.b = bVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(@NonNull Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.b.o(savedState.a);
            this.b.n(com.google.android.material.badge.b.c(this.b.getContext(), savedState.b));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.j
    @NonNull
    public Parcelable h() {
        SavedState savedState = new SavedState();
        savedState.a = this.b.getSelectedItemId();
        savedState.b = com.google.android.material.badge.b.d(this.b.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        if (this.c) {
            return;
        }
        if (z) {
            this.b.d();
        } else {
            this.b.p();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(@NonNull Context context, @NonNull e eVar) {
        this.a = eVar;
        this.b.c(eVar);
    }

    public void m(boolean z) {
        this.c = z;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
    }
}
