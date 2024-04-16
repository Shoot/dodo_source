package defpackage;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.outercallbacks.common.reader.CallToActionCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SlideData;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryData;
import defpackage.fz4;
import kotlin.Metadata;
/* compiled from: InAppStoryCallback.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcz4;", "Lfz4;", "Lcom/inappstory/sdk/stories/outercallbacks/common/reader/CallToActionCallback;", "Lcom/inappstory/sdk/stories/outercallbacks/common/reader/SlideData;", "slide", "", RemoteMessageConst.Notification.URL, "Lcom/inappstory/sdk/stories/outercallbacks/common/reader/ClickAction;", "action", "", "callToAction", "Lcr6;", "Lfz4$a;", "a", "Lcr6;", "_callToActionClicks", "Lsha;", "b", "Lsha;", c.a, "()Lsha;", "callToActionClicks", "Lfz4$b;", "_urlClicks", DateTokenConverter.CONVERTER_KEY, "urlClicks", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cz4  reason: default package */
/* loaded from: classes2.dex */
public final class cz4 implements fz4, CallToActionCallback {
    private final cr6<fz4.a> a;
    private final sha<fz4.a> b;
    private final cr6<fz4.b> c;
    private final sha<fz4.b> d;

    public cz4() {
        cr6<fz4.a> b = uha.b(0, Integer.MAX_VALUE, null, 5, null);
        this.a = b;
        this.b = wz3.c(b);
        cr6<fz4.b> b2 = uha.b(0, Integer.MAX_VALUE, null, 5, null);
        this.c = b2;
        this.d = wz3.c(b2);
    }

    @Override // defpackage.fz4
    /* renamed from: c */
    public sha<fz4.a> a() {
        return this.b;
    }

    @Override // com.inappstory.sdk.stories.outercallbacks.common.reader.CallToActionCallback
    public void callToAction(SlideData slideData, String str, ClickAction clickAction) {
        String str2;
        z65.h(slideData, "slide");
        z65.h(clickAction, "action");
        StoryData storyData = slideData.story;
        int i = storyData.id;
        String str3 = storyData.title;
        String str4 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        cr6<fz4.a> cr6Var = this.a;
        z65.e(str3);
        cr6Var.a(new fz4.a(i, str3, str2));
        if (str != null) {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                str4 = scheme;
            }
            this.c.a(new fz4.b(str4, str));
        }
    }

    @Override // defpackage.fz4
    /* renamed from: d */
    public sha<fz4.b> b() {
        return this.d;
    }
}
