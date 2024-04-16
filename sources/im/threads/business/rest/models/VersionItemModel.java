package im.threads.business.rest.models;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
/* compiled from: VersionItemModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lim/threads/business/rest/models/VersionItemModel;", "", "group", "", "artifact", Action.NAME_ATTRIBUTE, "version", CrashHianalyticsData.TIME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArtifact", "()Ljava/lang/String;", "getGroup", "getName", "getTime", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VersionItemModel {
    private final String artifact;
    private final String group;
    private final String name;
    private final String time;
    private final String version;

    public VersionItemModel(String str, String str2, String str3, String str4, String str5) {
        z65.h(str5, CrashHianalyticsData.TIME);
        this.group = str;
        this.artifact = str2;
        this.name = str3;
        this.version = str4;
        this.time = str5;
    }

    public static /* synthetic */ VersionItemModel copy$default(VersionItemModel versionItemModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionItemModel.group;
        }
        if ((i & 2) != 0) {
            str2 = versionItemModel.artifact;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = versionItemModel.name;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = versionItemModel.version;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = versionItemModel.time;
        }
        return versionItemModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.group;
    }

    public final String component2() {
        return this.artifact;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.version;
    }

    public final String component5() {
        return this.time;
    }

    public final VersionItemModel copy(String str, String str2, String str3, String str4, String str5) {
        z65.h(str5, CrashHianalyticsData.TIME);
        return new VersionItemModel(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionItemModel)) {
            return false;
        }
        VersionItemModel versionItemModel = (VersionItemModel) obj;
        if (z65.c(this.group, versionItemModel.group) && z65.c(this.artifact, versionItemModel.artifact) && z65.c(this.name, versionItemModel.name) && z65.c(this.version, versionItemModel.version) && z65.c(this.time, versionItemModel.time)) {
            return true;
        }
        return false;
    }

    public final String getArtifact() {
        return this.artifact;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.group;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.artifact;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.name;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.version;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((i4 + i) * 31) + this.time.hashCode();
    }

    public String toString() {
        String str = this.group;
        String str2 = this.artifact;
        String str3 = this.name;
        String str4 = this.version;
        String str5 = this.time;
        return "VersionItemModel(group=" + str + ", artifact=" + str2 + ", name=" + str3 + ", version=" + str4 + ", time=" + str5 + ")";
    }
}
