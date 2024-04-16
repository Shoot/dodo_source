package im.threads.business.markdown;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import defpackage.v86;
import defpackage.ww1;
import im.threads.business.markdown.LinkifyPlugin;
import im.threads.business.models.ExtractedLink;
import im.threads.business.utils.UrlUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LinkifyPlugin.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lim/threads/business/markdown/LinkifyPlugin;", "Ls1;", "Landroid/text/Spannable;", "text", "", "mask", "", "isCompat", "addAllLinks", "Lv86$b;", "registry", "", "configure", "I", "useCompat", "Z", "<init>", "(IZ)V", "Companion", "LinkifyCompatTextAddedListener", "LinkifyMask", "LinkifyTextAddedListener", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class LinkifyPlugin extends s1 {
    public static final Companion Companion = new Companion(null);
    private final int mask;
    private final boolean useCompat;

    /* compiled from: LinkifyPlugin.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lim/threads/business/markdown/LinkifyPlugin$Companion;", "", "()V", "create", "Lim/threads/business/markdown/LinkifyPlugin;", "useCompat", "", "mask", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LinkifyPlugin create$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.create(z);
        }

        public final LinkifyPlugin create() {
            return create$default(this, false, 1, null);
        }

        public final LinkifyPlugin create(boolean z) {
            return create(7, z);
        }

        public final LinkifyPlugin create(int i) {
            return new LinkifyPlugin(i, false);
        }

        public final LinkifyPlugin create(int i, boolean z) {
            return new LinkifyPlugin(i, z);
        }
    }

    /* compiled from: LinkifyPlugin.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lim/threads/business/markdown/LinkifyPlugin$LinkifyCompatTextAddedListener;", "Lim/threads/business/markdown/LinkifyPlugin$LinkifyTextAddedListener;", "Lim/threads/business/markdown/LinkifyPlugin;", "mask", "", "(Lim/threads/business/markdown/LinkifyPlugin;I)V", "addLinks", "", "text", "Landroid/text/Spannable;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class LinkifyCompatTextAddedListener extends LinkifyTextAddedListener {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkifyCompatTextAddedListener(int i) {
            super(i);
            LinkifyPlugin.this = r1;
        }

        @Override // im.threads.business.markdown.LinkifyPlugin.LinkifyTextAddedListener
        protected boolean addLinks(Spannable spannable, int i) {
            z65.h(spannable, "text");
            return LinkifyPlugin.this.addAllLinks(spannable, i, true);
        }
    }

    /* compiled from: LinkifyPlugin.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lim/threads/business/markdown/LinkifyPlugin$LinkifyMask;", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public @interface LinkifyMask {
    }

    /* compiled from: LinkifyPlugin.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lim/threads/business/markdown/LinkifyPlugin$LinkifyTextAddedListener;", "Lww1$p;", "Lz86;", "visitor", "", "text", "", "start", "", "onTextAdded", "Landroid/text/Spannable;", "mask", "", "addLinks", "I", "<init>", "(Lim/threads/business/markdown/LinkifyPlugin;I)V", "threads_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public class LinkifyTextAddedListener implements ww1.p {
        private final int mask;

        public LinkifyTextAddedListener(int i) {
            LinkifyPlugin.this = r1;
            this.mask = i;
        }

        protected boolean addLinks(Spannable spannable, int i) {
            z65.h(spannable, "text");
            return LinkifyPlugin.this.addAllLinks(spannable, i, false);
        }

        @Override // defpackage.ww1.p
        public void onTextAdded(z86 z86Var, String str, int i) {
            boolean z;
            z65.h(z86Var, "visitor");
            z65.h(str, "text");
            tqa a = z86Var.x().e().a(iq5.class);
            if (a == null) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (addLinks(spannableStringBuilder, this.mask)) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr != null) {
                    if (uRLSpanArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        dg9 q = z86Var.q();
                        z65.g(q, "visitor.renderProps()");
                        zqa f = z86Var.f();
                        z65.g(f, "visitor.builder()");
                        for (URLSpan uRLSpan : uRLSpanArr) {
                            xw1.e.e(q, uRLSpan.getURL());
                            zqa.j(f, a.a(z86Var.x(), q), spannableStringBuilder.getSpanStart(uRLSpan) + i, spannableStringBuilder.getSpanEnd(uRLSpan) + i);
                        }
                    }
                }
            }
        }
    }

    public LinkifyPlugin(int i, boolean z) {
        this.mask = i;
        this.useCompat = z;
    }

    public final boolean addAllLinks(Spannable spannable, int i, boolean z) {
        if (z) {
            tq5.b(spannable, i);
        } else {
            Linkify.addLinks(spannable, i);
        }
        ExtractedLink extractLink = UrlUtils.extractLink(spannable.toString());
        if (extractLink != null && !extractLink.isEmail() && extractLink.getLink() != null) {
            String scheme = Uri.parse(extractLink.getLink()).getScheme();
            if (z) {
                tq5.d(spannable, UrlUtils.WEB_URL, scheme, null, null);
                return true;
            }
            Linkify.addLinks(spannable, UrlUtils.WEB_URL, scheme, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
            return true;
        }
        return true;
    }

    @Override // defpackage.s1, defpackage.v86
    public void configure(v86.b bVar) {
        z65.h(bVar, "registry");
        bVar.a(ww1.class, new v86.a() { // from class: im.threads.business.markdown.LinkifyPlugin$configure$1
            @Override // defpackage.v86.a
            public final void apply(ww1 ww1Var) {
                boolean z;
                ww1.p linkifyTextAddedListener;
                int i;
                int i2;
                z65.h(ww1Var, "corePlugin");
                z = LinkifyPlugin.this.useCompat;
                if (z) {
                    LinkifyPlugin linkifyPlugin = LinkifyPlugin.this;
                    i2 = linkifyPlugin.mask;
                    linkifyTextAddedListener = new LinkifyPlugin.LinkifyCompatTextAddedListener(i2);
                } else {
                    LinkifyPlugin linkifyPlugin2 = LinkifyPlugin.this;
                    i = linkifyPlugin2.mask;
                    linkifyTextAddedListener = new LinkifyPlugin.LinkifyTextAddedListener(i);
                }
                ww1Var.d(linkifyTextAddedListener);
            }
        });
    }
}
