package com.inappstory.sdk.stories.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes3.dex */
public class GameInstance implements Parcelable {
    public static final Parcelable.Creator<GameInstance> CREATOR = new a();
    public String id;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<GameInstance> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GameInstance createFromParcel(Parcel parcel) {
            return new GameInstance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GameInstance[] newArray(int i) {
            return new GameInstance[i];
        }
    }

    public GameInstance() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GameInstance) && this.id == ((GameInstance) obj).id) {
            return true;
        }
        return false;
    }

    public GameInstance getSimpleCopy() {
        GameInstance gameInstance = new GameInstance();
        gameInstance.id = this.id;
        return gameInstance;
    }

    public int hashCode() {
        return this.id.hashCode() * 31;
    }

    public void readFromParcel(Parcel parcel) {
        this.id = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }

    public GameInstance(Parcel parcel) {
        readFromParcel(parcel);
    }
}
