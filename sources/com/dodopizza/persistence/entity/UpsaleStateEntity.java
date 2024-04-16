package com.dodopizza.persistence.entity;

import io.realm.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleStateEntity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0017\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/persistence/entity/UpsaleStateEntity;", "Lyi3;", "Lio/realm/n0;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "getWorkflowId", "setWorkflowId", "", "state", "I", "getState", "()I", "setState", "(I)V", "<init>", "()V", "(Ljava/lang/String;I)V", "Companion", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class UpsaleStateEntity extends n0 implements yi3, efc {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_NAME_WORKFLOW_ID = "workflowId";
    public static final int UPSALE_ADDED = 2;
    public static final int UPSALE_DISMISSED = 3;
    public static final int UPSALE_IDLE = 1;
    private String id;
    private int state;
    private String workflowId;

    /* compiled from: UpsaleStateEntity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/dodopizza/persistence/entity/UpsaleStateEntity$Companion;", "", "()V", "FIELD_NAME_WORKFLOW_ID", "", "UPSALE_ADDED", "", "UPSALE_DISMISSED", "UPSALE_IDLE", "persistence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpsaleStateEntity() {
        if (this instanceof r89) {
            ((r89) this).b();
        }
        realmSet$id("");
        realmSet$state(1);
    }

    @Override // defpackage.yi3
    public String getId() {
        String workflowId = getWorkflowId();
        if (workflowId == null) {
            return "";
        }
        return workflowId;
    }

    public int getState() {
        return realmGet$state();
    }

    public String getWorkflowId() {
        return realmGet$workflowId();
    }

    @Override // defpackage.efc
    public String realmGet$id() {
        return this.id;
    }

    @Override // defpackage.efc
    public int realmGet$state() {
        return this.state;
    }

    @Override // defpackage.efc
    public String realmGet$workflowId() {
        return this.workflowId;
    }

    @Override // defpackage.efc
    public void realmSet$id(String str) {
        this.id = str;
    }

    @Override // defpackage.efc
    public void realmSet$state(int i) {
        this.state = i;
    }

    @Override // defpackage.efc
    public void realmSet$workflowId(String str) {
        this.workflowId = str;
    }

    @Override // defpackage.yi3
    public void setId(String str) {
        realmSet$id(str);
    }

    public void setState(int i) {
        realmSet$state(i);
    }

    public void setWorkflowId(String str) {
        realmSet$workflowId(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpsaleStateEntity(String str, int i) {
        this();
        z65.h(str, FIELD_NAME_WORKFLOW_ID);
        if (this instanceof r89) {
            ((r89) this).b();
        }
        setWorkflowId(str);
        setState(i);
    }
}
