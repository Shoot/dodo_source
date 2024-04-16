package im.threads.business.rest.models;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.BuildConfig;
import im.threads.business.utils.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VersionsModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\t\u0010\u001b\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001e"}, d2 = {"Lim/threads/business/rest/models/VersionsModel;", "", "api", "Lim/threads/business/rest/models/VersionItemModel;", "datastore", "gate", "(Lim/threads/business/rest/models/VersionItemModel;Lim/threads/business/rest/models/VersionItemModel;Lim/threads/business/rest/models/VersionItemModel;)V", "getApi", "()Lim/threads/business/rest/models/VersionItemModel;", "getDatastore", "getGate", "component1", "component2", "component3", "copy", "equals", "", "other", "getSpacing", "Lkotlin/Pair;", "", "text", "", "spaceSize", "getVersionDataLine", Action.NAME_ATTRIBUTE, "version", "hashCode", "toString", "toTableString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VersionsModel {
    private final VersionItemModel api;
    private final VersionItemModel datastore;
    private final VersionItemModel gate;

    public VersionsModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ VersionsModel copy$default(VersionsModel versionsModel, VersionItemModel versionItemModel, VersionItemModel versionItemModel2, VersionItemModel versionItemModel3, int i, Object obj) {
        if ((i & 1) != 0) {
            versionItemModel = versionsModel.api;
        }
        if ((i & 2) != 0) {
            versionItemModel2 = versionsModel.datastore;
        }
        if ((i & 4) != 0) {
            versionItemModel3 = versionsModel.gate;
        }
        return versionsModel.copy(versionItemModel, versionItemModel2, versionItemModel3);
    }

    private final Pair<Integer, Integer> getSpacing(String str, int i) {
        int i2;
        int length = i - str.length();
        int i3 = length / 2;
        if (length % 2 == 0) {
            i2 = i3;
        } else {
            i2 = i3 + 1;
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    private final String getVersionDataLine(String str, String str2) {
        Pair<Integer, Integer> spacing = getSpacing(str, 25);
        Pair<Integer, Integer> spacing2 = getSpacing(str2, 22);
        String paddingStartEnd$default = StringExtensionsKt.paddingStartEnd$default(str, spacing.c().intValue(), spacing.d().intValue(), null, null, 12, null);
        String paddingStartEnd$default2 = StringExtensionsKt.paddingStartEnd$default(str2, spacing2.c().intValue(), spacing2.d().intValue(), null, null, 12, null);
        return HiAnalyticsConstant.REPORT_VAL_SEPARATOR + paddingStartEnd$default + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + paddingStartEnd$default2 + "|\n";
    }

    public final VersionItemModel component1() {
        return this.api;
    }

    public final VersionItemModel component2() {
        return this.datastore;
    }

    public final VersionItemModel component3() {
        return this.gate;
    }

    public final VersionsModel copy(VersionItemModel versionItemModel, VersionItemModel versionItemModel2, VersionItemModel versionItemModel3) {
        return new VersionsModel(versionItemModel, versionItemModel2, versionItemModel3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionsModel)) {
            return false;
        }
        VersionsModel versionsModel = (VersionsModel) obj;
        if (z65.c(this.api, versionsModel.api) && z65.c(this.datastore, versionsModel.datastore) && z65.c(this.gate, versionsModel.gate)) {
            return true;
        }
        return false;
    }

    public final VersionItemModel getApi() {
        return this.api;
    }

    public final VersionItemModel getDatastore() {
        return this.datastore;
    }

    public final VersionItemModel getGate() {
        return this.gate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        VersionItemModel versionItemModel = this.api;
        int i = 0;
        if (versionItemModel == null) {
            hashCode = 0;
        } else {
            hashCode = versionItemModel.hashCode();
        }
        int i2 = hashCode * 31;
        VersionItemModel versionItemModel2 = this.datastore;
        if (versionItemModel2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = versionItemModel2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        VersionItemModel versionItemModel3 = this.gate;
        if (versionItemModel3 != null) {
            i = versionItemModel3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        VersionItemModel versionItemModel = this.api;
        VersionItemModel versionItemModel2 = this.datastore;
        VersionItemModel versionItemModel3 = this.gate;
        return "VersionsModel(api=" + versionItemModel + ", datastore=" + versionItemModel2 + ", gate=" + versionItemModel3 + ")";
    }

    public final String toTableString() {
        String version;
        VersionItemModel versionItemModel = this.api;
        String str = "unavailable";
        String str2 = (versionItemModel == null || (str2 = versionItemModel.getVersion()) == null) ? "unavailable" : "unavailable";
        VersionItemModel versionItemModel2 = this.gate;
        String str3 = (versionItemModel2 == null || (str3 = versionItemModel2.getVersion()) == null) ? "unavailable" : "unavailable";
        VersionItemModel versionItemModel3 = this.datastore;
        if (versionItemModel3 != null && (version = versionItemModel3.getVersion()) != null) {
            str = version;
        }
        String str4 = "Versions:\n+-------------------------+----------------------+\n|        Component        |        Version       |\n+-------------------------+----------------------+\n" + getVersionDataLine("ChatCenter SDK", BuildConfig.VERSION_NAME) + getVersionDataLine("Backend", str2) + getVersionDataLine("ThreadsGate", str3) + getVersionDataLine("DataStore", str) + "+-------------------------+----------------------+\n";
        z65.g(str4, "stringBuilder.toString()");
        return str4;
    }

    public VersionsModel(VersionItemModel versionItemModel, VersionItemModel versionItemModel2, VersionItemModel versionItemModel3) {
        this.api = versionItemModel;
        this.datastore = versionItemModel2;
        this.gate = versionItemModel3;
    }

    public /* synthetic */ VersionsModel(VersionItemModel versionItemModel, VersionItemModel versionItemModel2, VersionItemModel versionItemModel3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : versionItemModel, (i & 2) != 0 ? null : versionItemModel2, (i & 4) != 0 ? null : versionItemModel3);
    }
}
