package ru.dodopizza.mindbox.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RegisterMindbox.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/dodopizza/mindbox/model/RegisterMindbox;", "", "installationId", "", "hubName", "connectionString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConnectionString", "()Ljava/lang/String;", "getHubName", "getInstallationId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mindbox_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegisterMindbox {
    private final String connectionString;
    private final String hubName;
    private final String installationId;

    public RegisterMindbox() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RegisterMindbox copy$default(RegisterMindbox registerMindbox, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerMindbox.installationId;
        }
        if ((i & 2) != 0) {
            str2 = registerMindbox.hubName;
        }
        if ((i & 4) != 0) {
            str3 = registerMindbox.connectionString;
        }
        return registerMindbox.copy(str, str2, str3);
    }

    public final String component1() {
        return this.installationId;
    }

    public final String component2() {
        return this.hubName;
    }

    public final String component3() {
        return this.connectionString;
    }

    public final RegisterMindbox copy(String str, String str2, String str3) {
        z65.h(str, "installationId");
        z65.h(str2, "hubName");
        z65.h(str3, "connectionString");
        return new RegisterMindbox(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterMindbox)) {
            return false;
        }
        RegisterMindbox registerMindbox = (RegisterMindbox) obj;
        if (z65.c(this.installationId, registerMindbox.installationId) && z65.c(this.hubName, registerMindbox.hubName) && z65.c(this.connectionString, registerMindbox.connectionString)) {
            return true;
        }
        return false;
    }

    public final String getConnectionString() {
        return this.connectionString;
    }

    public final String getHubName() {
        return this.hubName;
    }

    public final String getInstallationId() {
        return this.installationId;
    }

    public int hashCode() {
        return (((this.installationId.hashCode() * 31) + this.hubName.hashCode()) * 31) + this.connectionString.hashCode();
    }

    public String toString() {
        String str = this.installationId;
        String str2 = this.hubName;
        String str3 = this.connectionString;
        return "RegisterMindbox(installationId=" + str + ", hubName=" + str2 + ", connectionString=" + str3 + ")";
    }

    public RegisterMindbox(String str, String str2, String str3) {
        z65.h(str, "installationId");
        z65.h(str2, "hubName");
        z65.h(str3, "connectionString");
        this.installationId = str;
        this.hubName = str2;
        this.connectionString = str3;
    }

    public /* synthetic */ RegisterMindbox(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
