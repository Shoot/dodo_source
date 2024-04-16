package im.threads.business.models;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: Client.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001c\u0010&\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001c\u0010)\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0010\"\u0004\b+\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012¨\u0006/"}, d2 = {"Lim/threads/business/models/Client;", "", "()V", "blockRequested", "", "getBlockRequested", "()Ljava/lang/Boolean;", "setBlockRequested", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "blocked", "getBlocked", "setBlocked", "closedThreads", "", "getClosedThreads", "()Ljava/lang/String;", "setClosedThreads", "(Ljava/lang/String;)V", "data", "getData", "setData", "email", "getEmail", "setEmail", "externalClientId", "getExternalClientId", "setExternalClientId", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "lastThreadTime", "getLastThreadTime", "setLastThreadTime", Action.NAME_ATTRIBUTE, "getName", "setName", "online", "getOnline", "setOnline", "phone", "getPhone", "setPhone", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Client {
    private Boolean blockRequested;
    private Boolean blocked;
    private String closedThreads;
    private String data;
    private String email;
    private String externalClientId;
    private Long id;
    private String lastThreadTime;
    private String name;
    private String online;
    private String phone;

    public final Boolean getBlockRequested() {
        return this.blockRequested;
    }

    public final Boolean getBlocked() {
        return this.blocked;
    }

    public final String getClosedThreads() {
        return this.closedThreads;
    }

    public final String getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExternalClientId() {
        return this.externalClientId;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getLastThreadTime() {
        return this.lastThreadTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOnline() {
        return this.online;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setBlockRequested(Boolean bool) {
        this.blockRequested = bool;
    }

    public final void setBlocked(Boolean bool) {
        this.blocked = bool;
    }

    public final void setClosedThreads(String str) {
        this.closedThreads = str;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setExternalClientId(String str) {
        this.externalClientId = str;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setLastThreadTime(String str) {
        this.lastThreadTime = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnline(String str) {
        this.online = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }
}
