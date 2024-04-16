package im.threads.business.transport.models;

import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: Operator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lim/threads/business/transport/models/Operator;", "", "()V", "alias", "", "getAlias", "()Ljava/lang/String;", "aliasOrName", "getAliasOrName", "gender", "getGender", "id", "", "getId", "()J", Action.NAME_ATTRIBUTE, "getName", "organizationUnit", "getOrganizationUnit", "photoUrl", "getPhotoUrl", "role", "getRole", "status", "getStatus", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Operator {
    private final String alias;
    private final String gender;
    private final long id;
    private final String name;
    private final String organizationUnit;
    private final String photoUrl;
    private final String role;
    private final String status;

    public final String getAlias() {
        return this.alias;
    }

    public final String getAliasOrName() {
        if (!TextUtils.isEmpty(this.alias)) {
            return this.alias;
        }
        return this.name;
    }

    public final String getGender() {
        return this.gender;
    }

    public final long getId() {
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
}
