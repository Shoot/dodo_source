package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: IdentifierGenerator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J#\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lwpb;", "Lit4;", "Ljava/util/UUID;", c.a, "", "", "params", DateTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;)Ljava/util/UUID;", "<init>", "()V", "general"}, k = 1, mv = {1, 9, 0})
/* renamed from: wpb  reason: default package */
/* loaded from: classes.dex */
public final class wpb implements it4<UUID> {
    public static final wpb a = new wpb();

    private wpb() {
    }

    @Override // defpackage.it4
    /* renamed from: c */
    public UUID b() {
        UUID randomUUID = UUID.randomUUID();
        z65.g(randomUUID, "randomUUID(...)");
        return randomUUID;
    }

    @Override // defpackage.it4
    /* renamed from: d */
    public UUID a(Object... objArr) {
        String O;
        z65.h(objArr, "params");
        O = yr.O(objArr, "-", null, null, 0, null, null, 62, null);
        byte[] bytes = O.getBytes(rw0.b);
        z65.g(bytes, "getBytes(...)");
        UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        z65.g(nameUUIDFromBytes, "let(...)");
        return nameUUIDFromBytes;
    }
}
