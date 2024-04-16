package com.dodopizza.persistence.entity.locality;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SocialNetworkInfoEntity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/persistence/entity/locality/SocialNetworkInfoEntity;", "Lyi3;", "Lio/realm/n0;", "", Action.NAME_ATTRIBUTE, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", RemoteMessageConst.Notification.URL, "getUrl", "setUrl", "id", "getId", "setId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class SocialNetworkInfoEntity extends n0 implements yi3, pgc {
    private String id;
    private String name;
    private String url;

    public SocialNetworkInfoEntity() {
        this(null, null, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getUrl() {
        return realmGet$url();
    }

    @Override // defpackage.pgc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.pgc
    public String realmGet$name() {
        return this.name;
    }

    @Override // defpackage.pgc
    public String realmGet$url() {
        return this.url;
    }

    @Override // defpackage.pgc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.pgc
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // defpackage.pgc
    public void realmSet$url(String str) {
        this.url = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setName(String str) {
        z65.h(str, "<set-?>");
        realmSet$name(str);
    }

    public void setUrl(String str) {
        z65.h(str, "<set-?>");
        realmSet$url(str);
    }

    public /* synthetic */ SocialNetworkInfoEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public SocialNetworkInfoEntity(String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, RemoteMessageConst.Notification.URL);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$name(str);
        realmSet$url(str2);
    }
}
