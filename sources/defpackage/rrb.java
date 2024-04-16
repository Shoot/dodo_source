package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InitData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\f\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006\""}, d2 = {"Lrrb;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "token", "isTokenAvailable", "isNotificationsEnabled", "instanceId", "version", "notificationProvider", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "Z", "()Z", "getInstanceId", "I", "getVersion", "()I", "getNotificationProvider", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rrb  reason: default package */
/* loaded from: classes.dex */
public final class rrb {
    @uca("instanceId")
    private final String instanceId;
    @uca("isNotificationsEnabled")
    private final boolean isNotificationsEnabled;
    @uca("isTokenAvailable")
    private final boolean isTokenAvailable;
    @uca("notificationProvider")
    private final String notificationProvider;
    @uca("token")
    private final String token;
    @uca("version")
    private final int version;

    public rrb(String str, boolean z, boolean z2, String str2, int i, String str3) {
        z65.h(str, "token");
        z65.h(str2, "instanceId");
        z65.h(str3, "notificationProvider");
        this.token = str;
        this.isTokenAvailable = z;
        this.isNotificationsEnabled = z2;
        this.instanceId = str2;
        this.version = i;
        this.notificationProvider = str3;
    }

    public static /* synthetic */ rrb copy$default(rrb rrbVar, String str, boolean z, boolean z2, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rrbVar.token;
        }
        if ((i2 & 2) != 0) {
            z = rrbVar.isTokenAvailable;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = rrbVar.isNotificationsEnabled;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            str2 = rrbVar.instanceId;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = rrbVar.version;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = rrbVar.notificationProvider;
        }
        return rrbVar.copy(str, z3, z4, str4, i3, str3);
    }

    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.isTokenAvailable;
    }

    public final boolean component3() {
        return this.isNotificationsEnabled;
    }

    public final String component4() {
        return this.instanceId;
    }

    public final int component5() {
        return this.version;
    }

    public final String component6() {
        return this.notificationProvider;
    }

    public final rrb copy(String str, boolean z, boolean z2, String str2, int i, String str3) {
        z65.h(str, "token");
        z65.h(str2, "instanceId");
        z65.h(str3, "notificationProvider");
        return new rrb(str, z, z2, str2, i, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrb)) {
            return false;
        }
        rrb rrbVar = (rrb) obj;
        if (z65.c(this.token, rrbVar.token) && this.isTokenAvailable == rrbVar.isTokenAvailable && this.isNotificationsEnabled == rrbVar.isNotificationsEnabled && z65.c(this.instanceId, rrbVar.instanceId) && this.version == rrbVar.version && z65.c(this.notificationProvider, rrbVar.notificationProvider)) {
            return true;
        }
        return false;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getNotificationProvider() {
        return this.notificationProvider;
    }

    public final String getToken() {
        return this.token;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        boolean z = this.isTokenAvailable;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.isNotificationsEnabled;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((((i3 + i) * 31) + this.instanceId.hashCode()) * 31) + this.version) * 31) + this.notificationProvider.hashCode();
    }

    public final boolean isNotificationsEnabled() {
        return this.isNotificationsEnabled;
    }

    public final boolean isTokenAvailable() {
        return this.isTokenAvailable;
    }

    public String toString() {
        return "UpdateData(token=" + this.token + ", isTokenAvailable=" + this.isTokenAvailable + ", isNotificationsEnabled=" + this.isNotificationsEnabled + ", instanceId=" + this.instanceId + ", version=" + this.version + ", notificationProvider=" + this.notificationProvider + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
