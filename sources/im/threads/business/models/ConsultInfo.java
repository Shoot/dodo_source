package im.threads.business.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConsultInfo.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JQ\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006)"}, d2 = {"Lim/threads/business/models/ConsultInfo;", "Landroid/os/Parcelable;", "", "toString", "Lmb5;", "toJson", "component1", "component2", "component3", "component4", "component5", "component6", Action.NAME_ATTRIBUTE, "id", "status", "organizationUnit", "photoUrl", "role", "copy", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getId", "getStatus", "getOrganizationUnit", "getPhotoUrl", "getRole", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConsultInfo implements Parcelable {
    public static final Parcelable.Creator<ConsultInfo> CREATOR = new Creator();
    private final String id;
    private final String name;
    private final String organizationUnit;
    private final String photoUrl;
    private final String role;
    private final String status;

    /* compiled from: ConsultInfo.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ConsultInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsultInfo createFromParcel(Parcel parcel) {
            z65.h(parcel, "parcel");
            return new ConsultInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsultInfo[] newArray(int i) {
            return new ConsultInfo[i];
        }
    }

    public ConsultInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ConsultInfo copy$default(ConsultInfo consultInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consultInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = consultInfo.id;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = consultInfo.status;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = consultInfo.organizationUnit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = consultInfo.photoUrl;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = consultInfo.role;
        }
        return consultInfo.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.organizationUnit;
    }

    public final String component5() {
        return this.photoUrl;
    }

    public final String component6() {
        return this.role;
    }

    public final ConsultInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ConsultInfo(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsultInfo)) {
            return false;
        }
        ConsultInfo consultInfo = (ConsultInfo) obj;
        if (z65.c(this.name, consultInfo.name) && z65.c(this.id, consultInfo.id) && z65.c(this.status, consultInfo.status) && z65.c(this.organizationUnit, consultInfo.organizationUnit) && z65.c(this.photoUrl, consultInfo.photoUrl) && z65.c(this.role, consultInfo.role)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.id;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.status;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.organizationUnit;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.photoUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.role;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 + i;
    }

    public final mb5 toJson() {
        mb5 mb5Var = new mb5();
        mb5Var.z(Action.NAME_ATTRIBUTE, this.name);
        mb5Var.z("status", this.status);
        mb5Var.z("id", this.id);
        mb5Var.z("photoUrl", this.photoUrl);
        mb5Var.z("role", this.role);
        return mb5Var;
    }

    public String toString() {
        CharSequence R0;
        String str = this.name;
        String str2 = this.id;
        String str3 = this.status;
        String str4 = this.organizationUnit;
        String str5 = this.photoUrl;
        String str6 = this.role;
        R0 = m0b.R0("ConsultInfo{\n            name='" + str + "',\n            id=" + str2 + ",\n            status='" + str3 + "',\n            organizationUnit='" + str4 + "',\n            photoUrl='" + str5 + "',\n            role='" + str6 + "'\n            }\n        ");
        return R0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        z65.h(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeString(this.status);
        parcel.writeString(this.organizationUnit);
        parcel.writeString(this.photoUrl);
        parcel.writeString(this.role);
    }

    public ConsultInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.name = str;
        this.id = str2;
        this.status = str3;
        this.organizationUnit = str4;
        this.photoUrl = str5;
        this.role = str6;
    }

    public /* synthetic */ ConsultInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
