package im.threads.business.ogParser;

import android.view.ViewGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.ui.widget.textView.BubbleTimeTextView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OGDataContent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lim/threads/business/ogParser/OGDataContent;", "", "ogDataLayout", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewGroup;", "ogTimeStampView", "Lim/threads/ui/widget/textView/BubbleTimeTextView;", "mainTimeStampView", "messageText", "", RemoteMessageConst.Notification.URL, "(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;)V", "getMainTimeStampView", "()Ljava/lang/ref/WeakReference;", "getMessageText", "()Ljava/lang/String;", "getOgDataLayout", "getOgTimeStampView", "getUrl", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OGDataContent {
    private final WeakReference<BubbleTimeTextView> mainTimeStampView;
    private final String messageText;
    private final WeakReference<ViewGroup> ogDataLayout;
    private final WeakReference<BubbleTimeTextView> ogTimeStampView;
    private String url;

    public OGDataContent(WeakReference<ViewGroup> weakReference, WeakReference<BubbleTimeTextView> weakReference2, WeakReference<BubbleTimeTextView> weakReference3, String str, String str2) {
        z65.h(weakReference, "ogDataLayout");
        z65.h(weakReference2, "ogTimeStampView");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        this.ogDataLayout = weakReference;
        this.ogTimeStampView = weakReference2;
        this.mainTimeStampView = weakReference3;
        this.messageText = str;
        this.url = str2;
    }

    public static /* synthetic */ OGDataContent copy$default(OGDataContent oGDataContent, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, String str, String str2, int i, Object obj) {
        WeakReference<ViewGroup> weakReference4 = weakReference;
        if ((i & 1) != 0) {
            weakReference4 = oGDataContent.ogDataLayout;
        }
        WeakReference<BubbleTimeTextView> weakReference5 = weakReference2;
        if ((i & 2) != 0) {
            weakReference5 = oGDataContent.ogTimeStampView;
        }
        WeakReference weakReference6 = weakReference5;
        WeakReference<BubbleTimeTextView> weakReference7 = weakReference3;
        if ((i & 4) != 0) {
            weakReference7 = oGDataContent.mainTimeStampView;
        }
        WeakReference weakReference8 = weakReference7;
        if ((i & 8) != 0) {
            str = oGDataContent.messageText;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = oGDataContent.url;
        }
        return oGDataContent.copy(weakReference4, weakReference6, weakReference8, str3, str2);
    }

    public final WeakReference<ViewGroup> component1() {
        return this.ogDataLayout;
    }

    public final WeakReference<BubbleTimeTextView> component2() {
        return this.ogTimeStampView;
    }

    public final WeakReference<BubbleTimeTextView> component3() {
        return this.mainTimeStampView;
    }

    public final String component4() {
        return this.messageText;
    }

    public final String component5() {
        return this.url;
    }

    public final OGDataContent copy(WeakReference<ViewGroup> weakReference, WeakReference<BubbleTimeTextView> weakReference2, WeakReference<BubbleTimeTextView> weakReference3, String str, String str2) {
        z65.h(weakReference, "ogDataLayout");
        z65.h(weakReference2, "ogTimeStampView");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        return new OGDataContent(weakReference, weakReference2, weakReference3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OGDataContent)) {
            return false;
        }
        OGDataContent oGDataContent = (OGDataContent) obj;
        if (z65.c(this.ogDataLayout, oGDataContent.ogDataLayout) && z65.c(this.ogTimeStampView, oGDataContent.ogTimeStampView) && z65.c(this.mainTimeStampView, oGDataContent.mainTimeStampView) && z65.c(this.messageText, oGDataContent.messageText) && z65.c(this.url, oGDataContent.url)) {
            return true;
        }
        return false;
    }

    public final WeakReference<BubbleTimeTextView> getMainTimeStampView() {
        return this.mainTimeStampView;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final WeakReference<ViewGroup> getOgDataLayout() {
        return this.ogDataLayout;
    }

    public final WeakReference<BubbleTimeTextView> getOgTimeStampView() {
        return this.ogTimeStampView;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.ogDataLayout.hashCode() * 31) + this.ogTimeStampView.hashCode()) * 31;
        WeakReference<BubbleTimeTextView> weakReference = this.mainTimeStampView;
        int i = 0;
        if (weakReference == null) {
            hashCode = 0;
        } else {
            hashCode = weakReference.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.messageText;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i2 + i) * 31) + this.url.hashCode();
    }

    public final void setUrl(String str) {
        z65.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        WeakReference<ViewGroup> weakReference = this.ogDataLayout;
        WeakReference<BubbleTimeTextView> weakReference2 = this.ogTimeStampView;
        WeakReference<BubbleTimeTextView> weakReference3 = this.mainTimeStampView;
        String str = this.messageText;
        String str2 = this.url;
        return "OGDataContent(ogDataLayout=" + weakReference + ", ogTimeStampView=" + weakReference2 + ", mainTimeStampView=" + weakReference3 + ", messageText=" + str + ", url=" + str2 + ")";
    }

    public /* synthetic */ OGDataContent(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, weakReference2, weakReference3, str, (i & 16) != 0 ? "" : str2);
    }
}
