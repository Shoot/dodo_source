package ru.dodopizza.mindbox.model;

import kotlin.Metadata;
/* compiled from: User.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lru/dodopizza/mindbox/model/User;", "", "id", "", "fullName", "phoneNumber", "birthDate", "email", "isSubscribedToEmail", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBirthDate", "()Ljava/lang/String;", "getEmail", "getFullName", "getId", "()Z", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class User {
    private final String birthDate;
    private final String email;
    private final String fullName;
    private final String id;
    private final boolean isSubscribedToEmail;
    private final String phoneNumber;

    public User(String str, String str2, String str3, String str4, String str5, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "fullName");
        z65.h(str3, "phoneNumber");
        z65.h(str4, "birthDate");
        z65.h(str5, "email");
        this.id = str;
        this.fullName = str2;
        this.phoneNumber = str3;
        this.birthDate = str4;
        this.email = str5;
        this.isSubscribedToEmail = z;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.id;
        }
        if ((i & 2) != 0) {
            str2 = user.fullName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = user.phoneNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = user.birthDate;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = user.email;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = user.isSubscribedToEmail;
        }
        return user.copy(str, str6, str7, str8, str9, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.fullName;
    }

    public final String component3() {
        return this.phoneNumber;
    }

    public final String component4() {
        return this.birthDate;
    }

    public final String component5() {
        return this.email;
    }

    public final boolean component6() {
        return this.isSubscribedToEmail;
    }

    public final User copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        z65.h(str, "id");
        z65.h(str2, "fullName");
        z65.h(str3, "phoneNumber");
        z65.h(str4, "birthDate");
        z65.h(str5, "email");
        return new User(str, str2, str3, str4, str5, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (z65.c(this.id, user.id) && z65.c(this.fullName, user.fullName) && z65.c(this.phoneNumber, user.phoneNumber) && z65.c(this.birthDate, user.birthDate) && z65.c(this.email, user.email) && this.isSubscribedToEmail == user.isSubscribedToEmail) {
            return true;
        }
        return false;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.email.hashCode()) * 31) + a91.a(this.isSubscribedToEmail);
    }

    public final boolean isSubscribedToEmail() {
        return this.isSubscribedToEmail;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.fullName;
        String str3 = this.phoneNumber;
        String str4 = this.birthDate;
        String str5 = this.email;
        boolean z = this.isSubscribedToEmail;
        return "User(id=" + str + ", fullName=" + str2 + ", phoneNumber=" + str3 + ", birthDate=" + str4 + ", email=" + str5 + ", isSubscribedToEmail=" + z + ")";
    }
}
