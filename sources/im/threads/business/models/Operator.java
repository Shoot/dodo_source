package im.threads.business.models;

import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: Operator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006+"}, d2 = {"Lim/threads/business/models/Operator;", "", "()V", "alias", "", "getAlias", "()Ljava/lang/String;", "setAlias", "(Ljava/lang/String;)V", "aliasOrName", "getAliasOrName", "gender", "Lim/threads/business/models/Operator$Gender;", "getGender", "()Lim/threads/business/models/Operator$Gender;", "setGender", "(Lim/threads/business/models/Operator$Gender;)V", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maxThreads", "getMaxThreads", "setMaxThreads", Action.NAME_ATTRIBUTE, "getName", "setName", "orgUnit", "getOrgUnit", "setOrgUnit", "photoUrl", "getPhotoUrl", "setPhotoUrl", "role", "getRole", "setRole", "status", "getStatus", "setStatus", "Gender", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Operator {
    private String alias;
    private Gender gender = Gender.FEMALE;
    private Long id;
    private Long maxThreads;
    private String name;
    private String orgUnit;
    private String photoUrl;
    private String role;
    private String status;

    /* compiled from: Operator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lim/threads/business/models/Operator$Gender;", "", "(Ljava/lang/String;I)V", "MALE", "FEMALE", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum Gender {
        MALE,
        FEMALE
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getAliasOrName() {
        if (!TextUtils.isEmpty(this.alias)) {
            return this.alias;
        }
        return this.name;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Long getId() {
        return this.id;
    }

    public final Long getMaxThreads() {
        return this.maxThreads;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrgUnit() {
        return this.orgUnit;
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

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setGender(Gender gender) {
        z65.h(gender, "<set-?>");
        this.gender = gender;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setMaxThreads(Long l) {
        this.maxThreads = l;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOrgUnit(String str) {
        this.orgUnit = str;
    }

    public final void setPhotoUrl(String str) {
        this.photoUrl = str;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }
}
