package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOfferVO.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010#\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0001\u0002&'¨\u0006("}, d2 = {"Lp67;", "", "", "a", "()Ljava/lang/String;", "id", DateTokenConverter.CONVERTER_KEY, "offerImageUrl", "Lbwb;", Image.TYPE_HIGH, "()Lbwb;", "validityPeriod", "", "i", "()Z", "j", "(Z)V", "isApplied", "Lbs5;", "b", "()Lbs5;", "k", "(Lbs5;)V", "loadingState", c.a, "offerConditions", "f", "promoCode", e.a, "offerName", "Lu2a;", "g", "()Lu2a;", "l", "(Lu2a;)V", "secretType", "<init>", "()V", "Lk08;", "Lt2a;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p67  reason: default package */
/* loaded from: classes2.dex */
public abstract class p67 {
    private p67() {
    }

    public /* synthetic */ p67(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract bs5 b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract u2a g();

    public abstract bwb h();

    public abstract boolean i();

    public abstract void j(boolean z);

    public abstract void k(bs5 bs5Var);

    public abstract void l(u2a u2aVar);
}
