package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ServerDeltaTimeEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\tR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/persistence/entity/ServerDeltaTimeEntity;", "Lyi3;", "Lio/realm/n0;", "", "delta", "J", "getDelta", "()J", "setDelta", "(J)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class ServerDeltaTimeEntity extends n0 implements yi3, bfc {
    public static final Companion Companion = new Companion(null);
    public static final String ID_VALUE = "ID";
    private long delta;
    private String id;

    /* compiled from: ServerDeltaTimeEntity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dodopizza/persistence/entity/ServerDeltaTimeEntity$Companion;", "", "()V", "ID_VALUE", "", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ServerDeltaTimeEntity() {
        this(0L, 1, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public long getDelta() {
        return realmGet$delta();
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    @Override // defpackage.bfc
    public long realmGet$delta() {
        return this.delta;
    }

    @Override // defpackage.bfc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.bfc
    public void realmSet$delta(long j) {
        this.delta = j;
    }

    @Override // defpackage.bfc
    public void realmSet$id(String str) {
        this.id = str;
    }

    public void setDelta(long j) {
        realmSet$delta(j);
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public /* synthetic */ ServerDeltaTimeEntity(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public ServerDeltaTimeEntity(long j) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$delta(j);
        realmSet$id(ID_VALUE);
    }
}
