package defpackage;

import java.util.UUID;
import kotlin.Metadata;
/* compiled from: UUIDEntityIdGenerator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lvpb;", "Lbj3;", "", "a", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: vpb  reason: default package */
/* loaded from: classes2.dex */
public final class vpb implements bj3 {
    public static final vpb a = new vpb();

    private vpb() {
    }

    @Override // defpackage.bj3
    public String a() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "randomUUID().toString()");
        return uuid;
    }
}
