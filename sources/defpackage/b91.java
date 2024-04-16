package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ClickableSpanWithAction.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lb91;", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "currentView", "", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "Lkotlin/Function1;", "", "a", "Lkotlin/jvm/functions/Function1;", "action", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", c.a, "getUrl", RemoteMessageConst.Notification.URL, "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b91  reason: default package */
/* loaded from: classes4.dex */
public final class b91 extends ClickableSpan {
    private final Function1<String, Unit> a;
    private final String b;
    private final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public b91(Function1<? super String, Unit> function1, String str, String str2) {
        z65.h(function1, "action");
        z65.h(str, "text");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        this.a = function1;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        z65.h(view, "currentView");
        this.a.invoke(this.c);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        z65.h(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
