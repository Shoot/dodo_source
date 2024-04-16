package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryCallback;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: inappstoryext.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a6\u0010\u000b\u001a\u00020\t*\u00020\u00052*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0006\u001a\u001e\u0010\u000f\u001a\u00020\t*\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¨\u0006\u0010"}, d2 = {"Lcom/inappstory/sdk/stories/outercallbacks/common/reader/SourceType;", "", "isStoryListOpened", "Ljya;", e.a, "Lcom/inappstory/sdk/InAppStoryManager;", "Lkotlin/Function5;", "", "", "", "callback", c.a, "Lkotlin/Function1;", "Lez4;", "errorCallback", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: b05  reason: default package */
/* loaded from: classes2.dex */
public final class b05 {

    /* compiled from: inappstoryext.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"b05$a", "Lhq2;", "Lez4;", "errorType", "", "a", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b05$a */
    /* loaded from: classes2.dex */
    public static final class a extends hq2 {
        final /* synthetic */ Function1<ez4, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super ez4, Unit> function1) {
            this.b = function1;
        }

        @Override // defpackage.hq2
        public void a(ez4 ez4Var) {
            z65.h(ez4Var, "errorType");
            this.b.invoke(ez4Var);
        }
    }

    public static final void b(InAppStoryManager inAppStoryManager, Function1<? super ez4, Unit> function1) {
        z65.h(inAppStoryManager, "<this>");
        z65.h(function1, "errorCallback");
        inAppStoryManager.setErrorCallback(new a(function1));
    }

    public static final void c(InAppStoryManager inAppStoryManager, final c94<? super Integer, ? super String, ? super String, ? super Integer, ? super SourceType, Unit> c94Var) {
        z65.h(inAppStoryManager, "<this>");
        z65.h(c94Var, "callback");
        inAppStoryManager.setShowStoryCallback(new ShowStoryCallback() { // from class: a05
            @Override // com.inappstory.sdk.stories.outercallbacks.common.reader.ShowStoryCallback
            public final void showStory(int i, String str, String str2, int i2, SourceType sourceType, ShowStoryAction showStoryAction) {
                b05.d(c94.this, i, str, str2, i2, sourceType, showStoryAction);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c94 c94Var, int i, String str, String str2, int i2, SourceType sourceType, ShowStoryAction showStoryAction) {
        z65.h(c94Var, "$callback");
        z65.h(sourceType, "sourceType");
        Integer valueOf = Integer.valueOf(i);
        z65.e(str);
        z65.e(str2);
        c94Var.f0(valueOf, str, str2, Integer.valueOf(i2), sourceType);
    }

    public static final jya e(SourceType sourceType, boolean z) {
        z65.h(sourceType, "<this>");
        if (sourceType == SourceType.LIST && !z) {
            return jya.b;
        }
        if (sourceType == SourceType.SINGLE) {
            return jya.c;
        }
        return jya.d;
    }
}
