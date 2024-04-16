package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PackageInfoEntity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;", "Lio/realm/n0;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "switcherTitle", "getSwitcherTitle", "setSwitcherTitle", "actionTitle", "getActionTitle", "setActionTitle", "actionUrl", "getActionUrl", "setActionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class PackageWidgetDataEntity extends n0 implements xec {
    private String actionTitle;
    private String actionUrl;
    private String description;
    private String switcherTitle;
    private String title;

    public PackageWidgetDataEntity() {
        this(null, null, null, null, null, 31, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public String getActionTitle() {
        return realmGet$actionTitle();
    }

    public String getActionUrl() {
        return realmGet$actionUrl();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String getSwitcherTitle() {
        return realmGet$switcherTitle();
    }

    public String getTitle() {
        return realmGet$title();
    }

    @Override // defpackage.xec
    public String realmGet$actionTitle() {
        return this.actionTitle;
    }

    @Override // defpackage.xec
    public String realmGet$actionUrl() {
        return this.actionUrl;
    }

    @Override // defpackage.xec
    public String realmGet$description() {
        return this.description;
    }

    @Override // defpackage.xec
    public String realmGet$switcherTitle() {
        return this.switcherTitle;
    }

    @Override // defpackage.xec
    public String realmGet$title() {
        return this.title;
    }

    @Override // defpackage.xec
    public void realmSet$actionTitle(String str) {
        this.actionTitle = str;
    }

    @Override // defpackage.xec
    public void realmSet$actionUrl(String str) {
        this.actionUrl = str;
    }

    @Override // defpackage.xec
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // defpackage.xec
    public void realmSet$switcherTitle(String str) {
        this.switcherTitle = str;
    }

    @Override // defpackage.xec
    public void realmSet$title(String str) {
        this.title = str;
    }

    public void setActionTitle(String str) {
        realmSet$actionTitle(str);
    }

    public void setActionUrl(String str) {
        realmSet$actionUrl(str);
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }

    public void setSwitcherTitle(String str) {
        realmSet$switcherTitle(str);
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public /* synthetic */ PackageWidgetDataEntity(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public PackageWidgetDataEntity(String str, String str2, String str3, String str4, String str5) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$title(str);
        realmSet$description(str2);
        realmSet$switcherTitle(str3);
        realmSet$actionTitle(str4);
        realmSet$actionUrl(str5);
    }
}
