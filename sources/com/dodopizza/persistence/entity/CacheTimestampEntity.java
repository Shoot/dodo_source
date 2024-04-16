package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CacheTimestampEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/CacheTimestampEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "", "createdAt", "J", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "expirationTime", "getExpirationTime", "setExpirationTime", "<init>", "(Ljava/lang/String;JJ)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CacheTimestampEntity extends n0 implements yi3, qec {
    private long createdAt;
    private long expirationTime;
    private String id;

    public CacheTimestampEntity() {
        this(null, 0L, 0L, 7, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public long getExpirationTime() {
        return realmGet$expirationTime();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.qec
    public long realmGet$createdAt() {
        return this.createdAt;
    }

    @Override // defpackage.qec
    public long realmGet$expirationTime() {
        return this.expirationTime;
    }

    @Override // defpackage.qec
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.qec
    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    @Override // defpackage.qec
    public void realmSet$expirationTime(long j) {
        this.expirationTime = j;
    }

    @Override // defpackage.qec
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setExpirationTime(long j) {
        realmSet$expirationTime(j);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ CacheTimestampEntity(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CacheTimestampEntity(String str, long j, long j2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id(str);
        realmSet$createdAt(j);
        realmSet$expirationTime(j2);
    }
}
