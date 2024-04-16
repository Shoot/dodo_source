package com.dodopizza.persistence.entity.deliverylocation;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoordinatesEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "Lyi3;", "Lio/realm/n0;", "", "lat", "D", "getLat", "()D", "setLat", "(D)V", "lon", "getLon", "setLon", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "(DD)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class CoordinatesEntity extends n0 implements yi3, igc {
    private String id;
    private double lat;
    private double lon;

    public CoordinatesEntity() {
        this(0.0d, 0.0d, 3, null);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    @Override // defpackage.yi3
    public String getId() {
        return realmGet$id();
    }

    public double getLat() {
        return realmGet$lat();
    }

    public double getLon() {
        return realmGet$lon();
    }

    @Override // defpackage.igc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.igc
    public double realmGet$lat() {
        return this.lat;
    }

    @Override // defpackage.igc
    public double realmGet$lon() {
        return this.lon;
    }

    @Override // defpackage.igc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.igc
    public void realmSet$lat(double d) {
        this.lat = d;
    }

    @Override // defpackage.igc
    public void realmSet$lon(double d) {
        this.lon = d;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setLat(double d) {
        realmSet$lat(d);
    }

    public void setLon(double d) {
        realmSet$lon(d);
    }

    public /* synthetic */ CoordinatesEntity(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        if (this instanceof r89) {
            ((r89) this).b();
        }
    }

    public CoordinatesEntity(double d, double d2) {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$lat(d);
        realmSet$lon(d2);
    }
}
