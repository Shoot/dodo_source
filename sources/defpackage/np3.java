package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: FavoriteProductVO.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0010\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006&"}, d2 = {"Lnp3;", "Lmq8;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "b", "imageUrl", "Lhn6;", c.a, "Lhn6;", e.a, "()Lhn6;", "price", "Llq8;", DateTokenConverter.CONVERTER_KEY, "Llq8;", "g", "()Llq8;", MessageAttributes.TYPE, "", "Z", Image.TYPE_HIGH, "()Z", "isNewDesign", "Lre6;", "f", "Lre6;", "()Lre6;", "menuItemType", "menuItemId", "Lmp3;", "Lmp3;", "()Lmp3;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhn6;Llq8;ZLre6;Ljava/lang/String;Lmp3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: np3  reason: default package */
/* loaded from: classes2.dex */
public final class np3 extends mq8 {
    private final String a;
    private final String b;
    private final hn6 c;
    private final lq8 d;
    private final boolean e;
    private final re6 f;
    private final String g;
    private final mp3 h;

    public np3(String str, String str2, hn6 hn6Var, lq8 lq8Var, boolean z, re6 re6Var, String str3, mp3 mp3Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "imageUrl");
        z65.h(hn6Var, "price");
        z65.h(lq8Var, MessageAttributes.TYPE);
        z65.h(re6Var, "menuItemType");
        z65.h(str3, "menuItemId");
        z65.h(mp3Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = str;
        this.b = str2;
        this.c = hn6Var;
        this.d = lq8Var;
        this.e = z;
        this.f = re6Var;
        this.g = str3;
        this.h = mp3Var;
    }

    @Override // defpackage.mq8
    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public final String c() {
        return this.g;
    }

    public final re6 d() {
        return this.f;
    }

    public hn6 e() {
        return this.c;
    }

    public final mp3 f() {
        return this.h;
    }

    public lq8 g() {
        return this.d;
    }

    public boolean h() {
        return this.e;
    }
}
