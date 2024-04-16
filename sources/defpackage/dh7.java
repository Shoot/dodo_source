package defpackage;

import android.content.res.Resources;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderRatingChatMessageLinesBuilder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Ldh7;", "", "", "ratingValue", "", DateTokenConverter.CONVERTER_KEY, "productsDescription", c.a, "orderNumber", "b", "selectedTagsTitles", e.a, "comment", "a", "Landroid/content/res/Resources;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dh7  reason: default package */
/* loaded from: classes.dex */
public final class dh7 {
    private final Resources a;

    public dh7(Resources resources) {
        z65.h(resources, "resources");
        this.a = resources;
    }

    public final String a(String str) {
        z65.h(str, "comment");
        String string = this.a.getString(g19.rating_chat_message_comment, str);
        z65.g(string, "getString(...)");
        return string;
    }

    public final String b(int i) {
        String string = this.a.getString(g19.rating_chat_message_order_number, Integer.valueOf(i));
        z65.g(string, "getString(...)");
        return string;
    }

    public final String c(String str) {
        z65.h(str, "productsDescription");
        String string = this.a.getString(g19.rating_chat_message_products, str);
        z65.g(string, "getString(...)");
        return string;
    }

    public final String d(int i) {
        String string = this.a.getString(g19.rating_chat_message_rating_value, Integer.valueOf(i));
        z65.g(string, "getString(...)");
        return string;
    }

    public final String e(String str) {
        z65.h(str, "selectedTagsTitles");
        String string = this.a.getString(g19.rating_chat_message_tags, str);
        z65.g(string, "getString(...)");
        return string;
    }
}
